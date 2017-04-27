package com.bonc.entities.service;

/**
 * Created by KayZq on 2017/4/21.
 */
public class SBMDMMDMInquiryEnterpriseInfoSrvRequest {
    protected MsgHeader msgHeader;
    protected String vendorname;
    protected String orgcode;
    protected String enrollcode;
    protected String searchflag;
    protected String vreserved1;
    protected String vreserved2;
    protected String vreserved3;
    protected String vreserved4;
    protected String vreserved5;

    public SBMDMMDMInquiryEnterpriseInfoSrvRequest(){}

    public SBMDMMDMInquiryEnterpriseInfoSrvRequest(MsgHeader msgHeader, String vendorname, String orgcode, String enrollcode, String searchflag, String vreserved1, String vreserved2, String vreserved3, String vreserved4, String vreserved5) {
        this.msgHeader = msgHeader;
        this.vendorname = vendorname;
        this.orgcode = orgcode;
        this.enrollcode = enrollcode;
        this.searchflag = searchflag;
        this.vreserved1 = vreserved1;
        this.vreserved2 = vreserved2;
        this.vreserved3 = vreserved3;
        this.vreserved4 = vreserved4;
        this.vreserved5 = vreserved5;
    }

    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getEnrollcode() {
        return enrollcode;
    }

    public void setEnrollcode(String enrollcode) {
        this.enrollcode = enrollcode;
    }

    public String getSearchflag() {
        return searchflag;
    }

    public void setSearchflag(String searchflag) {
        this.searchflag = searchflag;
    }

    public String getVreserved1() {
        return vreserved1;
    }

    public void setVreserved1(String vreserved1) {
        this.vreserved1 = vreserved1;
    }

    public String getVreserved2() {
        return vreserved2;
    }

    public void setVreserved2(String vreserved2) {
        this.vreserved2 = vreserved2;
    }

    public String getVreserved3() {
        return vreserved3;
    }

    public void setVreserved3(String vreserved3) {
        this.vreserved3 = vreserved3;
    }

    public String getVreserved4() {
        return vreserved4;
    }

    public void setVreserved4(String vreserved4) {
        this.vreserved4 = vreserved4;
    }

    public String getVreserved5() {
        return vreserved5;
    }

    public void setVreserved5(String vreserved5) {
        this.vreserved5 = vreserved5;
    }

    @Override
    public String toString() {
        return "SBMDMMDMInquiryEnterpriseInfoSrvRequest{" +
                "msgHeader=" + msgHeader +
                ", vendorname='" + vendorname + '\'' +
                ", orgcode='" + orgcode + '\'' +
                ", enrollcode='" + enrollcode + '\'' +
                ", searchflag='" + searchflag + '\'' +
                ", vreserved1='" + vreserved1 + '\'' +
                ", vreserved2='" + vreserved2 + '\'' +
                ", vreserved3='" + vreserved3 + '\'' +
                ", vreserved4='" + vreserved4 + '\'' +
                ", vreserved5='" + vreserved5 + '\'' +
                '}';
    }
}
