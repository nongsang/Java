package Java;

import java.util.*;
import java.util.stream.*;

public class Boxed
{
    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArr);

        intStream
                .boxed()                                                // 박싱을 해준다.
                                                                        // int형은 값형식, Integer는 참조형식
                                                                        // int형을 Integer형으로 바꿔서 스트림을 반환
                .forEach(obj -> System.out.println(obj.intValue()));    // 출력
    }
}