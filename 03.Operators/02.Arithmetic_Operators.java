package Java;

public class Arithmetic_Operators
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = 0;

        c = a + b;  // 덧셈 연산, c는 3

        c = a - b;  // 뺄셈 연산, c는 -1

        c = a * b;  // 곱셈 연산, c는 2

        c = a / b;  // 나누기 연산, c는 0
                    // c는 int형이므로 실수값을 받을 수 없어서 소수점을 버리기 때문
                    // 실수에서 정수부분만 저장할 수 있다.

        c = a % b;  // 나머지 연산, c는 1
    }
}