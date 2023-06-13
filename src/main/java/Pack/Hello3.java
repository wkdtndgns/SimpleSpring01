//package Pack;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//class Apple {
//
//  Apple() {
//    System.out.println("apple");
//  }
//}
//
//class Banana {
//
//  Banana() {
//    System.out.println("banana");
//  }
//}
//
//// 스프링에게 객체를 생성할 환경설정 클래스임을 알린다
//@Configuration
//class AppConfig {
//
//  // 객체가 생성된다.
//  // apple 이라는 아이디로 생성된 객체를 얻을 수 있다.
//  @Bean
//  @Scope("singleton")
//  public Apple apple() {
//    return new Apple();
//  }
//
//  @Bean
//  @Scope("prototype")
//  public Banana banana() {
//    return new Banana();
//  }
//
//  @Bean
//  public Apple apple01() {
//    return new Apple();
//  }
//  @Bean
//  public Apple apple02() {
//    return new Apple();
//  }
//}
//
//public class Hello3 {
//
//  public static void main(String[] args) {
//    System.out.println("start");
//    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//        AppConfig.class);
//
//    // 싱글톤 패턴으로 만든다
//    Apple a1 = context.getBean("apple", Apple.class);
//    Apple a2 = context.getBean("apple", Apple.class);
//    System.out.println(a1.hashCode());
//    System.out.println(a2.hashCode());
//
//    Banana b1 = context.getBean("banana", Banana.class);
//    Banana b2 = context.getBean("banana", Banana.class);
//    System.out.println(b1.hashCode());
//    System.out.println(b2.hashCode());
//
//    Apple a3 = context.getBean("apple01", Apple.class);
//    Apple a4 = context.getBean("apple02", Apple.class);
//
//    System.out.println(a3.hashCode());
//    System.out.println(a4.hashCode());
//
//    context.close();
//    System.out.println("end");
//  }
//}
