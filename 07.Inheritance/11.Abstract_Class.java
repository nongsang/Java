package Java;

abstract class Animal               // 추상클래스면서 부모클래스다.
{                                   // 추상클래스는 반드시 자식클래스들의 모체가 되어야 하고, 오버라이딩을 해야 한다.
    protected String name = "없음";  // 기존의 부모클래스와 다른 점은 인스턴스화를 하지 못한다는 것이다.
                                    // 메서드를 정의해줄 수 있지만 인스턴스화를 하여 사용할 수 없으니 그냥 메서드 선언만 하고 오버라이딩을 할 것이다.
    protected Animal(String name)
    {
        this.name = name;
    }

    protected void Eat() {}
    protected void Bark() {}
}

class Dog extends Animal    // 동물클래스를 상속받은 개클래스
{
    public Dog(String name)
    {
        super(name);
    }

    public void Bark()
    {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal    // 동물클래스를 상속받은 고양이클래스
{
    public Cat(String name)
    {
        super(name);
    }

    public void Bark()
    {
        System.out.println("야옹!");
    }
}

public class Abstract_Class
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal("동물");   // Animal은 추상클래스기 때문에 인스턴스화를 할 수 없다.
                                                    // 추상클래스는 직접 사용하기 위해 정의하는 것이 아니다.
                                                    // 클래스들을 일반화하여 묶어주는 역할을 한다.

        Animal animal2 = new Dog("누렁이");    // 개 인스턴스 생성
        System.out.println(animal2.name);           // 개의 이름
        animal2.Bark();                             // 개가 짖는다.

        Animal animal3 = new Cat("떼껄룩");    // 고양이 인스턴스 생성
        System.out.println(animal3.name);           // 고양이의 이름
        animal3.Bark();                             // 고양이가 운다.
    }
}