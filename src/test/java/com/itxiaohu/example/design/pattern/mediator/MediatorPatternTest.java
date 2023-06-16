package com.itxiaohu.example.design.pattern.mediator;

import org.junit.Test;

/**
 * 中介者模式(Mediator Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class MediatorPatternTest {

    @Test
    public void test() {
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        Mediator mediator = new ConcreteMediator();

        String colleagueAId = mediator.register(colleagueA);
        String colleagueBId = mediator.register(colleagueB);

        colleagueA.send(colleagueAId, "message A >->-> A");
        colleagueA.send(colleagueBId, "message A >->-> B");

        colleagueB.send(colleagueAId, "message B >->-> A");
        colleagueB.send(colleagueBId, "message B >->-> B");
    }

}
