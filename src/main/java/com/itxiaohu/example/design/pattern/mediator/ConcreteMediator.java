package com.itxiaohu.example.design.pattern.mediator;

import java.util.Objects;

/**
 * 具体中介者
 *
 * <p>更多内容参看<a href="https://itxiaohu.com"><b>IT小胡频道</b></a>
 * @author IT小胡
 */
public class ConcreteMediator extends Mediator {

    @Override
    void operation(String id, String param) {
        Colleague colleague = this.colleagues.get(id);
        if(Objects.nonNull(colleague)) {
            colleague.receive(param);
        }
    }

}
