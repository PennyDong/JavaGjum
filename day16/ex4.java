class book4
{
	private String name;
	book4(String name){
		this.name=name;
	}

	String show(){
		return "書名="+name;
	}

}

class ex4
{
	public static void main(String[] args) {
		
		book4 b = new book4("Java")
		{
			String show()
			{
				return super.show()+"\t2023出版";
			}
		};

		System.out.println(b.show());

	}
}