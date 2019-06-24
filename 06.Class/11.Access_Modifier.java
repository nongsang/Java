package Java;

class Man   // 접근 제한자를 쓰지 않은 클래스는 default로 선언된다.
{           // default로 선언되면 현재 코드가 있는 패키지 내에서만 사용할 수 있다.
    private String name = "철수";  // private 선언은 현재 클래스 내부에서만 접근할 수 있다.

    int age = 19;   // 필드도 접근 제한자를 선언하지 않으면 default로 선언된다.

    public String hobby = "독서"; // public 선언은 다른 패키지에서도 접근할 수 있다.

    protected int tall = 176;   // protected는 현재 코드가 있는 패키지 내에서 이 클래스를 상속받은 클래스만 접근가능
                                // 현재 상속은 몰라도 됨

    public Man(){}; // public 생성자
                    // 다른 클래스에서 인스턴스화 할 수 있다.

    Man(){};    // default 생성자
                // 현재 패키지에서만 인스턴스화 할 수 있다.

    protected Man(){};  // protected 생성자
                        // 이 클래스를 상속받은 클래스에서만 호출

    private Man(){};    // private 생성자
                        // 생성자는 private로 선언하면 호출이 되지 않으므로 사용하지 않는것이 좋다.

    // 생성자는 접근 제한자만으로 오버로딩을 허용하지 않으니 잘 생각해야 한다.

    void Hello()    // 메서드도 접근 제한제 선언을 하지 않으면 default로 선언
    {
        System.out.println("Hello ");
    }

    private void BadWord()  // private로 선언하면 클래스 내부에서만 호출할 수 있다.
    {
        System.out.println("Shit!");
    }

    protected void Happy()  // protected로 선언하면 현재 코드가 있는 패키지에 있는 코드들만 호출 가능
    {
        System.out.println("I'm Happy!");
    }

    public void Sad()   // public으로 선언하면 다른 패키지 코드에서도 호출가능
    {
        System.out.println("I'm Sad!");
    }
}

public class Hello_World    // public 클래스는 1개만 존재해야하고 코드 이름과 같아야 한다.
{                           // public 클래스가 없으면 코드 이름과 같을 필요는 없지만 다른 코드에서 호출해야 실행된다.
    public static void main(String[] args)
    {
        Man man = new Man();    // Man 클래스를 Access_Modifier 클래스에서 사용하기 위해 인스턴스화

        man.name = "민수";    // private로 선언했으므로 접근 불가능
        man.age = 20;         // default이므로 그냥 접근
        man.hobby = "농구";   // public으로 선언했으므로 다른 패키지에서도 접근가능
        man.tall = 164;       // protected는 인스턴스화하면 default처럼 작동한다.

        man.Hello();    // default이므로 그냥 호출
        man.BadWord();  // private이므로 호출 불가능
        man.Happy();    // protected이므로 인스턴스화해서 default처럼 호출
        man.Sad();      // public이므로 다른 패키지에서도 호출가능
    }
}