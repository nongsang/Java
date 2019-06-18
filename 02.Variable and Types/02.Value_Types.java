package Java;

public class Value_Types
{
    public static void main(String[] args)
    {
        int i1 = 1; // 정수형 변수, 크기는 4byte

        int i2; // 값을 할당하지 않은 채로 생성할 수 있지만 사용할 수 없다.
                // 나중에라도 값을 할당해야 한다.

        byte b = 2;     // 정수형 변수, 크기는 1byte
        char c = 3;     // 정수형 변수, 크기는 2byte
                        // 유니코드를 처리할 때 사용할 수 있다.
        short s = 4;    // 정수형 변수, 크기는 2byte
        long l = 5;     // 정수형 변수, 크기는 8byte

        float f = 6.7f;     // 실수형 변수, 크기는 4byte, 접미사 f를 붙여줘야 한다.
        double d1 = 8.9;    // 실수형 변수, 크기는 8byte
        double d2 = 10.11d; // 접미사 d를 붙여줘도 된다.

        boolean bool = true;    // 논리형 변수, true 아니면 false값만 가진다.
    }
}