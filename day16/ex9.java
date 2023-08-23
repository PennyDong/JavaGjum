interface book5
{
	double bookPrice(double price);
}
class ex9
{
	public static void main(String[] args) {
		book5 b =new book5(){

			public double bookPrice(double price)
			{
				return price*0.9;
			}
		};

		System.out.println(b.bookPrice(1000));

		book5 b2 =(double price)->price*0.8;

		System.out.println(b.bookPrice(1000));
	}
}