package ru.alishev.springcourse;

/**
 * @project ru.alishev.springcourse
 * @user: tosipova
 **/
public class TestBean {  //бин = объект
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
