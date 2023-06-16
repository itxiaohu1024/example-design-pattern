package com.itxiaohu.example.design.pattern.factorymethod;

public class BoatFactory implements Factory {

    @Override
    public Product createProduct() {
        return new Boat();
    }

    @Override
    public Product createProduct(String use) {
        Boat boat = new Boat();
        boat.setUse(use);
        return boat;
    }

}
