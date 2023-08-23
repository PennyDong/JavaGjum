class A extends student{

	private int word;

	A(String name,int word){
		super(name);
		this.word=word;
	}

	A(String name ,int chi,int word){
		super(name,chi);
		this.word=word;}


	void change(int word){
		this.word=word;
}

	protected String abc(String aa){
		return "A:"+aa;
	}


	void skill(){
		System.out.println("A skill");

	}

}