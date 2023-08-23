class CA extends Company
{
	int Lcd;

	CA(String name,int Lcd)
	{
		super(name);

		this.Lcd=Lcd;
		
		System.out.println("new CA Lcd:"+Lcd);
	}

	CA(String name,String address,int Lcd)
	{
		super(name,address);

		this.Lcd=Lcd;
		
		System.out.println("new Company name:"+name+"地址:"+address+"new CA Lcd:"+Lcd);
	}

}