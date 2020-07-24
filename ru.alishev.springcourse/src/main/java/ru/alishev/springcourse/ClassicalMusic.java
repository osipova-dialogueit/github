package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Adm on 20.07.2020
 * @project ru.alishev.springcourse
 **/
@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
