package Pack;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

abstract class A{
  abstract void f1();
}
class B extends A{
  void f1(){
    System.out.println("B");
  }
}

class Animal {
  Animal() {
    System.out.println("생성자 룰 1");
  }

  void f1() {
    System.out.println("f1");
  }
}

class Tiger extends Animal {
  Tiger() {
    System.out.println("생성자 콜 2");
  }

  void f2() {
    System.out.println("Tiger f2");
  }
}

public class Hello {

  public static void main(String[] args) {

    System.out.println("Start");
//    Animal  a = new Animal();
//    a.f1();

    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
        "classpath:Context.xml");
    Animal a1 = ctx.getBean("tiger", Animal.class);
    Tiger a2 =  ctx.getBean("tiger", Tiger.class);
    a1.f1();
    a2.f1();
    ctx.close();
    System.out.println("end");

  }
}
