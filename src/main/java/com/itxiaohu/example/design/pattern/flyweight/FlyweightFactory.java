package com.itxiaohu.example.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 享元工厂类
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class FlyweightFactory {

    private final Map<String, Flyweight> cache = new HashMap<>();

    public Flyweight getFlyweight(String key) {
       while (true) {
           Flyweight flyweight = cache.get(key);
           if(Objects.nonNull(flyweight)) {
               return flyweight;
           }
           ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight();
           concreteFlyweight.setIntrinsicState((int)System.currentTimeMillis());
           cache.put(key, concreteFlyweight);
       }
    }

}
