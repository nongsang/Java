package Java;

import java.awt.*;

class Task implements Runnable  // 스레드로 동시에 작업을 하게 하려는 클래스는 Runnable 인터페이스를 상송해야 한다.
{
    Toolkit toolkit = Toolkit.getDefaultToolkit();  // 툴킷 사용

    @Override
    public void run()       // run() 메서드를 재정의
    {
        for(int i = 0; i < 5; ++i)  // 1초마다 비프음 5번 츨력
        {
            toolkit.beep();
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println("스레드 예외 발생");
            }
        }
    }
}

public class Asynchronous
{
    public static void main(String[] args)
    {
        // 스레드를 생성해서 작업을 시키면 동시에 작업을 할 것이다.

        // 스레드 생성법 1
        Runnable runnable = new Task();         // Runnable 인터페이스를 생성해서
        Thread thread1 = new Thread(runnable);  // 스레드 생성함과 동시에 인터페이스 전달
        thread1.start();                        // 인터페이스를 전달받은 스레드 시작

        // 스레드 생성법 2
        Thread thread2 = new Thread(new Task());// Runnable 인터페이스를 상속받은 클래스를 생성하면서 스레드에 할당
        thread2.start();                        // 클래스를 전달받은 스레드 시작

        // 스레드 생성법 3
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // 툴킷 사용
        Thread thread3 = new Thread(()->{   // 람다를 이용한 방법, 나중에 배운다.
            for(int i = 0; i < 5; ++i)  // 1초마다 비프음 5번 츨력
            {
                toolkit.beep();
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    System.out.println("스레드 예외 발생");
                }
            }
        });
        thread3.start();    // 람다로 전달받은 스레드 시작


        for(int i = 0; i < 5; ++i)      // 비프음과 문자열이 동시에 출력된다.
        {                               // 이를 비동기 방식이라고 한다.
            System.out.println("띵");
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println("스레드 예외 발생");
            }
        }
    }
}