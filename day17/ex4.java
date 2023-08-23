import java.util.InputMismatchException;

class ex4
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);

		int[]x =new int[3];

		System.out.println("請輸入索引");

		
	try{
		int n=sc.nextInt();
		x[n]=100; //new ArrayIndexOutOfBoundsException
		System.out.println("x["+n+"]="+x[n]);
		for(int i=1;i<=10;i++)
			{
				System.out.println("i="+i+"\tHello java");
			}
		}catch(ArrayIndexOutOfBoundsException e) //ArrayIndexOutOfBoundsException e=
		{
			System.out.println("超過索引範圍，索引範圍為0~2，請重新輸入");
			e.printStackTrace();
		}catch(InputMismatchException e)
		{
			System.out.println("請輸入整數");
			e.printStackTrace();
		} ;
	}
}