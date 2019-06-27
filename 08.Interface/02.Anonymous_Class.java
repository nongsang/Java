package Java;

interface RemoteController
{
    //RemoteController() {}  // 인터페이스는 생성자를 정의할 수 없다.
                            //왜냐하면 인터페이스는 인스턴스화하여 사용하기보다 다른 클래스와 연결해서 사용하기 위한 목적이 더 크기 때문이다.

    int maxVolume = 10;     // 필드는 기본적으로 상수로 선언된다.
    int minVolume = 0;      // public final static이 자동으로 붙어서 컴파일된다.

    /*static      // 인터페이스에서는 정적 초기화 블럭을 사용할 수 없다.
    {
        maxVolume = 20;
        minVolume = 10;
    }*/

    void TurnOn();      // 인터페이스는 추상메서드를 선언할 수 있다.
                        // public abstract가 자동으로 붙어서 컴파일된다.
    void TurnOff();
    void setVolume(int volume);

    static void setMute(boolean mute)               // interface 메서드를 정의하려면 static으로 정의해야 한다.
    {
        if(mute)
            System.out.println("무음처리를 한다");
        else
            System.out.println("무음해제를 한다.");
    }

    default void changeBattery()    // Java 8 부터 default 메서드를 정의할 수 있다.
    {                               // 반드시 명시적으로 default로 선언을 해야 하며, 그렇지 않으면 public으로 선언된다.
        System.out.println("건전지를 교환한다.");
    }
}

public class Anonymous_Class
{
    public static void main(String[] args)
    {
        RemoteController remoteController = new RemoteController()  // 익명 구현 객체(인스턴스)
        {                                                           // 인터페이스를 생성하면서 각 메서드들을 정의해 줘야 사용할 수 있다.
            private int volume;

            @Override
            public void TurnOn()
            {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void TurnOff()
            {
                System.out.println("TV를 끕니다.");
            }

            @Override
            public void setVolume(int volume)
            {
                if(volume > RemoteController.maxVolume)
                    this.volume = RemoteController.maxVolume;
                else if (volume < RemoteController.minVolume)
                    this.volume = RemoteController.minVolume;
                else
                    this.volume = volume;

                System.out.println("현재 TV 볼륨 : " + this.volume);
            }
        };

        remoteController.TurnOn();  // 익명 구현 객체의 메서드를 호출
        remoteController.TurnOff();
    }
}