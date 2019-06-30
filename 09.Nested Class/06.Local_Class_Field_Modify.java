package Java;

class Outter
{
    // 자바 7 이전
    void Method1(final int param)   // 메서드의 파라미터가 final이 붙어야 로컬 클래스에서 사용할 수 있다.
    {
        final int local = 100;  // 로컬 변수도 final을 붙여야 로컬 클래스에서 사용할 수 있다.

        param = 200;    // final을 붙였으니
        local = 300;    // 중간에 수정 불가능

        class Inner     // 로컬 클래스
        {
            void Method()
            {
                //int param = Outter.param;   // final을 붙이면 멤버 클래스 메서드 내에
                //int local = Outter.local;   // 복사하여 사용한다.

                int result = param + local;
            }
        }
    }

    // 자바 8 이후
    void Method1(int param) // 메서드의 파라미터가 final이 붙지 않아도 로컬 클래스에서 사용할 수 있다.
    {                       // 자바 7의 코딩 스타일처럼 final을 붙여도 된다.
        int local = 100;    // 자동으로 final이 붙기 때문

        param = 200;    // final이므로
        local = 300;    // 중간에 수정 불가능

        class Inner     // 로컬 클래스
        {
            //int param = Outter.param;   // 자바 8 이후에는 멤버 클래스 메서드 내에 복사하는 것이 아니라
            //int local = Outter.local;   // 멤버 클래스의 필드에 복사하여 사용한다.

            void Method()
            {
                int result = param + local;
            }
        }
    }

    // 자바 11 이후?
    void Method2(int param)
    {
        int local = 100;

        param = 200;    // 파라미터의 final이 붙지 않았으므로 수정 가능
        local = 300;    // local도 final이 붙지 않았으므로 수정 가능

        class Inner     // 멤버 클래스
        {
            void Method()
            {
                int result = param + local; // final이 붙지 않으면 멤버 클래스 내에서 사용할 수 없다.
            }
        }
    }
}

public class Local_Class_Field_Modify
{
    public static void main(String[] args)
    {

    }
}