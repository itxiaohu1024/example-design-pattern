package com.itxiaohu.example.design.pattern.factorymethod;

public class Boat implements Product {

    private String use;

    @Override
    public String getName() {
        return "Product Boat";
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String getUse() {
        return this.use;
    }

}
