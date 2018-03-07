package com.service.yltest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-07T07:28:34.389Z")

@RestSchema(schemaId = "yltest")
@RequestMapping(path = "/yl-test", produces = MediaType.APPLICATION_JSON)
public class YltestImpl {

    @Autowired
    private YltestDelegate userYltestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userYltestDelegate.helloworld(name);
    }

}
