package Java;

import java.util.function.*;

class Address
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

class Person
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

public class Function_AndThen_Compose
{
    public static void main(String[] args)
    {
		// Function<>을 합성하여 실행하기 위해 두개의  Function<> 생성
		Function<Person, Address> functionA = person -> person.getAddress();
		Function<Address, String> functionB = address -> address.getCity();

		// 두 Function<>을 합성하면 첫번째 Function<>의 Person, 두번째 Function<>의 String으로 합성한다.
		// Person -> Address -> String으로 변환이 되기 때문에 Person에서 String으로 변환하는 Function<>을 생성한다.
		Function<Person, String> functionAB;

		// andThen으로 합성할 수 있다.
		// Function<>은 반환형이 있기 때문에 functionA의 결과값이 functionB로 전달이 된다.
		functionAB = functionA.andThen(functionB);

		String city1 = functionAB.apply(new Person("홍길동", 20, new Address("한국", "서울")));
		System.out.println("거주 도시 : " + city1);

		// 반환형이 있는 람다 인터페이스(Function<>, Operator<>)는 compose로 합성할 수 있다.
		// andThen은 'A를 실행 후 B를 실행하라', compose는 'B는 A가 실행된 후 실행하라'라는 의미다.
		// 표현 순서만 다른 같은 기능이다.
		functionAB = functionB.compose(functionA);

		String city2 = functionAB.apply(new Person("홍길동", 20, new Address("한국", "서울")));
		System.out.println("거주 도시 : " + city2);
	}
}