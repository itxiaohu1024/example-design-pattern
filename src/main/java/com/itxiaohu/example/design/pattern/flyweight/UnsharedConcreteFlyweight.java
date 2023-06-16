package com.itxiaohu.example.design.pattern.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 非共享具体享元类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private static final Logger logger = LoggerFactory.getLogger(UnsharedConcreteFlyweight.class);

    private int allState;

    @Override
    public void operation() {
        logger.info("UnsharedConcreteFlyweight-operation-allState:{}", allState);
    }

    public int getAllState() {
        return allState;
    }

    public void setAllState(int allState) {
        this.allState = allState;
    }

    @Override
    public String toString() {
        return "UnsharedConcreteFlyweight{" +
                "allState=" + allState +
                '}';
    }

}
