class check extends Exception
{
	check(String msg)
	{
		System.out.println(msg);
	}
}

class Order
{
	private int Lcd;
	private int Ram;

	Order(int Lcd,int Ram) throws check
	{
		if(Lcd>=0 && Ram>=0)
		{
			this.Lcd=Lcd;
			this.Ram=Ram;
		}
		else
		{
			
			throw new check("新增LCD與RAM需>=0");
			//throw new Exception();
			/*try
			{
				throw new Exception();
			}
			catch(Exception e)
			{

			}*/
			
		}
		
	}

	void setLcd(int Lcd) throws check
	{
		if(Lcd>=0)
		{
			this.Lcd=Lcd;
		}
		else
		{
			throw new check("修改LCD需>=0");
			//throw new Exception();
		}

		
	}

	void setRam(int Ram) throws check
	{
		if(Ram>=0){
			this.Ram=Ram;
		}else{
			throw new check("修改LCD需>=0");
		};
		
	}

	void show()
	{
		System.out.println("Lcd="+Lcd+"\tRam="+Ram);
	}
}