package Java;

import java.util.function.*;

public class Predicate_IsEqual
{
    public static void main(String[] args)
    {
		Predicate<String> predicate;

		// Predicate<>의 정적 메서드
		// Objects.Equals(sourse, target)이 실행된다.
		predicate = Predicate.isEqual(null);
		System.out.println("null null : " + predicate.test(null));

		predicate = Predicate.isEqual("Java 12");
		System.out.println("null Java 12 : " + predicate.test(null));

		predicate = Predicate.isEqual(null);
		System.out.println("Java 12 null : " + predicate.test("Java 12"));

		predicate = Predicate.isEqual("Java 12");
		System.out.println("Java 12 Java 12 : " + predicate.test("Java 12"));
	}
}