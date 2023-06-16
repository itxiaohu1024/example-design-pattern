package com.itxiaohu.example.design.pattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 真实主题角色
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class RealSubject implements Subject {

    private static final Logger logger = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void request() {
        logger.info("RealSubject-request");
    }

}
