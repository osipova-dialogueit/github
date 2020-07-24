package ru.alishev.springcourse;

/**
 * @author Adm on 20.07.2020
 * @project ru.alishev.springcourse
 **/
public class ClassicalMusic implements Music{
    private  ClassicalMusic() { } //приватный конструткор

    public static ClassicalMusic getClassicalMusic() {  //фабричный метод
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Initializing...");
    }

    public void doMyDestroy() {
        System.out.println("Desrtucting...");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
