package Java;

public class Conditional_Statement_Else
{
    public static void main(String[] args)
    {
        int i = 1;

        if(i > 1)   // 조건에 맞으면 실행된다.
        {
            System.out.println("i는 1보다 크지 않다.");    // 조건에 맞지 않으므로 실행되지 않는다.
        }
        else    // 조건에 맞지 않으면 실행된다.
        {
            System.out.println("i는 1보다 작거나 같다.");   // 조건에 맞으므로 실행된다.
        }

        System.out.println("끝");
    }
}