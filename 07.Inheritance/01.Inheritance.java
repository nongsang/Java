package Java;

class Car   // 모든 자동차를 일반화하여 부모클래스로 쓰일 자동차 클래스
{
    public String name = "자동차"; // 부모객체의 이름
    public String color = "검정";

    public Car()    // 부모클래스 생성자
    {
        System.out.println("Car 생성");   // 생성자가 호출되면 생성자가 호출됬다는 문자열을 출력한다.
    }

    public void Set()
    {
        System.out.println("시동을 걸었습니다. 부릉~");
    }
}

class Auto  // 다른 자동차 클래스, 이 클래스도 동시에 상속할 수 있는지 확인하려고 생성
{
    public String name = "차";

    public Auto()
    {
        System.out.println("Auto 생성");   // 생성자가 호출되면 생성자가 호출됬다는 문자열을 출력한다.
    }

    public void Set()
    {
        System.out.println("시동을 걸었습니다. 부앙부앙~");
    }
}

class Lamborghini extends Car   // Car 클래스를 상속받은 람보르기니 클래스
{
    public String name = "람보르기니";   // Car 클래스와 같은 이름의 필드가 있지만 사용할 수 있다.

    public Lamborghini()    // 람보르기니 생성자
    {
        System.out.println("Lamborghini 생성");   // 생성자가 호출되면 생성자가 호출됬다는 문자열을 출력한다.
    }
}

class Ferrari extends Car//, Auto    // 다중 상속 불가능
{
    public String name = "페라리"; // Car 클래스와 같은 이름의 필드가 있지만 사용할 수 있다.

    public Ferrari() // 페라리 생성자
    {
        System.out.println("Ferrari 생성");   // 생성자가 호출되면 생성자가 호출됬다는 문자열을 출력한다.
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Car car = new Car();    // 부모클래스 인스턴스화
                                // 생성자를 정의해줬기 때문에 인스턴스화를 하면서 생성자가 호출돼, 문자열이 출력된다.
        car.Set();  // 부모클래스의 메서드 호출
        System.out.println("name : " + car.name);
        System.out.println("color : " + car.color);

        System.out.println();

        Lamborghini lamborghini = new Lamborghini();    // 람보르기니 인스턴스화
                                                        // 람보르기니를 인스턴스화하면서 Car 생성자가 먼저 호출되고 람보르기니 생성자가 호출된다.
                                                        // 부모클래스가 먼저 생성되고 자식클래스가 생성된다.
        lamborghini.Set();  // 람보르기니에는 Set() 메서드가 없기 때문에 부모클래스의 메서드를 호출한다.
                            // 이는 부모클래스를 만들면 자식클래스를 만들 때 부모클래스에 있는 기능 외의 것만 만들면 된다는 뜻이다.
                            // 즉, 재사용성이 증가한다.
        System.out.println("name : " + lamborghini.name);   // Car의 name 필드와 이름만 같지 서로 다른 필드다.
        System.out.println("color : " + lamborghini.color); // lamborghini에는 color 필드가 없으므로 부모클래스의 color 필드를 호출한다.
                                                            // 이것 또한 재사용성과 연관이 있다.

        System.out.println();

        Ferrari ferrari = new Ferrari();    // 페라리 인스턴스화
                                            // 페라리를 인스턴스화하면서 Car 생성자가 먼저 호출되고 페라리 생성자가 호출된다.
        ferrari.Set();  // 페라리도 Set() 메서드가 없으므로 부모클래스의 메서드를 사용한다.
        System.out.println("name : " + ferrari.name);   // Car의 name 필드와 이름만 같지 서로 다른 필드다.
        System.out.println("color : " + ferrari.color); // ferrari에는 color 필드가 없으므로 부모클래스의 color 필드를 호출한다.
    }
}