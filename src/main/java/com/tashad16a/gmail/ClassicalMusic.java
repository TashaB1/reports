package com.tashad16a.gmail;

import org.springframework.stereotype.Component;

/**
 * Created by TashaD on 21.10.2020.
 */

@Component("musicClassicalBean")
public class ClassicalMusic implements Music {

 /*   public void doMyInit(){
        System.out.println("Doing my initialization (Classical)");
    }

    public void  doMyDestroy(){
        System.out.println("Doing my destruction (Classical)");
    }*/

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
