package Java;

import java.io.FileInputStream;
import java.io.IOException;

public class Try_With_Resource
{
    public static void main(String[] args)
    {
        FileInputStream fis1 = null;

        try     // 자바 7 이전에 사용했던 리소스 예외처리
        {
            fis1 = new FileInputStream("file1.txt");    // 파일 입력 스트림을 생성시도를 하고
        }
        catch (IOException e)       // 예외가 발생하면 처리
        {
            System.out.println("스트림 예외가 발생했습니다.");
        }
        finally     // 예외가 발생했든 정상적으로 종료했든 마지막에 처리하는 부분
        {
            if(fis1 != null)
            {
                try
                {
                    fis1.close();   // 파일 입력 스트림을 닫는데도 시도를 해야하고
                }
                catch (IOException e)
                {
                    // 예외처리도 해야한다.
                    // 코드가 매우 길어지고 불편하다.
                    System.out.println("스트림을 닫는데 예외가 발생했습니다.");
                }
            }
        }

        // 자바 7 이후 추가된 자동 리소스 예외 처리
        try(FileInputStream fis2 = new FileInputStream("file2.txt"))
        {
            // 자동 리소스 예외 문법을 사용할 수 있는 대상은 java.lang.AutoCloseable 인터페이스를 구현한 클래스여야 한다.
            // 파일 스트림, 소켓 등
            // 정상적으로 사용이 끝나면 자동으로 close()가 호출되어 정상적으로 종료
            // 예외가 발생하면 close()를 호출하고 Exception 발생
        }
        catch (IOException e)   // 스트림 예외가 발생하면 실행
        {
            System.out.println("스트림 예외가 발생했습니다.");
        }
    }
}