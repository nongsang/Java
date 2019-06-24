package Java;

class Car
{
    private String name = "람보르기니";  // 기본적으로 필드는 private로 선언하는 것이 좋다.
    private String color = "검정";      // 필요한 정보만 노출하는 것이 보안상 좋기 때문이다.
    private int maxSpeed = 300;         // 또한 개인정보를 마음대로 접근하여 엉뚱한 값을 넣지 않게끔 해야 한다.

    public String getName() // private한 필드는 그냥 접근할 수 없다.
    {
        return this.name;   // 따라서 메서드를 통해 값을 가져와야 할 필요가 있다.
    }                       // 이를 getter라고 한다.
                            // getter는 메서드 이름이 get으로 시작한다.(관례)
                            // 필드가 boolean인 경우 is로 시작한다.

    public void setName(String name)    // 마찬가지로 private 필드에 메서드로 값을 할당해준다.
    {
        this.name = name;   // 이를 setter라고 한다.
    }                       // setter는 메서드 이름이 set으로 시작한다.(관례)
}

public class Getter_Setter
{
    public static void main(String[] args)
    {
        Car car = new Car();

        car.name = "페라리";   // private 필드들이므로
        car.color = "빨강";   // 그냥 접근이
        car.maxSpeed = 400;     // 불가능하다.

        car.setName("페라리"); // 메서드로 필드에 값을 할당한다.

        System.out.println(car.getName());  // 메서드로 필드값을 가져온다.
    }
}