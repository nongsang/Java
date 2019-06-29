package Java;

class A
{
    A()     // A 생성자
    {
        System.out.println("A 생성");
    }

    void Method()
    {
        class D     // 로컬 클래스
        {
            D()     // D 생성자
            {
                System.out.println("D 생성");
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

        D d = new D();  // A 메서드 내에 정의한 D 클래스를 생성
        d.field1 = 3;   // D 필드 접근
        d.Method1();    // D 메서드 호출
    }
}

public class Local_Class
{
    public static void main(String[] args)
    {
        A a = new A();

        a.Method(); // 메서드를 호출하면 D 생성
    }
}