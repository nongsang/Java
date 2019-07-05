package Java;

import java.util.*;

// TreeSet이나 TreeMap에 저장할 사용자 정의 클래스는 Comparable<>를 상속받아야 한다.
// TreeSet이나 TreeMap은 저장하자마자 비교해서 정렬을 하기 때문이다.
// 저장할 객체를 비교할 수 있는 인터페이스 정의가 필요하다.
class Language implements Comparable<Language>
{
	private String name;
	private int number;

	public Language(String name, int number)
	{
		this.name = name;
		this.number = number;
	}

	public String getName() { return name; }
	public int getNumber() { return number; }

	@Override
	public int compareTo(Language lang)		// compareTo를 오버라이딩하여 어떤 것이 더 큰지 비교할 수 있는 근거가 된다.
	{
		if(number < lang.number) return -1;			// 비교했을 때 작으면 -1
		else if (number == lang.number) return 0;	// 같으면 0
		else return 1;								// 크면 1을 반환한다.
	}
}

public class Comparable_Interface
{
    public static void main(String[] args)
    {
		TreeSet<Language> treeSet = new TreeSet<>();

		// 삽입할 때 compareTo()가 실행되어 정렬된다.
		treeSet.add(new Language("Java", 1));
		treeSet.add(new Language("C", 2));
		treeSet.add(new Language("C++", 3));
		treeSet.add(new Language("C#", 4));
		treeSet.add(new Language("Python", 5));
		treeSet.add(new Language("Lua", 6));
		treeSet.add(new Language("Ruby", 7));

		for(var elem : treeSet)
			System.out.println(elem.getName() + " : " + elem.getNumber());

		TreeMap<Language, Double> treeMap = new TreeMap<>();

		// 삽입할 때 compareTo()가 실행되어 정렬된다.
		treeMap.put(new Language("Java", 1), 15.004);
		treeMap.put(new Language("C", 2), 13.3);
		treeMap.put(new Language("C++", 3), 7.384);
		treeMap.put(new Language("C#", 4), 4.483);
		treeMap.put(new Language("Python", 5), 8.53);
		treeMap.put(new Language("Lua", 6), 0.514);

		for(var elem : treeMap.entrySet())
			System.out.println(elem.getKey().getName() + " : " + elem.getKey().getNumber() + " = " + elem.getValue() + "%");
	}
}