package com.itxiaohu.example.design.pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体实现类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteImplementorA implements Implementor {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteImplementorA.class);

    @Override
    public void doOperation() {
        logger.info("ConcreteImplementorA-doOperation");
    }

}
