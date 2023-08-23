class A extends Order{
	private int Lcd;

	A(String name,int Lcd){

		super(name);
		this.Lcd=Lcd;
	}
	
	String show(){
		return super.show()+"\tlcd:"+Lcd;
	}
	
	void skillA(){

		System.out.println("A skill lcd:"+Lcd);
	}

}