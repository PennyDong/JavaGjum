class book1 <E>
{
	 String name;
	E price;

	book1(String name,E price)
	{
		this.name=name;
		this.price=price;
	}


}
	class ex2{
	public static void main(String[] args) {
		book1<Double> b1 = new book1<Double>("a",1000.5);
		System.out.println(b1.name+"\t"+b1.price);

		book1<Integer> b2 =new book1<Integer>("b",1000);
		System.out.println(b2.name+"\t"+b2.price);




}}