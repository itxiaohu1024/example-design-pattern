package com.itxiaohu.example.design.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSystemB {

    private static final Logger logger = LoggerFactory.getLogger(SubSystemB.class);

    public void operation() {
        logger.info("SubSystemB-operation");
    }

}
