package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class System_Out
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        OutputStream outputStream = System.out; // 모니터로 출력을 한다.
                                                // System.out은 OutputStream 타입의 출력스트림이다.

        for(byte b = 48; b < 58; ++b)   // 아스키코드 48번부터 57번까지 출력
        {
            outputStream.write(b);
        }

        //outputStream.write(13);   // 캐리지리턴 출력, return
                                    // Java 12, IntelliJ 기준 캐리지리턴만 출력하면 앞에 출력하려는 내용들이 전부 없어진다.
        outputStream.write(10); // 라인피드 출력, 개행

        for(byte b = 97; b < 123; ++b)  // 아스키코드 97번부터 122번까지 출력
        {
            outputStream.write(b);
        }

        outputStream.write(10);

        String hangle = "가나다라마바사아자차카타파하";
        byte[] hangleBytes = hangle.getBytes();
        outputStream.write(hangleBytes);        //byte 배열에 저장된 문자열을 한번에 출력할 수 있다.

        outputStream.flush();   // 출력버퍼를 비움
        outputStream.close();   // 스트림을 전부 사용했으면 닫아준다.
    }
}