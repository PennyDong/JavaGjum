class C extends Order{
	private int Mouse;

	C(String name,int Mouse){

		super(name);
		this.Mouse=Mouse;
	}

	String show(){
		return super.show()+"\tMouse"+Mouse;
	}
}