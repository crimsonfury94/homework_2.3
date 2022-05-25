package com.company;

public class Bicycle extends Vehicle implements Service {


    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void checkVehicle() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
