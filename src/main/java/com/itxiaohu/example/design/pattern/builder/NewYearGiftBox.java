package com.itxiaohu.example.design.pattern.builder;

/**
 * 新年礼盒(具体产品)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class NewYearGiftBox extends GiftBox {

    private String message; //新年寄语,拓展属性

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NewYearGiftBox{");
        sb.append("name:").append(this.name).append(", ");
        sb.append("gift:[");
        for(String gift : this.gifts) {
            sb.append(gift).append(", ");
        }
        int len = sb.length();
        sb.delete(len -2, len);
        sb.append("]").append(", ");
        sb.append("price:").append(this.price).append(", ");
        sb.append("message:").append(this.message);
        sb.append("}");
        return sb.toString();
    }

}
