package Java;

public class Multi_Catch
{
    public static void main(String[] args)
    {
        String data1 = null;

        String[] arr = {"Hello", "World"};

        String data2 = "a100";

        try     // 예외가 발생하면 치명적인 문제가 생길 수 있는 작업을 시도하는 부분
        {
            System.out.println(data1.toString());    // NullPointerException 발생

            String s1 = arr[0];
            String s2 = arr[1];
            String s3 = arr[2]; // ArrayIndexOutOfBoundsException 발생

            int value2 = Integer.parseInt(data2);   // NumberFormatException 발생
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) // NullPointerException이나
        {                                                               // ArrayIndexOutOfBoundsException이 발생하면 실행될 부분
            System.out.println("인스턴스가 없거나 인덱스를 벗어났습니다.");// 자바 7부터 추가됨
        }
        catch (Exception e)     // 어떤 예외든 실행
        {                       // NumberFormatException에 대한 예외처리가 없으므로 NumberFormatException이 발생하면 실행
            System.out.println("예외가 발생했습니다.");
        }
        finally     // 모든 예외들을 처리한 후 마지막에 항상 실행될 부분
        {
            System.out.println("작업이 끝났습니다. 다시 시도해주세요.");
        }
    }
}