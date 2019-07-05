package Java;

import java.util.*;

public class Queue_Interface
{
    public static void main(String[] args)
    {
    	// 먼저 들어오면 먼저 나가는 선입선출(FIFO: First In First Out) 구조
		// Queue<>는 인터페이스 이므로 LinkedList<> 등 선입선출 구조의 컬렉션을 연결하여 사용할 수 있다.
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(1);	// 제일 먼저 들어왔으므로 제일 뒤에 위치
							// offer()는 특수값도 처리할 수 있다.(null, false 등)
		queue.add(2);		// LinkedList를 사용할 때 처럼 add로 넣어도 된다.
							// add()는 정상값만 처리할 수 있다.(null, false 등이 입력되면 Exception 발생)
		queue.offer(3);	// 제일 늦게 들어왔으므로 제일 앞에 위치

		System.out.println(queue);	// 제일 뒤부터 출력한다.

		System.out.println(queue.poll());	// 제일 뒤에 있는 객체를 빼낸다.
											// 그리고 출력
											//offer()는 특수값도 처리할 수 있다.(null, false 등)

		System.out.println(queue.remove());	// 제일 뒤에 있는 객체를 빼낸다.
											// 그리고 출력
											// add()는 정상값만 처리할 수 있다.(null, false 등이 입력되면 Exception 발생)

		System.out.println(queue.peek());	// 제일 뒤에 있는 값을 반환한다.
											// 그리고 출력
											// 값을 빼지는 않는다.
											// peek()는 특수값도 처리할 수 있다.(null, false 등)

		System.out.println(queue.element());// 제일 뒤에 있는 값을 반환한다.
											// 그리고 출력
											// 값을 빼지는 않는다.
											// element()는 정상값만 처리할 수 있다.(null, false 등이 입력되면 Exception 발생)

		// 우선순위 큐
		// 일반 큐와 다를바 없이 들어온 순서대로 저장이 되지만 값을 뺄 때 우선순위에 따라 뺀다.
		queue = new PriorityQueue<>();

		queue.offer(1);
		queue.offer(3);
		queue.offer(2);

		System.out.println(queue);	// 1, 3, 2

		System.out.println(queue.poll());	// 1
		System.out.println(queue.poll());	// 2, 작은 수 순서가 우선순위
		System.out.println(queue.poll());	// 3
	}
}