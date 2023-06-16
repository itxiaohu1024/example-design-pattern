package com.itxiaohu.example.design.pattern.abstractfactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象工厂模式（Abstract Factory）模式测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class AbstractFactoryPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(AbstractFactoryPatternTest.class);

    @Test
    public void testCivilianFactory() {
        Factory factory = new CivilianFactory();

        Car car = factory.createCar();
        logger.info("car:{},{}", car.getName(), car.getUse());

        Boat boat = factory.createBoat();
        logger.info("boat:{},{}", boat.getName(), boat.getUse());
    }


    @Test
    public void testMilitaryFactory() {
        Factory factory = new MilitaryFactory();

        Car car = factory.createCar();
        logger.info("car:{},{}", car.getName(), car.getUse());

        Boat boat = factory.createBoat();
        logger.info("boat:{},{}", boat.getName(), boat.getUse());
    }

}
