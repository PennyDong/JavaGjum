class student
{
	private String name;
	private int chi;

	student(String name)
	{
		this.name=name;
	}


	student(String name ,int chi){
		this.name=name;
		this.chi=chi;
	}

	protected String abc(String msg){
		return msg;
	}


	void change(String name ,int chi)
	{
		this.name=name;
		this.chi=chi;
	}

	void skill(){
		System.out.println("skill student");
	}

	String show(){

		return "名:"+name+"\t國"+chi;
	}

}