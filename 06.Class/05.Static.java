package Java;

class Car
{
    // static은 객체끼리 공유하는 요소라고 생각하면 된다.
    static String name = null;  // static으로 선언된 필드
    static String color = null; // static으로 선언되면 일반 메서드와 같은 영역에 존재한다.
    static int maxSpeed = 0;    // 즉, 인스턴스화 없이 접근 가능

    // static으로 선언되지 않는 요소는 공통요소지만 객체끼리 공유하지 않고 고유한 값을 가지는 요소라고 생각하면 된다.
    boolean isRun = false;  // static으로 선언되지 않은 필드
                            // 이 필드를 사용하려면 인스턴스화를 하여 사용해야 한다.
                            // 일반 필드는 인스턴스화한 객체 영역에 생성되기 때문이다.

    // 생성자가 없는 클래스다

    static void PrintCarInfo()  //static으로 선언된 메서드
    {                           // 인스턴스화 없이 호출 가능
        System.out.println("name : " + name);
        System.out.println("color : " + color);
        System.out.println("maxSpeed : " + maxSpeed);
    }

    static void setName(String name)
    {
        this.name = name;   // static 메서드 내에서는 this를 사용해서 static 필드에 접근할 수 없다.
    }

    void setColor(String color)
    {
        this.color = color; // static 메서드가 아니면 this를 사용해서 필드에 접근할 수 없다.
    }

    void PrintIsRun()               // static으로 선언하지 않은 메서드
    {                               // 인스턴스화를 해야 호출가능
        System.out.println(isRun);  // 일반 메서드는 인스턴스화한 객체 영역에 생성되기 때문이다.
    }
}

public class Static
{
    public static void main(String[] args)
    {
        Car.name = "람보르기니"; // static선언된 필드는 인스턴스화 없이 접근가능
        Car.color = "빨강";
        Car.maxSpeed = 300;

        Car.PrintCarInfo(); // static선언된 메서드를 인스턴스화 없이 호출가능

        Car car = new Car();    // 물론 인스턴스화 해서 할 수 있다.
                                // 인스턴스화를 하면 static선언하지 않는 필드 및 메서드를 사용할 수 있다.

        car.isRun = true;   // 인스턴스화한 객체의 필드에 접근해서 수정한다.
        car.PrintIsRun();   // 인스턴스화한 객체의 메서드를 호출한다.
    }
}