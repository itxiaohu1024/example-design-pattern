package com.itxiaohu.example.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）单例测试
 * @author IT小胡
 */
public class DCLSingletonPatternTest {

    /**
     * 单线程测试
     */
    @Test
    public void testSingleThread(){

        List<DCLSingleton> instances = new ArrayList<DCLSingleton>();

        for(int i = 0; i < 100; i++){
            instances.add(DCLSingleton.getInstance());
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

        final List<DCLSingleton> instances = Collections.synchronizedList(new ArrayList<DCLSingleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    instances.add(DCLSingleton.getInstance());
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
