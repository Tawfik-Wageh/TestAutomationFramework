package com.automationexercices.apis;

import com.automationexercices.utils.dataReader.PropertyReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class Builder {
    private static String baseURI = PropertyReader.getProperty("baseUrlApi");

    // Private constructor to prevent instantiation
    private Builder() {

    }

    //build request specification
    public static RequestSpecification getUserManagementRequestSpecification(Map<String, ?> formParams) {
        return new RequestSpecBuilder().setBaseUri(baseURI)
                .setContentType(ContentType.URLENC)
                .addFormParams(formParams)
                .build();
    }
}

// TODO : Add other request specifications as needed for different API endpoints
