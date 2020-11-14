package com.tashad16a.gmail;

import org.springframework.stereotype.Component;

/**
 * Created by TashaD on 21.10.2020.
 */

@Component("musicRockBean")
public class RockMusic implements Music {

 /*   public void doMyInit(){
        System.out.println("Doing my initialization (Rock)");
    }

    public void  doMyDestroy(){
        System.out.println("Doing my destruction (Rock))");
    }*/

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
