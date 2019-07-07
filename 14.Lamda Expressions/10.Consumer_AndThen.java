package Java;

import java.util.function.*;

class Address	// 거주지
{
	private String country;
	private String city;

	Address(String country, String city)
	{
		this.country = country;
		this.city = city;
	}

	public String getCountry() { return this.country; }
	public String getCity() { return this.city; }
}

class Person	// 사람
{
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, Address address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public Address getAddress() { return this.address; }
}

public class ConsumerAndThen
{
    public static void main(String[] args)
    {
    	// Consumer<>를 합성하여 실행하기 위해 두개의 Consumer<> 생성
		Consumer<Person> consumerA = person -> System.out.println("이름 : " + person.getName());
		Consumer<Person> consumerB = perosn -> System.out.println("나이 : " + perosn.getAge());

		// andThen으로 합성할 수 있다.
		// Consumer<>계열은 반환형이 없기 때문에 단순히 실행 순서를 정의할 뿐이다.
		Consumer<Person> consumerAB = consumerA.andThen(consumerB);	// consumerA가 실행된 후 consumerB가 실행
		consumerAB.accept(new Person("홍길동", 20, null));	// 하나의 매개변수를 두 람다가 공유한다.
	}
}