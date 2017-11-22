package com.service.testql.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCpetest {

        CpetestDelegate cpetestDelegate = new CpetestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cpetestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}