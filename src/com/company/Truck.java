package com.company;

public class Truck extends Vehicle implements Service {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void checkVehicle() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
