package com.itxiaohu.example.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 新年礼盒建造者(具体建造者)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class NewYearGiftBoxBuilder implements GiftBoxBuilder {

    private GiftBox giftBox = new NewYearGiftBox();

    @Override
    public void setName() {
        giftBox.setName("新年大礼包");
    }

    @Override
    public void wrapGift() {
        List<String> gifts = new ArrayList<String>();
        gifts.add("中影票务通电影卡");
        gifts.add("南极人棉被");
        gifts.add("新年挂历");
        giftBox.setGifts(gifts);
    }

    @Override
    public void calcPrice() {
        giftBox.setPrice(5000.00);
    }

    /**
     * 设置新年祝福语,拓展方法
     */
    private void setMessage() {
        ((NewYearGiftBox)giftBox).setMessage("大吉大利，恭喜发财!");
    }

    @Override
    public GiftBox build() {

        // 建造主流程
        setName();
        wrapGift();
        calcPrice();
        setMessage();

        return giftBox;
    }

}
