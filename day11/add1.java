class add1{
	public static void main(String[] args) {
		
		A a1=new A("a1",10);// is-a Order is-a A
		System.out.println(a1.show());
		a1.skill();
		a1.skillA();


		Order o = new A("a2",20); //is-a Order
		//編譯時走宣告的名稱
		System.out.println(o.show());
		//Rum時走new的物件
		o.skill();
		//o.skillA();

		
		


	}
}