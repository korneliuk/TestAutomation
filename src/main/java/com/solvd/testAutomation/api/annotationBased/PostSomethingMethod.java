package com.solvd.testAutomation.api.annotationBased;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/post", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/_post/rq.json")
@ResponseTemplatePath(path = "api/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostSomethingMethod extends AbstractApiMethodV2 {

    public PostSomethingMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        setProperties("api/user.properties");
    }
}
