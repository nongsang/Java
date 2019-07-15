package Java;

import java.util.*;
import java.util.stream.*;	// 스트림을 사용하기 위해 임포트

public class Stream
{
    public static void main(String[] args)
    {
    	List<String> list = Arrays.asList("홍길동", "홍길순", "홍대");

    	// 범위기반 for로 출력
    	for(var elem : list)
		{
			System.out.println(elem);
		}

    	// Iterator를 이용한 출력
		// 자바 7 이전에 사용하던 방법
		// 개발자가 직접 요소들을 반복으로 참조해서 처리하게 하는 외부 반복자 패턴
    	Iterator<String> iterator = list.iterator();
    	while (iterator.hasNext())
		{
			String name = iterator.next();
			System.out.println(name);
		}

    	// 스트림을 이용한 출력
		// 람다식으로 처리할 수 있는 반복자
		// 자바 8 이후부터 사용할 수 있는 방법
		// 컬렉션 내부에서 요소를 반복해서 개발자는 요소 당 처리할 코드만 제공하는 내부 반복자 패턴
		// 개발자는 요소처리 코드에만 집중해서 구현해주면 된다.
    	Stream<String> stream = list.stream();
    	stream.forEach(name -> System.out.println(name));

		// 컬렉션 내부에서 분배하고 병렬처리하는 방법
		// 자바는 ForkJoinPool 프레임워크로 병렬처리가 이루어진다.
		// 동기화는 따로 해줘야 한다.
    	Stream<String> parallelStream = list.parallelStream();
    	parallelStream.forEach(name -> System.out.println(name));
	}
}