package com.optimagrowth.product.utils;

import org.springframework.stereotype.Component;

@Component
public class UserContext {
    public static final String CORRELATION_ID = "tmx-correlation-id";
    public static final String AUTH_TOKEN     = "tmx-auth-token";
    public static final String USER_ID        = "tmx-user-id";
    public static final String ORGANIZATION_ID = "tmx-organization-id";
    public static final String MY_HEADER = "custom-header";

    private String correlationId= new String();
    private String headerid= new String();


    public String getCorrelationId() { return correlationId;}
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getmyheader() { return headerid+"_{ requestHeader of Licensing Service}";}
    public void settmyheader(String headerid) {
        this.headerid = headerid;
    }



}
