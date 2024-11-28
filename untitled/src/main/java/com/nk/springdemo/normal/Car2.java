package com.nk.springdemo.normal;

/**
 * This is a has-a relationship
 */

public class Car2  {
    void drive(){
        Engine engine = new Engine();
        int start = engine.start();
        if(start >= 1){
            System.out.println("Engine Started.....");
        }
    }
}
