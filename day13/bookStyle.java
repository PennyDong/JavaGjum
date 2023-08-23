class bookStyle implements book{

	public double bookPrice(double price)
	{
		return price*0.9;
	}

	public String bookName(String name)
	{
		return "java書名="+name;
	}
}