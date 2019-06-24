package Java;

class Tire
{
    private String company = "없음";
    private String position;

    protected Tire(String position)
    {
        this.position = position;
    }

    protected void Roll()
    {
        System.out.println("바퀴가 구른다.");
    }

    protected void setCompany(String company)
    {
        this.company = company;
    }

    protected String getPosition()
    {
        return position;
    }

    protected String getCompany()
    {
        return company;
    }

    protected void getInfo()
    {
        System.out.println("position : " + this.getPosition() + " company : " + this.getCompany());
    }
}

class Auto
{
    Tire[] tires = {
            new Tire("앞오른쪽"),
            new Tire("앞왼쪽"),
            new Tire("뒤오른쪽"),
            new Tire("뒤왼쪽")
    };

    void Run()
    {
        for(var t : tires)
        {
            t.Roll();
        }
    }

    protected void getInfo()
    {
        for(var t : tires)
        {
            t.getInfo();
        }
    }
}

class Bus extends Auto  // 자동차의 특성을 상속받은 버스를 만든다.
{
    void Run()
    {
        for(var t : tires)
        {
            t.Roll();
        }
    }

    protected void getInfo()
    {
        for(var t : tires)
        {
            t.getInfo();
        }
    }
}

class Driver        // 자동차는 혼자서 움직이게 하기보다 드라이버가 조종할 때 움직이게 하는 것이 현명하다.
{
    void Drive(Auto auto)   // 매개변수를 Auto형으로 만든다.
    {
        System.out.println("운전사가 버스를 운전합니다.");
        auto.Run();
    }
}

public class Parameter_Polymorphism
{
    public static void main(String[] args)
    {
        Bus bus = new Bus();            // 버스를 생성하고
        Driver driver = new Driver();   // 운전사를 생성한 후

        driver.Drive(bus);  // 운전사가 버스를 운전한다는 의미가 된다.
    }
}