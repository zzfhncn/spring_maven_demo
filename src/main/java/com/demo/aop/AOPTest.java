/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.aop;

import com.demo.service.AService;
import com.demo.service.BService;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

public class AOPTest extends AbstractDependencyInjectionSpringContextTests  {
    
    private AService aService;  
      
    private BService bService;  
      
    protected String[] getConfigLocations() {  
        String[] configs = new String[] { "/applicationContext.xml"};  
        return configs;  
    }  
      
      
    /** 
     * 测试正常调用 
     */  
    public void testCall()  
    {  
        System.out.println("SpringTest JUnit test");  
        aService.fooA("JUnit test fooA");  
        aService.barA();  
        bService.fooB("Junit test fooB", AUTOWIRE_NO);
        bService.barB();
    }  
      
    /** 
     * 测试After-Throwing 
     */  
    public void testThrow()  
    {  
        try {  
            bService.fooB("JUnit call barB",1);  
        } catch (IllegalArgumentException e) {  
              
        }  
    }  
      
    public void setAService(AService service) {  
        aService = service;  
    }  
      
    public void setBService(BService service) {  
        bService = service;  
    }  
}
