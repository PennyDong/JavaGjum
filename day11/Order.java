class Order{
	private String name;

	Order(String name){
		this.name=name;
	}

	String show(){
		return "名:"+name;
	}

	void skill(){

		System.out.println("Order skill");
	}

	void skillA(){}

}