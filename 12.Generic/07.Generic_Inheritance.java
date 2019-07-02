package Java;

class A<T>{}    // 제너릭을 사용한 클래스
class B<T,K> extends A<T>{} // 제너릭을 사용한 클래스를 상속할 때 제너릭을 같이 사용해야 한다.
class C<T,K,V> extends B{}  // 상속받을 때 제너릭을 명시하지 않아도 된다.

interface inter1<T>{}
interface inter2<T,K> extends inter1{}  // 인터페이스도 마찬가지

public class Generic_Inheritance
{
    public static void main(String[] args)
    {

    }
}