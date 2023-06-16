package com.itxiaohu.example.design.pattern.builder;

import java.util.List;

/**
 * 礼盒(抽象产品)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public abstract class GiftBox {

    protected String name;        //名称

    protected List<String> gifts; //礼品

    protected Double price;       //价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGifts() {
        return gifts;
    }

    public void setGifts(List<String> gifts) {
        this.gifts = gifts;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
