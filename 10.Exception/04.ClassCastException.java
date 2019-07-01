package Java;

abstract class Animal{}     // 추상클래스
class Dog extends Animal{}  // 자식클래스 상속
class Cat extends Animal{}  // 자식클래스 상속

interface RemoteController{}                // 리모컨 인터페이스
class TV implements RemoteController{}      // 리모컨과 호환이 되는 TV 클래스
class Audio implements RemoteController{}   // 리모컨과 호환이 되는 Audio 클래스

public class ClassCastException
{
    public static void main(String[] args)
    {
        Animal animal = new Dog();  // animal은 Dog의 인스턴스를 생성하여 참조
        Dog dog = (Dog)animal;      // Dog의 인스턴스를 Dog로 변환 가능

        Cat cat = (Cat)animal;      // Dog의 인스턴스를 Cat으로 변환 불가능
                                    // ClassCastException 발생

        RemoteController rc = new TV(); // 인스턴스를 인터페이스에 대입한다.
        TV tv = (TV)rc;                 // 리모컨은 TV의 기능을 사용하고 있으므로 TV로 변환 가능

        Audio audio = (Audio)rc;        // 리모컨은 TV의 기능을 사용하고 있으므로 Audio로 변환 불가능
                                        // ClassCastException 발생

        AnimalCast(new Cat());  // 매개변수가 Animal이므로 Cat을 생성하여 전달할 수 있다.
                                // AnimalCast 내부에서는 Dog로 변환하므로 ClassCastException 발생
    }

    static void AnimalCast(Animal animal)
    {
        //Dog dog = (Dog)animal;  // 매개변수인 animal을 Dog로 변환
        // 하지만 Cat이 전달된다면 변환이 되지 않으므로 ClassCastException 발생

        Dog dog;                    // 예외를 발생하고 싶지 않으면
        if(animal instanceof Dog)   // instanceof로 호환이 가능한지 확인 후
            dog = (Dog)animal;      // 변환을 해주면 좋다.
    }
}