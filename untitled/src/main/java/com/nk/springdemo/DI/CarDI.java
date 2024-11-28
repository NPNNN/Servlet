package com.nk.springdemo.DI;

import com.nk.springdemo.losecouple.IEngine;


public class CarDI {
    private IEngine engine;
    // Example of the Setter DI
//    public void setEngine(IEngine engine) {
//        this.engine = engine;
//    }

    // Example of the Constructor DI
//    public CarDI(IEngine engine) {
//        this.engine = engine;
//    }


    public void drive(){
        int start = engine.start();

        if(start>=1){
            System.out.println("Engine Started.......");
        }
        else {
            System.out.println("Engine not Started.......");
        }
        }
    }

