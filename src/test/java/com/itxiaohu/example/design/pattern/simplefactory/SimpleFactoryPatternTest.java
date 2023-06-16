package com.itxiaohu.example.design.pattern.simplefactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.text.DateFormat;

/**
 * 简单工厂模式（Simple Factory）模式测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class SimpleFactoryPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(SimpleFactoryPatternTest.class);

    @Test
    public void test() {
        String carName = Factory.createProduct("car").getName();
        logger.info("carName:{}", carName);
        String boatName = Factory.createProduct("boat").getName();
        logger.info("boatName:{}", boatName);
    }

    @Test
    public void testJdk() throws Exception {
        // DateFormat
        DateFormat fullDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        logger.info("fullDateFormat:{}", fullDateFormat.getClass().getCanonicalName());

        DateFormat shortDateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        logger.info("shortDateFormat:{}", shortDateFormat.getClass().getCanonicalName());

        // KeyGenerator
        KeyGenerator keyGen = KeyGenerator.getInstance("DESede");
        logger.info("keyGen:{}", keyGen.getClass().getCanonicalName());

        // Cipher
        Cipher cp = Cipher.getInstance("DESede");
        logger.info("cp:{}", cp.getClass().getCanonicalName());
    }

}
