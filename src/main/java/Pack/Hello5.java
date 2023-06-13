package Pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 고객 입력 필드
class RegisterRequest {

  String name;

  RegisterRequest(String name) {
    this.name = name;
  }
}

// VO
class Member {

  String name;
}

class MemberDao {

  void insert(Member member) {
    System.out.println(member.name + " insert into db");
  }
}

class MemberRegisterService {

  @Autowired
  MemberDao memberDao;

  void register(RegisterRequest rr) {
    Member member = new Member();
    member.name = rr.name + "바보";
    memberDao.insert(member);
  }
}

@Configuration
class AppConfig {

  @Bean
  MemberDao memberDao() {
    return new MemberDao();
  }

  @Bean
  MemberRegisterService memberRegisterService() {
    return new MemberRegisterService();
  }
}

public class Hello5 {

  public static void main(String[] args) {
    System.out.println("start");
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    RegisterRequest rr = new RegisterRequest("홍길동");
    MemberRegisterService service2 = context.getBean(MemberRegisterService.class);
    service2.register(rr);
    context.close();
    System.out.println("end");
  }
}
