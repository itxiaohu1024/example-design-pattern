package com.itxiaohu.example.design.pattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体观察者
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteObserver implements Observer {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteObserver.class);

    private int observerState;

    @Override
    public void update(int state) {
        logger.info("ConcreteObserver-update-state:{}", state);
        this.observerState = state;
    }

    public int getObserverState() {
        return observerState;
    }

}
