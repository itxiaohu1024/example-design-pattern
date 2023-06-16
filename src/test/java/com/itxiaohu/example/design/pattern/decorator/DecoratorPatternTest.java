package com.itxiaohu.example.design.pattern.decorator;

import org.junit.Test;

/**
 * 装饰模式(Decorator Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class DecoratorPatternTest {

    @Test
    public void test() {
        Component component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);

        // 原来行为
        decoratorA.operation();
        // 增加行为
        decoratorA.addBehavior();

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);

        // 原来行为
        decoratorB.operation();
        // 增加行为
        decoratorB.addBehavior();
    }

}
