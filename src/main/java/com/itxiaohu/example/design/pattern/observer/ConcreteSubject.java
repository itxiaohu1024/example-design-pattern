package com.itxiaohu.example.design.pattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体目标
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteSubject extends Subject {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteSubject.class);

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        logger.info("ConcreteSubject-setState:{}", state);
        this.state = state;
        notifyObserver(state);
    }

}
