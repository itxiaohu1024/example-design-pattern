package com.itxiaohu.example.design.pattern.builder;

/**
 * 国庆礼盒(具体产品)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class NationalDayGiftBox extends GiftBox {

    private long cash; //礼金,拓展属性

    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NationalDayGiftBox{");
        sb.append("name:").append(this.name).append(", ");
        sb.append("gift:[");
        for(String gift : this.gifts) {
            sb.append(gift).append(", ");
        }
        int len = sb.length();
        sb.delete(len -2, len);
        sb.append("]").append(", ");
        sb.append("price:").append(this.price).append(", ");
        sb.append("cash:").append(this.cash);
        sb.append("}");
        return sb.toString();
    }
}
