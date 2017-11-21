package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestCpetest {

    CpetestImpl cpetestImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        cpetestImpl = BeanUtils.getBean("cpetestImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: cpetestImpl.add(Integer a, Integer b)
        Integer returnValue = cpetestImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: cpetestImpl.sayHei(String name)
        String returnValue = cpetestImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: cpetestImpl.sayHello(String name)
        String returnValue = cpetestImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: cpetestImpl.sayHi(String name)
        String returnValue = cpetestImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: cpetestImpl.saySomething(String prefix, Person user)
        String returnValue = cpetestImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



