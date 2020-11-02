package com.tashad16a.gmail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TashaD on 21.10.2020.
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
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
    }

    //IoS
    /*  public MusicPlayer(Music music){
        this.music=music;
    } */

    public MusicPlayer(){}

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music musicPlay: musicList) {
          System.out.println("Playing:" + musicPlay.getSong());
        }
    }
}
