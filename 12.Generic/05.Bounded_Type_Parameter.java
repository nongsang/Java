package Java;

class Box<T extends Number>     // 제너릭을 제한하는 방법
{                               // 제너릭을 숫자형으로만 사용할 수 있게 제한했다.
    private T t;                // Class형만 받도록, interface만 받도록 할수도 있다.
    public T getT()             // C#의 where와 같다.
    {                           // 상속이므로 상위클래스를 써야 한다.
        return this.t;
    }
    public void setT(T t)
    {
        this.t = t;
    }
}

public class Bounded_Type_Parameter
{
    public static void main(String[] args)
    {
        Box<Integer> box1 = new Box();  // 제너릭을 숫자형으로만 사용할 수 있게 제한했으므로 int형을 사용할 수 있다.

        Box<String> box2 = new Box();   // 제너릭을 숫자형으로만 사용할 수 있게 제한했으므로 String형을 사용할 수 없다.
    }
}