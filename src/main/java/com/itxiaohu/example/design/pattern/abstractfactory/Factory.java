package com.itxiaohu.example.design.pattern.abstractfactory;

public interface Factory {

    /**
     * 创建汽车
     * @return 汽车
     */
    Car createCar();

    /**
     * 创建轮船
     * @return 轮船
     */
    Boat createBoat();

}
