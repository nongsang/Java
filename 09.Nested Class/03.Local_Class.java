package Java;

class A
{
    void Method()
    {
        class B
        {
            B(){}   // 생성자
            int field1; // 인스턴스 필드 정의 가능
            //static int field2;  // static 필드 정의 불가
            void Method1(){}    // 메서드 정의 가능
            //static void Method2(){} // static 메서드 정의 불가능
        }

        B b = new B();  // 메서드 내에서 정의한 클래스를 생성
        b.field1 = 10;  // 필드 접근 가능
        b.Method1();    // 메서드 호출 가능
    }
}

public class Local_Class
{
    public static void main(String[] args)
    {
        A a = new A();

        a.Method();     // A의 메서드를 호출하면 B를 생성하고 작업한 후 B 클래스 삭제
    }
}