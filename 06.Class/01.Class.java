package Java;

class Car{}     // 클래스 선언, public 선언은 하면 안된다.

class $Car{}    // 클래스 이름은 $로 시작해도 된다.

class _Car{}    // 클래스 이름은 _로 시작해도 된다.

class CarBody{} // 클래스 이름의 단어 첫글자는 대문자로 시작한다.(관례)

class Car_Body{}// 클래스 이름이 여러 단어로 이루어져있으면 _로 구분해도 된다.(자유)

class 자동차{}   // 클래스 이름은 한글로 해도 되지만 영어로 하는게 관례.

class int{}     // 클래스 이름은 예약어로 할 수 없다.

public class Class    // public으로 선언된 클래스가 존재하면 소스 파일 이름도 public 클래스와 같아야 한다.
{
    public static void main(String[] args)
    {
        Car car = new Car();    // 일반적으로 클래스를 사용하기 위해서 new로 인스턴스화를 하여 사용한다.
                                // 인스턴스화를 하지 않고도 사용할 수 있지만 그건 나중에
    }
}