package Java;

public class NumberFormatException
{
    public static void main(String[] args)
    {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);   // "100"은 int로 변환할 수 있다.
        int value2 = Integer.parseInt(data2);   // "a100"은 int로 변환할 수 없으므로 NumberFormatException 발생
    }
}