class B extends Order{
	private int Ram;

	B(String name,int Ram){

		super(name);
		this.Ram=Ram;
	} 

	String show(){
		return super.show()+"\tRam:"+Ram;
	}

	public String toString(){
		return "位址=" +super.toString();
	}

}