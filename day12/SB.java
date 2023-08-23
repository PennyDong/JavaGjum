class SB extends Company{

	private int p2;

	SB(String name , int p2){

		super(name);
		this.p2=p2;
	}

	void skill(){
		System.out.println("SB skill p2="+p2);
	}
	void set(int p2){
		this.p2=p2;
	}
}