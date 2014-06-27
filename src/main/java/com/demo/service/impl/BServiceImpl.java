/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.service.impl;

import com.demo.service.BService;

public class BServiceImpl implements BService{

    @Override
    public void fooB(String msg, int type) {
        System.out.println(this.getClass().getName()+" 's fooB(). args = "+ msg + ", type = " + type);
        if(type == 1){
            throw new IllegalArgumentException("测试异常");
        }
    }

    @Override
    public void barB() {
        System.out.println("="+this.getClass().getName()+" 's barB()");
    }
    
}
