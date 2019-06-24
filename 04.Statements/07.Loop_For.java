package Java;

public class Loop_For
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; ++i)      // i의 값을 5보다 작은지 검사하고 true면 실행후 ++i 실행
        {                               // 5와 같거나 크면 for문을 탈출한다.
            System.out.println("Hello");    // Hello 5번 출력
        }

        System.out.println("끝");
    }
}