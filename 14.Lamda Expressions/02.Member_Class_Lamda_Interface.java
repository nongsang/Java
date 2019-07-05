package Java;

@FunctionalInterface
interface MyInterface
{
	void Method();
}

class A
{
	int outterField = 10;

	class B	// 멤버 클래스
	{
		int innerField = 20;

		MyInterface inter = () ->	// 람다
		{
			System.out.println(outterField);		// 바깥 클래스의 필드에 접근
			System.out.println(A.this.outterField);	// 바깥 클래스.this를 이용하여 경로를 명시해도 좋다.

			System.out.println(innerField);			// 내부 클래스의 필드에 접근
			System.out.println(B.this.innerField);	// 내부 클래스.this를 이용하여 경로를 명시해도 좋다.
			System.out.println(this.innerField);	// this만으로 접근할 수 있다.
		};
	}
}

public class Member_Class_Lamda
{
    public static void main(String[] args)
    {
		A a = new A();
		A.B b = a.new B();

		b.inter.Method();
    }
}