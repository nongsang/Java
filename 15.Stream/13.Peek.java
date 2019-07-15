package Java;

import java.util.*;
import java.util.stream.*;

public class Peek
{
    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArr);

        System.out.println("peek()를 마지막에 사용한 경우");
        intStream
                .filter(i -> i%2 == 0)
                .peek(i-> System.out.println(i));   // peek()는 중간처리이므로 최종처리를 하지 않으면 작업을 하지 않는다.


        System.out.println("최종처리를 한 경우");
        intStream = Arrays.stream(intArr);          // 사용하던 스트림은 사용을 끝내면 스트림을 닫기 때문에 다시 스트림을 얻어야 한다.
        int total = intStream
                .filter(i -> i%2 == 0)
                .peek(i-> System.out.println(i))    // 최종처리인 sum()이 있으므로 작업을 한다.
                .sum();                             // sum()은 집계해주는 최종처리 메서드, 스트림이 아니라 자료형을 반환한다.
        System.out.println(total);
    }
}