package Java;

import java.util.*;
import java.util.stream.*;

public class ForEach
{
    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArr);

        intStream.forEach(i -> System.out.println(i));  // 최종 처리 메소드
                                                        // 요소를 하나씩 반복하며 출력
    }
}