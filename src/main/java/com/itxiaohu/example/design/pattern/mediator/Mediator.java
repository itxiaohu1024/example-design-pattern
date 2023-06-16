package com.itxiaohu.example.design.pattern.mediator;

import java.util.*;

/**
 * 抽象中介者
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public abstract class Mediator {

    protected final Map<String, Colleague> colleagues = new HashMap();

    /**
     * 操作
     * @param param 参数
     */
    abstract void operation(String id, String param);

    /**
     * 注册同事类
     * @param colleague
     */
    String register(Colleague colleague) {
        String id = UUID.randomUUID().toString();
        colleagues.put(id,colleague);
        colleague.setMediator(this);
        return id;
    }

}
