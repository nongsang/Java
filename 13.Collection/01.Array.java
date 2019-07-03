package Java;

public class Hello_World
{
    public static void main(String[] args)
    {
        int[] intArr = new int[5];  // 배열의 단점
                                    // 1. 크기를 한번 정하면 바꾸기 쉽지 않다.
                                    // 2. 하나의 자료형 데이터만 저장가능하다.
                                    // 3. 데이터를 삭제하면 해당 인덱스가 비어있는 상태가 유지된다.

        Object[] objects = new Object[5];   // Object형 배열을 만들면 여러 데이터를 저장할 수 있다.
                                            // 하지만 박싱이 발생하기 때문에 오버헤드가 증가하고
                                            // 크기를 정해줘야 하는 것은 변함이 없다.
                                            // 해당 인덱스가 비어있는 상태가 유지되는 것도 마찬가지다.
    }
}