package com.itxiaohu.example.design.pattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Cglib动态代理测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class CglibProxyTest {

    private static final Logger logger = LoggerFactory.getLogger(CglibProxyTest.class);

    @Test
    public void test() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                logger.info("Enhancer-intercept-before");

                // 调用被代理对象
                Object result = methodProxy.invokeSuper(object, args);

                logger.info("Enhancer-intercept-before");
                return result;
            }
        });

        RealSubject realSubject = (RealSubject)enhancer.create();
        realSubject.request();
    }

}
