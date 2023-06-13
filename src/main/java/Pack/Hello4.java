//package Pack;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//class Airplane {
//
//  @Autowired
//  Water water;
//
//  void fly() {
//    this.water.use();
//    System.out.println("fly");
//  }
//}
//
//class Water {
//
//  void use() {
//    System.out.println("use water ");
//  }
//}
//
//// 스프링에게 객체를 생성할 환경설정 클래스임을 알린다
//@Configuration
//@ComponentScan
//class AppConfig {
//
//  @Bean
//  Water water() {
//    return new Water();
//  }
//
//  @Bean
//  Airplane airplane() {
//    return new Airplane();
//  }
//}
//
//public class Hello4 {
//
//  public static void main(String[] args) {
//    System.out.println("start");
//    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//        AppConfig.class);
//    Airplane airplane = context.getBean(Airplane.class);
//    airplane.fly();
//    context.close();
//    System.out.println("end");
//  }
//}
