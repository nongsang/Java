package Java;

interface PowerSupplier // 파워 서플라이어
{
    void TurnOnPower();
    void TurnOffPower();
}

interface Monitor       // 모니터
{
    void TurnOnMoniter();
    void TurnOffMoniter();
}

class Computer implements PowerSupplier, Monitor    // 인터페이스는 다중으로 구현이 가능하다.
{                                                   // 인터페이스를 모아서 컴퓨터를 구현했다.
    public void TurnOnPower()
    {
        System.out.println("전원공급");
    }

    public void TurnOffPower()
    {
        System.out.println("전원차단");
    }

    public void TurnOnMoniter()
    {
        System.out.println("모니터 전원공급");
    }

    public void TurnOffMoniter()
    {
        System.out.println("모니터 전원차단");
    }
}

public class Multiple_Interface
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();

        computer.TurnOnPower();     // 컴퓨터의 전원을 넣는다.
        computer.TurnOnMoniter();   // 모니터를 켠다.
        computer.TurnOffPower();    // 컴퓨터의 전원을 끈다.
        computer.TurnOffMoniter();  // 모니터를 끈다.
    }
}