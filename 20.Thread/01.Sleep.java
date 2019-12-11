package Java;

public class Sleep
{
    public static void main(String[] args)
    {
        System.out.println("main 시작");

        try
        {
            Thread.sleep(500);  // 현재 스레드 0.5초 대기
        }
        catch (Exception e)     // 스레드는 예외처리를 하도록 강제해놨다.
        {
            System.out.println("스레드 예외");
        }

        System.out.println("main 끝");

    }
}