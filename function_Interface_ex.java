package streamEx2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ex1 {

	public static void main(String[] args) {
		Predicate<Integer>p=(t)->t>=0;
		System.out.println(p.test(10));
		
		Consumer<String> b=(t)->System.out.println(t);
		b.accept("hello java");
		
		Function<String,Integer> f=(t)->Integer.parseInt(t);
		String x = "13";
		System.out.println(f.apply(x)+100);
		
		Supplier<String> c = ()->"安安你好";
		System.out.println(c.get());
		Supplier<member> s2=()->new member();
	}

}

class member{}