package com.service.testql.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-22T16:25:12.842Z")

@RestSchema(schemaId = "cpetest")
@RequestMapping(path = "/testql", produces = MediaType.APPLICATION_JSON)
public class CpetestImpl {

    @Autowired
    private CpetestDelegate userCpetestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCpetestDelegate.helloworld(name);
    }

}
