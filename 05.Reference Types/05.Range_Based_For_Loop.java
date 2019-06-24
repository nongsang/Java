package Java;

public class Range_Based_For_Loop
{
    public static void main(String[] args)
    {
        int[] intArr = {1, 2, 3, 4, 5};

        for(var i : intArr)         // 범위기반 for문
        {                           // intArr 배열의 원소를 i로 순회하며 처리
            System.out.println(i);  // 배열같은 원소가 있는 구조를 처리할 때 매우 유용하다.
        }
    }
}