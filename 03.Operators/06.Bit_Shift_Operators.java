package Java;

public class Bit_Shift_Operators
{
    public static void main(String[] args)
    {
        // 비트 이동 연산은 정수만 가능
        // 비트 이동 연산은 int 기준으로 해야 이해하기 편하니 int 기준
        int a = 0b1111_1111_1111_1111_1111_1111_1111_0000;  // 2진수로 -16
        int b = 0b0000_0000_0000_0000_0000_0000_0000_0001;  // 2진수로 1
        int c = 0b0000_0000_0000_0000_0000_0000_1000_0000;  // 2진수로 128

        // 비트 이동 연산은 전부 단독으로 사용할 수 없다.
        // 결과값을 활용할 수 있을 때 사용가능

        b = b << 4; // 비트를 왼쪽으로 4번 옮기고 새로운 비트를 0으로 채운다.
                    // b는 0000 0000 0000 0000 0000 0000 0001 0000이므로 결과값은 16

        a = a >> 4; // 비트를 오른쪽으로 4번 옮기고 최상위 비트가 1(음수)일 경우 새로운 비트를 1로 채운다.
                    // a는 1111 1111 1111 1111 1111 1111 1111 1111이므로 결과값은 -1

        c = c >> 4; // 비트를 오른쪽으로 4번 옮기고 최상위 비트가 0(양수)일 경우 새로운 비트를 0으로 채운다.
                    // c는 0000 0000 0000 0000 0000 0000 0000 1000이므로 결과값은 8

        a = a << 4; // 원상복구

        a = a >>> 4;    // 비트를 오른쪽으로 4번 옮기고 새로운 비트를 무조건 0으로 채운다.
                        // a는 0000 1111 1111 1111 1111 1111 1111 1111이므로 결과값은 268435455
    }
}