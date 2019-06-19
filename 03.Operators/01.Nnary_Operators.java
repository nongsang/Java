package Java;

public class Hello_World
{
    public static void main(String[] args)
    {
        int i = 1;

        i++;    // 후위 증가 연산자, 2
        --i;    // 전위 감소 연산자, 1

        double d = 2.3;

        ++d;    // 실수형도 증감 연산자를 사용할 수 있다.

        boolean bool = true;

        ++bool;    // 논리형은 증감 연산자를 사용할 수 없다.

        !bool;     // !는 not이며 true의 not은 false다.

        bool = !bool;   // !는 단독으로 사용할 수 없다.
                        // 결과값을 활용할 수 있을 때만 사용가능
                        // b를 not 연산한 결과를 다시 b에 저장한다.

        byte b = 0;

        ~b; // ~는 1의 보수로 변환
            // ~는 단독으로 사용할 수 없다.
            // 결과값을 활용할 수 있을 때만 사용가능

        i = ~i; // ~연산은 기본적으로 int형만 가능하다.

        b = ~b; // byte형은 불가능
        b = (byte)~b;   // 강제 형변을 사용해서 가능
                        // short, long형도 강제형변환으로 사용가능
    }
}