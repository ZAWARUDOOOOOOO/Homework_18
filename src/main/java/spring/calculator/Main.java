package spring.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        System.out.println(context.getBean(Calculator.class).sum(10, 2));
        System.out.println(context.getBean(Calculator.class).subtract(10, 2));
        System.out.println(context.getBean(Calculator.class).multiply(10, 2));
        System.out.println(context.getBean(Calculator.class).divide(10, 2));
    }
}
