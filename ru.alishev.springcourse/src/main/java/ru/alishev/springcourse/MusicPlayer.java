package ru.alishev.springcourse;

/**
 * @author Adm on 20.07.2020
 * @project ru.alishev.springcourse
 **/
public class MusicPlayer {
    private Music music;
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing music " + music.getSong());
    }
}
