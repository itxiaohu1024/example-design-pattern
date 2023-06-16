package com.itxiaohu.example.design.pattern.facade;

import org.junit.Test;

/**
 * 外观模式(Facade Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class FacadePatternTest {

    @Test
    public void test() {
        Facade facade = new Facade();
        facade.wrapOperation();
    }

}
