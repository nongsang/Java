package Java;

public class Array_Type
{
    public static void main(String[] args)
    {
        int[] intArr1 = null;   // 참조형식 중 배열
        // 참조형식이기 때문에 null로 아무값도 가리키지 않음을 나타낼 수 있다.

        int[] intArr2 = {1, 2, 3, 4, 5};    // 여러 값을 한 변수로 관리할 수 있다.

        intArr2[0] = 6; // 0번 인덱스값에 접근하여 값을 수정

        for(int i = 0; i < 5; ++i)  // for문으로 반복해서
            intArr2[i] = i + 1;     // 인덱스에 접근해서 값을 수정할 수 있다.

        int intArr3[] = {1, 2, 3};  // []의 위치를 바꿔도 상관없다.

        int[] intArr4 = new int[3]; // 미리 배열의 크기를 정해놓고 생성할 수 있다.
        // 모든 원소는 0으로 자동설정

        int[] intArr5 = new int[3] {1,2,3};   // 배열의 크기를 정해서 생성하면서 값을 저장할 수는 없다.

        int[] intArr6 = intArr5;    // 참조형이기 때문에 intArr5가 가리키는 메모리를 intArr6도 가리키고 있다.
        // 가리키는게 아니라 복사하고 싶다면?

        System.arraycopy(intArr6, 0, intArr1, 0, 3);    // intArr6이 가리키는 메모리를 0번부터
        //  intArr1이 가리키는 메모리에 0번부터
        // 3개를 복사해서 저장한다.
    }
}