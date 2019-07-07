package Java;

import java.util.function.*;

public class Predicate_And_Or_negate
{
    public static void main(String[] args)
    {
		// Predicate<>를 합성하여 실행하기 위해 두개의 Predicate<> 생성
		IntPredicate predicateA = i -> i%2 == 0;	// 2의 배수인지 확인
		IntPredicate predicateB = i -> i%3 == 0;	// 3의 배수인지 확인

		IntPredicate predicateAB;
		boolean result;

		// Predicate<>는 Predicate<>끼리 and로 && 연산할 수 있다.
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수? " + result);

		// Predicate<>는 Predicate<>끼리 or로 || 연산할 수 있다.
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2또는 3의 배수? " + result);

		// Predicate<>는 negate로 ! 연산할 수 있다.
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 2의 배수?(결과를 반대로 내라) " + result);
	}
}