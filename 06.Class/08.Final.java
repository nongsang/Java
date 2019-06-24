package Java;

class Car
{
    final String name = "람보르기니";    // final은 갚을 정하면 앞으로 변하지 않게 고정해준다. const와 같다.
    final String color = null;          // null도 값이므로 값이 변하지 않는다.
    final int maxSpeed;                 // final로 선언하고 값을 설정하지 않으면 오류
    boolean isRun;                      // 비교하려고 선언

    public Car()
    {
        this.color = "검정";     // color는 이미 null로 값이 정해져 있으므로 오류
        this.maxSpeed = 300;    // maxSpeed는 final로 선언했으면서 생성하면서 값을 정해주지 않았지만 생성자에서 할당하면 된다.
        this.isRun = false;     // 그냥 필드는 생성하면서 값을 할당하든, 생성자에서 할당하든 상관없다.
    }
}

public class Final
{
    public static void main(String[] args)
    {

    }
}