class ex2{
	public static void main(String[] args) {
	
		int[][][] x = new int[2][2][3];

		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t"+x[i][j]);
				for(int k=0;k<x[i][j].length;k++)
				{
					System.out.println("\t\t"+x[i][j][k]);
				}
			}
		}
		System.out.println("==============");

		System.out.println(x);

		for(int[][] o:x)
		{
			System.out.println(o);
			for(int[] u:o)
			{
				System.out.println("\t\t"+u);
				for(int v:u)
				{
					System.out.println("\t\t\t"+v);
				}
			}
		}

		System.out.println("===============");

		

	}

}