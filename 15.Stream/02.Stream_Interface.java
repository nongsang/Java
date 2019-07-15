package Java;

import java.util.*;
import java.util.stream.*;

public class Stream_Interface
{
	public static void main(String[] args)
	{
		BaseStream baseStream = null;	// 최상위 스트림으로써 인터페이스만 제공한다.

		List<String> list = Arrays.asList("홍길동", "홍길순", "홍대");
		Stream<String> stream = list.stream();		// 어떤 컬렉션이든, 어떤 배열이든 스트림을 가져올 수 있는 Stream<T> 인터페이스
		stream.forEach(s -> System.out.println(s));

		IntStream intStream1 = IntStream.rangeClosed(1, 100);	// int형만 담을 수 있는 IntStream 인터페이스
		// 1 ~ 100까지 스트림으로 저장한다.
		intStream1.forEach(i -> System.out.println(i));

		int[] intArr = { 3, 4, 5 };
		IntStream intStream2 = Arrays.stream(intArr);	// Arrays의 stream()으로 배열의 스트림을 가져올 수 있다.
		// 배열의 자료형에 따라 가져올 스트림의 자료형이 달라진다.

		DoubleStream doubleStream = DoubleStream.of(3.0, 5.0, 7.0);	// double형만 담을 수 있는 DoubleStream 인터페이스
		// of를 이용하여 새로운 스트림을 연결할 수 있다.
		doubleStream.forEach(d -> System.out.println(d));
	}
}