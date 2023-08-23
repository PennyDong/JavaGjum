class check extends Exception
{
	check(String msg)
{
	System.out.println(msg);
}
}


class order
{
	private int Lcd;
	private int Ram;

	order(int Lcd,int Ram) throws check
	{	
		if(Lcd>=0 && Ram>=0)
		{
			this.Lcd=Lcd;
			this.Ram=Ram;
		}
		else
		{	
			throw new check(">=0");

			/*try{
				throw new Exception();
			}
			catch(Exception e)
			{

			}*/
		}
	}

	void setLcd(int Lcd) throws check
	{
		if(Lcd>=0){
			this.Lcd=Lcd;
		}else{
			throw new check(">=0");
		}
		
	}

	void setRam(int Ram)
	{
		this.Ram=Ram;
	}

	void show()
	{
		System.out.println("Lcd="+Lcd+"\tRam="+Ram);
	}
}