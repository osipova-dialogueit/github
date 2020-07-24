package ru.alishev.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @project ru.alishev.springcourse
 * @user: tosipova
 **/
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
