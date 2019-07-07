package Java;

import java.util.function.*;

class Person
{
	private String name;
	private int age;

	Person() { System.out.println("Person() 호출"); }
	Person(String name)
	{
		System.out.println("Person(String) 호출");
		this.name = name;

	}
	Person(String name, int age)
	{
		System.out.println("Person(String, int) 호출");
		this.name = name;
		this.age = age;
	}
}

public class Constructor_Reference
{
    public static void main(String[] args)
    {
    	// 생성자를 참조하여 람다로 사용할 수 있다.
		Function<String, Person> function1 = Person::new;	// Person(String) 호출
		Person person1 = function1.apply("홍길동");

		BiFunction<String, Integer, Person> function2 = Person::new;	// Person(String, int) 호출
		Person person2 = function2.apply("홍길순", 20);
	}
}