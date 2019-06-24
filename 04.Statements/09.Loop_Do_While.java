package Java;

public class Loop_Do_While
{
    public static void main(String[] args)
    {
        int i = 0;

        do  // while문과 다른 것은 내부을 무조건 한번 실행한다는 점이다.
        {
            System.out.println("Hello");    // 실행한 후
            ++i;
        }
        while(i < 5);   // 조건검사
    }
}