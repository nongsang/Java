package Java;

class Box<T>
{
    private T t;
    public T getT()
    {
        return this.t;
    }
    public void setT(T t)
    {
        this.t = t;
    }
}

public class Generic_Method
{
    public static void main(String[] args)
    {
        Box<Integer> box1 = Hello_World.<Integer>boxing(123);   // 어떤 클래스의 어떤 제너릭을 사용할 것인지 알려줘야 한다.

        Box<String> box2 = Hello_World.boxing("바보");    // 어떤 제너릭을 사용할지 알려주지 않아도 자료형을 추정하여 사용할 수 있다.
    }

    static <T> Box<T> boxing(T t)   // 제너릭 메서드는 반환형 앞에 제너릭을 붙여줘야 한다.
    {
        Box<T> box = new Box(); // 자동으로 자료형이 정해진다.
        box.setT(t);
        return box;
    }
}