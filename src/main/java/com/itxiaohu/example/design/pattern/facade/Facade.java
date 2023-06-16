package com.itxiaohu.example.design.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Facade {

    private static final Logger logger = LoggerFactory.getLogger(Facade.class);

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade(){
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
        this.subSystemC = new SubSystemC();
    }

    public void wrapOperation() {
        this.subSystemA.operation();
        this.subSystemB.operation();
        this.subSystemC.operation();
    }

}
