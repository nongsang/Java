package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class HashSet_Collection
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = null;   // Set<>은 인터페이스다.
                                    // Set<>은 Set<> 계열의 컬렉션들이 필수로 정의되어 있어야 하는 기능들을 선언해놓았다.
                                    // Set<> 계열 컬렉션은 들어온 순서대로 저장하지 않고, 중복값을 허용하지도 않는다.
                                    // 수학의 집합정도로 생각하면 된다.
                                    // 아니면 로또 번호기계

        HashSet<Integer> set2 = new HashSet<>();    // Set<> 계열 컬렉션 중 하나인 HashSet이다.

        set2.add(1);    // 데이터 추가
        set2.add(1);    // 같은 데이터를 추가한다고 오류를 내는게 아니라 그냥 추가를 안한다.
                        // 먼저 hashCode()로 비교하여 같은 인스턴스인지 비교한다.
                        // 그리고 Equals()로 비교하여 같은 값인지 비교한다.
                        // 하나라도 false면 다른 객체로 인식하고 컬렉션에 데이터를 추가한다.

        System.out.println(set);
    }
}