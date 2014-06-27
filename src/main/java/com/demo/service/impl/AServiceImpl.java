/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.service.impl;

import com.demo.service.AService;

public class AServiceImpl implements AService{

    @Override
    public void fooA(String msg) {
        System.out.println(this.getClass().getName()+" 's fooA(). args = "+msg);
    }

    @Override
    public void barA() {
        System.out.println("="+this.getClass().getName()+" 's barA()");
    }
    
}
