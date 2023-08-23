interface book
{
	String bookName(String name);
}

class bookStore implements book
{
	

	public String bookName(String name)
	{
		return "Java書名="+name;
	}
}

class ex1
{
	public static void main(String[] args) {
		
		book b1 = new bookStore();

		System.out.println(b1.bookName("Java11"));
	}
}