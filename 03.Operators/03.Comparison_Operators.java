package Java;

public class Comparison_Operators
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        boolean bool = true;

        // 비교 결과를 boolean값으로 반환

        bool = a == b;  // a와 b가 서로 같은가?, false

        bool = a != b;  // a와 b가 서로 다른가?, true

        bool = a < b;   // a는 b보다 작은가?, true

        bool = a <= b;  // a는 b보다 작거나 같은가?, true

        bool = a > b;   // a는 b보다 큰가?, false

        bool = a >= b;  // a는 b보다 크거나 같은가?, false
    }
}