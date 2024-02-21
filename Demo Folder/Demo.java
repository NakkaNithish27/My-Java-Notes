import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

class Demo {
	public static void main(String[] args) {
		List <Integer> nums = Arrays.asList(4, 7, 8, 3, 9, 2);
		int result = nums.stream()
		             .filter(n -> n % 2 == 0)  //takes object of Predicate interface
		             .map(n->n * 2) //takes object of Function interface
		             .reduce(0, (c, e)->c + e); /*0 is the intitial value, c is carry and e is the element*/
		System.out.println(result);

		/*To get sorted values*/
		Stream<Integer> sortedValues = nums.stream()
		                               .filter(n -> n % 2 == 0)
		                               .map(n->n * 2)
		                               .sorted();
		sortedValues.forEach(n-> System.out.print(n));
		System.out.println();

		/*What if want to do filtering with multiple threads, we can use parallelStream*/
		/*use only if you want to filter, don't use parallel stream if you want to sort the stream values*/
		Stream<Integer> ps = nums.parallelStream()
		                     .filter(n->n % 2 == 0);
		ps.forEach(e->System.out.print(e));

	}
}



