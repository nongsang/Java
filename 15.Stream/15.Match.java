package Java;

import java.util.*;
import java.util.stream.*;

public class Match
{
    public static void main(String[] args)
    {
        int[] intArr = { 2, 4, 6 };

        IntStream intStream = Arrays.stream(intArr);

        boolean result =  intStream.allMatch(a -> a%2 == 0);        // 모든 요소가 조건에 맞으면 true 반환
                                                                    // And연산과 같다.
        System.out.println("모든 요소가 2의 배수인가? : " + result);

        intStream = Arrays.stream(intArr);

        result =  intStream.anyMatch(a -> a%3 == 0);                // 하나라도 조건에 맞으면 true 반환
                                                                    // Or 연산과 같다.
        System.out.println("1개라도 3의 배수인 요소가 있는가? : " + result);

        intStream = Arrays.stream(intArr);

        result = intStream.noneMatch(a -> a%3 == 0);                // 조건에 맞는 요소가 없어야 true 반환
                                                                    // Nor 연산과 같다.
        System.out.println("3의 배수인 요소가 전혀 없는가? : " + result);
    }
}