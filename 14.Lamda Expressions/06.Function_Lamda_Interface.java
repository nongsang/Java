package Java;

import java.util.function.*;	// 람다를 사용하기 위해 귀찮게 매번 인터페이스와 메서드를 선언하기는 싫다.
								// 미리 선언된 람다 인터페이스를 사용하면 좋다.
								// 자바 8 부터 함수적 인터페이스 API를 제공해준다.
								// C#의 Func<>, Action<> 같은거라고 보면 된다.

public class Function_Lamda_Interface
{
    public static void main(String[] args)
    {
    	// 람다 인터페이스 중 Function<>이다.
		// 매개값과 리턴값이 모두 있다.
		// 주로 매개값을 리턴값으로 변환하기 위해 사용한다.
		Function<String, Integer> function = string -> Integer.parseInt(string);
		System.out.println(function.apply("1"));

		// 람다 인터페이스 중 BiFunction<>이다.
		// String, String으로 입력받아서 int로 변환하여 반환해야한다.
		BiFunction<String, String, Integer> biFunction = (string1, string2)
				-> Integer.parseInt(string1 + string2);
		System.out.println(biFunction.apply("2", "3"));

		// 람다 인터페이스 중 IntFunction<>이다.
		// String으로 입력받아서 int로 고정된 자료형으로 변환하여 반환해야한다.
		IntFunction<String> intFunction = i -> Integer.toString(i + 4);
		System.out.println(intFunction.apply(5));

		// 람다 인터페이스 중 DoubleFunction<>이다.
		// String으로 입력받아서 double로 고정된 자료형으로 변환하여 반환해야한다.
		DoubleFunction<String> doubleFunction = d -> Double.toString(d + 6);
		System.out.println(doubleFunction.apply(7));

		// 람다 인터페이스 중 IntToDoubleFunction<>이다.
		// int형으로 고정된 자료형으로 입력받아서 double로 변환하여 반환해야한다.
		IntToDoubleFunction intToDoubleFunction = i -> i + 8;
		System.out.println(intToDoubleFunction.applyAsDouble(9));

		// 람다 인터페이스 중 DoubleToIntFunction<>이다.
		// double형으로 고정된 자료형으로 입력받아서 int로 변환하여 반환해야한다.
		DoubleToIntFunction doubleToIntFunction = d -> (int)d + 10;
		System.out.println(doubleToIntFunction.applyAsInt(11));

		// 람다 인터페이스 중 ToIntFunction<>이다.
		// 어떤 자료형이든 입력받아서 int로 변환하여 반환해야한다.
		ToIntFunction<String> toIntFunction = string -> Integer.parseInt(string);
		System.out.println(toIntFunction.applyAsInt("12"));

		// 람다 인터페이스 중 ToIntBiFunction<>이다.
		// 어떤 자료형이든 2개 입력받아서 int로 변환하여 반환해야한다.
		ToIntBiFunction<String, Double> toIntBiFunction = (s, d) ->
				Integer.parseInt(s) + d.intValue();
		toIntBiFunction.applyAsInt("13", 14.5);
    }
}