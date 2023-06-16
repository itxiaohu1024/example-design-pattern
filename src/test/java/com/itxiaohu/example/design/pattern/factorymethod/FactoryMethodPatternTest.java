package com.itxiaohu.example.design.pattern.factorymethod;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂方法模式（Factory Method）模式测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class FactoryMethodPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(FactoryMethodPatternTest.class);

    @Test
    public void testCar() {
        Factory factory = new CarFactory();
        Product product = factory.createProduct();
        logger.info("product:{},{}", product.getName(), product.getUse());

        product = factory.createProduct(Product.USE_FOR_CIVILIAN);
        logger.info("product:{},{}", product.getName(), product.getUse());
    }

    @Test
    public void testBoat() {
        Factory factory = new BoatFactory();
        Product product = factory.createProduct();
        logger.info("product:{},{}", product.getName(), product.getUse());

        product = factory.createProduct(Product.USE_FOR_MILITARY);
        logger.info("product:{},{}", product.getName(), product.getUse());
    }

}
