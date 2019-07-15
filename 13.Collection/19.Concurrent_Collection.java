package Java;

import java.util.*;
import java.util.concurrent.*;

public class Concurrent_Collection
{
    public static void main(String[] args)
    {
		// 동기화 컬렉션의 단점은 한 스레드가 컬렉션을 점유하고 있는 동안 컬렉션에 접근하려는 다른 스레드는 대기할 수 밖에 없다.
		// 멀티스레드로 성능이 높아져야 하지만 성능에 전혀 도움이 안된다.
		// 어차피 컬렉션의 모든 엔트리를 수정하는게 아니기 때문에 스레드가 딱 작업하는 컬렉션의 영역만 동기화하면 어떨까?
		// ConcurrentXXX로 이러한 컬렉션을 제공해준다.
		// ConcurrentMap<>은 인터페이스 이므로 ConcurrentHashMap<> 등의 컬렉션을 연결하여 사용할 수 있다.
		ConcurrentMap<String, Integer> concurrentMap = null;

		ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

		concurrentHashMap.put("Java", 1);
	}
}