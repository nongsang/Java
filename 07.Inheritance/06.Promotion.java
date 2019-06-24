package Java;

class Animal    // 최고 조상인 동물 클래스
{

}

class Mammalia extends Animal   // 동물 클래스를 상속받은 포유류 클래스
{

}

class Dog extends Mammalia  // 포유류 클래스를 상속받은 개 클래스
{

}

class Aves extends Animal   // 동물 클래스를 상속받은 조류 클래스
{

}

class Chicken extends Aves    // 조류 클래스를 상속받은 닭 클래스
{

}

public class Promotion
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        Animal animal1 = dog1;  // 부모클래스가 자식클래스의 인스턴스를 가리키는 상황이다.
                                // 부모클래스는 자식클래스와 호환이 되기 때문이다.
                                // 따라서 자동으로 형변환이 이루어진다고 할 수 있다.
                                // 이처럼 부모클래스가 자식클래스의 인스턴스를 가리키는 상황을 promotion이라고 한다.

        Animal animal2 = new Dog(); // 위의 내용과 같다.

        Mammalia mammalia = new Mammalia(); // 포유류 생성
        Dog dog = new Dog();                // 개 생성
        Aves aves = new Aves();             // 조류 생성
        Chicken chicken = new Chicken();    // 닭 생성

        Animal animal = new Animal();

        animal = mammalia;  // 포유류는 동물인가?
        animal = dog;       // 개는 동물인가?
        animal = aves;      // 조류는 동물인가?
        animal = chicken;   // 닭은 동물인가?

        mammalia = dog; // 개는 포유류인가?
        aves = chicken; // 닭은 조류인가?

        mammalia = chicken; // 닭은 포유류인가?
        aves = dog;         // 개는 조류인가?

        chicken = aves; // 조류는 닭인가?
        dog = mammalia; // 포유류는 개인가?

        chicken = animal;   // 동물은 닭인가?
        aves = animal;      // 동물은 조류인가?
        dog = animal;       // 동물은 개인가?
        mammalia = animal;  // 동물은 포유류인가?
    }
}