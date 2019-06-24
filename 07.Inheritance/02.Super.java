package Java;

class Car
{
    public String name = "자동차";
    public String color = "검정";
    public int maxSpeed = 300;

    public Car()
    {
        System.out.println("Car() 호출");
    }

    // 왜 매개변수로 문자열을 받아 name을 바꾸는 생성자를 정의해주지 않았나?
    // 나머지 요소는 자식클래스가 부모클래스의 요소를 그대로 써도 상관이 없는 부모와 자식의 공통된 요소이기 때문
    // 하지만 차 이름은 고유한 요소이기 때문에 name을 바꾸는 생성자는 의미가 없다.

    public Car(String color)
    {
        this.color = color; // 색을 변경한다.
        System.out.println("Car(String) 호출");
    }

    public Car(String color, int maxSpeed)
    {
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Car(String, int) 호출");
    }
}

class Lamborghini extends Car
{
    public String name = "람보르기니";   // 자식클래스의 이름만 고유하고 나머지 요소는 상속받은 필드를 사용한다.

    public Lamborghini()
    {
        super();    // 부모클래스의 생성자
                    // 부모클래스를 수퍼클래스라고도 부른다.
                    // 자식클래스를 생성하면 부모클래스의 생성자가 먼저, 자식클래스가 후에 호출이 된다.
                    // 당연하지만 부모클래스의 생성자가 없으면 호출할 수 없기 때문에 부모클래스의 생성자를 정의해줘야 한다.
                    // C#의 base와 같다.
        System.out.println("Lamborghini() 호출");
    }

    public Lamborghini(String name)
    {
        // super()로 명시적으로 부모클래스의 생성자를 호출하지 않아도 자동으로 호출이 된다.
        // 호출되는 생성자는 부모클래스의 기본생성자(Car())다.
        // 형태에 맞추어 Car(String) 생성자가 호출되는 것이 아니다.
        this.name = name;
        System.out.println("Lamborghini(String) 호출");
    }

    public Lamborghini(String name, String color)
    {
        //this.name = name; // 다른 것보다 수퍼클래스의 생성자를 호출하는 것이 우선이다.
        super(color);       // 수퍼클래스에 매개변수 1개만 받는 생성자 호출
                            // 부모생성자의 기본생성자(Car())를 제외하고 나머지 생성자는 명시적으로 매개변수를 전달하여 호출해야 한다.
                            // 반드시 수퍼클래스의 생성자를 호출하는 순서가 처음이여야한다.
        this.name = name;   // 수퍼클래스의 생성자를 호출한 후에 대입하거나 하는 등의 작업을 해줘야 한다.
        System.out.println("Lamborghini(String, String) 호출");
    }

    public Lamborghini(String name, String color, int maxSpeed)
    {
        super(color, maxSpeed);
        this.name = name;
        System.out.println("Lamborghini(String, String, int) 호출");
    }
}

public class Super
{
    public static void main(String[] args)
    {
        Lamborghini lamborghini1 = new Lamborghini();   // 자식클래스의 생성자에서 수퍼클래스의 생성자를 명시적으로 호출했다.
                                                        // Car(), Lamborghini() 호출

        System.out.println();

        Lamborghini lamborghini2 = new Lamborghini("페라리");  // 수퍼클래스의 생성자를 호출하지 않음으로 수퍼클래스의 기본생성자가 호출된다.
                                                                    // Car(), Lamborghini(String) 호출
        System.out.println();

        Lamborghini lamborghini3 = new Lamborghini("아우디", "빨강"); // 수퍼클래스의 생성자에 매개변수 1개를 전달하여 호출
                                                                                // Car(String), Lamborghini(String, String) 호출
        System.out.println();

        Lamborghini lamborghini4 = new Lamborghini("재규어", "파랑", 400);  // 수퍼클래스의 생성자에 매개변수 2개를 전달하여 호출
                                                                                                // Car(String, int), Lamborghini(String, String, int) 호출
    }
}