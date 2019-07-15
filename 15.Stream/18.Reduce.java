package Java;

import java.util.*;
import java.util.stream.*;

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

public class Reduce
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.MALE, 20),
                new Person("홍길순", Person.FEMALE, 23),
                new Person("홍대", Person.MALE, 22)
        );

        int sum1 = list.stream()
                .mapToInt(Person::getAge)
                .sum();                     // 합 구하기 1

        System.out.println("나이의 총합 : " + sum1);

        int sum2 = list.stream()
                .mapToInt(Person::getAge)
                .reduce((a, b) -> a + b)    // 프로그래머가 다양한 집계 기능을 만들 수 있다.
                .getAsInt();                // 합 구하기 2

        System.out.println("나이의 총합 : " + sum2);

        int sum3 = list.stream()
                .mapToInt(Person::getAge)
                .reduce(0, (a, b) -> a + b);    // 값을 반환할 수 없다든가 하는 집계 기능을 사용할 수 없는 경우 0을 반환

        System.out.println("나이의 총합 : " + sum3);
    }
}