package Java;

public class Conditional_Statement_Switch
{
    public static void main(String[] args)
    {
        int i = 1;

        switch (i)  // i라는 변수를 평가한다.
        {
            case 1: // i가 1과 같으면 여기서부터 차례로 case를 실행한다.
            {
                System.out.println("i는 1과 같다");
            }
            case 2: // i는 2가 아니지만 1에서 조건이 맞으므로 1부터 실행해서 차례로 실행되서 2도 실행이 된다.
            {
                System.out.println("i는 2와 같다");
            }
            default:    // 어떤 조건도 맞지 않으면 실행되는 case다.
            {
                System.out.println("어떤 것도 해당되지 않는다.");
            }
        }

        System.out.println("끝");
    }
}