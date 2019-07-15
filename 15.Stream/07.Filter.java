package Java;

import java.util.*;

public class Filter
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("홍길동", "홍길순", "홍대", "홍길동");

        list.stream()
                .distinct()                     // 일단 중복값을 없앤다.
                .filter(s -> s.endsWith("순"))   // 조건에 맞는 값만 찾아서 중간처리 스트림 생성 후 반환
                                                // 매개값으로 전달된 Predicate가 true를 반환한 값만 고른다.
                                                // 문자열이 "순"으로 끝나는 문자열을 고른다.
                .forEach(s -> System.out.println(s));
    }
}