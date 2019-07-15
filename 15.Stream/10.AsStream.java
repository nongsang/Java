package Java;

import java.util.*;
import java.util.stream.*;

public class AsStream
{
    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArr);

        intStream
                .asDoubleStream()                       // 스트림에 있는 요소들은 double형으로 변환하여 스트림을 반환
                                                        // int형으로 변환하려면 asIntStream()을 사용하면 된다.
                .forEach(d -> System.out.println(d));   // 출력
    }
}