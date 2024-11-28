package com.nk.springdemo.DI;

import com.nk.springdemo.losecouple.PetrolEngine;

import java.lang.reflect.Field;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        CarDI car = new CarDI();
        //CarDI car = new CarDI(new PetrolEngine()); //Constructor DI
       // car.setEngine(new PetrolEngine()); Setter DI
        //car.drive();

        //Reflection API use for access the private the member or Using the Field DI
        Class<?> aClass=Class.forName("com.nk.springdemo.DI.CarDI");
        Field field =aClass.getDeclaredField("engine");
        field.setAccessible(true);
        Object instance=aClass.newInstance();
        CarDI carDI = (CarDI)instance;

        //carDI.setEngine(new PetrolEngine()); field Di using the Setter Method
        field.set(carDI,new PetrolEngine());//Field Di using the Reflection API
        carDI.drive();


    }
}
