package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class LinkedList_Collection
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();    // List<> 계열 컬렉션 중 하나인 LinkedList다.

        list.add(1);   // 기본적인 사용법은
        list.add(2);   // ArrayList와
        list.add(3);   // 다르지 않다.
        list.add(4);

        list.remove(2);    // ArrayList와 다른 점은
        list.remove(0);    // LinkedList는 양방향 연결 리스트인 점.
                                 // 따라서 삽입, 삭제가 빈번할 때 ArrayList보다 좋다.

        System.out.println(list);
    }
}