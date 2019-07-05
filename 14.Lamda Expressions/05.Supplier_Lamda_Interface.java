package Java;

import java.util.function.*;	// 람다를 사용하기 위해 귀찮게 매번 인터페이스와 메서드를 선언하기는 싫다.
								// 미리 선언된 람다 인터페이스를 사용하면 좋다.
								// 자바 8 부터 함수적 인터페이스 API를 제공해준다.
								// C#의 Func<>, Action<> 같은거라고 보면 된다.

public class Supplier_Lamda_Interface
{
    public static void main(String[] args)
    {
    	// 람다 인터페이스 중 Supplier<>다.
		// 매개값이 없고 반환값만 있는 메서드를 제공
		Supplier<String> supplier = () -> "Java 12";
		System.out.println(supplier.get());

		// 람다 인터페이스 중 BooleanSupplier다.
		// 반환값은 boolean형 밖에 없다.
		BooleanSupplier booleanSupplier = () -> true;
		System.out.println(booleanSupplier.getAsBoolean());

		// 람다 인터페이스 중 IntSupplier다.
		// 반환값은 int형 밖에 없다.
		IntSupplier intSupplier = () -> (int)Math.random() + 3;	// random()은 double형을 반환하므로 형변환
		System.out.println(intSupplier.getAsInt());

		// 람다 인터페이스 중 DoubleSupplier다.
		// 반환값은 Double형 밖에 없다.
		DoubleSupplier doubleSupplier = () -> Math.random() + 4;
		System.out.println(doubleSupplier.getAsDouble());
    }
}