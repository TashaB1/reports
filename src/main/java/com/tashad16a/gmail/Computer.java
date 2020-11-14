package com.tashad16a.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by TashaD on 14.11.2020.
 */
@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic();
    }
}
