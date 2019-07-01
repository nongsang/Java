package Java;

public class Exception_Throw
{
    public static void main(String[] args)
    {
        try
        {
            FindClass();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("클래스를 찾지 못했습니다.");
        }
    }

    static void FindClass() throws ClassNotFoundException   // 메서드 실행할 때 예외가 발생할 수 있다면 throw로 예외를 던져야 한다.
    {
        Class findClass = Class.forName("Player");  // Class.forName()는 이름을 단서로 클래스를 찾는 메서드다.
                                                    // 클래스를 찾아도 없으면 ClassNotFoundException이 발생한다.
    }
}