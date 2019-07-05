package Java;

import java.util.function.*;	// 람다를 사용하기 위해 귀찮게 매번 인터페이스와 메서드를 선언하기는 싫다.
								// 미리 선언된 람다 인터페이스를 사용하면 좋다.
								// 자바 8 부터 함수적 인터페이스 API를 제공해준다.
								// C#의 Func<>, Action<> 같은거라고 보면 된다.

public class Operator_Lamda_Interface
{
    public static void main(String[] args)
    {
    	// 람다 인터페이스 중 Operator<>다.
		// 매개값과 리턴값이 모두 있다.
		// 주로 매개값을 연산하고 그 결과를 리턴할 경우에 사용한다.
		UnaryOperator<String> unaryOperator;	// Function<>의 하위 인터페이스
		BinaryOperator<String> binaryOperator;	// BiFunction<>의 하위 인터페이스

		// 1개의 int값만 받아서 처리하는 IntUnaryOperator다.
		IntUnaryOperator intUnaryOperator = i -> i + 1;
		System.out.println(intUnaryOperator.applyAsInt(2));

		// 2개의 int값을 받아서 처리하는 IntBinaryOperator다.
		IntBinaryOperator intBinaryOperator = (i, n) -> i + n;
		System.out.println(intBinaryOperator.applyAsInt(3, 4));

		// 1개의 double값만 받아서 처리하는 DoubleUnaryOperator다.
		DoubleUnaryOperator doubleUnaryOperator = d -> d + 5.6;
		System.out.println(doubleUnaryOperator.applyAsDouble(7.8));

		// 2개의 double값을 받아서 처리하는 DoubleBinaryOperator다.
		DoubleBinaryOperator doubleBinaryOperator = (d, l) -> d + l;
		System.out.println(doubleBinaryOperator.applyAsDouble(9.1, 11.12));
	}
}