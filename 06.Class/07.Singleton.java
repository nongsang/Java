package Java;

class Manager
{
    static private Manager instance;    // static으로 1개만 존재할 수 있게 한다.
                                        // private로 아무도 접근할 수 없게 설정한다.
                                        // 클래스 변수가 가리키게 해서 사용해야 한다.
                                        // 싱글턴의 시작

    static Manager getInstance()        // 호출하면 싱글턴 객체를 반환한다.
    {
        if(null == instance)            // 인스턴스가 없으면
            instance = new Manager();   // 인스턴스화를 한다.
                                        // 이미 인스턴스화를 했으면 건너뛴다.

        return instance;                // 인스턴스화를 한 객체를 반환
                                        // 클래스 변수가 가리키게 되는 시점
    }
}

public class Singleton
{
    public static void main(String[] args)
    {
        Manager manager1 = Manager.getInstance();   // 인스턴스화를 하는 메서드 호출
        Manager manager2 = Manager.getInstance();   // 또 인스턴스화를 하는 메서드 호출

        if(manager1 == manager2)        // 싱글턴 객체는 메모리를 오직 1개만 가지고 여러 변수가 가리키는 구조다.
            System.out.println("manager1과 manager2는 같은 위치를 가리키고 있다.");  // 실행
        else
            System.out.println("manager1과 manager2는 다른 위치를 가리키고 있다.");

        // 싱글턴 패턴은 오직 1개의 메모리만 있으면 되고, 1개만 있어야 하는 상황에서 사용
    }
}