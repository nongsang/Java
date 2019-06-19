package Java;

public class Logical_Bit_Operators
{
    public static void main(String[] args)
    {
        // 이해하기 편하게 byte로 예시
        byte a = (byte)0b10000000;  // 2진수로 -128
        byte b = (byte)0b00000001;  // 2진수로 1
        byte c = 0;

        // 비트 논리 연산은 전부 단독으로 사용할 수 없다.
        // 결과값을 활용할 수 있을 때 사용가능

        c = (byte)(a & b);  // &는 AND 비트연산
                            // a와 b의 비트연산 결과는 0000 0000
                            // c의 값은 0

        c = (byte)(a | b);  // |는 OR 비트연산
                            // a와 b의 비트연산 결과는 1000 0001
                            // c의 값은 -127

        c = (byte)(a ^ b);  // ^는 XOR 비트연산
                            // XOR는 두 값이 서로 다를 때 1, 같으면 0
                            // a와 b의 비트연산 결과는 1000 0001
                            // c의 값은 -127

        c = (byte)~a;   // ~는 1의 보수연산
                        // a의 비트연산 결과는 0111 1111
                        // c의 값은 127

        // 비트논리 연산은 Boolean에도 사용가능
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = false;

        bool3 = bool1 & bool2;  // 결과값은 false

        bool3 = bool1 | bool2;  // 결과값은 true

        bool3 = bool1 ^ bool2;  // 결과값은 true

        bool3 = ~bool1; // ~만 Boolean에서 사용 불가능

        // 실수형은 비트논리연산 적용이 안된다.
        double d1 = 3.0;
        double d2 = 4.0;
        double d3 = 0.0;

        d3 = d1 & d2;
        d3 = d1 | d2;
        d3 = d1 ^ d2;
        d3 = !d1;
    }
}