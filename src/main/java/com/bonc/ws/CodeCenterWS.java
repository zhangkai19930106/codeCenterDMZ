package com.bonc.ws;

import com.bonc.entities.service.SBMDMMDMInquiryEnterpriseInfoSrvRequest;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by KayZq on 2017/4/17.
 */
@Path(value = "/codeCenter")
@WebService(targetNamespace="http://webservice.bonc.com/")
public interface CodeCenterWS {
    @POST
    @Path("/CCService")
    @Consumes("application/json")
    @Produces("application/json")
    @Description(value = "组织机构代码", target = DocTarget.METHOD)
    public String CCService(@WebParam(name = "request")String request);
}
