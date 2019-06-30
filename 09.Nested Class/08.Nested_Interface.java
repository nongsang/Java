package Java;

class Button
{
    OnClickListener listener;   // 인터페이스 생성

    void setOnClickListener(OnClickListener listener)   // 리스너를 설정하고
    {
        this.listener = listener;
    }

    void Touch()    // 터치 기능을 호출하면
    {
        listener.OnClick();     // 인터페이스가 호출
    }

    interface OnClickListener   // 중첩 인터페이스, 클래스 내부의 인터페이스 선언
    {
        void OnClick();
    }
}

class CallListener implements Button.OnClickListener
{
    @Override
    public void OnClick()
    {
        System.out.println("전화를 겁니다.");
    }
}

class MessageListener implements Button.OnClickListener
{
    @Override
    public void OnClick()
    {
        System.out.println("메세지를 보냅니다.");
    }
}

public class Nested_Interface
{
    public static void main(String[] args)
    {
        Button button = new Button();

        button.setOnClickListener(new CallListener());  // 버튼에 전화기능을 연결
        button.Touch();                                 // 버튼을 누르면 실행

        button.setOnClickListener(new MessageListener());   // 버튼에 메세지 기능을 연결
        button.Touch();                                     // 버튼을 누르면 실행
    }
}