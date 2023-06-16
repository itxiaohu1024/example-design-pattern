package com.itxiaohu.example.design.pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 扩充抽象类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class RefinedAbstraction extends Abstraction {

    private static final Logger logger = LoggerFactory.getLogger(RefinedAbstraction.class);

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        logger.info("RefinedAbstraction-operation-start");
        this.implementor.doOperation();
        logger.info("RefinedAbstraction-operation-end");
    }


}
