package com.tashad16a.gmail;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by TashaD on 21.10.2020.
 */

@Component("musicClassicalBean")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization (Classical)");
    }

    @PreDestroy
    public void  doMyDestroy(){
        System.out.println("Doing my destruction (Classical)");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
