package com.dashboardapi.whkstatusapi.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@SchemaMapping(typeName = "HealthCheckQuery")
public class HealthCheckController {

    @QueryMapping("isApplicationRunning")
    public String isApplicationRunning() {
        return "Application is running";
    }
}
