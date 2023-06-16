package com.itxiaohu.example.design.pattern.builder;

/**
 * 礼盒建造者(抽象建造者)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public interface GiftBoxBuilder {

    /**
     * 设置礼盒名称
     */
    public void setName();

    /**
     * 包裹礼物
     */
    public void wrapGift();

    /**
     * 计算价格
     */
    public void calcPrice();

    /**
     * 构建礼盒
     */
    public GiftBox build();

}
