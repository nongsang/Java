package Java;

class BalanceinsufficientException extends RuntimeException
{
    public BalanceinsufficientException(){} // 생성자
    public BalanceinsufficientException(String Message) {super(Message);}   // 생성자
}

class Account
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
        // 더 정확하게 예외가 발생했을 때 메세지를 전달한다.
        if(balance < money)
            throw new BalanceinsufficientException("잔고부족 : " + (money - balance) + "모자람");

        balance -= money;
    }
}

public class Exception_Information
{
    public static void main(String[] args)
    {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

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

        try
        {
            account.Withdraw(10000);    // BalanceinsufficientException 발생
        }
        catch (BalanceinsufficientException e)
        {
            System.out.println("잔액이 부족합니다.");
            String message = e.getMessage();        // 예외가 발생한 이유(메세지)를 가져와서
            System.out.println(message);            // 출력한다.

            e.printStackTrace();    // 예외발생 경로를 추적하여 위치를 출력해준다.
                                    // 예외처리를 했기 때문에 메세지가 출력되지만 경고표시가 아닌 정상처리로 표시된다.
                                    // 그렇기 때문에 경고표시도 필요하다면 예외발생 경로를 추적하여 출력해주는 기능도 필요하다.
        }
    }
}