package com.itxiaohu.example.design.pattern.abstractfactory;

public class Car implements Product {

    private String name;
    private String use;

    @Override
    public String getUse() {
        return this.use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
