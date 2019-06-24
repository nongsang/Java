package Java;

public class String_Type
{
    public static void main(String[] args)
    {
        String string1 = "Hello";   // 참조형식 중 하나인 String형

        System.out.println("string1 : " + string1); // 출력 메서드는 +연산으로 문자열을 붙여서 출력할 수 있다.

        String string2 = "Hello, " + "world!"   // 문자열과 문자열을 +연산으로 문자열을 붙여서 저장할 수 있다.

        String string3 = string1 + ", world!";  // 기존 문자열과 +연산으로 문자열을 붙여서 저장할 수 있다.

        String string4 = null;  // 참조형식은 null값으로 아무 값을 가지지 않는다고 명시할 수 있다.
    }
}