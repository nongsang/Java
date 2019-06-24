package Java;

class Animal
{
    public void Sleep()
    {
        System.out.println("쿨쿨~");
    }

    public void Eat()
    {
        System.out.println("냠냠~");
    }

    public final void Bark()        // final 메서드
    {                               // final로 선언된 메서드는 오버라이딩이 불가능하다.
        System.out.println("엉엉!");
    }
}

final class Dog extends Animal  // final 클래스
{                               // final로 선언된 클래스는 상속이 불가능하다.
    public void Sleep()         // C#의 sealed와 같은 기능이다.
    {
        System.out.println("드르렁~");
    }

    public void Eat()
    {
        System.out.println("우적우적~");
    }

    public void Bark()      // Animal의 Bark() 메서드가 final 선언되어 있으므로 오버라이딩이 불가능하다.
    {
        System.out.println("멍멍!");
    }
}

class Puppy extends Dog     // Dog 클래스는 final 선언이 되어있으므로 상속이 불가능하다.
{
    // 상속받지 못했으므로 오버라이딩도 불가능
}


public class Final_Class_Method
{
    public static void main(String[] args)
    {

    }
}