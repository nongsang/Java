package Java;

import java.util.function.*;	// 람다를 사용하기 위해 귀찮게 매번 인터페이스와 메서드를 선언하기는 싫다.
								// 미리 선언된 람다 인터페이스를 사용하면 좋다.
								// 자바 8 부터 함수적 인터페이스 API를 제공해준다.
								// C#의 Func<>, Action<> 같은거라고 보면 된다.

public class Consumer_Lamda_Interface
{
    public static void main(String[] args)
    {
    	// 람다 인터페이스 중 Consumer<>다.
		// 매개값만 있고 반환값이 없는 메서드를 제공
		// 아무 값이나 제너릭을 정할 수 있으나, 보통 String을 사용한다.
		Consumer<String> consumer = string -> System.out.println(string + "12");
		consumer.accept("Java");	// 람다에 매개값 전달

		// 람다 인터페이스 중 BiConsumer<>다.
		// 매개값이 2개인 메서드를 제공해준다.
		BiConsumer<String, String> biConsumer = (string1, string2) -> System.out.println(string1 + string2);
		biConsumer.accept("Java ", "12");

		// 람다 인터페이스 중 IntConsumer다.
		// 매개값은 int형 1개로 정해져있다.
		IntConsumer intConsumer = i -> System.out.println("Java " + i);
		intConsumer.accept(12);

		// 람다 인터페이스 중 DoubleConsumer다.
		// 매개값은 double형 1개로 정해져있다.
		DoubleConsumer doubleConsumer = d -> System.out.println("Java " + d);
		doubleConsumer.accept(12.1);

		// 람다 인터페이스 중 ObjIntConsumer<>다.
		// 매개값 1개는 Object로 자유 자료형, 매개값 1개는 int형으로 정해져 있다.
		// 따라서 제너릭 1개는 자료형을 정해줘야 한다.
		ObjIntConsumer<String> objIntConsumer = (o, i) -> System.out.println(o + i);
		objIntConsumer.accept("Java ", 12);
    }
}