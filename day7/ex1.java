class ex1{
	public static void main(String[] args) {
		
		
			//int[] x=new int[3];
		//double[] x=new double[3];
		//boolean[] x=new boolean[3];
		String[] x=new String[3];
		//Integer[] x=new Integer[3];
		//Boolean[] x=new Boolean[3];

		System.out.println(x);
		for(int i=0;i<3;i++)
		{
			System.out.println(x[i]);
		}

		System.out.println("================");

		//for(int o:x)
		//for(double o:x)//double=Integer-->int
		for(String o:x)
		{
			System.out.println(o);
		}


		/*
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		*/


		/*
		int abc=10;
		int def=20;
		int ddd=30;

		System.out.println(abc);
		System.out.println(def);
		System.out.println(ddd);
		*/
	}
	
}