class ex5
{
	public static void main(String[] args) {
		
		Member[][][] M = new Member[2][][];

		M[0] = new Member[2][];
		M[0][0] = new Member[2];
		M[0][1] = new Member[3];

		M[1] = new Member[3][];
		M[1][0] = new Member[2];
		M[1][1] = new Member[3];
		M[1][2] = new Member[4];

		M[0][0][0] = new Member("a1","i");
		M[0][0][1] = new Member("a2","i");

		M[0][1][0] = new Member("b1","i");
		M[0][1][1] = new Member("b2","i");
		M[0][1][2] = new Member("b3","i");

		M[1][0][0] = new Member("c1","i");
		M[1][0][1] = new Member("c2","i");

		M[1][1][0] = new Member("d1","i");
		M[1][1][1] = new Member("d2","i");
		M[1][1][2] = new Member("d3","i");

		M[1][2][0] = new Member("e1","i");
		M[1][2][1] = new Member("e2","i");
		M[1][2][2] = new Member("e3","i");
		M[1][2][3] = new Member("e4","i");


		for(int i=0;i<M.length;i++)
		{
			System.out.println(M[i]);
			for(int j=0;j<M[i].length;j++)
			{
				System.out.println("\t"+M[i][j]);
				for(int k=0;k<M[i][j].length;k++)
				{
					System.out.println("\t"+M[i][j][k]+"\t"+M[i][j][k].show());
				}
			}
		}

		System.out.println("===========================");

		for(Member[][] o:M)
			{
				System.out.println(o);
				for(Member[] u:o)
				{
					System.out.println(u);
					for(Member v:u)
					{
						System.out.println(v+v.show());
					}
				}
			}






	}
}