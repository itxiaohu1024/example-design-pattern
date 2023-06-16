package com.itxiaohu.example.design.pattern.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）单例
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class DCLSingleton {

    private volatile static DCLSingleton instance;

    private DCLSingleton(){}

    public static DCLSingleton getInstance(){
        if(instance == null){
            synchronized (DCLSingleton.class){
                if(instance == null){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

}
