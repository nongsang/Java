package Java;

import Java.PrintAnnotation.*;  // 자신이 만든 어노테이션 사용
                                // 내부는 이미 만들어진 어노테이션도 사용하니 확인할 것

import java.lang.reflect.*;

class Service
{
    // 어노테이션은 주석처럼 사용할 수 있고, 특정 기능을 구현하기 위해 사용할 수 있다.
    // 클래스, 필드, 메서드 가리지 않고 바로 아래 요소에 적용된다.
    // C#의 어트리뷰트같은 것.

    @PrintAnnotation    // PrintAnnotation은 Target을 메서드로 제한했으므로 메서드에만 사용 가능하다.
    void Print1()       // PrintAnnotation의 멤버는 default로 값을 정해줬으니 아무값도 정해주지 않고 호출할 수 있다.
    {
        System.out.println("Print1()");
    }

    @PrintAnnotation("*")   // PrintAnnotation의 가장 첫번째 멤버에 값을 전달하고 호출한다.
    void Print2()
    {
        System.out.println("Print2()");
    }

    @PrintAnnotation(value = "#", Num = 20) // PrintAnnotation의 메버에 2개 이상 값을 전달하려면
    void Print3()                           // 각 멤버에 직접 값을 전달해주고 호출해야 한다.
    {
        System.out.println("Print3()");
    }

}

public class Annotation
{
    public static void main(String[] args)
    {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for(var method : declaredMethods)   // 메소드 전부
        {
            if(method.isAnnotationPresent(PrintAnnotation.class))   // PrintAnnotation라는 어노테이션 클래스를 적용했는지 확인한다.
            {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);  // 메소드에 적용된 어노테이션 정보를 사용한다.

                System.out.println(method.getName() + "에는 적용되어 있음");    // 적용된 메소드의 이름 출력

                System.out.println("value : " + printAnnotation.value());   // 어노테이션의 value값을 출력
                System.out.println("Num : " + printAnnotation.Num());       // 어노테이션의 Num값을 출력

                for(int i = 0; i < printAnnotation.Num(); ++i)  // 어노테이션의 Num 갯수만큼
                {
                    System.out.print(printAnnotation.value());  // 어노테이션의 value를 출력
                }

                System.out.println();

                // 지금까지는 적용된 어노테이션을 알아내는 방법이었다.

                try
                {
                    method.invoke(new Service());   // 리플렉트로 메서드 실행
                }
                catch (Exception e) {}
            }
            else
            {
                System.out.println(method.getName() + "에는 적용되어 있지 않음");
            }
        }
    }
}