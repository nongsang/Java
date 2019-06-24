package Java;

public class Conditional_Statement_Break
{
    public static void main(String[] args)
    {
        int i = 1;

        switch (i)
        {
            case 1:
            {
                System.out.println("i는 1과 같다");
                break;                              // break를 선언했으므로 case 실행이 끝나면 switch문 탈출
            }
            case 2:
            {
                System.out.println("i는 2와 같다");
                break;
            }
            default:
            {
                System.out.println("어떤 것도 해당되지 않는다.");
                break;
            }
        }

        System.out.println("끝");
    }
}