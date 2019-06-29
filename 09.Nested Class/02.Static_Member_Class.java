package Java;

class A
{
    A()     // A 생성자
    {
        System.out.println("A 생성");
    }

    static class C     // 정적 멤버 클래스
    {
        C()     // C 생성자
        {
            System.out.println("C 생성");
        }

        int field1; // 인스턴스 필드 정의 가능
                    // 접근제어자도 선언 가능

        static int field2;  // static 필드 정의 가능

        void Method1()      // 메서드 정의 가능
        {
            System.out.println("Method1() 호출");
        }

        static void Method2()   // static 메서드 정의 가능
        {
            System.out.println("Method2() 호출");
        }
    }
}

public class Static_Member_Class
{
    public static void main(String[] args)
    {
        A.C c = new A.C();  // A가 생성되지 않았어도 C를 생성할 수 있다.

        c.field1 = 3;   // C 인스턴스 필드 접근
        c.Method1();    // C 인스턴스 메서드 호출
        c.field2 = 4;   // C 정적 필드 접근 가능
        c.Method2();    // C 정적 메서드 호출 가능

        A.C.field2 = 5; // 정적 필드이므로 인스턴스화를 하지 않고 접근 가능
        A.C.Method2();  // 정적 메서드이므로 인스턴스화를 하지 않고 호출 가능
    }
}