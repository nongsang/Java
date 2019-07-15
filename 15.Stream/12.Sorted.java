package Java;

import java.util.*;
import java.util.stream.*;

class Person implements Comparable<Person>  // 정렬 스트림에 쓰이기 위한 비교
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

    @Override
    public int compareTo(Person person) // 비교 구현
    {
        return Integer.compare(this.age, person.age);
    }
}

public class Sorted
{
    public static void main(String[] args)
    {
        int[] intArr = { 5, 3, 2, 1, 4 };

        IntStream intStream = Arrays.stream(intArr);

        intStream
                .sorted()                               // 기본적으로 오름차순
                .forEach(d -> System.out.println(d));

        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.MALE, 20),
                new Person("홍길순", Person.FEMALE, 23),
                new Person("홍대", Person.MALE, 22)
        );

        list.stream()
                .sorted()
                .forEach(p -> System.out.println(p.getName() + ", " + p.getSex() + ", " + p.getAge()));

        list.stream()
                .sorted(Comparator.reverseOrder())      // 기본 오름차순에서 거꾸로 -> 내림차순
                .forEach(p -> System.out.println(p.getName() + ", " + p.getSex() + ", " + p.getAge()));
    }
}