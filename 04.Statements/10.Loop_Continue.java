package Java;

public class Loop_Continue
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; ++i) // 10번 반복
        {
            if(i % 2 == 0)  // 2로 나누어 떨어지면(짝수면)
                continue;   // for문을 다시 실행(짝수는 건너뛰겠다)

            System.out.println(i);  // 홀수만 출력
        }                           // continue는 while문에서도 사용할 수 있다.
    }
}