package com.itxiaohu.example.design.pattern.simplefactory;

/**
 * 工厂角色
 *
 * 工厂角色负责实现创建所有实例的内部逻辑
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Factory {

    public static Product createProduct(String productName) {

        if("car".equals(productName)) {
            return new Car();
        }


        if("boat".equals(productName)) {
            return new Boat();
        }

        return null;
    }

}
