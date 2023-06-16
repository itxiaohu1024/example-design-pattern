package com.itxiaohu.example.design.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体策略类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteStrategyB implements Strategy {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteStrategyB.class);

    @Override
    public void algorithm() {
        logger.info("ConcreteStrategyB-algorithm");
    }

}
