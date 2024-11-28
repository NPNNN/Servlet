package com.nk.springdemo.normal;

/**
 * This is a is-a relationship
 */

public class Car extends Engine {
    public void drive(){
        int start = super.start();
        if(start >= 1){
            System.out.println("Engine Started.....");
        }
    }
}
