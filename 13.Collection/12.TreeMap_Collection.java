package Java;

import java.util.*;

public class TreeMap_Collection
{
    public static void main(String[] args)
    {
		TreeMap<String, Integer> map = new TreeMap<>();	// Map<> 계열 컬렉션 중 하나인 TreeMap이다.
														// Binaray Tree 기반의 Map 컬렉션이다.
														// 키와 값이 저장된 Map.Entry를 저장한다.
														// 삽입, 삭제를 할 때 마다 정렬하므로 잦은 삽입, 삭제가 발생하면 성능저하가 발생한다.

		// 삽입하면 키값을 기준으로 자동정렬
		// 문자열이면 a부터, 정수면 작은 수부터
		map.put("Java", 1);
		map.put("C", 2);
		map.put("C++", 3);
		map.put("C#", 4);
		map.put("Python", 5);
		map.put("Lua", 6);
		map.put("Ruby", 7);

		System.out.println(map);

		// 특정한 원소를 찾을 수 있다.
		System.out.println(map.firstEntry());    // 제일 작은 값
		System.out.println(map.lastEntry());     // 제일 큰 값

		// 비교하여 해당하는 값을 찾는다.
		System.out.println(map.lowerEntry("Java"));      // Java보다 작은 값 1개를 반환
		System.out.println(map.floorEntry("Java"));      // Java가 있으면 Java를 반환하고 없으면 작은 값 1개를 반환
		System.out.println(map.higherEntry("Python"));   // Python보다 큰 값 1개를 반환
		System.out.println(map.ceilingEntry("Python"));  // Python이 있으면 Python을 반환하고 없으면 작은 값 1개를 반환

		while(!map.isEmpty())   // set이 비어있지 않다면 반복
		{
			Map.Entry lang = map.pollFirstEntry();      // 컨테이너 제일 작은 값부터 반환하고 삭제한다.
			System.out.println(lang + " 남은 데이터 : " + map.size());
		}

		map.put("Java", 1);
		map.put("C", 2);
		map.put("C++", 3);
		map.put("C#", 4);
		map.put("Python", 5);
		map.put("Lua", 6);
		map.put("Ruby", 7);

		Iterator<String> iter = map.keySet().iterator(); // set의 원소들을 가리키는 반복자 생성
		while(iter.hasNext())   // 반복자가 다음값을 가리킬 수 있다면
		{
			String lang = iter.next();      // 컨테이너 제일 작은 값을 반환만 한다.
			System.out.println(lang + " = " + map.get(lang) + " 남은 데이터 : " + map.size());
		}

		// 그냥 범위기반 for문을 사용하면 쉽게 출력할 수 있다.
		for(var elem : map.entrySet())
			System.out.println(elem.getKey() + " = " + elem.getValue());

		// keySet()을 이용하여 범위기반 for문으로 출력할 수 있다.
		for(var elem : map.keySet())
			System.out.println(elem + " = " + map.get(elem));


		NavigableMap<String, Integer> desMap = map.descendingMap();	// map을 내림차순으로 저장한다.
																	// 반환형은 NavigableSet<>이므로 주의
		System.out.println(desMap);

		// Map은 Entry로 저장되므로 Entry를 가져와서 Set에 저장할 수 있다.
		Set<Map.Entry<String,Integer>> desEntrySet = desMap.entrySet();
		System.out.println(desEntrySet);

		// 내림차순이었던 컨테이너를 다시 반대로 하여 오름차순으로 바꿔서 저장한다.
		NavigableMap<String, Integer> aseMap = desMap.descendingMap();
		System.out.println(aseMap);

		// Map은 Entry로 저장되므로 Entry를 가져와서 Set에 저장할 수 있다.
		Set<Map.Entry<String,Integer>> aseEntrySet = aseMap.entrySet();
		System.out.println(aseEntrySet);

		// C로 시작하는 단어부터 L로 시작하는 단어 전까지 모두 찾는다.
		NavigableMap<String, Integer> findMap1 = map.subMap("C", true, "L", true);
		System.out.println(findMap1);

		// Java보다 앞에있는 원소들을 모두 찾는다.
		// 반환형은 SortedSet<>이니 주의
		SortedMap<String, Integer> findMap2 = map.headMap("Java");
		System.out.println(findMap2);

		// Java를 포함하여 뒤에 있는 원소들을 모두 찾는다.
		SortedMap<String, Integer> findMap3 = map.tailMap("Java");
		System.out.println(findMap3);
	}
}