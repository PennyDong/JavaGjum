class B extends student{

	private int excel;

	B(String name,int chi,int excel){

		super(name);
		this.excel=excel;
	}

	void change(int excel){
		this.excel=excel;
	}

}