package Java;

// 일반적인 시스템의 예외가 아니라 자신이 개발한 특정한 상황에서 발생시킬 예외 클래스 등 예외를 정의해서 사용할 수 있다.
// 은행 프로그램에서 계좌를 찾지 못하는 경우, 잔액부족, 회원가입 실패 등
class BalanceinsufficientException extends RuntimeException // 런타임 예외 클래스를 상속받은 사용자 정의 예외 클래스
{                                                           // 일반 예외로 설정하고 싶으면 Exception을 상속받으면 된다.
    public BalanceinsufficientException(){} // 생성자
    public BalanceinsufficientException(String Message) {super(Message);}   // 생성자
}

class User_Define_Exception
{
    private long balance = 0;   // 통장 잔액

    Account(){}

    public long getBalance()    // 잔액 출력
    {
        return balance;
    }

    public void deposit(int money)  // 입금
    {
        balance += money;
    }

    public void Withdraw(int money) throws BalanceinsufficientException // 출금
    {
        if(balance < money)     // 잔액이 출금할 금액보다 적으면
            throw new BalanceinsufficientException();   // 예외 발생

        balance -= money;   // 아니라면 출금
    }
}

public class Hello_World
{
    public static void main(String[] args)
    {
        Account account = new Account();    // 통장 생성

        account.deposit(10000);         // 10000원 입금
        System.out.println("예금액 : " + account.getBalance());    // 잔액 출금

        try
        {
            account.Withdraw(1000);  // 1000원 인출
                                            // Withdraw()는 BalanceinsufficientException를 발생하므로 catch를 구현해줘야 한다.
            System.out.println("예금액 : " + account.getBalance());    // 자바 12 기준으로 catch를 정의해줄 필요는 없다.
        }
        catch (BalanceinsufficientException e)
        {
            System.out.println("잔액이 부족합니다.");
        }

        account.Withdraw(10000);    // 자바 12 기준으로 catch를 강제하지는 않지만 예외는 발생한다.
    }
}