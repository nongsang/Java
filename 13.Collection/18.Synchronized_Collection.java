package Java;

import java.util.*;

public class Synchronized_Collection
{
    public static void main(String[] args)
    {
    	// 기본적으로 컬렉션은 비동기방식이다.
		// 여러 스레드가 한꺼번에 값을 변경(삽입, 삭제 등)을 하면 제대로된 결과가 나오지 않는다.
		// 한 스레드가 컬렉션을 사용하고 있다면 다른 스레드들이 접근하지 못하게 제한하면 제대로된 결과가 나올 것이다.
		// Collections.synchronizedXXX()에 매개변수로 컬렉션을 전달해줘서 전달해준 컬렉션을 동기방식으로 바꿔준다.
		// 단, 각 컬렉션에 맞는 컬렉션 인터페이스와 연결해줘야 한다.
    	List<Integer> list = Collections.synchronizedList(new ArrayList<>());	// ArrayList<>를 동기방식으로 변경했다.
																				// ArrayList<>는 List<> 계열 컬렉션이므로 List<> 인터페이스와 연결해주면 된다.

		Set<Integer> set = Collections.synchronizedSet(new HashSet<>());	// HashSet<>을 동기방식으로 변경했다.
																			// HashSet<>은 Set<> 계열이므로 Set<> 인터페이스와 연결해주면 된다.

		Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());	// HashMap<>을 동기방식으로 변경했다.
																					// HashMap<>dms Map<> 계열이므로 Set<> 인터페이스와 연결해주면 된다.
	}
}