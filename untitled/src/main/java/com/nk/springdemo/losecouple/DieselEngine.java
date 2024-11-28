package com.nk.springdemo.losecouple;



public class DieselEngine implements IEngine {
    String model;
    public DieselEngine(String model) {
        this.model = model;
    }

    @Override
    public int start(){
        System.out.println("Diesel Engine Started.......");
        return 1;
    }
}
