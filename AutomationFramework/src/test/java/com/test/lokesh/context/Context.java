package com.test.lokesh.context;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, String> context = new HashMap<String, String>();

    public void setContextParam(String key, String value) {
        context.put(key, value);
    }

    public String getContextParam(String key) {
        return context.get(key);
    }

}
