package Java;

class Car
{
    String name = null;     // 필드가 3개
    String color = null;    // 기본 값을 정할 수 있다.
    int maxSpeed = 0;

    public Car()            // 디폴트 생성자, public으로 선언해야 하고, 반환형이 없으며, 클래스 이름과 같은 메서드
    {                       // 디폴트 생성자는 정의하지 않아도 자동으로 호출이 된다.
        name = "람보르기니"; // 디폴트 생성자가 호출하여 인스턴스화를 했음을 알리는 것
        color = "검정";
        maxSpeed = 300;
    }

    public Car(String name)     // 매개변수를 가진 생성자, 기본 생성자가 있어도 생성자를 또 정의할 수 있다.
    {                           // 이를 생성자 오버로딩이라고 한다.
        this.name = name;       // this.name은 필드를 뜻한다.
        this.color = "검정";    // 필드에다 매개변수 값을 할당하면서 클래스를 인스턴스화한다.
        this.maxSpeed = 300;
    }

    public Car(String name, String color)   // 매개변수를 2개 가진 생성자를 오버로딩
    {                                       // 오버로딩을 할 수록 중복되는 내용이 생길 수 밖에 없다.
        this.name = name;
        this.color = color;
        this.maxSpeed = 300;
    }

    public Car(String name, String color, int maxSpeed) // 매개변수를 3개 가진 생성자를 오버로딩
    {
        this(name, color);          // 기존에 매개변수를 2개 가진 생성자를 호출한다.
        this.maxSpeed = maxSpeed;   // 중복되는 내용이 많으면 코드가 길어지기 때문에 기존의 코드를 재사용한 것이다.
    }
}

public class Constructor_Overloading
{
    public static void main(String[] args)
    {
        Car car1 = new Car();    // 디폴트 생성자 호출
        Car car2 = new Car("페라리");  // 매개변수 1개인 생성자 호출
        Car car3 = new Car("페라리", "파랑");    // 매개변수 2개인 생성자 호출
        Car car4 = new Car("페라리", "파랑",400);    // 매개변수 3개인 생성자 호출
    }
}