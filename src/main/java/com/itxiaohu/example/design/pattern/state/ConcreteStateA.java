package com.itxiaohu.example.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体状态类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteStateA implements State {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteStateA.class);

    @Override
    public void handle(Context context) {
        logger.info("ConcreteStateA-handle");
        context.changeState(new ConcreteStateB());
    }

    @Override
    public String toString() {
        return "StateA";
    }

}
