import java.util.InputMismatchException;
class ex1
{
	public static void main(String[] args) {
		 

		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 int[] x=new int[3];

		 System.out.println("請輸入索引");
		 

		try
		{
			int n=sc.nextInt();
			x[n]=100;//new ArrayIndexOutOfBoundsException();

			System.out.println("請輸入分母");
			int m=sc.nextInt();

			System.out.println("x["+n+"]/"+m+"="+x[n]/m);
			
		}
		catch(ArrayIndexOutOfBoundsException|
				InputMismatchException|
				ArithmeticException e)
		{
			System.out.println(
				"索引範圍為0~2,分母不可為0or請輸入整數");
			e.printStackTrace();
		}
		
		/*
		catch(ArrayIndexOutOfBoundsException e)//ArrayIndexOutOfBoundsException e=?
		{
			System.out.println("索引範圍為0~2,請重新執行");
			e.printStackTrace();

		}
		catch(InputMismatchException e)
		{
			System.out.println("請輸入整數");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("分母不可為0");
			e.printStackTrace();
		}
*/
		catch(RuntimeException e)
		{
			System.out.println("重新輸入");
			e.printStackTrace();
		}
		finally
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("i="+i+"\thello java");
			}
		}
	
}}