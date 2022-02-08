package com.qaprosoft.carina.demo.api;

import com.mongodb.util.JSON;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.ContentType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetTodoMethod extends AbstractApiMethodV2 {
    public GetTodoMethod() {
        super(null, "api/todos/_get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
