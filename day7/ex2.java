class ex2
{
	public static void main(String[] args) {
		//動態初始值
		/*int[] x=new int[3];
		x[0]=20;
		x[1]=30;
		x[2]=40;
		*/

		//靜態初始值建立
		//int[] x=new int[]{20,43,43,32,12,21};
		int[] x={20,43,43,32,12,21};


		System.out.println(x);
		System.out.println(x.length);

		System.out.println("=====================");

		System.out.println(x[0]);
		System.out.println(x[1]);

		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}

		System.out.println("=====================");

		for(int o:x)
		{
			System.out.println(o);
		}


	}
}