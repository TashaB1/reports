package com.tashad16a.gmail;

/**
 * Created by TashaD on 21.10.2020.
 */
public class MusicPlayer {
    private Music music;
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
    public MusicPlayer(Music music){
        this.music=music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing:" + music.getSong());
    }
}
