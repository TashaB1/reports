package com.tashad16a.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TashaD on 21.10.2020.
 */
@Component
public class MusicPlayer {
    @Autowired
    private List<Music> musicList = new ArrayList<>();

    /*private String name;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music musicPlay: musicList) {
          System.out.println("Playing:" + musicPlay.getSong());
        }
    }
}
