class SA extends Company{

	private int p1;

	SA(String name,int p1){

		super(name);
		this.p1=p1;

	}

	String show(){
		return super.show()+"\tp1="+p1;
	}

	void skill(){
		System.out.println("SA skill p1="+p1);
	}
	void set(int p1){
		this.p1=p1;
	}

}