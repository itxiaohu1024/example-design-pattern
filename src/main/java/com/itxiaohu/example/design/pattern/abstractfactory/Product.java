package com.itxiaohu.example.design.pattern.abstractfactory;

public interface Product {

    // 用途:民用,军用
    String USE_FOR_CIVILIAN = "use for civilian";
    String USE_FOR_MILITARY = "use for military";

    /**
     * 获取用途
     *
     * @return 用途
     */
    String getUse();

    /**
     * 获取名称
     * @return 名称
     */
    String getName();

}
