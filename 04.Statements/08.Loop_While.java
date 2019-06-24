package Java;

public class Loop_While
{
    public static void main(String[] args)
    {
        int i = 0;

        while(i < 5)    // 조건에 맞으면 실행, 조건에 맞지 않으면 while문 탈출
        {
            System.out.println("Hello");
            ++i;
        }
    }
}