package com.itxiaohu.example.design.pattern.bridge;

import org.junit.Test;

/**
 * 桥接模式(Bridge Pattern)测试
 *
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class BridgePatternTest {

    @Test
    public void test() {
        Abstraction abstraction;

        // 桥接ConcreteImplementorA
        Implementor implementorA = new ConcreteImplementorA();
        abstraction = new RefinedAbstraction(implementorA);
        abstraction.operation();

        // 桥接ConcreteImplementorB
        Implementor implementorB = new ConcreteImplementorB();
        abstraction = new RefinedAbstraction(implementorB);
        abstraction.operation();
    }

}
