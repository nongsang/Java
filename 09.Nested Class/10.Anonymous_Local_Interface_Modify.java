package Java;

// 보통 UI 이벤트기능이나 스레드기능을 간편하게 사용하기 위해 사용

interface RemoteControl // 인터페이스
{
    void TurnOn();  // 키고
    void TurnOff(); // 끄는 기능만
}

class TV
{
    RemoteControl remoteControl = new RemoteControl()   // 멤버 인터페이스 생성
    {
        @Override
        public void TurnOn()        // 오버라이딩
        {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void TurnOff()       // 오버라이딩
        {
            System.out.println("TV를 끕니다.");
        }
    };

    void Method1()  // TV 메서드
    {
        RemoteControl remoteControl = new RemoteControl()   // 로컬 인터페이스 생성
        {
            @Override
            public void TurnOn()    // 오버라이딩, 이번에는 오디오 켜기
            {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void TurnOff()   // 오버라이딩, 이번에는 오디오 끄기
            {
                System.out.println("Audio를 끕니다.");
            }
        };

        remoteControl.TurnOn();     // 로컬 인터페이스 호출
        remoteControl.TurnOff();    // 로컬 인터페이스 호출
    }

    void Method2(RemoteControl remoteControl)   // 인터페이스를 매개변수로 받는 TV 메서드
    {
        remoteControl.TurnOn();     // 매개변수로 받은 인터페이스 중 켜기 기능 호출
        remoteControl.TurnOff();    // 매개변수로 받은 인터페이스 중 끄기 기능 호출
    }
}

public class Anonymous_Local_Interface_Modify
{
    public static void main(String[] args)
    {
        Television television = new Television();   // TV 생성

        television.remoteControl.TurnOn();  // TV의 리모컨 기능 중 켜기 기능
        television.remoteControl.TurnOff(); // TV의 리모컨 기능 중 끄기 기능

        television.Method1();   // TV 메서드 호출

        television.Method2(new RemoteControl()  // 익명 인터페이스를 정의하고 매개변수로 전달
        {
            @Override
            public void TurnOn()    // 이번에는 SmartTV 켜기로 오버라이딩
            {
                System.out.println("SmartTV를 켭니다.");
            }

            @Override
            public void TurnOff()   // 이번에는 SmartTV 끄기로 오버라이딩
            {
                System.out.println("SmartTV를 끕니다.");
            }
        });
    }
}