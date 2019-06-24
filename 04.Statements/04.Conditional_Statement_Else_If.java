package Java;

public class Conditional_Statement_Else_If
{
    public static void main(String[] args)
    {
        int i = 1;

        if(i > 1)   // 조건에 맞으면 실행된다.
        {
            System.out.println("i는 1보다 크지 않다.");    // 조건에 맞지 않으므로 실행되지 않는다.
        }
        // else 내부에서 다시 조건을 거는것 보다 else if로 줄여서 조건을 걸 수 있다.
        else if(i == 1)  // 조건이 맞지 않는 경우에 다시 조건을 걸어서 검사할 수 있다.
        {
            System.out.println("i는 1과 같다.");    // 조건에 맞으므로 실행된다.
        }
        else    // 다시 조건을 걸어도 맞지 않는 경우 실행된다.
        {
            System.out.println("i는 1보다 작다.");   // 앞서 조건이 맞으므로 실행되지 않는다.
        }

        System.out.println("끝");
    }
}