package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//class Apple {
//  Apple(){
//    System.out.println("생성자 콜");
//  }
//  public void show() {
//    System.out.println("apple");
//  }
//
//  public void f1() {
//    System.out.println("f1");
//  }
//}

// 스프링에게 객체를 생성할 환경설정 클래스임을 알린다
//@Configuration
//class AppConfig {
//  // 객체가 생성된다.
//  // apple 이라는 아이디로 생성된 객체를 얻을 수 있다.
//  @Bean
//  public Apple apple() {
//    return new Apple();
//  }
//}

public class Hello1 {
  public static void main(String[] args) {
    System.out.println("start");
//    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    Apple apple = context.getBean("apple", Apple.class);
//    apple.f1();
//
//    context.close();
    System.out.println("end");
  }
}
