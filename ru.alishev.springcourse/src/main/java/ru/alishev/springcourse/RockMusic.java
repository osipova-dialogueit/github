package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music{

    @Override
    public String getSong() {
        List<String> list = new ArrayList<>();
        list.add("Wind cries Mary");
        list.add("Personal Jesus");
        list.add("Rock DJ");
        Random random = new Random();
        int rand = random.nextInt(3);
        return list.get(rand);
    }
}
