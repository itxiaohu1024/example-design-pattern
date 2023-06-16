package com.itxiaohu.example.design.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSystemA {

    private static final Logger logger = LoggerFactory.getLogger(SubSystemA.class);

    public void operation() {
        logger.info("SubSystemA-operation");
    }

}
