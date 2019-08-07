package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class Consoler_Readline
{
    public static void main(String[] args)
    {
        // System.in은 char로 변환하거나 byte의 배열에 저장해서 사용하는 등 불편함이 있다.
        // 자바 6 부터 입력된 문자열을 쉽게 읽을 수 있도록 Console 클래스 제공
        Console console = System.console();

        System.out.print("아이디 : ");
        String id = console.readLine(); // 문자열 입력
                                        // 콘솔로 입력을 받아야 하기 때문에 null을 반환한다.
                                        // cmd 창에서 소스코드를 실행하면 잘 작동한다.

        console.writer();   // 라인피드가 버퍼에 남아있으므로 문자 한개만 입력 받아서 무시한다.

        System.out.print("패스워드 : ");
        char[] charPassword = console.readPassword();   // 화면에는 출력되지 않게 입력받는다.
        String password = new String(charPassword);

        System.out.println("---------------------");
        System.out.println("아이디 : " + id);
        System.out.println("패스워드 : " + password);
    }
}