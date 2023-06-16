package com.itxiaohu.example.design.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ContainerSingleton {

    private static final Map<Class, Object> cache = new HashMap<Class, Object>();

    private ContainerSingleton(){}

    public static void putInstance(Class clazz, Object instance){
        if(cache.containsKey(clazz)){
            return;
        }
        cache.put(clazz, instance);
    }

    public static <T> T getInstance(Class<T> clazz){
        return clazz.cast(cache.get(clazz));
    }

}
