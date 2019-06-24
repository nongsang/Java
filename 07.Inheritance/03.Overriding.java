package Java;

class Animal
{
    void Sleep()    // default 메서드
    {
        System.out.println("쿨쿨~");
    }

    private void Eat()  // private 메서드
    {
        System.out.println("냠냠~");
    }

    public void Bark()  // public 메서드
    {
        System.out.println("엉엉!");
    }
}

class Dog extends Animal
{
    void Sleep()                        // Animal의 Sleep() 메서드와 이름이 같다.
    {                                   // 자식클래스에서 부모클래스의 메서드를 다시 재정의하여 부모의 메서드는 가려진 상황이다.
        System.out.println("드르렁~");   // 이를 오버라이딩이라고 한다.
    }                                   // 오버로딩과 비슷하지만 다르다.

    public void Eat()                   // Amimal의 Eat() 메서드와 이름이 같으므로 오버라이딩을 시도한다.
    {                                   // 하지만 Animal의 Eat() 메서드는 private이므로 오버라이딩이 실패하며 별개의 메서드로 인식한다.
        System.out.println("우적우적~");
    }

    private void Bark()                 // Animal의 Bark() 메서드와 이름이 같으므로 오버라이딩을 시도한다.
    {                                   // 하지만 Animal의 Bark() 메서드는 public이므로 private로 접근제한자의 권한이 낮아지는 선언은 할 수 없다.
        System.out.println("멍멍!");     // 접근제한자를 유지하거나 권한을 넓혀서 오버라이딩해야 한다.
    }
}

class Cat extends Animal
{
    @Override       // 어노테이션으로 명시적으로 오버라이드된 메서드임을 나타낼 수 있다.
    void Sleep()    // 어노테이션이 없어도 된다.
    {
        System.out.println("고로롱~");
    }

    void Eat()
    {
        System.out.println("뇸뇸~");
    }

    public void Bark()
    {
        System.out.println("야옹~");
    }
}

public class Overriding
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();

        animal.Sleep();
        animal.Eat();   // private 메서드이므로 호출불가
        animal.Bark();

        Dog dog = new Dog();

        dog.Sleep();
        dog.Eat();
        dog.Bark(); // private 메서드이므로 호출불가

        Cat cat = new Cat(); // Cat 클래스를 인스턴스화했으므로

        // 당연히 Cat 클래스의 내용들을 출력한다.
        cat.Sleep();
        cat.Eat();
        cat.Bark();
    }
}