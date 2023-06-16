package com.itxiaohu.example.design.pattern.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象同事类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public abstract class Colleague {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected Mediator mediator;

    abstract void send(String id, String param);

    abstract void receive(String param);

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
