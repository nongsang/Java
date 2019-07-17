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
    @Override
    public int hashCode()
    {
        return this.name.hashCode();    // 문자열의 해시코드를 반환한다.
    }

    // 출력했을 때 호출되는 메서드
    @Override
    public String toString()
    {
        return this.name.toString();
    }
}

public class Object_ToString
{
    public static void main(String[] args)
    {
        Object object1 = new Member("홍길동");
        Object object2 = new Member("홍길동"); // object1과는 이름만 같은 다른 객체다.

        System.out.println(object1.toString()); // 객체의 문자정보를 출력한다.
        System.out.println(object2);            // 그냥 출력해도 toString()가 호출된다.
                                                // 재정의를 해주지 않으면 의미있는 문자가 아니라 ID를 반환한다.
    }
}