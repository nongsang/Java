package Java;

public class Exception_Handling
{
    public static void main(String[] args)
    {
        String data = null;

        try     // 예외가 발생하면 치명적인 문제가 생길 수 있는 작업을 시도하는 부분
        {
            System.out.println(data.toString());
        }
        catch (Exception e)     // 어떤 예외가 발생하든 실행될 부분
        {
            System.out.println("실행할 수 없습니다.");
        }
        finally     // 모든 예외들을 처리한 후 마지막에 항상 실행될 부분
        {
            System.out.println("작업이 끝났습니다. 다시 시도해주세요.");
        }
    }
}