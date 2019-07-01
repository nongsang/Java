package Java;

public class Multiple_Catch
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
        catch (NullPointerException e)  // NullPointerException이 발생하면 실행될 부분
        {
            System.out.println("인스턴스가 없습니다.");
        }
        catch (ArrayIndexOutOfBoundsException e)    // ArrayIndexOutOfBoundsException이 발생하면 실행될 부분
        {                                           // NullPointerException이 먼저 발생하므로 실행되지 않는다.
            System.out.println("인덱스를 넘었습니다.");
        }
        finally     // 모든 예외들을 처리한 후 마지막에 항상 실행될 부분
        {
            System.out.println("작업이 끝났습니다. 다시 시도해주세요.");
        }
    }
}