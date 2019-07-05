package Java;

import java.util.*;

public class Stack_Collection
{
    public static void main(String[] args)
    {
		// 나중에 저장된 것이 먼저 나가는 후입선출(LIFO: Last In First Out) 구조
		Stack<Integer> stack = new Stack<>();

		stack.push(1);	// 제일 먼저 들어왔으므로 제일 아래에 위치
		stack.push(2);
		stack.push(3);	// 제일 늦게 들어왔으므로 제일 위에 위치

		System.out.println(stack);	// 제일 아래부터 출력한다.

		System.out.println(stack.pop());	// 제일 위의 객체를 빼낸다.
											// 그리고 빼낸 값이 무엇인지 출력

		System.out.println(stack);

		System.out.println(stack.peek());	// 현재 제일 위에 위치한 값을 반환한다.
											// 그리고 출력
											// 값을 빼지는 않는다.
	}
}