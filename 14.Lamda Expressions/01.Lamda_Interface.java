package Java;

interface MyInterface1  // 람다를 사용하기 위해서는 인터페이스가 필요하다.
{                       // C#으로 비유하면 델리게이트같은 개념
    void Method();  // 매개변수가 없는 인터페이스 메서드
                    // 메서드는 인터페이스당 1개여야만 한다.
}

@FunctionalInterface    // 1개의 추상 메서드만 선언된 인터페이스인지 컴파일러가 확인한다.
                        // 2개 이상의 추상 메서드가 선언되면 컴파일 오류가 발생한다.
interface MyInterface2
{
    void Method(int x);    // 매개변수가 1개인 인터페이스 메서드
}

interface MyInterface3
{
    int Method(int x, int y);   // 매개변수가 2개인 인터페이스 메서드
                                // 이번에는 반환형이 존재하는 메서드다.
}

public class Lamda
{
    public static void main(String[] args)
    {
        // 자바 8 부터 람다사용 가능
        // 익명 메서드를 구현하기 위해서 도입했다.
        // 코드가 간결해지고, 1번만 사용할거면 즉석에서 제작하여 사용할 수 있다.
        // 컬렉션 필터링이나 매핑도 간결해진다.
        // 자바는 람다를 하나의 익명 객체로 취급한다.
        // 인터페이스가 필요하며, 인터페이스를 정의하여 사용하는 방식이다.

        MyInterface1 inter1 = () -> {System.out.println("Hello");}; // 람다의 사용
                                                                    // ()는 매개변수가 없는 메서드를 사용하겠다는 의미다.
                                                                    // 그리고 메서드를 즉석에서 정의한다.
                                                                    // 여기서 MyInterface1은 타겟 타입이라고 부른다.
        inter1.Method();    // 람다로 정의된 메서드 호출

        inter1 = () -> System.out.println("World!");    // 람다의 정의 부분에 실행문이 하나라면 {}로 묶지 않아도 된다.
                                                        // 그리고 기존의 메서드를 다른 내용으로 변경
        inter1.Method();    // 람다로 정의된 메서드 호출

        inter1 = () ->
        {
            String string = "Java";     // 람다 내부에서 변수 생성해서 사용가능
            System.out.println(string); // 람다는 익명 메서드기 때문
        };
        inter1.Method();    // 람다로 정의된 메서드 호출

        inter1 = new MyInterface1() // 기존의 즉석으로 인터페이스를 정의하여 사용하는 법
        {
            @Override
            public void Method()
            {
                System.out.println("Good!");
            }
        };

        MyInterface2 inter2 = (int x) -> {  // 매개변수가 1개인 메서드를 정의한다.
            int a = x + 5;                  // 어떤 자료형의 값을 전달할지 자료형을 명시해준다.
            System.out.println(a);
        };
        inter2.Method(5);   // 인수를 전달하여 메서드 호출

        inter2 = (x) -> {   // 자료형을 명시하지 않아도 컴파일러가 추론하여 값을 전달한다.
            int a = x + 10;
            System.out.println(a);
        };
        inter2.Method(5);   // 인수를 전달하여 메서드 호출

        inter2 = x -> {     // 더욱 줄여서 매개변수가 1개일 때는 ()를 사용하지 않아도 된다.
            int a = x + 15;
            System.out.println(a);
        };
        inter2.Method(5);   // 인수를 전달하여 메서드 호출

        MyInterface3 inter3 = (int x, int y) -> {   // 매개변수가 2개인 메서드를 정의한다.
            int result = x + y;
            return result;                          // 이번에는 return이 존재한다.
        };
        System.out.println(inter3.Method(1, 2));    // 메서드를 호출하여 결과값 출력

        inter3 = (x, y) -> { return x + y; };       // 컴파일러 추론으로 자료형을 생략하고 return만 남겼다.
        System.out.println(inter3.Method(3, 4));    // 메서드를 호출하여 결과값 출력

        inter3 = (x, y) -> x + y;                   // 극단적으로 줄여서 return값이 존재한다면 return도 생략할 수 있다.
                                                    // 하지만 매개변수가 2개 이상이면 매개변수가 1개였을 때 처럼 ()를 생략할 수 없다.
        System.out.println(inter3.Method(5, 6));    // 메서드를 호출하여 결과값 출력

        inter3 = (x, y) -> sum(x, y);               // 람다로 다른 메서드를 호출할 수 있다.
        System.out.println(inter3.Method(7, 8));    // 메서드를 호출하여 결과값 출력
    }

    static int sum(int x, int y)    // 람다에서 호출할 메서드
    {
        return x + y;
    }
}