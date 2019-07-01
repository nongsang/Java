package Java;

public class ArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        String[] arr = {"Hello", "World"};

        String s1 = arr[0];
        String s2 = arr[1];
        String s3 = arr[2]; // 인덱스 범위를 넘어서 접근하려하여 ArrayIndexOutOfBoundsException 발생
    }
}