package com.itxiaohu.example.design.pattern.proxy;

import org.junit.Test;

/**
 * 代理模式(Proxy Pattern)测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ProxyPatternTest {

    @Test
    public void test() {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }

}
