package ru.alishev.springcourse;

/**
 * @author Adm on 20.07.2020
 * @project ru.alishev.springcourse
 **/
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
