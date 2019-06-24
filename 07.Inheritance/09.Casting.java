package Java;

class Animal
{
    protected void Sleep()
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
    public void Sleep()
    {
        System.out.println("드르렁드르렁~");
    }

    public void Eat()
    {
        System.out.println("우적우적~");
    }
}


public class Casting
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal = dog;   // 부모클래스 변수가 자식클래스의 인스턴스를 가리켜서 사용할 수 있다.
                        // 이 때 자동 형변환(promotion)이 발생한다.

        animal.Sleep(); // 다형성이 구현되어 dog의 메서드가 호출된다.

        dog = animal;   // 자식클래스 변수를 다시 사용하고 싶기 때문에 자식클래스 변수를 부모클래스가 가리키는 인스턴스를 가리키게 하면 안된다.
                        // 왜냐하면 부모클래스는 자식클래스를 가리킬 수 있지만, 자식클래스는 부모클래스를 가리킬 수 없기 때문이다.

        dog = (Dog)animal;  // 명시적으로 형변환을 해줘야 한다.
                            // 이를 Casting이라고 한다.

        Animal animal1 = new Dog(); // 처음부터 자식클래스 변수를 생성하지 않았으면 Casting을 할 이유가 없다.
                                    // 왜냐하면 애초에 자식클래스 변수를 생성하지도 않았기 때문이다.
    }
}