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

public class Collect1
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.MALE, 20),
                new Person("홍길순", Person.FEMALE, 23),
                new Person("홍대", Person.MALE, 22)
        );

        List<Person> maleList = list.stream()
                .filter(s -> s.getSex() == Person.MALE) // 남자인 요소를 구해서
                .collect(Collectors.toList());          // 콜렉션인 리스트로 변환하여 저장한다.

        maleList.forEach(s-> System.out.println(s.getName()));

        Set<Person> femaleSet1 = list.stream()
                .filter(s -> s.getSex() == Person.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));    // 해시셋을 생성해서 전달할 수 있다.

        femaleSet1.forEach(s -> System.out.println(s.getName()));

        Set<Person> femaleSet2 = list.stream()
                .filter(s -> s.getSex() == Person.FEMALE)
                .collect(Collectors.toSet());               // 그냥 toSet()을 사용해도 된다.

        femaleSet2.forEach(s -> System.out.println(s.getName()));
    }
}