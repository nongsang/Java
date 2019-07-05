package Java;

@FunctionalInterface
interface MyInterface
{
	void Method();
}

class A
{
	void Method(int param)
	{
		int localvar = 10;

		//param = 20;		// 매개변수와 로컬 변수는 final이 자동으로 붙어서
		//localvar = 20;	// 수정이 되지 않는다.
						// 자세한 것은 09.Nested Class/06.Local_Class_Field_Modify를 보도록

		MyInterface inter = () ->	// 로컬 람다
		{
			System.out.println("localvar : " + localvar);
			System.out.println("param : " + param);
		};
		inter.Method();
	}
}

public class Local_Lamda
{
    public static void main(String[] args)
    {
		A a = new A();

		a.Method(3);
    }
}