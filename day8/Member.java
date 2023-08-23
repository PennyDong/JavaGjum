class Member
{
	private String name;
	private String address;

	Member(String name,String address)
	{
		this.name=name;
		this.address=address;
	}

	String show()
	{
		return "名:"+name+"\t地址:"+address;
	}
}