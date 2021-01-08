package com.tashad16a.gmail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //ClassicalMusic classicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class);

       // System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
       // MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
       // MusicPlayer thirdMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

       // boolean comparison = firstMusicPlayer == secondMusicPlayer;

       // System.out.println(comparison);

       // System.out.println(firstMusicPlayer);
       // System.out.println(secondMusicPlayer);

       // firstMusicPlayer.setVolume(10);

        //System.out.println(firstMusicPlayer.getVolume());
        //System.out.println(secondMusicPlayer.getVolume());

     //   musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

      //  Computer computer = context.getBean("computer", Computer.class);
      //  System.out.println(computer);

        ClassicalMusic classicalMusic1 = context.getBean("musicClassicalBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicClassicalBean", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);
        context.close();
    }
}
