package Java;

interface RemoteControl
{
    void TurnOn();
    void TurnOff();
}

class Television
{
    RemoteControl remoteControl = new RemoteControl()
    {
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
    };

    void Method1()
    {
        RemoteControl remoteControl = new RemoteControl()
        {
            @Override
            public void TurnOn()
            {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void TurnOff()
            {
                System.out.println("Audio를 끕니다.");
            }
        };

        remoteControl.TurnOn();
        remoteControl.TurnOff();
    }

    void Method2(RemoteControl remoteControl)
    {
        remoteControl.TurnOn();
        remoteControl.TurnOff();
    }
}

public class Anonymous_Local_Modify
{
    public static void main(String[] args)
    {
        Television television = new Television();

        television.remoteControl.TurnOn();
        television.remoteControl.TurnOff();

        television.Method1();

        television.Method2(new RemoteControl()
        {
            @Override
            public void TurnOn()
            {
                System.out.println("SmartTV를 켭니다.");
            }

            @Override
            public void TurnOff()
            {
                System.out.println("SmartTV를 끕니다.");
            }
        });
    }
}