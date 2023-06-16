package com.itxiaohu.example.design.pattern.abstractfactory;

public class CivilianFactory implements Factory {

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setName("Car");
        car.setUse(Product.USE_FOR_CIVILIAN);
        return car;
    }

    @Override
    public Boat createBoat() {
        Boat boat = new Boat();
        boat.setName("boat");
        boat.setUse(Product.USE_FOR_CIVILIAN);
        return boat;
    }

}
