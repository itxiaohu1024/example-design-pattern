package com.itxiaohu.example.design.pattern.proxy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Jdk动态代理测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class JdkProxyTest {

    private static final Logger logger = LoggerFactory.getLogger(JdkProxyTest.class);

    @Test
    public void test() {
        // 被代理对象
        final RealSubject realSubject = new RealSubject();

        // handler
        InvocationHandler handler = new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                logger.info("InvocationHandler-invoke-before");

                // 调用被代理对象
                Object result = method.invoke(realSubject, args);

                logger.info("InvocationHandler-invoke-after");
                return result;
            }
        };

        // 生成代理
        Object proxy = Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                                              realSubject.getClass().getInterfaces(),
                                              handler);

        logger.info("proxy-class:{}", proxy.getClass());

        // 使用代理调用
        ((Subject)proxy).request();
    }

}
