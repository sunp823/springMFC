package com.mkyong.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by hzsunpeng on 2016/5/27.
 */
public class App {
    public static void main( String[] args )
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"applicationContex.xml"});
        Customer cust = (Customer)context.getBean("customerBean");
        System.out.println(cust);
    }
}
