package com.itxiaohu.example.design.pattern.singleton;

/**
 * 懒汉式线程不安全单例
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class LazyThreadUnsafeSingleton {

    private static LazyThreadUnsafeSingleton instance;

    private LazyThreadUnsafeSingleton(){}

    public static LazyThreadUnsafeSingleton getInstance(){
        if(instance == null){
            instance = new LazyThreadUnsafeSingleton();
        }
        return instance;
    }

}
