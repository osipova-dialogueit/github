package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private RockMusic rockMusic;

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() +
                " & " + rockMusic.getSong();
    }
}
