package Java;

interface RemoteController
{
    int maxVolume = 10;
    int minVolume = 0;

    void TurnOn();                          // 어떤 접근제한자를 선언하지 않은 메서드는 public
    void TurnOff();                         // 그리고 상속받은 클래스에서 반드시 재정의해줘야 하는 메서드다.
    default void setVolume(int volume) { }  // default 인터페이스 메서드는 자식클래스에서 재정의할 필요는 없다.
                                            // default 인터페이스 메서드가 존재하는 이유는 인터페이스를 상속받은 자식클래스 모두 공통된 인터페이스를 갖지만,
                                            // 일부의 클래스는 추가 인터페이스를 가진다는 뜻이다.

    // 처음 설계를 할 때 공유기만 조작하는 리모컨으로 설계를 했다면 default 인터페이스 메서드는 필요가 없을 것이다.
    // 하지만 같은 리모컨으로 오디오까지 조작할 수 있게 설계한다면 볼륨 설정을 하는 인터페이스도 필요하다.
    // 그렇다고 공유기용 리모컨, 오디오용 리모컨을 따로 정의하기에는 겹치는 기능이 있다.
    // 차라리 공용으로 사용하는 기능은 냅두고 dafault 인터페이스 메서드로 특정 기기에 맞는 기능을 추가하는 것이 더 낫다.
    // 만약 default로 만들지 않으면 어떨까?
    // 공유기에도 볼륨 설정하는 기능이 있다는 의미이므로 볼륨 설정하는 메서드도 재정의 해줘야 한다.
}

class Home_Louter implements RemoteController   // 리모컨으로 조작할 수 있는 공유기
{
    public void TurnOn()    // 인터페이스는 무조건 재정의 해줘야 한다.
    {
        System.out.println("공유기를 킵니다.");
    }

    public void TurnOff()   // 이것도 인터페이스
    {
        System.out.println("공유기를 끕니다.");
    }

    // default 인터페이스 메서드는 볼륨을 설정하는 메서드다.
    // 하지만 공유기에는 소리내는 장치가 없으므로 필요없는 기능이다.
}

class Audio implements RemoteController
{
    public int volume;

    public void TurnOn()    // 재정의해야하는 인터페이스 메서드
    {
        System.out.println("오디오를 킵니다.");
    }

    public void TurnOff()   // 재정의해야하는 인터페이스 메서드
    {
        System.out.println("오디오를 끕니다.");
    }

    public void setVolume(int volume)   // default 인터페이스 메서드로, 공유기와는 다른 추가 기능이기 때문에 재정의한다.
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

public class Default_Interface_Method
{
    public static void main(String[] args)
    {
        RemoteController remoteController = new Home_Louter();  // 리모컨과 공유기를 연결

        remoteController.TurnOn();      // 전원을 킨다.
        remoteController.setVolume(5);  // 리모컨의 볼륨 조절 인터페이스가 있지만 공유기에는 기능이 없으므로 무시
        remoteController.TurnOff();     // 전원을 끈다.

        remoteController = new Audio(); // 리모컨과 오디오를 연결

        remoteController.TurnOn();      // 전원을 킨다.
        remoteController.setVolume(5);  // 공유기에는 없는 볼륨 조절 기능이 오디오에는 있으므로 설정
        remoteController.TurnOff();     // 전원을 끈다.
    }
}