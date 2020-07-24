package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Adm on 24.07.2020
 * @project ru.alishev.springcourse
 **/
@Component
public class Computer {
    private int id;
    @Autowired
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer " + id +
                ", Playing: " + musicPlayer.playMusic(Genre.ROCK);
    }
}
