package com.itxiaohu.example.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 饿汉式单例
 * @author IT小胡
 */
public class EagerSingletonPatternTest {

    /**
     * 单线程测试
     */
    @Test
    public void testSingleThread(){

        List<EagerSingleton> instances = new ArrayList<EagerSingleton>();

        for(int i = 0; i < 100; i++){
            instances.add(EagerSingleton.getInstance());
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

        final List<EagerSingleton> instances = Collections.synchronizedList(new ArrayList<EagerSingleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    instances.add(EagerSingleton.getInstance());
                }
            }.start();
        }

        for(int i = 0; i < instances.size(); i++){
            for(int j = 0; j < instances.size(); j++){
                Assert.assertEquals(instances.get(i), instances.get(j));
            }
        }

    }

}
