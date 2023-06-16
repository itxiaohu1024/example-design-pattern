package com.itxiaohu.example.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 国庆礼盒建造者(具体建造者)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class NationalDayGiftBoxBuilder implements GiftBoxBuilder {

    private GiftBox giftBox = new NationalDayGiftBox();

    @Override
    public void setName() {
        giftBox.setName("国庆大礼包");
    }

    @Override
    public void wrapGift() {
        List<String> gifts = new ArrayList<String>();
        gifts.add("沃尔玛购物卡");
        gifts.add("京东购物卡");
        giftBox.setGifts(gifts);
    }

    @Override
    public void calcPrice() {
        giftBox.setPrice(3000.00);
    }

    /**
     * 设置礼金,拓展方法
     */
    private void setCash() {
        ((NationalDayGiftBox)giftBox).setCash(1000);
    }

    @Override
    public GiftBox build() {

        // 建造主流程
        setName();
        wrapGift();
        calcPrice();
        setCash();

        return giftBox;
    }

}
