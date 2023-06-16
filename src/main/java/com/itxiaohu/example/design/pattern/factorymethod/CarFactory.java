package com.itxiaohu.example.design.pattern.factorymethod;

public class CarFactory implements Factory {

    @Override
    public Product createProduct() {
        return new Car();
    }

    @Override
    public Product createProduct(String use) {
        Car car = new Car();
        car.setUse(use);
        return car;
    }

}
