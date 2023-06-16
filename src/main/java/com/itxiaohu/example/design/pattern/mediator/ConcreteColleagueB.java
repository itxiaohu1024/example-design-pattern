package com.itxiaohu.example.design.pattern.mediator;

/**
 * 具体同事类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteColleagueB extends Colleague {

    @Override
    void send(String id, String param) {
        logger.info("ConcreteColleagueA-send:{}", param);
        this.mediator.operation(id, param);
    }

    @Override
    void receive(String param) {
        logger.info("ConcreteColleagueB-receive:{}", param);
    }

}
