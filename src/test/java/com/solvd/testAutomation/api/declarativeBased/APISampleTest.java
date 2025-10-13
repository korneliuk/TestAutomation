package com.solvd.testAutomation.api.declarativeBased;

import com.zebrunner.carina.api.binding.TemplateFactory;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APISampleTest {

    @Test
    public void testGetSomething() {
        GetTemplate getTemplate = TemplateFactory.prepareTemplate(GetTemplate.class);
        var method = getTemplate.getSomething();
        method.callAPI();
        method.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testPostSomething() {
        PostTemplate postTemplate = TemplateFactory.prepareTemplate(PostTemplate.class);
        var method = postTemplate.createSomething();
        method.callAPI();
        method.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testPutSomething() {
        PutTemplate putTemplate = TemplateFactory.prepareTemplate(PutTemplate.class);
        var method = putTemplate.updateSomething();
        method.callAPI();
        method.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void testPatchSomething() {
        PatchTemplate patchTemplate = TemplateFactory.prepareTemplate(PatchTemplate.class);
        var method = patchTemplate.patchSomething();
        method.callAPI();
        method.validateResponse(JSONCompareMode.LENIENT);
    }
}