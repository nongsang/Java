package Java;

import java.util.*;     // Scanner를 사용하기 위해 임포트

public class Scanner_Next
{
    public static void main(String[] args)
    {
        // Console은 문자열은 입력받을 수 있으나 기본 타입(정수, 실수)값까지 문자열로 인식하는 문제가 있다.
        // Scanner는 기본 타입을 바로 읽을 수 있게 도와준다.
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s1 입력 : ");
        String s1 = scanner.next();             // 첫번째 공백까지만 하나의 문자열로 인식한다.
        System.out.println("s1 : " + s1);

        System.out.print("문자열 s1 입력 : ");
        String s2 = scanner.nextLine();         // 공백까지 입력받아 하나의 문자열로 인식한다.

        System.out.println("s2 : " + s2);

        System.out.print("정수 입력 : ");
        int i = scanner.nextInt();          // 정수를 입력받아 i에 저장
        System.out.println("i : " + i);
    }
}