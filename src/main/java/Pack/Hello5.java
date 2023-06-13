package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {

}

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

  MemberDao memberDao;

  MemberRegisterService(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  void register(RegisterRequest rr) {
    // 2. 클라에서 받았다고 가정하자
    // vo로 변환하는 과정
    Member member = new Member();
    member.name = rr.name + "바보";
    // db에 등록하는 코드

    memberDao.insert(member);
  }
}

public class Hello5 {

  public static void main(String[] args) {
    MemberRegisterService service = new MemberRegisterService(new MemberDao());
    // 1. 클라이언트에서 폼 전송을 하였다.
    RegisterRequest rr = new RegisterRequest("홍길동");
    service.register(rr);

//    System.out.println("start");
//    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//        AppConfig.class);
//    context.close();
//    System.out.println("end");
  }
}
