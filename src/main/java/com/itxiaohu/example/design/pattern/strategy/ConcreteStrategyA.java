package com.itxiaohu.example.design.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体策略类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteStrategyA implements Strategy {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteStrategyA.class);

    @Override
    public void algorithm() {
        logger.info("ConcreteStrategyA-algorithm");
    }

}
