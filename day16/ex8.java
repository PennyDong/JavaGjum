/*
	java8以後,用物件來儲存
*/
enum product3
{
	java11(650,10),javaWeb(700,5),spring(850,10);

	//field
	private int price;
	private int amount;

	//constructors
	private product3(int price,int amount)
	{
		this.price=price;
		this.amount=amount;
	}

	private int getPrice(int price)
	{
		this.price=price;
	}

	private int getAmount(int amount)
	{
		this.amount=amount;
	}



}
/*
	product3 java11=new product3();--->java11+()
	product3 javaWeb=new product3();
	product3 spring=new product3();
*/
class ex8
{
	public static void main(String[] args) {
		
		product3[] p=product3.values();

		for(product3 o:p)
		{
			System.out.println(o);
		}

		

	}
}