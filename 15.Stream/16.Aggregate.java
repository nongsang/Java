package Java;

import java.util.*;
import java.util.stream.*;

public class Aggregate
{
    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5, };

        IntStream intStream = Arrays.stream(intArr);

        long count = intStream
                .filter(i -> i%2 == 0)
                .count();               // 갯수를 세는 최종처리 메서드
        System.out.println("2의 배수의 갯수 : " + count);

        intStream = Arrays.stream(intArr);

        int result = intStream
                .filter(i -> i%2 == 0)
                .sum();                 // 값을 다 더해주는 최종처리 메서드
        System.out.println("2의 배수의 합 : " + result);

        intStream = Arrays.stream(intArr);

        int maxInt = intStream
                .filter(i -> i%2 == 0)
                .max()                  // 최고로 큰 값을 반환
                                        // 반환형이 Optional이다.
                                        // null과 null이 아닌 데이터를 같이 처리하기 위해 자바 8 부터 제공해준다.
                                        // 이전에는 NullPointerException이 자주 호출이 되고 예외처리를 해주자니 가독성도 나빠져서 제공해주게 되었다.
                                        // NullPointerException이 호출되지 않는 것은 아니지만 예외처리를 안해줘도 되게끔 설계가 되었다.
                .getAsInt();            // 반환형이 Optional이라서 int형으로 반환해줘야 한다.
        System.out.println("2의 배수의 합 : " + result);

        double avg = intStream
                .filter(i -> i%2 == 0)
                .average()              // 평균값을 반환
                                        // 평균의 반환형은 OptionalDouble이다.
                .getAsDouble();
    }
}