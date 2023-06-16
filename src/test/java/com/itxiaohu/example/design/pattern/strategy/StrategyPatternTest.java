package com.itxiaohu.example.design.pattern.strategy;

import org.junit.Test;

/**
 * 策略模式(Strategy Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class StrategyPatternTest {

    @Test
    public void test() {
        // 构建环境对象
        Context context = new Context();

        // 使用策略A处理
        context.setStrategy(new ConcreteStrategyA());
        context.algorithm();

        // 使用策略B处理
        context.setStrategy(new ConcreteStrategyB());
        context.algorithm();
    }

}
