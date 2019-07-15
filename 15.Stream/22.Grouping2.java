package Java;

import java.util.*;
import java.util.stream.Collectors;

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

public class Grouping2
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.Sex.MALE, 20),
                new Person("홍길순", Person.Sex.FEMALE, 23),
                new Person("홍대", Person.Sex.MALE, 22)
        );

        Map<Person.Sex, Double> mapBySex1 = list.stream()
                .collect(
                        Collectors.groupingBy(  // 묶는데
                                Person::getSex, // 키값은 성별로
                                Collectors.averagingDouble(Person::getAge)  // 밸류는 나이를 double형의 평균으로 묶는다.
                )
                );

        System.out.println("[남자 평균 나이] " + mapBySex1.get(Person.Sex.MALE));     // 남자 성별을 가진 요소를 출력
        System.out.println("[여자 평균 나이] " + mapBySex1.get(Person.Sex.FEMALE));   // 여자 성별을 가진 요소를 출력

        Map<Person.Sex, String> mapBySex2 = list.stream()
                .collect(
                        Collectors.groupingBy(  // 묶는데
                                Person::getSex, // 키값은 성별로
                                Collectors.mapping(     // 밸류값은 다른 값으로 바꾼다.
                                        Person::getName,    // String형인 이름을
                                        Collectors.joining(", ")    // 중간에 ,로 구분해서 묶는다.
                                )
                        )
                );

        System.out.println("[남자 이름] " + mapBySex2.get(Person.Sex.MALE));    // 남자 성별을 가진 요소를 출력
        System.out.println("[여자 이름] " + mapBySex2.get(Person.Sex.FEMALE));  // 여자 성별을 가진 요소를 출력
    }
}