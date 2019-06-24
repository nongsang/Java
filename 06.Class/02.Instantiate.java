package Java;

class Car
{
    int speed = 0;      // 필드

    void SetSpeed()      // 메서드
    {
        speed = 10;
    }
}

public class Instantiate
{
    public static void main(String[] args)
    {
        Car car = new Car();    // 인스턴스화를 하면 디폴트 생성자가 호출된다.
                                // 생성자가 호출이 되야 인스턴스화가 되고, 사용할 수 있는 상태가 된다.

        car.speed = 30; // 필드에 접근해서 값을 바꿀 수 있다.

        car.SetSpeed(); // 메서드를 호출할 수도 있다.
    }
}