package com.bonc.entities.service;

import java.math.BigDecimal;

/**
 * Created by KayZq on 2017/4/21.
 */
public class MsgHeader {
    protected String SOURCE_SYSTEM_ID;
    protected String SOURCE_SYSTEM_NAME;
    protected String USER_ID;
    protected String USER_NAME;
    protected String SUBMIT_DATE;
    protected BigDecimal PAGE_SIZE;
    protected BigDecimal CURRENT_PAGE;
    protected BigDecimal TOTAL_RECORD;
    protected String PROVINCE_CODE;
    protected String ENVIRONMENT_NAME;

    public MsgHeader(){}

    public MsgHeader(String SOURCE_SYSTEM_ID, String SOURCE_SYSTEM_NAME, String USER_ID, String USER_NAME, String SUBMIT_DATE, BigDecimal PAGE_SIZE, BigDecimal CURRENT_PAGE, BigDecimal TOTAL_RECORD, String PROVINCE_CODE, String ENVIRONMENT_NAME) {
        this.SOURCE_SYSTEM_ID = SOURCE_SYSTEM_ID;
        this.SOURCE_SYSTEM_NAME = SOURCE_SYSTEM_NAME;
        this.USER_ID = USER_ID;
        this.USER_NAME = USER_NAME;
        this.SUBMIT_DATE = SUBMIT_DATE;
        this.PAGE_SIZE = PAGE_SIZE;
        this.CURRENT_PAGE = CURRENT_PAGE;
        this.TOTAL_RECORD = TOTAL_RECORD;
        this.PROVINCE_CODE = PROVINCE_CODE;
        this.ENVIRONMENT_NAME = ENVIRONMENT_NAME;
    }

    public String getSOURCE_SYSTEM_ID() {
        return SOURCE_SYSTEM_ID;
    }

    public void setSOURCE_SYSTEM_ID(String SOURCE_SYSTEM_ID) {
        this.SOURCE_SYSTEM_ID = SOURCE_SYSTEM_ID;
    }

    public String getSOURCE_SYSTEM_NAME() {
        return SOURCE_SYSTEM_NAME;
    }

    public void setSOURCE_SYSTEM_NAME(String SOURCE_SYSTEM_NAME) {
        this.SOURCE_SYSTEM_NAME = SOURCE_SYSTEM_NAME;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getSUBMIT_DATE() {
        return SUBMIT_DATE;
    }

    public void setSUBMIT_DATE(String SUBMIT_DATE) {
        this.SUBMIT_DATE = SUBMIT_DATE;
    }

    public BigDecimal getPAGE_SIZE() {
        return PAGE_SIZE;
    }

    public void setPAGE_SIZE(BigDecimal PAGE_SIZE) {
        this.PAGE_SIZE = PAGE_SIZE;
    }

    public BigDecimal getCURRENT_PAGE() {
        return CURRENT_PAGE;
    }

    public void setCURRENT_PAGE(BigDecimal CURRENT_PAGE) {
        this.CURRENT_PAGE = CURRENT_PAGE;
    }

    public BigDecimal getTOTAL_RECORD() {
        return TOTAL_RECORD;
    }

    public void setTOTAL_RECORD(BigDecimal TOTAL_RECORD) {
        this.TOTAL_RECORD = TOTAL_RECORD;
    }

    public String getPROVINCE_CODE() {
        return PROVINCE_CODE;
    }

    public void setPROVINCE_CODE(String PROVINCE_CODE) {
        this.PROVINCE_CODE = PROVINCE_CODE;
    }

    public String getENVIRONMENT_NAME() {
        return ENVIRONMENT_NAME;
    }

    public void setENVIRONMENT_NAME(String ENVIRONMENT_NAME) {
        this.ENVIRONMENT_NAME = ENVIRONMENT_NAME;
    }

    @Override
    public String toString() {
        return "MsgHeader{" +
                "SOURCE_SYSTEM_ID='" + SOURCE_SYSTEM_ID + '\'' +
                ", SOURCE_SYSTEM_NAME='" + SOURCE_SYSTEM_NAME + '\'' +
                ", USER_ID='" + USER_ID + '\'' +
                ", USER_NAME='" + USER_NAME + '\'' +
                ", SUBMIT_DATE='" + SUBMIT_DATE + '\'' +
                ", PAGE_SIZE=" + PAGE_SIZE +
                ", CURRENT_PAGE=" + CURRENT_PAGE +
                ", TOTAL_RECORD=" + TOTAL_RECORD +
                ", PROVINCE_CODE='" + PROVINCE_CODE + '\'' +
                ", ENVIRONMENT_NAME='" + ENVIRONMENT_NAME + '\'' +
                '}';
    }
}
