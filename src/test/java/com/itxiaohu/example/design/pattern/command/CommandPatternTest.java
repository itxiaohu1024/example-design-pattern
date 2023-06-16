package com.itxiaohu.example.design.pattern.command;

import org.junit.Test;

/**
 * 命令模式(Command Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class CommandPatternTest {

    @Test
    public void test() {
        // 构造接收者
        Receiver receiver = new Receiver();

        // 构造命令
        Command command = new ConcreteCommand(receiver);

        // 构造调用者
        Invoker invoker = new Invoker(command);

        // 执行调用
        invoker.call();
    }

}
