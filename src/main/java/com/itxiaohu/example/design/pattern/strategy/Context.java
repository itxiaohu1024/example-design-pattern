package com.itxiaohu.example.design.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * 环境类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Context {

    private static final Logger logger = LoggerFactory.getLogger(Context.class);

    private Strategy strategy;

    public void algorithm() {
        logger.info("Context-algorithm");
        if(Objects.isNull(this.strategy)) {
            return;
        }
        this.strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
