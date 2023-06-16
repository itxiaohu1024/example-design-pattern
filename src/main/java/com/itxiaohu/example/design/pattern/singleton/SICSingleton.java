package com.itxiaohu.example.design.pattern.singleton;

/**
 * 登记式/静态内部类(static inner class)单例
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class SICSingleton {

    private static class SICSingletonHolder {
        private static final SICSingleton INSTANCE = new SICSingleton();
    }

    private SICSingleton(){}

    public static final SICSingleton getInstance() {
        return SICSingletonHolder.INSTANCE;
    }

}
