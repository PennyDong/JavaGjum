interface book2
{
	String bookName(String name);
	double priceBook(double price);
}

class ex2
{
	public static void main(String[] args) {
		
		book2 b2 = new book2()
		{
			public String bookName(String name)
			{
				return "書名="+name;
			}

			public double priceBook(double price)
			{
				return price*0.9;
			}

		};

		System.out.println(b2.bookName("jacaWeb")+"\t價格="+b2.priceBook(1000));
	}
}