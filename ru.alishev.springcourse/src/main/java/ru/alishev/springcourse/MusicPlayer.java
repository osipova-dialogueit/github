package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List myList;
    public MusicPlayer(List <Music> musicList) {
        List myList = musicList;
        //this.music1 = music1;
        //this.music2 = music2;
    }
    public String playMusic(Genre genre) {
        Random random = new Random();
        int rand = random.nextInt(3);
        Music music = (Music) myList.get(random.nextInt(myList.size()));
        return "Playing: " + music.getSong()
                + " with volume " + this.volume;
        /*if (genre == Genre.ROCK) {
            return "Playing: " + music1.getSong() + ", " + music2.getSong();
        }else if (genre == Genre.CLASSIC) {
            return "Playing: " + music2.getSong();
        } else
            return "";*/
    }
}
