package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");

        System.out.println("Hello world!");
    }
}