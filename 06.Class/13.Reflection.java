package Java;

import java.lang.reflect.*; // 데이터의 데이터, 메타데이터를 얻을 수 있도록 도와주는 리플렉션을 사용하려면 임포트

class Car
{
    private String name = "람보르기니";
    public String color = "검정";
    public int maxSpeed = 300;

    String getName()
    {
        return name;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}

public class Reflection
{
    public static void main(String[] args)
    {
        Class carReflect = Car.class;   // reflect 중 클래스를 가리키는 Class 클래스
                                        // 클래스이름.class로 클래스의 메타데이터를 얻어올 수 있다.

        System.out.println("carReflect name : " + carReflect.getName());    // 클래스 이름을 출력
        System.out.println("carReflect package : " + carReflect.getPackageName());    // 클래스가 있는 패키지의 위치 출력

        Method[] methods = Car.class.getDeclaredMethods();  // reflect 중 메서드를 가리키는 Method 클래스
                                                            // 클래스이름.class.getDeclaredMethods()로 클래스의 메서드를 전부 얻어올 수 있다.

        for(var m : methods)    // 메서드 전부
        {
            System.out.println("method : " + m.getModifiers()  + " " + m.getName()); // 메서드의 순서와 이름 출력

            try                         // 리플렉트로 메서드를 호출하는 작업은 예외처리를 해야 가능하다.
            {
                m.invoke(new Car());    // Car 메서드는 static이 없으므로 인스턴스화를 하여 실행해야 한다.
            }
            catch (Exception e) { }     // 예외가 발생하면 처리하는 부분
        }

        Field[] fields = Car.class.getFields(); // reflect 중 필드를 가리키는 Field 클래스
                                                // 클래스이름.class.getFields()로 클래스의 필드들을 얻을 수 있다.

        for(var f : fields)
        {
            System.out.println("field : " + f.getType());   // 접근할 수 있는 필드의 자료형을 출력
        }
    }
}