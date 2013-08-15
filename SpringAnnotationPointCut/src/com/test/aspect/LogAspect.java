package com.test.aspect;

 //import org.aspectj.lang.annotation.After;
 import org.aspectj.lang.annotation.Aspect;
 import org.aspectj.lang.annotation.Before;
 import org.aspectj.lang.annotation.Pointcut;

 @Aspect
 public class LogAspect {

 @Before("allGetters() && allcircle()")
 public void loggingAdvice()
 {
  System.out.println("Wel Come With....logging advice");
 }
   
 @Pointcut("execution(* get*())")
 public void allGetters()
 {
 System.out.println("Wel Come With....allgetters");
 }
   
 @Pointcut("within(com.test.App.Circle)")
  public void allcircle()
  {
  System.out.println("Wel Come With....circle");
  }
 }