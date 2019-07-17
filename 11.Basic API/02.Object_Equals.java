package Java;

class Member
{
    private String name;

    public Member(String name) { this.name = name; }

    // 논리적 동등을 위해 equals 재정의
    // 실질적인 값이 같아도 new로 생성했으면 값만 같은 다른 객체로 인식한다.
    // 논리적 동등은 실직적인 값을 비교해서 같은지 비교한다.
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof Member)    // 받은 object가 Member와 호환이 되는지 확인한다.
        {
            Member member = (Member)object;
            if(this.name.equals(member.name))   // 현재 Member의 name과 받은 object의 name을 비교
                return true;                    // 같으면 true
        }
        return false;   // 받은 object가 Member와 호환이 되지 않거나 name이 서로 다르면 false
    }
}

public class Object_Equals
{
    public static void main(String[] args)
    {
        Object object1 = new Member("홍길동");
        Object object2 = new Member("홍길동"); // object1과는 이름만 같은 다른 객체다.
        Object object3 = new Member("홍길순");

        if (object1.equals(object2))                             // 원래라면 다른 객체지만 equals를 오버라이드했으므로 같은 객체로 인식한다.
            System.out.println("object1과 object2는 같다.");
        else
            System.out.println("object1과 object2는 다르다.");

        if (object1 == object2)                                  // equals 메서드와 같다.
            System.out.println("object1과 object2는 같다.");
        else
            System.out.println("object1과 object2는 다르다.");

        if (object1.equals(object3))                             // 값이 서로 다르므로 다른 객체로 인식한다.
            System.out.println("object1과 object3은 같다.");
        else
            System.out.println("object1과 object3은 다르다.");
    }
}