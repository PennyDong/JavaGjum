/*
=

*/
class ex3
{
	public static void main(String[] args) {
		int[] x=new int[]{10,20,30};
		int[] y=new int[]{40,50,60};

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);

		System.out.println("==================");
		x=y;//位址=位址-->一樣位址-->同一個--->回收記憶體(消滅)-->garbage collection(GC)
		//x[0]=y[0];//值=值-->copy

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);

		System.out.println("==================");
		x[0]=100;
		System.out.println("x="+x);
		System.out.println("y="+y);

		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);





		/*
		int x=10;
		int y=20;

		System.out.println("x="+x);
		System.out.println("y="+y);

		System.out.println("==================");
		x=y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("==================");
		x=100;
		System.out.println("x="+x);
		System.out.println("y="+y);
		*/

	}
}