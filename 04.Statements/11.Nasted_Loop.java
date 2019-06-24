package Java;

public class Nasted_Loop
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 3; ++i)
        {
            System.out.println(i + "번째 실행");

            for(int j = 0; j < 3; ++j)  // for문 내부에 for문을 중첩하여 정의
            {
                System.out.println("Hello");
            }
        }

        // 중첩 반복문은 While도 가능하다.
    }
}