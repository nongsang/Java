package Java;

class Animal
{
    protected void Water()
    {
        System.out.println("쿨쿨~");
    }

    protected void Eat()
    {
        System.out.println("냠냠~");
    }
}

class Dog extends Animal
{
    public void Water()
    {
        System.out.println("드르렁드르렁~");
    }

    public void Eat()
    {
        System.out.println("우적우적~");
    }
}

class FeedMechine   // 급식기 및 급수기
{
    public void Feed(Animal animal) // Animal형과 호환되는 변수를 전달하면 된다.
    {
        Dog dog = (Dog)animal;  // Feed 메서드 안에서만 사용할 자식클래스 기능
                                // 하지만 매개변수 animal에 전달된 객체가 반드시 Animal형, Dog형과 호환된다는 보장이 없다.
        dog.Eat();              // 개가 음식을 먹는다.
    }

    public void Water(Animal animal) // Animal형과 호환되는 변수를 전달하면 된다.
    {
        Dog dog;    // 사용할 자식클래스 변수를 먼저 만들어야 한다.

        if(animal instanceof Dog)   // 전달된 animal이 Dog로 변환이 가능한지 검사하고
        {                           // C#의 is와 같다.
            dog = (Dog) animal;     // 변환이 가능하다면 animal을 Dog형으로 형변환하여 dog가 가리키게 한다.
            dog.Eat();              // 개가 음식을 먹는다.
        }
    }
}

class Cat{} // 고양이도 동물이지만 Animal을 상속받지 않은 클래스로 설정하여 실험해보자.

public class Instanceof
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        FeedMechine feedMechine = new FeedMechine();

        feedMechine.Feed(dog);  // 매개변수가 Animal형이므로 dog와 호환이 되기 때문에 성립
        feedMechine.Water(dog);

        System.out.println();

        Cat cat = new Cat();

        feedMechine.Feed(cat);  // cat은 Animal을 상속받지 않아 Animal과 호환이 되지 않아 컴파일 오류
        feedMechine.Water(cat);
    }
}