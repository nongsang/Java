package Java;

import java.util.*;

public class FlatMap
{
    public static void main(String[] args)
    {
        List<String> list1 = Arrays.asList("Java 12", "Stream Mapping"); // 띄어쓰기가 있는 문자열들 저장

        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))    // 스트림 요소를 다른 요소로 바꾸고 스트림 반환
                                                                         // 띄어쓰기를 기준으로 단어를 나눠서 저장한 스트림 반환
                .forEach(s -> System.out.println(s));

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50, 60"); // ,로 구분된 정수로 이루어진 문자열들

        list2.stream()
                .flatMapToInt(      // int형으로 바꾸어 요소를 저장한 스트림 반환
                        data -> {
                            String[] strArr = data.split(",");  // ,로 단어를 나눠서 배열에 저장
                            int[] intArr = new int[strArr.length];   // int로 변환하여 저장할 배열
                            for(int i = 0; i < intArr.length; ++i)
                            {
                                intArr[i] = Integer.parseInt(strArr[i].trim()); // 문자열이 저장된 배열에 요소들을 트림을 하여 int 배열에 변환하여 저장
                            }
                            return Arrays.stream(intArr);   // 배열을 스트림으로 변환하여 반환
                        })
                .forEach(n -> System.out.println(n));   // 스트림 출력

        // flatMap은 기존 요소를 잘게 쪼개서 넣은 스트림을 반환한다고 보면 된다.
    }
}