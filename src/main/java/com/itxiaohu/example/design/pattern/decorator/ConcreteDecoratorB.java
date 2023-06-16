package com.itxiaohu.example.design.pattern.decorator;

/**
 * 具体装饰类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void addBehavior() {
        logger.info("ConcreteDecoratorB-addBehavior");
    }

}
