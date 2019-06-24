package Java;

class Car
{
    static String name;   // static 필드
    String color;

    static void setName(String strName)
    {
        name = strName;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    static  // 정적 초기화 블럭, static 선언된 필드, 메서드를 한번에 정의 및 호출이 가능
    {
        name = "람보르기니"; // name은 static 선언이 되어있으므로 정의 가능
        this.color = "검정";  // color는 static 선언이 되어있지 않으므로 정의 불가능

        setName("페라리"); // SetName() 메서드는 static 선언이 되어있으므로 호출 가능
        this.setColor("빨강");    // SetColor() 메서드는 static 선언이 되어있지 않으므로 호출 불가능
    }
}

public class Static_Initialize_Block
{
    public static void main(String[] args)
    {

    }
}