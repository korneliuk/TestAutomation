package com.solvd.testAutomation.api.annotationBased;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.IAbstractTest;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APISampleTest implements IAbstractTest {

    @Test
    public void testCreateSomething() {
        PostSomethingMethod api = new PostSomethingMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testGetSomething() {
        GetSomethingMethod api = new GetSomethingMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testDeleteSomething() {
        DeleteSomethingMethod api = new DeleteSomethingMethod();
        api.setProperties("api/user.properties");
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testPutSomething() {
        PutSomethingMethod api = new PutSomethingMethod();
        api.callAPI();
        api.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testPatchSomething() {
        PatchSomethingMethod api = new PatchSomethingMethod();
        api.callAPI();
        api.validateResponse(JSONCompareMode.LENIENT);
    }
}