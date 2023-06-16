package com.itxiaohu.example.design.pattern.observer;

import org.junit.Test;

import java.util.Observable;

/**
 * 观察者模式(Observer Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ObserverPatternTest {

    @Test
    public void test() {
        // 构建观察者
        Observer observer = new ConcreteObserver();

        // 构建目标或主题
        ConcreteSubject subject = new ConcreteSubject();

        // 添加观察者
        subject.attach(observer);

        // 目标属性修改
        subject.setState((int)System.currentTimeMillis());
        subject.setState((int)System.currentTimeMillis());

        // 移除观察者
        subject.detach(observer);

        // 目标属性修改
        subject.setState((int)System.currentTimeMillis());
        subject.setState((int)System.currentTimeMillis());
    }


    private class ObservableBean extends Observable {

        private int state;

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
            notifyObservers();
        }

    }

    private class ObserverBean implements Observer {

        @Override
        public void update(int state) {

        }

    }

}
