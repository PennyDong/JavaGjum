import java.util.Scanner;

class ex1
{
	public static void main(String[] args) throws check{
			Order[] o=new Order[3];
			o[0]=new Order(1,2);//new check
			o[1]=new Order(3,2);
			o[2]=new Order(1,3);

			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}

			System.out.println("=================");


			o[0].setLcd(3);//new check
			Scanner sc= new Scanner(System.in);
			System.out.println("請輸入修改ram的數量");
			int m =sc.nextInt();


			assert m>=0:"Ram修改的數量要>=0"; //cmd執行時輸入java -ea ex1
			o[0].setRam(m);

			for(Order u:o)
			{
				u.show();
			}

			/*
			finally
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("hello java");
				}
			}
			*/
		

		/*try
		{
			o[0]=new Order(-1,2);//new check
			o[1]=new Order(3,2);
			o[2]=new Order(1,3);

			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}

			System.out.println("=================");

			o[0].setLcd(-3);//new check

			for(Order u:o)
			{
				u.show();
			}
		}
		catch(Exception e)//Exception e=new check()
		{

			System.out.println("新增LCD與RAM>=0");
			e.printStackTrace();
		}*/
	}
}