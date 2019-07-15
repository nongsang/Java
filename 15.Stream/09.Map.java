package Java;

import java.util.*;

class Person
{
    public final static int MALE = 0;
    public final static int FEMALE = 1;

    private String name;
    private int sex;
    private int age;

    Person(String name, int sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() { return this.name; }
    public int getSex() { return this.sex; }
    public int getAge() { return this.age; }
}

public class Map
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.MALE, 20),
                new Person("홍길순", Person.FEMALE, 23),
                new Person("홍대", Person.MALE, 22)
        );

        list.stream()
                .mapToInt(Person::getAge)               // int형으로 바꾸어 요소를 저장한 스트림 반환
                .forEach(p -> System.out.println(p));

        // flatMap은 요소를 쪼개서 스트림에 저장하여 반환
        // map은 요소를 다른 요소로 바꾸어서 스트림에 저장하여 반환
    }
}