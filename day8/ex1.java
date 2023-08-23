class ex1{
	public static void main(String[] args) {
		
		int[][] x = new int[2][3];
		int[][] y = new int[2][];
		y[0]=new int[3];
		y[1]=new int[4];

		System.out.println(x);

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("x["+i+"]["+j+"]="+x[i][j]);
			}
		}

		System.out.println("==============");

		for(int[] o:x)
			{
				System.out.println(o);
				for(int u:o)
				{
					System.out.println(u);
				}
			}

	}
}