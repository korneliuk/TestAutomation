package com.solvd.testAutomation.api.annotationBased;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/put", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/_put/rq.json")
@ResponseTemplatePath(path = "api/_put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutSomethingMethod extends AbstractApiMethodV2 {

    public PutSomethingMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        setProperties("api/user.properties");
    }
}
