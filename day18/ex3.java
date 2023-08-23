class ex3
{
	public static void main(String[] args) {
		order[] o=new order[3];
		
		try
		{
			o[0]=new order(1,2);
			o[1]=new order(3,2);
			o[2]=new order(1,3);

			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}

			System.out.println("===========");

			o[0].setLcd(-3); // new check();

			for(order u:o)
			{
				u.show();
			}
		}
		catch(Exception e)// Exception e = new check();
		{
			System.out.println("Lcd與Ram>=0");
			e.printStackTrace();
		}



		//System.out.println("=================");

	}
}