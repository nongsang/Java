package Java;

class Box<T>        // 자바 5 부터 추가된 제네릭을 사용한다.
{                   // 제네릭은 어떤 자료형을 사용할지 나중에 알려주고 그 알려준 자료형으로 데이터를 다루겠다는 의미다.
    private T t;    // String형이면 String, int형이면 int형으로 자료를 다룬다.
    public T getT() // 반환형이 제네릭
    {
        return this.t;
    }
    public void setT(T t)   // 매개변수가 제네릭
    {
        this.t = t;
    }
}

public class Generic_Type
{
    public static void main(String[] args)
    {
        Box<String> box1 = new Box<String>();   // 클래스를 생성하면서 자료형을 알려줘야 한다.
        box1.setT("바보");                       // 알려준 자료형대로 데이터를 사용한다.
        String string1 = box1.getT();           // 강제형변환을 하지 않아도 된다.


        Box<Integer> box2 = new Box<Integer>(); // 제네릭에 알려주는 자료형은 일반적으로 사용하는 int가 아니라
                                                // java.lang에 정의된 Integer다.
        box2.setT(123);                         // 자료형이 Integer로 정의되어 있으므로 정수형을 전달할 수 있다.
        String string2 = box2.getT().toString();// 문자열로 받으려면 toString() 써야하는건 같다.
        int integer = box2.getT();              // 자료형이 같으므로 강제형변환을 하지 않아도 된다.
    }
}