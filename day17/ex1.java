interface book1
{
	public void bookName(String name);
	//使用lambda只能有一個抽象方法
	//public void bookName2(String name)
	//增加上面的方法會導致編譯錯誤
}

class ex1
{
	public static void main(String[] args) {
		
		book1 b1 = new book1()
		{
			public void bookName(String name)
			{
				System.out.println("Java書名:"+name);
			}
			//public void bookName2(String name){"第"+name+"版"};


		};

		b1.bookName("JAVA11");

		System.out.println("======================");

		book1 b2=(String name)
		->System.out.println("JAVA -lambda書名:"+name);
		b2.bookName("Java_11");

		book1 b3=(n)->System.out.println("lambda"+n);
		b3.bookName("Java_");
		book1 b4=n->System.out.println("lambda2"+n);
		b4.bookName("Java_");


		System.out.println("========================");
		book1 b5=n->
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("java書名5:"+n);
			}
		};
		b5.bookName("Hello world");
	}
} 