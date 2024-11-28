package com.nk.springdemo.losecouple;



public class Car   {
    IEngine engine;
    Car(IEngine engine) {
        this.engine = engine;
    }

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

