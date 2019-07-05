package Java;

import java.util.function.*;	// 람다를 사용하기 위해 귀찮게 매번 인터페이스와 메서드를 선언하기는 싫다.
								// 미리 선언된 람다 인터페이스를 사용하면 좋다.
								// 자바 8 부터 함수적 인터페이스 API를 제공해준다.
								// C#의 Func<>, Action<> 같은거라고 보면 된다.

public class Predicate_Lamda_Interface
{
    public static void main(String[] args)
    {
    	// 람다 인터페이스 중 Predicate<>다.
		// 매개값과 리턴값이 모두 있다.
		// 매개값을 조사하고 true, false로 리턴한다.
		Predicate<String> predicate = string -> string.equals("World!");
		System.out.println(predicate.test("Hello"));

		// 2개의 값을 받아서 처리하는 BiPredicate다.
		BiPredicate<String, String> biPredicate = (string1, string2) -> string1.equals(string2);
		System.out.println(biPredicate.test("Java", "Java"));

		// int 값 1개를 받아서 처리하는 IntPredicate다.
		IntPredicate intPredicate = i -> i > 10;
		System.out.println(intPredicate.test(20));

		// double 값 1개를 받아서 처리하는 DoublePredicate다.
		DoublePredicate doublePredicate = d -> d < 3.4;
		System.out.println(doublePredicate.test(5.6));
	}
}