package Java;

import java.util.*;
import java.util.stream.*;

class Person
{
    public enum Sex { MALE, FEMALE }    // 조금 더 보기 쉽게 enum으로 정리

    private String name;
    private Sex sex;        // int 대신에 enum을 사용했으므로 선언
    private int age;

    Person(String name, Sex sex, int age)   // 생성자도 enum으로 변경
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() { return this.name; }
    public Sex getSex() { return this.sex; }
    public int getAge() { return this.age; }
}

public class Grouping
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.Sex.MALE, 20),
                new Person("홍길순", Person.Sex.FEMALE, 23),
                new Person("홍대", Person.Sex.MALE, 22)
        );

        Map<Person.Sex, List<Person>> mapBySex1 = list.stream()     // 성별을 키값으로, 요소를 밸류로 가지는 맵
                .collect(Collectors.groupingBy(Person::getSex));    // 키값을 성별로 그룹을 만든다.

        System.out.println("[남자]");
        mapBySex1.get(Person.Sex.MALE)  // 키값이 남자인 요소들을 전부 얻어서
                .forEach(p -> System.out.println(p.getName())); // 출력

        Map<Person.Sex, List<String>> mapBySex2 = list.stream()     // 성별을 키값으로, 문자열을 밸류로 가지는 맵, 밸류는 Person이 아니라 문자열이다.
                .collect(Collectors.groupingBy(
                        Person::getSex,                             // 키값을 성별로
                        Collectors.mapping(Person::getName, Collectors.toList())    // 요소의 이름을 밸류로 그룹을 만든다.
                ));

        System.out.println("[여자]");
        mapBySex2.get(Person.Sex.FEMALE)    // 키값이 여자인 문자열들을 전부 얻어서
                .forEach(p-> System.out.println(p));    // 출력
                                                        // 밸류가 Person이 아니라 String이므로 그냥 출력할 수 있다.
    }
}