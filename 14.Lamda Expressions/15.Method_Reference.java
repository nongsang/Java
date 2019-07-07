package Java;

import java.util.function.*;

class Calculator	// 계산용 클래스
{
	static int StaticMethod(int x, int y) { return x + y; }
	int InstanceMethod(int x, int y) { return x + y; }
}

public class Method_Reference
{
    public static void main(String[] args)
    {
		IntBinaryOperator operator;

		// 일반적으로 람다를 사용하는 방법
		operator = (x, y) -> Calculator.StaticMethod(x, y);
		System.out.println("결과값 : " + operator.applyAsInt(1, 2));

		// 람다를 정의할 때 다른 메서드를 사용하는 경우가 있다.
		// 다른 메서드를 사용하는데 매개변수의 갯수와 자료형이 이미 정의가 되어있다.
		// 람다에 굳이 매개변수를 사용하지 않아도 된다는 뜻이다.
		// 매개변수를 없애주고 메서드를 참조하여 연결만 해주면 된다.
		operator = Calculator::StaticMethod;
		System.out.println("결과값 : " + operator.applyAsInt(3, 4));

		Calculator calculator = new Calculator();

		operator = (x, y) -> calculator.InstanceMethod(x, y);
		System.out.println("결과값 : " + operator.applyAsInt(5, 6));

		// 인스턴스 메서드도 마찬가지로 연결해주면 사용할 수 있다.
		operator = calculator::InstanceMethod;
		System.out.println("결과값 : " + operator.applyAsInt(7, 8));

		ToIntBiFunction<String, String> function;

		function = (a, b) -> a.compareToIgnoreCase(b);
		Print(function.applyAsInt("java 12", "Java 12"));

		// String 메서드 중 문자열 비교 메서드를 연결해주면 된다.
		function = String::compareToIgnoreCase;
		Print(function.applyAsInt("java 12", "Java 12"));
	}

	static void Print(int order)
	{
		if(order < 0) System.out.println("사전순으로 먼저 옵니다.");
		else if(order == 0) System.out.println("두 문자열이 같습니다.");
		else System.out.println("사전순으로 나중에 옵니다.");
	}
}