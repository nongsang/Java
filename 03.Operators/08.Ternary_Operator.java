package Java;

public class Ternary_Operator
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = 0;

        c = a < b ? a : b;  // 삼항 연산자
                            // a < b가 true면 a를 반환, false면 b를 반환한다.
                            // a < b가 true이므로 c는 1
    }
}