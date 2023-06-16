package com.itxiaohu.example.design.pattern.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体享元类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteFlyweight implements Flyweight {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteFlyweight.class);

    private int intrinsicState;

    @Override
    public void operation() {
        logger.info("ConcreteFlyweight-operation-intrinsicState:{}", intrinsicState);
    }

    public int getIntrinsicState() {
        return intrinsicState;
    }

    public void setIntrinsicState(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public String toString() {
        return "ConcreteFlyweight{" +
                "intrinsicState=" + intrinsicState +
                '}';
    }

}
