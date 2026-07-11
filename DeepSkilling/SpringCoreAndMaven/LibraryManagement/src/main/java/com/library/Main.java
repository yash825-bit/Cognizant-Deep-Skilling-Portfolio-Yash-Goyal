package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieving a Bean
        BookService service = context.getBean("bookService", BookService.class);

        //Calling the bean's method
        service.displayService();
    }
}
