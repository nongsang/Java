package Java;

public class Logical_Operators
{
    public static void main(String[] args)
    {
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = false;

        // 논리 연산은 전부 단독으로 사용할 수 없다.
        // 결과값을 활용할 수 있을 때 사용가능

        bool3 = bool1 && bool2; // &&는 AND연산
                                // 두 값이 true일 때만 true 반환
                                // 결과값은 false

        bool3 = bool1 || bool2; // ||는 OR연산
                                // 두 값중 1개라도 true면 true 반환
                                // 결과값은 true

        bool3 = !bool1; // !는 NOT연산
                        // true면 false, false면 true 반환
                        // 결과값은 false
    }
}