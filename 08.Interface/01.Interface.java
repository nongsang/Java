package Java;

interface RemoteController
{
    //RemoteController() {}  // 인터페이스는 생성자를 정의할 수 없다.
                            // 왜냐하면 인터페이스는 인스턴스화하여 사용하기보다 다른 클래스와 연결해서 사용하기 위한 목적이 더 크기 때문이다.

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

class Television implements RemoteController    // intellij에서 Cntl + i를 하면 오버라이딩할 인터페이스를 자동으로 추가해준다.
{
    private int volume;     // 현재 볼륨

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
        if(volume > RemoteController.maxVolume)         // 볼륨이 maxVolume보다 크면
            this.volume = RemoteController.maxVolume;   // 현재 볼륨을 maxVolume으로 설정
        else if (volume < RemoteController.minVolume)   // 볼륨이 minVolume보다 작으면
            this.volume = RemoteController.minVolume;   // 현재 볼륨을 minVolume으로 설정
        else                        // 모두 해당되지 않으면
            this.volume = volume;   // 설정 볼륨으로

        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}

class Audio implements RemoteController // 인터페이스를 받은 클래스는 반드시 메서드들을 구현해야 한다.
{                                       // 오버라이딩으로 메서드들을 구현하면 된다.
    private int volume;

    @Override
    public void TurnOn()
    {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void TurnOff()
    {
        System.out.println("오디오를 끕니다.");
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

        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }
}

abstract class Computer implements RemoteController // 추상클래스는 인터페이스를 받아도 메서드들을 구현하지 않아도 된다.
{

}

public class Interface
{
    public static void main(String[] args)
    {
        Television television = new Television();   // 인터페이스를 사용하지 않고 객체를 그냥 생성하여 사용한다.

        television.TurnOn();    // 텔레비전을 그냥 킨다.
        television.TurnOff();   // 텔레비전을 그냥 끈다.

        RemoteController remoteController = new Television();   // 인터페이스를 이용하여 객체와 연결했다.

        remoteController.TurnOn();  // 현재 리모컨과 TV가 연결이 되어 있으므로 리모컨의 전원을 누르면 TV가 켜지는 것이다.
        remoteController.TurnOff(); // TV를 끈다.

        remoteController = new Audio(); // 이제는 리모컨과 오디오를 연결했다.

        remoteController.TurnOn();  // 오디오를 켠다.
        remoteController.TurnOff(); // 오디오를 끈다.
    }
}