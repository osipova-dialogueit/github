package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adm on 20.07.2020
 * @project ru.alishev.springcourse
 **/
public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List music) {
        this.musicList = music;
    }
    public MusicPlayer() { }
    public void setMusic(List music) {
        this.musicList = music;
    }
    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("Playing music " + music.getSong());
        }
    }
}
