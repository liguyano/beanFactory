package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void f(BeanFactory factory)
    {
        Factory b=(Factory) factory.getBean("test");
        System.out.println(b.next);
    }
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");
        Factory a=(Factory) factory.getBean("test");
        System.out.println(a.getClass());
        System.out.println(a.next++);
        f(factory);
        System.out.println("Hello world!");

    }
}