package com.itxiaohu.example.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 枚举单例测试
 * @author IT小胡
 */
public class EnumSingletonPatternTest {

    /**
     * 单线程测试
     */
    @Test
    public void testSingleThread(){

        List<EnumSingleton> instances = new ArrayList<EnumSingleton>();

        for(int i = 0; i < 100; i++){
            instances.add(EnumSingleton.INSTANCE);
        }

        for(int i = 0; i < instances.size(); i++){
            for(int j = 0; j < instances.size(); j++){
                Assert.assertEquals(instances.get(i), instances.get(j));
            }
        }

    }

    /**
     * 多线程测试
     */
    @Test
    public void testMultiThread(){

        final List<EnumSingleton> instances = Collections.synchronizedList(new ArrayList<EnumSingleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    instances.add(EnumSingleton.INSTANCE);
                }
            }.start();
        }

        for(int i = 0; i < instances.size(); i++){
            for(int j = 0; j < instances.size(); j++){
                Assert.assertEquals(instances.get(i), instances.get(j));
            }
        }

    }

    /**
     * 方法调用测试
     */
    @Test
    public void testMethodInvoke(){

        final List<EnumSingleton> instances = Collections.synchronizedList(new ArrayList<EnumSingleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    instances.add(EnumSingleton.INSTANCE);
                }
            }.start();
        }

        for(int i = 0; i < instances.size(); i++){
            EnumSingleton.INSTANCE.execute();
        }

    }


}
