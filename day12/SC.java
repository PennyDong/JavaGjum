class SC extends Company{

	private int p3;

	SC(String name ,int p3){

		super(name);
		this.p3=p3;
	}

	void skill(){
		System.out.println("SC skill p3="+p3);
	}
	void set(int p3){
		this.p3=p3;
	}
}