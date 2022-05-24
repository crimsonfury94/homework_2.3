package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda Integra", 4);
        Car car1 = new Car("Ford Mustang", 4);

        Truck truck = new Truck("Hino 300", 6);
        Truck truck1 = new Truck("Scania G400", 8);

        Bicycle bicycle = new Bicycle("Stels", 2);
        Bicycle bicycle1 = new Bicycle("BMC", 2);

        Service serviceStation = new ServiceStation();
        serviceStation.check(car);
        serviceStation.check(car1);
        serviceStation.check(truck);
        serviceStation.check(truck1);
        serviceStation.check(bicycle);
        serviceStation.check(bicycle1);

    }
}
