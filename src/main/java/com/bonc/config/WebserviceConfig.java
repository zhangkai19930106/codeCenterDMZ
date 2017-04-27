package com.bonc.config;

import com.bonc.ws.CodeCenterWS;
import com.bonc.ws.client.CodeCenterWSImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.ResourceProvider;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;


import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;


@Configuration
public class WebserviceConfig {
	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/codeCenter/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public CodeCenterWS CCService() {
		return new CodeCenterWSImpl();
	}

	@Bean
	public Endpoint soapEndpoint() {
		Endpoint endpoint = new EndpointImpl(springBus(), CCService());
		endpoint.publish("/codeCenter");
		return endpoint;
	}
	
	@Bean
	public Server restEndpoint(){
		// 添加 ResourceProvider
		List<ResourceProvider> resourceProviderList = new ArrayList<ResourceProvider>();
		resourceProviderList.add(new SingletonResourceProvider(new CodeCenterWSImpl()));

		// 添加 Provider
		List<Object> providerList = new ArrayList<Object>();
		providerList.add(new JacksonJsonProvider());
		
		// 发布 REST 服务
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

		factory.setAddress("http://localhost:8888/codeCenter");
		
//		factory.setResourceClasses(resourceClassList);
		factory.setResourceProviders(resourceProviderList);
		factory.setProviders(providerList);

		return factory.create();
		
	}
	
}
