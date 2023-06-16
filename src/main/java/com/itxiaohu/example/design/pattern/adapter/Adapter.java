package com.itxiaohu.example.design.pattern.adapter;

import java.util.UUID;

/**
 * 适配器类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        String[] result = this.adaptee.request(new String[]{UUID.randomUUID().toString()});
        return result[0];
    }

}
