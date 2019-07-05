package Java;

import java.util.*;

// Comparable<>을 상속받지 않았다.
// 다른 방식으로 객체를 비교해야 한다.
class Language
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
}

// Comparator<>를 상속받았다.
// 비교기능만 담당하는 클래스를 만들어서 사용한다.
// 오른차순으로 정렬하는 기능을 정의한다.
class AscendingComparator implements Comparator<Language>
{
	@Override
	public int compare(Language lang1, Language lang2)
	{
		if(lang1.getNumber() < lang2.getNumber()) return -1;
		else if (lang1.getNumber() == lang2.getNumber()) return 0;
		else return 1;
	}
}

// 내림차순으로 정렬하는 기능을 정의한다.
class DescendingComparator implements Comparator<Language>
{
	@Override
	public int compare(Language lang1, Language lang2)
	{
		if(lang1.getNumber() < lang2.getNumber()) return 1;
		else if (lang1.getNumber() == lang2.getNumber()) return 0;
		else return -1;
	}
}

public class Comparator_Interface
{
    public static void main(String[] args)
    {
    	// 생성하면서 내림차순 비교자 클래스로 정렬한다.
		TreeSet<Language> treeSet = new TreeSet<>(new DescendingComparator());

		// 삽입할 때 compare()가 실행되어 정렬된다.
		treeSet.add(new Language("Java", 1));
		treeSet.add(new Language("C", 2));
		treeSet.add(new Language("C++", 3));
		treeSet.add(new Language("C#", 4));
		treeSet.add(new Language("Python", 5));
		treeSet.add(new Language("Lua", 6));
		treeSet.add(new Language("Ruby", 7));

		for(var elem : treeSet)
			System.out.println(elem.getName() + " : " + elem.getNumber());

		// 생성하면서 오름차순 비교자 클래스로 정렬한다.
		TreeMap<Language, Double> treeMap = new TreeMap<>(new AscendingComparator());

		// 삽입할 때 compare()가 실행되어 정렬된다.
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