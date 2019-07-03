package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class HashMap_Collection
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = null;   // Map<>은 인터페이스다.
                                            // Set<>은 Set<> 계열의 컬렉션들이 필수로 정의되어 있어야 하는 기능들을 선언해놓았다.
                                            // Set<> 계열 컬렉션은 들어온 순서대로 저장하지 않고, 키와 값으로 두가지 자료형을 사용한다.
                                            // 키는 중복이 허용되지않으며 String을 주로 사용한다.
                                            // 값은 중복으로 저장해도 된다.

        HashMap<String, Integer> map2 = new HashMap<>();    // Map<> 계열 컬렉션 중 하나인 HashMap이다.

        // 삽입하면 자동정렬
        // add()가 아니라 put()이다.
        map2.put("Java", 1);
        map2.put("C", 2);
        map2.put("C++", 3);
        map2.put("C#", 4);
        map2.put("Python", 5);
        map2.put("Lua", 6);
        map2.put("Ruby", 7);

        System.out.println(map2);

        System.out.println(map2.values());  // 맵의 값을 가져오는 방법
        System.out.println(map2.keySet());  // 맵의 키값을 가져오는 방법
    }
}