package com.tashad16a.gmail;

import org.springframework.stereotype.Component;

/**
 * Created by TashaD on 02.11.2020.
 */

@Component("musicJazzBean")
public class JazzMusic implements Music {

  /*  public void doMyInit(){
        System.out.println("Doing my initialization (Jazz)");
    }

    public void  doMyDestroy(){
        System.out.println("Doing my destruction (Jazz)");
    }*/

    @Override
    public String getSong() {
        return "what a wonderful world";
    }
}
