package com.itxiaohu.example.design.pattern.flyweight;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 享元模式(Flyweight Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class FlyweightPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(FlyweightPatternTest.class);

    @Test
    public void test() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight oneFlyweight = factory.getFlyweight("one");
        logger.info("oneFlyweight:{}", oneFlyweight);

        Flyweight twoFlyweight = factory.getFlyweight("two");
        logger.info("twoFlyweight:{}", twoFlyweight);

        Flyweight oneAgainFlyweight = factory.getFlyweight("one");
        logger.info("oneAgainFlyweight:{}", oneAgainFlyweight);
    }

}
