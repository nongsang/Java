package Java;

import java.util.function.*;

class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
}

public class BinaryOperator_MaxBy_MinBy
{
    public static void main(String[] args)
    {
		BinaryOperator<Person> binaryOperator;
		Person person;

		// BinaryOperator에만 있는 정적 메서드 maxBy
		// 두 객체를 비교해서 큰 객체를 반환
		// 매개변수로 Comparator를 전달해줘야 한다.
		binaryOperator = BinaryOperator.maxBy((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
		person = binaryOperator.apply(new Person("홍길동", 20), new Person("홍길순", 23));

		System.out.println(person.getName());

		// BinaryOperator에만 있는 정적 메서드 minBy
		// 두 객체를 비교해서 작은 객체를 반환
		binaryOperator = BinaryOperator.minBy((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
		person = binaryOperator.apply(new Person("홍길동", 20), new Person("홍길순", 23));

		System.out.println(person.getName());
	}
}