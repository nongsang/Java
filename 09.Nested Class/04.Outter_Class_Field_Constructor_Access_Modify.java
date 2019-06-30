package Java;

class A
{
    class B{}           // 인스턴스 멤버 클래스
    static class C{}    // 정적 멤버 클래스

    // 인스턴스 필드
    B field1 = new B(); // 생성가능
    C field2 = new C(); // 생성가능

    // 인스턴스 메서드
    void Method1()
    {
        B var1 = new B();   // 생성가능
        C var2 = new C();   // 생성가능
    }

    // 정적 필드
    static B field3 = new B();  // 생성불가능, B는 인스턴스 멤버 클래스기 때문
    static C field4 = new C();  // 생성가능, C는 정적 멤버 클래스기 때문

    // 정적 메서드
    static void Method2()
    {
        B var3 = new B();   // 생성불가능, B는 인스턴스 멤버 클래스기 때문
        C var4 = new C();   // 생성가능, C는 정적 멤버 클래스기 때문
    }
}

public class Outter_Class_Field_Constructor_Access_Modify
{
    public static void main(String[] args)
    {

    }
}