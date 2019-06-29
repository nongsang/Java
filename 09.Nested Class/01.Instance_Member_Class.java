package Java;

class A
{
    A()     // A 생성자
    {
        System.out.println("A 생성");
    }

    class B     // 인스턴스 멤버 생성자
    {
        B()     // B 생성자
        {
            System.out.println("B 생성");
        }

        int field1; // 인스턴스 필드 정의 가능
                    // 접근제어자도 선언 가능

        static int field2;  // static 필드 정의 불가능

        void Method1()      // 메서드 정의 가능
        {
            System.out.println("Method1() 호출");
        }

        static void Method2()   // static 메서드 정의 불가능
        {
            System.out.println("Method2() 호출");
        }
    }
}

public class Instance_Member_Class
{
    public static void main(String[] args)
    {
        A a = new A();      // A 생성

        A.B b = a.new B();  // A가 생성된 후에 B를 생성할 수 있다.

        b.field1 = 3;   // B 인스턴스 필드 접근
        b.Method1();    // B 인스턴스 메서드 호출
    }
}