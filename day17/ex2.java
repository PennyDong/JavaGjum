interface bookStyle
{
	String book(String name,double price);
}

class ex2
{
	public static void main(String[] args) {
		
		bookStyle b = new bookStyle()
		{
			public String book(String name,double price)
			{
				return "名="+name+"\t價錢="+price;
			}
		};

		System.out.println(b.book("abc",1000));

		System.out.println("=======================");

		bookStyle b2 = (name,price)->"名="+name+"\t價錢"+price*0.9;
		System.out.println(b2.book("S",1000));

		bookStyle b3 = (name,price)->
		{
			if(price>=0)
			{
				return "名:"+name+"\t價錢:"+price;
			}
			else
			{
				return "價格要大於0";
			}
		};
		System.out.println(b3.book("a",-10000));
	}
}