package com.service.yltest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestYltest {

        YltestDelegate yltestDelegate = new YltestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = yltestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}