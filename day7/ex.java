class ex{

	public static void main(String[] args) {
		
	
	int[] x = new int[3];

	System.out.println(x);
	x[0]=10;
	x[1]=20;
	x[2]=30;
	

	x= new int[10];
	x[3]=40;

	for(int o:x)
	{
		System.out.println(o);
	}
	System.out.println(x);
	}
}