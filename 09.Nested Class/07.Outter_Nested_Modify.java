package Java;

class A
{
    // 바깥 클래스 필드와 메서드
    String field = "Outter Field";
    void Method()
    {
        System.out.println("Outter Method");
    }

    class B     // 인스턴스 멤버 클래스
    {
        // 인스턴스 멤버 클래스 필드와 메서드
        String field = "Nested Class Field";
        void Method()
        {
            System.out.println("Nested Class Method");
        }

        void Show()
        {
            System.out.println(this.field); // 중첩 클래스의 필드 접근
            this.Method();                  // 중첩 클래스의 메서드 접근

            System.out.println(A.this.field);   // 바깥 클래스의 필드 접근
            A.this.Method();                    // 바깥 클래스의 메서드 호출
        }
    }
}

public class Outter_Nested_Modify
{
    public static void main(String[] args)
    {

    }
}