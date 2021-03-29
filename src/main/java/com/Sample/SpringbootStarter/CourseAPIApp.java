package com.Sample.SpringbootStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Springboot oldugunu gösterir
public class CourseAPIApp {

    public static void main(String[] args) {

        SpringApplication.run(CourseAPIApp.class,args); //run methoduna argument olarak icinde bulunulan class ismi yazilir)
        //performs class path scan
        //Starts Tomcat server

    }
}
