package Java;

public class Catch_Order
{
    public static void main(String[] args)
    {
        String data = null;

        String[] arr = {"Hello", "World"};

        try     // 예외가 발생하면 치명적인 문제가 생길 수 있는 작업을 시도하는 부분
        {
            System.out.println(data.toString());    // NullPointerException 발생

            String s1 = arr[0];
            String s2 = arr[1];
            String s3 = arr[2]; // ArrayIndexOutOfBoundsException 발생
        }
        catch (Exception e)     // Exception은 어떤 예외든 받아서 실행한다.
        {                       // 어떤 예외도 처리하기 때문에 다른 예외를 먼저 처리하고 실행되게끔 순서를 바꿔줘야 한다.
            System.out.println("예외가 발생했습니다.");
        }
        catch (NullPointerException e)  // NullPointerException이 발생하면 실행될 부분
        {                               // Exception이 앞에 있으므로 NullPointerException이 발생하기 전에 finally로 넘어간다.
            System.out.println("인스턴스가 없습니다.");  // 그래서 문법적으로 Exception은 finally 앞에 정의하게끔 강제된다.
        }
        finally     // 모든 예외들을 처리한 후 마지막에 항상 실행될 부분
        {
            System.out.println("작업이 끝났습니다. 다시 시도해주세요.");
        }
    }
}