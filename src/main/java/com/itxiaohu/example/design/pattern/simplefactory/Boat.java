package com.itxiaohu.example.design.pattern.simplefactory;

/**
 * 具体产品角色
 *
 * 具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class Boat implements Product {
    @Override
    public String getName() {
        return "Product Boat";
    }
}
