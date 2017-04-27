package com.bonc.ws.client;

import com.bonc.ws.CodeCenterWS;
import com.bonc.ws.service.DMDataService;
import com.bonc.ws.service.DMDataServicePortType;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by KayZq on 2017/4/17.
 */
public class CodeCenterWSImpl implements CodeCenterWS {
    @Override
    public String CCService(String request) {
        long startTime = System.currentTimeMillis();
        System.out.println("DMZ接收请求的时间:" + new Date().toLocaleString());
        System.out.println("完整请求:"+request);
        Pattern code_pattern = Pattern.compile("<JGDM>([^<]*)</");
        Matcher matcher = code_pattern.matcher(request);
        String JGDM = new String();
        if(matcher.find()){
            JGDM = matcher.group(1);
        }
        System.out.println("查询的CODE:"+JGDM);
        String response;
        DMDataServicePortType service = new DMDataService().getDMDataServiceHttpPort();
        response = service.searchDMInfo(request);
        long endTime = System.currentTimeMillis();
        System.out.println("DMZ响应时间:" + (endTime-startTime)/1000);
        return response;
    }
}
