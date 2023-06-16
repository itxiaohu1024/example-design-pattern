package com.itxiaohu.example.design.pattern.state;

import org.junit.Test;

/**
 * 状态模式(State Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class StatePatternTest {

    @Test
    public void test() {
        // 构建环境类
        Context context = new Context();

        // A -> B
        context.request();
        // B -> C
        context.request();
        // C -> A
        context.request();
        // A -> B
        context.request();
    }

}
