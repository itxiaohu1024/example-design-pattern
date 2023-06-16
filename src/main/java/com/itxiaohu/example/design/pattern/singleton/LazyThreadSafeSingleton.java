package com.itxiaohu.example.design.pattern.singleton;

/**
 * 懒汉式线程安全单例
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class LazyThreadSafeSingleton {

    private static LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton(){}

    public static synchronized LazyThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new LazyThreadSafeSingleton();
        }
        return instance;
    }

}
