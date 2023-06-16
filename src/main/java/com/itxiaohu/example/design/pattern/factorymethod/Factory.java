package com.itxiaohu.example.design.pattern.factorymethod;

/**
 * 抽象工厂角色
 *
 * 工厂角色负责实现创建所有实例的内部逻辑
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public interface Factory {

    /**
     * 创建产品
     *
     * @return 产品
     */
    Product createProduct();

    /**
     * 创建产品
     *
     * @param use 用途
     * @return 产品
     */
    Product createProduct(String use);

}
