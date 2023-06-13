package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//class Greeter {
//
//  String format;
//
//  String greet(String guest) {
//    return String.format(format, guest);
//  }
//
//  public void setFormat(String format) {
//    this.format = format;
//  }
//}

// 스프링에게 객체를 생성할 환경설정 클래스임을 알린다
//@Configuration
//class AppConfig {
//
//  // 객체가 생성된다.
//  // apple 이라는 아이디로 생성된 객체를 얻을 수 있다.
//  @Bean
//  public Greeter greeter() {
//    System.out.println("test");
//    return new Greeter();
//  }
//}

public class Hello2 {

  public static void main(String[] args) {
//    String result = String.format("%s꽃이%d송이피었습니다.", "민들레", 10);
//    System.out.println(result);

    System.out.println("start");
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        AppConfig.class);
//    Greeter greeter = context.getBean("greeter", Greeter.class);
//    greeter.setFormat("%s님, 안녕하세요.");
//    System.out.println(greeter.greet("호랑이"));

    context.close();
    System.out.println("end");
  }
}
