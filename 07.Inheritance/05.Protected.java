package Java;

class Animal
{
    protected String name = "동물";  // protected 선언된 메서드
                                    // 같은 패키지에서는 default 취급을 받는다.
                                    // 다른 패키지에서 상속받으면 상속받은 자식클래스만 호출가능하다.

    protected void Sleep()          // protected 선언된 메서드
    {
        System.out.println("쿨쿨~");
    }

    protected void Eat()            // protected 선언된 메서드
    {
        System.out.println("냠냠~");
    }

    protected void Bark()           // protected 선언된 메서드
    {
        System.out.println("엉엉!");
    }
}

class Dog
{
    Animal animal = new Animal();

    animal.name = "개";  // 자식클래스에서 부모클래스의 필드를 수정할 수 없다.
                        // 이건 public이여도 수정불가

    public void Bark()
    {
        animal.name = "개";  // 메서드 안에서 부모클래스의 필드를 수정할 수 있다.
        animal.Bark();      // 부모클래스의 메서드에 접근가능
    }
}

class Cat extends Animal
{
    public void Sleep()
    {
        this.name = "고양이";
        this.Sleep();
    }
}

// 여기서부터 클래스는 다른 패키지에서 구현했다고 가정

class Lizard
{
    Animal animal = new Animal();   // 다른 패키지에서는 protected로 선언된 클래스를 인스턴스화할 수 없다.

    public void Eat()
    {
        animal.Eat();   // 인스턴스화가 불가능하므로 메서드도 호출불가
    }
}

class Snake extends Animal  // 다른 패키지에서 protected로 선언된 부모클래스의 기능을 쓰고 싶으면 상속을 받아야 한다.
{
    public void Bark()
    {
        this.name = "뱀";
        this.Eat();         // 상속받았으므로 부모클래스의 메서드를 호출할 수 있다.
    }
}

public class Protected
{
    public static void main(String[] args)
    {

    }
}