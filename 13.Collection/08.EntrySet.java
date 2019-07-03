package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class EntrySet
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put("C", 2);
        map.put("C++", 3);
        map.put("C#", 4);
        map.put("Python", 5);
        map.put("Lua", 6);
        map.put("Ruby", 7);

        Set<String> keySet = map.keySet();              // 맵의 키셋을 가져와서
        Iterator<String> keyIter = keySet.iterator();   // 반복자를 구하고
        while(keyIter.hasNext())
        {
            String key = keyIter.next();        // 키값과
            int value = map.get(key);           // 밸류값을 구할 수 있다.
            System.out.println("Key : " + key + " Value : " + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();      // 맵의 엔드리셋을 구한다.
                                                                        // C++의 pair<>같은 개념이다.
        Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();   // 반복자를 구하고
        while (entryIter.hasNext())
        {
            Map.Entry<String, Integer> entry = entryIter.next();    // 엔트리의
            String key = entry.getKey();                            // 키값과
            int value = entry.getValue();                           // 밸류값을 구할 수 있다.
            System.out.println("Key : " + key + " Value : " + value);
        }
    }
}