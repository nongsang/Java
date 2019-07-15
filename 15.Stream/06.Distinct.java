package Java;

import java.util.*;

public class Distinct
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("홍길동", "홍길순", "홍대", "홍길동");

        list.stream()
                .distinct()     // 중복을 없애준 중간처리 스트림 반환
                                // Equals()를 실행하고 true면 삭제하는 방식이다.
                .forEach(s -> System.out.println(s));
    }
}