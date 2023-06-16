package com.itxiaohu.example.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 登记式/静态内部类(static inner class)单例测试
 * @author IT小胡
 */
public class SICSingletonPatternTest {

    /**
     * 单线程测试
     */
    @Test
    public void testSingleThread(){

        List<SICSingleton> instances = new ArrayList<SICSingleton>();

        for(int i = 0; i < 100; i++){
            instances.add(SICSingleton.getInstance());
        }

        for(int i = 0; i < instances.size(); i++){
            for(int j = 0; j < instances.size(); j++){
                Assert.assertEquals(instances.get(i), instances.get(j));
            }
        }

    }

    @Test
    public void testMultiThread(){

        final List<SICSingleton> instances = Collections.synchronizedList(new ArrayList<SICSingleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    instances.add(SICSingleton.getInstance());
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
