package com.itxiaohu.example.design.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体命令类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteCommand implements Command {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteCommand.class);

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver =receiver;
    }

    @Override
    public void execute() {
        logger.info("ConcreteCommand-execute");
        this.receiver.action();
    }

}
