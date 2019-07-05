package Java;

import java.util.*;

public class Deque_Interface
{
    public static void main(String[] args)
    {
		// Double-Ended-Queue의 약자로 발음은 '디큐'가 아니라 '데크'다.
    	// 기본적인 구조는 Queue<>와 같다.
		// 다른 점은 앞으로만 삽입할 수 있는 Queue<>와 달리 앞, 뒤로 삽입할 수 있다.
		// Deque<>는 인터페이스 이므로 ArrayDeque<> 등의 컬렉션을 연결하여 사용할 수 있다.
    	Deque<Integer> deque = new ArrayDeque<>();

    	deque.addFirst(1);	// 앞에서 삽입
    	deque.addLast(2);	// 뒤에서 삽입
    	deque.add(3);			// addLast()와 같은 기능
		deque.push(4); 		// addFirst()와 같은 기능

		System.out.println(deque);

		deque.offerFirst(5);	// 앞에서 삽입
		deque.offerLast(6);	// 뒤에서 삽입
		deque.offer(7);		// offerLast()와 같은 기능

		System.out.println(deque);

		deque.removeLast();	// 뒤의 값 삭제
		deque.remove();		// removeFirst()와 같이 앞의 값 삭제
		deque.remove(3);	// 특정한 값을 찾아서 삭제
		deque.pop();		// removeFirst()와 같이 앞의 값 삭제

		System.out.println(deque);

		deque.pollLast();	// 뒤의 값 삭제
		deque.poll();		// pollFirst()와 같이 앞의 값 삭제

		System.out.println(deque);

		deque.addFirst(1);
		deque.addLast(3);

		System.out.println(deque);

		System.out.println(deque.getFirst());	// 첫번째 값 출력
		System.out.println(deque.getLast());	// 두번째 값 출력
		System.out.println(deque.element());	// getFirst()와 같은 기능

		System.out.println(deque.peekFirst());	// 첫번째 값 출력
		System.out.println(deque.peekLast());	// 두번째 값 출력
		System.out.println(deque.peek());		// peekFirst()와 같은 기능

		deque = new LinkedList<>();	// LinkedList<>도 Deque<> 구조와 같기 때문에 Deque<>에 연결해서 사용할 수 있다.
									// LinkedList<>는 중간에 값을 넣을 수 있는 것이 다르다.
	}
}