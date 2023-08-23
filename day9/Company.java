class Company
{
	String name;
	String address;

	Company(String name)
	{	
		this.name=name;
		System.out.println("new Company name:"+name);
	}

	Company(String name,String address)
	{	
		this.name=name;
		this.address=address;
		System.out.println("new Company name:"+name+"地址:"+address);
	}


}