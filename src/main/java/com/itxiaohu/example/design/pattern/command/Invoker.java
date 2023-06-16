package com.itxiaohu.example.design.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 调用者
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Invoker {

    private static final Logger logger = LoggerFactory.getLogger(Invoker.class);

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        logger.info("Invoker-call");
        this.command.execute();
    }

}
