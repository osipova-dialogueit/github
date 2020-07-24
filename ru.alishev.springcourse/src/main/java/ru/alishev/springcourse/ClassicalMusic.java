package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Adm on 20.07.2020
 * @project ru.alishev.springcourse
 **/
public class ClassicalMusic implements Music{
    private List list;

    @Override
    public String getSong() {
        List<String> list = new ArrayList<>();
        list.add("Hungarian Rhapsody");
        list.add("Seasons");
        list.add("Fly of the bee");
        Random random = new Random();
        int rand = random.nextInt(3);
        return  list.get(rand);
    }
}
