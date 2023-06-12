package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamExample {

	public static void main(String[] args) {
		//create a list integer
		List<Integer> number = Arrays.asList(2,3,4,5);
		//demonstration of the map method
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		System.out.println("----------------------------------------------------");
		
		//create a list of string
		List<String> names = Arrays.asList("refelection","stream","collection");
		//  demonstration of the filter method
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		//demonstration of sort method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		System.out.println("---------------------------------------------------------");
	
		List<Integer> numbers = Arrays.asList(2,3,5,6);
		//collect methods return set
		Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);
		//demonstration of for each loop
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		//demonstration of reduce method
		int even = numbers.stream().filter(x->x%2==0).reduce(0, (ans,i)->ans+i);
		System.out.println(even);
		
		System.out.println("-------------------------------------------------------");
		
		List<String> nm = Arrays.asList("suns","runs","var","bars","pop","runs");
		List<String> res = nm.stream().filter(s->s.endsWith("s")).map(n->n.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(nm);
		System.out.println(res);
		
	
		

	}

}
