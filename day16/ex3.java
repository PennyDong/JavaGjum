interface book3
{
	String bookName(String name);
	double bookPrice(double price);
}

class ex3
{
	public static void main(String[] args) {
		
		System.out.println(new book3(){

			public String bookName(String name)
			{
				return null;
			}

			public double bookPrice(double price)
			{
				if(price>=0){
					return price*0.9;
				}else{
					return 0;
				}
			}
		}.bookPrice(1000)+"元");
	}
}