package com.itxiaohu.example.design.pattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public abstract class Subject {

    private static final Logger logger = LoggerFactory.getLogger(Subject.class);

    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        logger.info("Subject-attach-Observer:{}", observer);
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        logger.info("Subject-detach-Observer:{}", observer);
        this.observers.remove(observer);
    }

    public void notifyObserver(int state) {
        logger.info("Subject-notifyObserver-state:{}", state);
        this.observers.forEach(observer -> {
            observer.update(state);
        });
    }

}
