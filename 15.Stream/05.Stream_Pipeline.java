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

public class Stream_Pipeline
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.MALE, 20),
                new Person("홍길순", Person.FEMALE, 23),
                new Person("홍대", Person.MALE, 22)
        );

        double ageAverage = list.stream()   // 오리지널 스트림
                .filter(p -> p.getSex() == Person.MALE) // 중간처리 스트림, 필터링
                .mapToInt(Person::getAge)               // 중간처리 스트림, 매핑
                .average()                              // 최종처리, 집계
                .getAsDouble(); // 변환

        System.out.println("남자 평균 나이 : " + ageAverage);
    }
}