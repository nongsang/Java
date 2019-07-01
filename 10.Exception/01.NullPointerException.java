package Java;

public class NullPointerException
{
    public static void main(String[] args)
    {
        String data = null;    // 참조형식이 null일 때

        System.out.println(data.toString());    // 어떤 작업을 하려고 하는 경우 NullPointerException 발생
                                                // 문자열의 경우 출력 혹은 가공이 작업이다.
                                                // 참조하는 곳이 없으므로 예외 발생
        System.out.println(data);   // toString()으로 출력하지 않으면 참조하는 곳이 없을 때 null로 출력
    }
}