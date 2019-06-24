package Java;

public class Heap
{
    public static void main(String[] args)
    {
        String s1 = "Hello";   // Hello라는 문자열을 힙에 생성하고 string1이 참조하게 한다.
        String s2 = "Hello";   // Hello라는 문자열이 이미 있으므로 string2도 같은 메모리를 참조한다.

        System.out.println("s1 == s2 : " + s1 == s2);   // 문자열끼리 +연산이 있으므로 ==연산이 아니라 문자열 + 문자열 연산이 먼저다
                                                        // ==연산을 먼저 하게끔 묶어줘야 한다.

        System.out.println("s1 == s2 : " + (s1 == s2)); // true
                                                        // 값형식에서 ==연산은 두 값이 같은지 비교하는 연산이다.
                                                        // 참조형식에서 ==연산은 두 변수가 참조하는 메모리가 같은지 비교하는 연산이다.

        System.out.println("s1 != s2 : " + (s1 != s2)); // 같은 위치를 참조하고 있으므로 false

        String s3 = new String("Hello");   // Hello라는 문자열을 힙에 생성하고 string3이 참조하게 한다.
        String s4 = new String("Hello");   // Hello라는 문자열이 이미 있지만 새로 힙에 생성해서 string4가 참조하게 한다.

        System.out.println("s3 == s4 : " + (s3 == s4)); // false
                                                        // 값은 서로 같지만 참조위치가 다르기 때문에 false

        System.out.println("s3 != s4 : " + (s3 != s4)); // true

        System.out.println("s3.equals(s4) : " + s3.equals(s4)); // 참조 위치가 아니라 값이 같은지 확인하고 싶으면 equals 메서드를 사용해야 한다.
                                                                // true
    }
}