package com.service.yulu.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-22T16:14:50.715Z")

@RestSchema(schemaId = "cpetest")
@RequestMapping(path = "/yulu", produces = MediaType.APPLICATION_JSON)
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
