package org.wipro.Employeeapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = (Employee) context.getBean("employee1");
        emp.display();
    }
}
