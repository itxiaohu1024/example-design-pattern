package com.itxiaohu.example.design.pattern.adapter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 适配器模式测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class AdapterPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(AdapterPatternTest.class);

    @Test
    public void test() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        String result = target.request();
        logger.info("result:{}", result);
    }

}
