package com.succeed;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/8/4 - 21:06
 * @apiNote
 */
public class BookTest {
    @Test
    public void test111(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        final Service service = context.getBean("service", Service.class);
        final List<Book> all = service.findAll();
        for (Book book : all) {
            System.out.println(book);
        }
    }
}
