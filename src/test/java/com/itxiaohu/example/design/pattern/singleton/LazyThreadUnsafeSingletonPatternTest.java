package com.itxiaohu.example.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 懒汉式线程不安全单例测试
 * @author IT小胡
 */
public class LazyThreadUnsafeSingletonPatternTest {

    /**
     * 单线程测试
     */
    @Test
    public void testSingleThread(){

        List<LazyThreadUnsafeSingleton> instances = new ArrayList<LazyThreadUnsafeSingleton>();

        for(int i = 0; i < 100; i++){
            instances.add(LazyThreadUnsafeSingleton.getInstance());
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

        final List<LazyThreadUnsafeSingleton> instances = Collections.synchronizedList(new ArrayList<LazyThreadUnsafeSingleton>());

        for(int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    instances.add(LazyThreadUnsafeSingleton.getInstance());
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
