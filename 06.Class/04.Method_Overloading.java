package Java;

class Car
{
    String name = null;
    String color = null;
    int maxSpeed = 0;

    public Car(String name, String color, int maxSpeed)
    {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void PrintCarInfo()
    {
        System.out.println("name : " + name);
        System.out.println("color : " + color);
        System.out.println("maxSpeed : " + maxSpeed);
    }

    void setInfo(String name)   // 매개변수가 1개인 메서드
    {
        this.name = name;
    }

    void setInfo(String name, String color) // 매개변수가 2개인 메서드
    {                                       // 앞서 정의한 메서드와 이름이 같지만 매개변수가 드르므로 서로 다른 메서드로 인식한다.
        this.name = name;                   // 이를 메서드 오버로딩이라고 한다.
        this.color = color;
    }

    void setInfo(int maxSpeed)      // 매개변수가 int형 1개인 메서드
    {                               // 마찬가지로 다른 메서드로 인식한다.
        this.maxSpeed = maxSpeed;
    }

    int setInfo(int maxSpeed)       // 반환형이 int형인 메서드
    {                               // 앞서 정의한 메서드와 반환형만 다른데, 반환형은 오버로딩에 영향을 주지 않는다.
        this.maxSpeed = maxSpeed;
        return 1;
    }
}

public class Method_Overloading
{
    public static void main(String[] args)
    {
        Car car1 = new Car();    // 다른 생성자가 있어도 디폴트 생성자를 정의하지 않으면 인스턴스화 불가능

        Car car2 = new Car("람보르기니", "검정", 300);

        car2.setInfo("페라리");    // 매개변수가 String형 1개인 메서드가 호출
        car2.setInfo("재규어", "빨강"); // 매개변수가 String형 2개인 메서드가 호출
        car2.setInfo(400);  // 매개변수가 int형 1개인 메서드가 호출
    }
}