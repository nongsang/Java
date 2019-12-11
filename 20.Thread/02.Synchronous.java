package Java;

import java.awt.*;

public class Synchronous
{
    public static void main(String[] args)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // 툴킷 사용

        for(int i = 0; i < 5; ++i)  // 5번
        {
            toolkit.beep(); // 비프 사운드 출력 후
            try
            {
                Thread.sleep(1000);  // 1초 대기
            }
            catch (Exception e)
            {
                System.out.println("스레드 예외 발생");
            }
        }

        for(int i = 0; i < 5; ++i)
        {
            System.out.println("띵");    // 비프 사운드에 맞춰서 문차열이 출력되었으면 좋겠다.
            try
            {
                Thread.sleep(1000); // 하지만 비프음이 끝난 다음에 문자열이 출력된다.
            }                             // 이를 동기방식이라고 한다.
            catch (Exception e)
            {
                System.out.println("스레드 예외 발생");
            }
        }
    }
}