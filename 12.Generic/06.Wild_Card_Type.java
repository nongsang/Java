package Java;

import java.util.Arrays;

class Course<T>
{
    private String name;    // 과목이름
    private T[] students;   // 학생 수

    Course(String name, int capacity)   // 생성자
    {
        this.name = name;
        //student = new T[capacity];  // 제너릭이 아직 확인되지 않았기 때문에 얼만큼의 크기로 메모리를 할당해야할지 모르기 때문에 오류 발생
        students = (T[]) new Object[capacity];   // Object형으로 메모리를 생성한 후 T형으로 변환하면 된다.
    }

    public String getName() { return this.name; }
    public T[] getStudent() { return this.students; }

    public void Add(T t)    // 학생 추가
    {
        for(int i = 0; i < students.length; ++i)    // 배열을 찾아본다.
        {
            if(students[i] == null) // 비어있는 부분이 있으면
            {
                students[i] = t;    // 학생 추가
                break;
            }
        }
    }
}

class Person    // 일반인
{
    private String name;

    public Person(String name){this.name = name;}   // 생성자
    public String getName() {return this.name;}

    @Override
    public String toString() { return this.name; }
}

class Student extends Person    // 학생
{
    public Student(String name) { super(name); }    // 일반인을 상속받았으므로 생성자를 정의해줘야 한다.
}

class Worker extends Person     // 직장인
{
    public Worker(String name) { super(name); }    // 생성자
}

class HighStudent extends Student   // 고등학생
{
    public HighStudent(String name) { super(name); }    // 생성자를 호출하면 학생 생성자가 호출된다.
}

public class Wild_Card_Type
{
    static void RegisterCourse(Course<?> course)    // 제너릭과 비슷한 와일드카드 타입이다.
    {                                               // 주로 return, 매개변수로 자주 사용한다.
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudent()));
    }

    static void RegisterCourseStudent(Course<? extends Student> course) // Student부터 Student의 자식클래스까지 받을 수 있다.
    {
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudent()));
    }

    static void RegisterCourseWorker(Course<? super Worker> course) // Worker부터 Worker의 부모클래스까지 받을 수 있다.
    {
        System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudent()));
    }

    public static void main(String[] args)
    {
        // 제한이 없는 와일드카드 타입이므로 모든 사람 클래스 전달 가능
        RegisterCourse(new Course<Person>("일반인 과정", 5));
        RegisterCourse(new Course<Student>("학생 과정", 5));
        RegisterCourse(new Course<Worker>("직장인 과정", 5));
        RegisterCourse(new Course<HighStudent>("고등학생 과정", 5));

        // Student와 Student를 상속받은 자식클래스들을 전달할 수 있다.
        // 그렇기 때문에 일반인과 직장인은 전달할 수 없다.
        RegisterCourseStudent(new Course<Person>("일반인 과정", 5));
        RegisterCourseStudent(new Course<Student>("학생 과정", 5));
        RegisterCourseStudent(new Course<Worker>("직장인 과정", 5));
        RegisterCourseStudent(new Course<HighStudent>("고등학생 과정", 5));

        // Worker와 Worker의 부모클래스들을 전달할 수 있다.
        // 그렇기 때문에 학생과 고등학생은 전달할 수 없다.
        RegisterCourseWorker(new Course<Person>("일반인 과정", 5));
        RegisterCourseWorker(new Course<Student>("학생 과정", 5));
        RegisterCourseWorker(new Course<Worker>("직장인 과정", 5));
        RegisterCourseWorker(new Course<HighStudent>("고등학생 과정", 5));

        // 코스를 생성해서
        Course<Person> personCourse = new Course<>("일반인 과정" ,5);
        personCourse.Add(new Person("일반인"));
        personCourse.Add(new Person("학생"));
        personCourse.Add(new Person("직장인"));
        personCourse.Add(new Person("고등학생"));

        // 등록하는 방법도 있다.
        RegisterCourse(personCourse);
        RegisterCourseStudent(personCourse);
        RegisterCourseWorker(personCourse);
    }
}