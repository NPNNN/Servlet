package com.nk.springdemo.losecouple;

public class EngineFactory {
    public IEngine getInstance(String engineName) {
        if (engineName.equals("Petrol")) {
            return new PetrolEngine();
        } else {
            return new DieselEngine("2024");

        }


    }
}
