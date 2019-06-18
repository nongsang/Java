package Java;

public class Type_Casting
{
    public static void main(String[] args)
    {
        int i = 3;

        long l1 = i;        // 큰 자료형 변수에 작은 자료형 변수값을 저장할 수 있다.
                            // 이를 묵시적 형변환이라고 한다.
        long l2 = (long)i;  // '(자료형)변수'를 사용해도 i의 값을 변환하여 저장한다.
                            // 이를 명시적 형변환이라고 한다.

        byte b1 = i;        // 작은 자료형 변수에 큰 자료형 변수값을 저장할 수 없다.
                            // 왜냐하면 데이터 손실이 발생하기 때문이다.
                            // 데이터 손실이 발생하더라도 형변환하고 싶을 수 있다.
        byte b2 = (byte)i;  // 강제로 변환하여 저장하려면 명시적 형변환을 한다.
                            // 명시적 형변환을 강제 형변환이라고도 한다.
    }
}