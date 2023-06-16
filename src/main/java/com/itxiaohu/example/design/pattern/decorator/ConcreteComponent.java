package com.itxiaohu.example.design.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体构件
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteComponent implements Component {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteComponent.class);

    @Override
    public void operation() {
        logger.info("ConcreteComponent-operation");
    }

}
