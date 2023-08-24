package streamEx3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex3 {

	public static void main(String[] args) {
		/*
		List<Integer> l = Arrays.asList(10,20,5,10,3);
		Stream<Integer> s = l.stream();
		s.forEach((t)->System.out.print(t+" "));
		
		Stream<Integer> k = Arrays.asList(10,203,30,20,3).stream();
		s.forEach((y)->System.out.print(y+" "));
		*/
		//Arrays.asList(1,2,3,4).stream().forEach((v)->System.out.print(v+" "));
		
		Arrays
		.asList(2,3,4,6,8)
		.stream()
		//.sorted()
		.filter((o)->(o>=5))
		.sorted((o1,o2)->(o2-o1))
		.forEach((x)->System.out.print(x+" "));
	}

}
