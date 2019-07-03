package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class Vector_Collection
{
    public static void main(String[] args)
    {
        Vector<Integer> list1 = new Vector<>();   // List<> 계열 컬렉션 중 하나인 Vector다.

        list1.add(123);         // Vector의 특징은 스레드 안전(thread safe)하다는 것이다.
        list1.remove(0);  // 삽입과 삭제는 대상을 수정하는 작업이다.
                                // 하나의 스레드가 작업을 하는 동안 다른 스레드가 접근한다면 다른 결과가 나올 수 있다.
                                // 한번에 하나의 스레드만 접근하게하여 일관성을 유지할 수 있는 컬렉션이다.

        List list2 = new Vector(5); // 벡터의 크기를 정해서 생성;
        List list3 = new Vector(5, 5);  // 벡터의 가장 큰 특징 중 하나
                                                                    // 벡터의 공간이 꽉차면 일정한 크기를 추가로 잡고 다시 데이터를 저장한다.
                                                                    // 메모리를 할당하는 작업은 매우 비용이 많이 들기 때문에 한번메 많은 크기를 할당하면 오버헤드가 적어진다.
                                                                    // 5의 공간을 할당하고 꽉찰때마다 5의 크기를 할당받는다.
    }
}