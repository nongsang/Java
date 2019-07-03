package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class Hashtable_Collection
{
    public static void main(String[] args)
    {
        Hashtable<String, Integer> map = new Hashtable<>(); // Map<> 계열 컬렉션 중 하나인 Hashtable이다.
                                                            // HashMap과 크게 다르지 않다.
        
        map.put("Java", 1);     // Hashtable의 특징은 Vector와 같이 스레드 안전(thread safe)하다는 것이다.
        map.put("C", 2);        // 삽입과 삭제는 대상을 수정하는 작업이다.
        map.put("C++", 3);      // 하나의 스레드가 작업을 하는 동안 다른 스레드가 접근한다면 다른 결과가 나올 수 있다.
        map.put("C#", 4);       // 한번에 하나의 스레드만 접근하게하여 일관성을 유지할 수 있는 컬렉션이다.
        map.put("Python", 5);
        map.put("Lua", 6);
        map.put("Ruby", 7);
    }
}