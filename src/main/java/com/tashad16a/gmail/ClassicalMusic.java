package com.tashad16a.gmail;

/**
 * Created by TashaD on 21.10.2020.
 */
public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initialization (Classical)");
    }

    public void  doMyDestroy(){
        System.out.println("Doing my destruction (Classical)");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
