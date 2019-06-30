package Java;

class A
{
    // 인스턴스 필드와 메서드
    int field1;
    void Method1(){}

    // 정적 필드와 메서드
    static int field2;
    static void Method2(){}

    class B     // 인스턴스 멤버 클래스
    {
        void Method()       // 인스턴스 멤버 클래스 메서드
        {
            field1 = 10;    // 인스턴스 필드에 접근 가능
            Method1();      // 인스턴스 메서드에 접근 가능

            field2 = 20;    // 정적 필드에 접근 가능
            Method2();      // 정적 메서드에 접근 가능
        }
    }

    static class C      // 정적 멤버 클래스
    {
        void Method()       // 정적 멤버 클래스 메서드
        {
            field1 = 10;    // 인스턴스 필드에 접근 불가능
            Method1();      // 인스턴스 메서드에 접근 불가능

            field2 = 20;    // 정적 필드에 접근 가능
            Method2();      // 정적 메서드에 접근 가능
        }
    }
}

public class Member_Class_Method_Access_Modify
{
    public static void main(String[] args)
    {

    }
}