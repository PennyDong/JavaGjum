package streamEx3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex1 {

	public static void main(String[] args) {
		
		List<Integer> x = new ArrayList();
		
		x.add(10);
		x.add(3);
		x.add(10);
		x.add(5);
		x.add(10);
		
		//Collections.sort(x);
		Collections.sort(x,(o1,o2)->(o2-o1));
		
		for(Integer o:x)
		{
			System.out.print(o+" ");
		}
	}

}
