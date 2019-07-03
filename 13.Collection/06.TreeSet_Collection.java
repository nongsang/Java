package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class TreeSet_Collection
{
    public static void main(String[] args)
    {
        TreeSet<String> set = new TreeSet<>();  // Set<> 계열 컬렉션 중 하나인 HashSet이다.
                                                // Tree구조는 탐색에 특화되어 있다.
                                                // 삽입, 삭제를 할 때 마다 정렬하므로 잦은 삽입, 삭제가 발생하면 성능저하가 발생한다.

        // 삽입하면 자동정렬
        // 문자열이면 a부터, 정수면 작은 수부터
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("C#");
        set.add("Python");
        set.add("Lua");
        set.add("Ruby");

        System.out.println(set);

        // 특정한 원소를 찾을 수 있다.
        System.out.println(set.first());    // 제일 작은 값
        System.out.println(set.last());     // 제일 큰 값

        // 비교하여 해당하는 값을 찾는다.
        System.out.println(set.lower("Java"));      // Java보다 작은 값 1개를 반환
        System.out.println(set.floor("Java"));      // Java가 있으면 Java를 반환하고 없으면 작은 값 1개를 반환
        System.out.println(set.higher("Python"));   // Python보다 큰 값 1개를 반환
        System.out.println(set.ceiling("Python"));  // Python이 있으면 Python을 반환하고 없으면 작은 값 1개를 반환

        while(!set.isEmpty())   // set이 비어있지 않다면 반복
        {
            String lang = set.pollFirst();      // 컨테이너 제일 작은 값부터 반환하고 삭제한다.
            System.out.println(lang + " 남은 데이터 : " + set.size());
        }

        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("C#");
        set.add("Python");
        set.add("Lua");
        set.add("Ruby");

        Iterator<String> iter = set.iterator(); // set의 원소들을 가리키는 반복자 생성
        while(iter.hasNext())   // 반복자가 다음값을 가리킬 수 있다면
        {
            String lang = iter.next();      // 컨테이너 제일 작은 값을 반환만 한다.
            System.out.println(lang + " 남은 데이터 : " + set.size());
        }

        NavigableSet<String> decSet = set.descendingSet();  // set을 내림차순으로 저장한다.
                                                            // 반환형은 NavigableSet<>이므로 주의
        System.out.println(decSet);
        NavigableSet<String> aseSet = decSet.descendingSet();   // 내림차순이었던 컨테이너를 다시 반대로 하여 오름차순으로 바꾼다.
        System.out.println(aseSet);

        // C로 시작하는 단어부터 L로 시작하는 단어 전까지 모두 찾는다.
        NavigableSet<String> findSet1 = set.subSet("C", true, "L", true);
        System.out.println(findSet1);

        // Java보다 앞에있는 원소들을 모두 찾는다.
        // 반환형은 SortedSet<>이니 주의
        SortedSet<String> findSet2 = set.headSet("Java");
        System.out.println(findSet2);

        // Java를 포함하여 뒤에 있는 원소들을 모두 찾는다.
        SortedSet<String> findSet3 = set.tailSet("Java");
        System.out.println(findSet3);
    }
}