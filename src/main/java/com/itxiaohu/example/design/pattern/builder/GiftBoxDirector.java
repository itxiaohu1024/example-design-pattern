package com.itxiaohu.example.design.pattern.builder;

/**
 * 礼盒导演者
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class GiftBoxDirector {

    /**
     * 使用建造者创建产品
     */
    public GiftBox buildGiftBox(GiftBoxBuilder builder) {
        return builder.build();
    }

}
