package com.itxiaohu.example.design.pattern.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * 建造者模式示例
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class BuilderPatternTest {

    @Test
    public void test() {
        // 1.创建导演者
        GiftBoxDirector director = new GiftBoxDirector();

        // 2.导演者使用国庆礼盒建造者创建国庆礼盒
        GiftBox giftBox = director.buildGiftBox(new NationalDayGiftBoxBuilder());
        Assert.assertTrue(giftBox instanceof  NationalDayGiftBox);

        // 3.导演者使用新年礼盒建造者创建新年礼盒
        giftBox = director.buildGiftBox(new NewYearGiftBoxBuilder());
        Assert.assertTrue(giftBox instanceof  NewYearGiftBox);
    }

}
