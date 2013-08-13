package com.test.aop;

 import org.springframework.context.ApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext;

 import com.test.service.Shape;

 public class Main {

 
 public static void main(String[] args) {

  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
  Shape sh=context.getBean("shape", Shape.class);
  System.out.println(sh.getTriangle().getName());
  System.out.println(sh.getCircle().getName());
 }

 }