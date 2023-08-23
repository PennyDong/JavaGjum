class book2<E,T>
{
	String bookName;
	E price1;
	T price2;
	
	book2(String bookName,E price1,T price2)
	{
		this.bookName=bookName;
		this.price1=price1;
		this.price2=price2;
		}
}
class ex3
{
	public static void main(String[] args) {
		book2<Integer,Integer> b1=new book2<Integer,Integer>("java",1000,1000);
		book2<Integer,Double> b2=new book2<Integer,Double>("java",1000,1000.);
		book2<Integer,Double> b3=new book2<>("a",1000,1000.2);
	}
}