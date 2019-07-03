package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class ArrayList_Collection
{
    public static void main(String[] args)
    {
        List<Integer> list1 = null; // List<>는 인터페이스다.
                                    // List<>는 List<> 계열의 컬렉션들이 필수로 정의되어 있어야 하는 기능들을 선언해놓았다.
                                    // List<> 계열 컬렉션은 들어온 순서대로 저장하고, 중복값을 허용하여 저장한다.

        ArrayList<Integer> list2 = new ArrayList(); // List<> 계열 컬렉션중 하나인 ArrayList다.
                                                    // ArrayList<>만의 기능도 있으므로 List<>보다는 ArrayList<>로 쓰자.

        list2 = new ArrayList<>();

        list2.add(123); // 컬렉션 맨 뒤에 데이터 저장
        list2.add(345);
        list2.add(1, 567);  // 1번 인덱스에 데이터 저장

        System.out.println(list2);  // 컬렉션 원소들을 전부 출력

        list2.clear();  // 모든 원소 삭제

        ArrayList list3 = new ArrayList();   // 제너릭을 사용하지 않으면 Object형으로 생성된다.

        list3.add("바보");    // 다른 자료형과
        list3.add(123);       // 동시에
        list3.add(345.678);   // 저장할 수 있다.

        System.out.println(list3);  // 컬렉션 원소들을 전부 출력
        System.out.println(list3.get(1));   // 1번 인덱스의 원소값을 가져온다.
        System.out.println(list3.indexOf(123)); // 찾는 원소값의 인덱스를 가져온다.
                                                // 찾는 값이 없으면 -1 반환

        list3.remove(0);      // 0번 인덱스 값을 삭제
        list3.remove(345.678);   // 값을 찾아서 삭제할 수도 있다.
                                    // ArrayList는 값을 삭제하면 뒤에있는 원소들을 한칸씩 앞으로 당겨서 저장한다.
                                    // 배열특징 중 하나인 값을 삭제하면 해당 인덱스가 비어있는 상태를 없애는데 그친다.

        List list4 = Arrays.asList(new Object[]{"바보", 123, 345.678});   // 생성과 동시에 초기화
                                                                          // 배열로 생성해서 리스트로 변환해 저장할 수 밖에 없다.

        List list5 = Arrays.asList("바보", 123, 345.678); // 자바 5 이상부터 사용할 수 있는 축소 초기화
    }
}