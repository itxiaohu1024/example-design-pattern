package com.itxiaohu.example.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 环境类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Context {

    private static final Logger logger = LoggerFactory.getLogger(Context.class);

    // 当前状态
    private State state;

    public Context() {
        // 初始状态 A
        this.state = new ConcreteStateA();
    }

    public void changeState(State state) {
        logger.info("Context-changeState-state:{} -> {}", this.state, state);
        this.state = state;
    }

    public void request() {
        logger.info("Context-request");
        this.state.handle(this);
    }

}
