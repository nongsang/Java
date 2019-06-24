package Java;

public class Enumeration_Type
{
    public enum State{IDLE, ATTACK, DIE}    // 열거형
    // 원소는 상수이며, 관례적으로 모두 대문자로 정의

    public enum Equip{ONE_HAND_SWORD, TWO_HAND_SWORD}   // 두 단어 이상으로 이루어져 있으면 관례적으로 단어 사이에 _로 이어준다.

    public static void main(String[] args)
    {
        // enum을 사용하면 자동으로 java.lang.enum이 import되어 컴파일된다.

        State state = null; // 열거형 변수 생성 가능
        // 참조형이므로 null로 아무것도 가리키지 않게 할 수 있다.

        Equip equip = Equip.ONE_HAND_SWORD; // 열거형 원소를 저장해 놓을 수 있다.

        System.out.println(equip);  // equip 변수가 가리키고 있는 열거형 원소의 이름을 출력
        System.out.println(equip.name());   // 위와 같은 의미

        System.out.println(equip.ordinal());    // equip 변수가 가리키고 있는 열거형 원소가 몇번째 원소인지 출력

        System.out.println(equip.compareTo(Equip.TWO_HAND_SWORD));  // equip 변수가 가리키고 있는 열거형 원소와 열거형 원소가 몇개의 원소만큼 떨어져있는지 출력

        System.out.println(State.valueOf("DIE"));   // 이름으로 열거형 원소를 찾으면 열거형 원소의 이름을 반환
    }
}