package com.itxiaohu.example.design.pattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 代理主题角色
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Proxy implements Subject {

    private static final Logger logger = LoggerFactory.getLogger(Proxy.class);

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void beforeRequest() {
        logger.info("Proxy-beforeRequest");
    }

    @Override
    public void request() {
        beforeRequest();
        this.subject.request();
        afterRequest();
    }

    public void afterRequest() {
        logger.info("Proxy-afterRequest");
    }

}
