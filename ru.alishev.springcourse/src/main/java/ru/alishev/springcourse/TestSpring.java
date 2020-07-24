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

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
