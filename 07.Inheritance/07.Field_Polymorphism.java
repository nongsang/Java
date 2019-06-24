package Java;

class Tire
{
    private String company = "없음";
    private String position;

    protected Tire(String position)
    {
        this.position = position;
    }

    protected void Roll()   // 상속으로 오버라이딩을 할 것이라는 의미로 protected 선언
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

class NexenTire extends Tire
{
    public NexenTire(String position) // 생성자
    {
        super(position);
        this.setCompany("넥센");
    }

    public void Roll()  // 오버라이딩
    {
        System.out.println("부앙~");
    }

    public void getInfo()
    {
        System.out.println("position : " + this.getPosition() + " company : " + this.getCompany());
    }
}

class HankookTire extends Tire
{
    public HankookTire(String position) // 생성자
    {
        super(position);
        this.setCompany("한국");
    }

    public void Roll()  // 오버라이딩
    {
        System.out.println("부웅~");
    }

    public void getInfo()
    {
        System.out.println("position : " + this.getPosition() + " company : " + this.getCompany());
    }
}

class Car
{
    Tire frontRightTire;    // 자동차는 타이어가 4개 있음을 보여준다.
    Tire frontLeftTire;     // 그리고 각 타이어마다 독립적인 움직임이 있음을 알려준다.
    Tire backRightTire;
    Tire backLeftTire;

    Car()
    {
        frontRightTire = new Tire("앞오른쪽");  // 각 타이어를 생성하여 할당했음을 나타낸다.
        frontLeftTire = new Tire("앞왼쪽");
        backRightTire = new Tire("뒤오른쪽");
        backLeftTire = new Tire("뒤왼쪽");
    }

    void Run()
    {
        frontRightTire.Roll();
        frontLeftTire.Roll();
        backRightTire.Roll();
        backLeftTire.Roll();
    }

    public void getInfo()
    {
        frontRightTire.getInfo();
        frontLeftTire.getInfo();
        backRightTire.getInfo();
        backLeftTire.getInfo();
    }
}

class Auto
{
    Tire[] tires = new Tire[4]; // 관리하기 편하게 Tire 배열로 선언
                                // 타이어는 4개 있으므로 4개를 미리 할당해놓는다.
                                // 그게 싫으면 처음부터 4개 타이어를 초기화하면 된다.

    Auto()  // 생성자가 호출되면 각 타이어는 일반 타이어가 아니라 제조회사가 다른 타이어로 할당된다.
    {       // Tire형 변수가 NexenTire, HankookTire를 가리키고 각 타이어의 기능을 호출할 수도 있다.
        tires[0] = new NexenTire("앞오른쪽");   // 다형성을 구현한 것
        tires[1] = new NexenTire("앞왼쪽");
        tires[2] = new HankookTire("뒤오른쪽");
        tires[3] = new HankookTire("뒤왼쪽");
    }

    void Run()
    {
        for(var t : tires)  // 배열이므로 for문을 사용해서 호출할 수 있는 등 편리한 점이 있다.
        {
            t.Roll();
        }
    }

    void getInfo()
    {
        for(var t : tires)
        {
            t.getInfo();
        }
    }
}

public class Field_Polymorphism
{
    public static void main(String[] args)
    {
        Car car = new Car();    // 자동차 생성
        car.Run();              // 자동차가 달리면 나는 소리 출력

        System.out.println();

        car.frontRightTire = new NexenTire("앞오른쪽"); // 타이어를 넥센타이어로 갈아 끼웠다.
                                                                // frontRightTire는 Tire형인데 NexenTire형 인스턴스를 가리키게 했다.
        car.Run();      // 타이어를 갈아 끼웠으므로 다른 소리가 나는 것은 당연
        car.getInfo();  // 각 타이어의 위치와 제조사 출력

        System.out.println();

        Auto auto = new Auto(); // 새로운 자동차 생성
        auto.Run();             // 자동차가 달리면 나는 소리 출력
        auto.getInfo();         // 각 타이어의 위치와 제조사 출력
    }
}