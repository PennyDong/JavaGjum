class ex5{
	public static void main(String[] args) {
		
		int[][] x = new int[2][3];

		for(int i=0;i<x.length;i++){
			System.out.println("{"+i+"}"+x[i]);
			for(int j=0;j<x[i].length;j++){
				System.out.println("{"+i+"}{"+j+"}="+x[i][j]);
			}
		}



		/*
		System.out.println(x);
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[0]);
		System.out.println(x[0][0]);
		System.out.println(x[1]);
		System.out.println(x[1][0]);
		*/
	}
}