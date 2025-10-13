package com.solvd.testAutomation.api.declarativeBased;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.*;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@EndpointTemplate(url = "https://httpbin.org")
public interface PostTemplate {

    @EndpointTemplateMethod(url = "/post", methodType = HttpMethodType.POST)
    @RequestTemplatePath(path = "api/_post/rq.json")
    @ResponseTemplatePath(path = "api/_post/rs.json")
    @PropertiesPath(path = "api/user.properties")
    @SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
    AbstractApiMethodV2 createSomething();
}
