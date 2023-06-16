package com.itxiaohu.example.design.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 接收者
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    public void action() {
        logger.info("Receiver-action");
    }

}
