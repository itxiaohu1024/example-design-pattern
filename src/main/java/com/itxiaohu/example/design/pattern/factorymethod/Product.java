package com.itxiaohu.example.design.pattern.factorymethod;

/**
 * 抽象产品角色
 *
 * 抽象产品角色是所创建的所有对象的父类，负责描述所有实例所共有的公共接口
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public interface Product {

    // 用途:民用,军用
    String USE_FOR_CIVILIAN = "use for civilian";
    String USE_FOR_MILITARY = "use for military";

    /**
     * 获取名称
     * @return 名称
     */
    String getName();

    /**
     * 获取用途
     * @return 用途
     */
    String getUse();

}
