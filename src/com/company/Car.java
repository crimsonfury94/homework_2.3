package com.company;

public class Car extends Vehicle implements Service {

    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    @Override
    public void checkVehicle() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
