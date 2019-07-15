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

class MalePerson    // 남자만 저장하는 리스트를 가진 클래스
{
    private List<Person> list;

    public MalePerson()
    {
        System.out.println("[" + Thread.currentThread().getName() + "] MalePerson()");
        list = new ArrayList<Person>();
    }
    public void Accumulate(Person person)   // Person 하나만 저장할 때 호출
    {
        System.out.println("[" + Thread.currentThread().getName() + "] Accumulate()");
        list.add(person);
    }
    public void Combine(MalePerson malePerson)  // 리스트를 저장할 때 호출
    {
        System.out.println("[" + Thread.currentThread().getName() + "] Combine");
        list.addAll(malePerson.GetList());
    }
    public List<Person> GetList()
    {
        return list;
    }
}

public class Collect2
{
    public static void main(String[] args)
    {
        List<Person> list = Arrays.asList(
                new Person("홍길동", Person.MALE, 20),
                new Person("홍길순", Person.FEMALE, 23),
                new Person("홍대", Person.MALE, 22)
        );

        MalePerson malePerson = list.stream()
                .filter(p -> p.getSex() == Person.MALE)     // 조건에 맞는 요소들을
                .collect(
                        ()->new MalePerson(),               // 새로운 클래스를 생성하고
                        (r,t)-> r.Accumulate(t),            // 클래스 안의 리스트에 넣는 작업을 한다.
                                                            // 삽입되는 요소는 2개라서 Accumulate 두번 호출
                        (r1, r2) -> r1.Combine(r2)          // 리스트가 입력이 되면 리스트의 값을 리스트에 넣는 작업을 한다.
                );

        malePerson.GetList().forEach(p-> System.out.println(p.getName()));  // 클래스의 리스트를 출력
    }
}