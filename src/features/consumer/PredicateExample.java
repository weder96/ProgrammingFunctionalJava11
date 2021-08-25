package features.consumer;

import java.util.function.Predicate;
public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> lessThan = a -> (a <= 18);
		Predicate<Integer> greaterThan = a -> (a >= 18);
		Predicate<Integer> equalTo = a -> (a == 0);

		boolean result = lessThan.test(18);
		System.out.println("Result :"+result);

		System.out.println("Greater Than :"+greaterThan.test(12));
		System.out.println("Less Than :"+lessThan.test(60));
		System.out.println("Equal :"+equalTo.test(0));

		boolean result1 = lessThan.and(greaterThan).and(equalTo).test(75);
		System.out.println("Result 1:"+result1);
		
		boolean result2 = lessThan.or(greaterThan).test(75);
		System.out.println("Result 2:"+result2);
		
		boolean result3 = lessThan.or(greaterThan).negate().test(75);
		System.out.println("Result 3:"+result3);
	}
}
