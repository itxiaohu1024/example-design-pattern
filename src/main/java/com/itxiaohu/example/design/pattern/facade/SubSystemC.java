package com.itxiaohu.example.design.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSystemC {

    private static final Logger logger = LoggerFactory.getLogger(SubSystemC.class);

    public void operation() {
        logger.info("SubSystemC-operation");
    }

}
