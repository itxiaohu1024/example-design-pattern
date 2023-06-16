package com.itxiaohu.example.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 容器单例测试
 * @author IT小胡
 */
public class ContainerSingletonPatternTest {

    /**
     * 单线程测试
     */
    @Test
    public void testSingleThread(){

        List<Singleton> instances = new ArrayList<Singleton>();

        for(int i = 0; i < 100; i++){
            ContainerSingleton.putInstance(Singleton.class, new Singleton());
            instances.add(ContainerSingleton.getInstance(Singleton.class));
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

        final List<Singleton> instances = Collections.synchronizedList(new ArrayList<Singleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    ContainerSingleton.putInstance(Singleton.class, new Singleton());
                    instances.add(ContainerSingleton.getInstance(Singleton.class));
                }
            }.start();
        }

        for(int i = 0; i < instances.size(); i++){
            for(int j = 0; j < instances.size(); j++){
                Assert.assertEquals(instances.get(i), instances.get(j));
            }
        }

    }

    public static class Singleton {}

}
