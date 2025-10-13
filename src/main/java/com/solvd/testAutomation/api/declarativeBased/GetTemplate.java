package com.solvd.testAutomation.api.declarativeBased;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.*;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@EndpointTemplate(url = "https://httpbin.org")
public interface GetTemplate {

    @EndpointTemplateMethod(url = "/get", methodType = HttpMethodType.GET)
    @ResponseTemplatePath(path = "api/_get/rs.json")
    @PropertiesPath(path = "api/user.properties")
    @SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
    AbstractApiMethodV2 getSomething();
}
