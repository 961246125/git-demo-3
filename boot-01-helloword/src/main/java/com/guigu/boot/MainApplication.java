package com.guigu.boot;

import com.guigu.boot.bean.Pet;
import com.guigu.boot.bean.User;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
    主程序类
    @SpringBootApplication：这是一个springboot应用
 */

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        String[] names = run.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("123456789");
        }

        Pet tom01 = context.getBean(Pet.class);
        System.out.println(tom01.getName());

        Pet tom02 = run.getBean(Pet.class);
        System.out.println(tom02.getName());
    }


}
