package com.itxiaohu.example.design.pattern.observer;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * Jdk观察者模式测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ObserverPatternJdkTest {

    @Test
    public void test() {
        // 构建观察者
        ObserverBean observer = new ObserverBean();

        // 构建目标或主题
        ObservableBean bean = new ObservableBean();

        // 添加观察者
        bean.addObserver(observer);

        // 目标属性修改
        bean.setState((int)System.currentTimeMillis());
        bean.setState((int)System.currentTimeMillis());

        // 移除观察者
        bean.deleteObserver(observer);

        // 目标属性修改
        bean.setState((int)System.currentTimeMillis());
        bean.setState((int)System.currentTimeMillis());
    }

    private static class ObservableBean extends Observable {

        private final Logger logger = LoggerFactory.getLogger(ObservableBean.class);

        private int state;

        public int getState() {
            return state;
        }

        public void setState(int state) {
            logger.info("ObservableBean-setState:{}", state);
            this.state = state;
            setChanged();
            notifyObservers(this.state);
        }

    }

    private static class ObserverBean implements Observer {

        private final Logger logger = LoggerFactory.getLogger(ObserverBean.class);

        @Override
        public void update(Observable observable, Object arg) {
            logger.info("ObserverBean-update:{}", observable);
            logger.info("ObserverBean-arg:{}", arg);

            ObservableBean bean = (ObservableBean)observable;
            logger.info("ObservableBean-state:{}", bean.getState());
        }

    }

}
