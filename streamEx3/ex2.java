package streamEx3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {
		
		Integer[] x = new Integer[] {10,2,3,10};
		
		List<Integer> l = Arrays.asList(x);
		//List<Integer> l = Arrays.asList 
		
		Collections.sort(l,(o1,o2)->(o2-o1));
		
		for(Integer o:l)
		{
			System.out.print(o+" ");
		}
		
	}

}
