package Java;

public class Variable_Name
{
    public static void main(String[] args)
    {
        int i = 1;  // int형 변수
        int _i = 2; // 변수 이름은 _를 처음에 붙여서 지을 수 있다.
        int $i = 3; // 변수 이름은 $를 처음에 붙여서 지을 수 있다.

        int playerHP = 4;   // 변수 이름은
        int playerhp = 5;   // 대소문자를 구분하여 인식한다.

        int playerStrength = 6; // 변수 이름이 두 단어 이상으로 이루어져 있을경우
        int carBodyColor = 7;   // 첫 단어는 소문자, 다은 단어부터는 대문자로 시작한다. (관례)

        int int;  // 이미 예약되어 있는 명령어는 변수이름으로 사용할 수 없다.
    }
}