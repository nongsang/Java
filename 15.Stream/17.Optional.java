package Java;

import java.util.*;
import java.util.stream.*;

public class Optional
{
    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArr);

        OptionalDouble optionalDouble = intStream
                .filter(i -> i%2 == 0)
                .average();             // 평균을 구하고 Optional로 반환

        if(optionalDouble.isPresent())  // 값이 존재하면
        {
            System.out.println("평균 : " + optionalDouble.getAsDouble()); // double형으로 변환해서 출력
        }
        else    // 값이 없으면
        {
            System.out.println("평균을 낼 수 없습니다.");
        }

        intStream = Arrays.stream(intArr);

        double avg = intStream
                .filter(i -> i>6)
                .average()
                .orElse(0.0);       // 결과를 반환할 수 없으면 0.0을 반환하라.
        System.out.println(avg);

        intStream = Arrays.stream(intArr);

        intStream
                .average()
                .ifPresent(d -> System.out.println(d)); // 값이 존재하면 작업
                                                        // if와 inPresent()를 합친 기능
    }
}