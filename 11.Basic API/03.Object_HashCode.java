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

    // 해시코드로 객체가 같은지 확인
    // 해시코드는 객체의 고유한 코드이다.
    // 나중에 HashMap, HashSet 등 해시를 이용한 컬렉션을 사용하기 위해 재정의해야 한다.
    @Override
    public int hashCode()
    {
        return this.name.hashCode();    // 문자열의 해시코드를 반환한다.
    }
}

public class Object_HashCode
{
    public static void main(String[] args)
    {
        Object object1 = new Member("홍길동");
        Object object2 = new Member("홍길동"); // object1과는 이름만 같은 다른 객체다.

        if(object1.hashCode() == object2.hashCode())                    // 같은 문자열을 가지므로 두 해시코드는 같다.
            System.out.println("object1과 object2는 해시코드가 같다.");
        else
            System.out.println("object1과 object2는 해시코드가 다르다.");
    }
}