package Java;

class Person    // 미리 정의된 클래스
{
    String name;
    void Wake()
    {
        System.out.println("7시에 일어납니다.");
    }
}

class A
{
    Person person = new Person()    // 익명 클래스
    {                               // UI 처리나 스레드 할당을 편하게 하려고 주로 사용
        String student;

        void Study()    // 익명 클래스의 메서드
        {
            System.out.println("공부합니다.");
        }

        @Override
        void Wake()     // 오버라이딩
        {
            System.out.println("6시에 일어납니다.");
            Study();
        }
    };

    void Method1()
    {
        person.student; // 익명 클래스의 필드 접근 불가
        person.Wake();  // 익명 클래스의 메서드 중 오버라이드된 메서드 호출 가능
        person.Study;   // 익명 클래스의 메서드 호출 불가
    }

    void Method2(Person person)     // 매개변수로서 익명 클래스를 사용할 수 있다.
    {
        person.Wake();
    }
}

public class Anonumous_Instrance_Modify
{
    public static void main(String[] args)
    {
        A a = new A();

        a.person.Wake();
        a.Method1();

        a.Method2(new Person()  // 인자로 익명 객체를 정의
        {
            String student;

            void Walk()    // 익명 클래스의 메서드
            {
                System.out.println("산책합니다.");
            }

            @Override
            void Wake()     // 오버라이딩
            {
                System.out.println("7시에 일어납니다.");
                Walk();
            }
        });
    }
}