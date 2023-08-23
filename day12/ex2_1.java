class ex2_1{
	public static void main(String[] args) {
		
		Company c1 = new SA("a",10);

		System.out.println(c1.show());

		//((SA)c1).skill();
		c1.skill();

		//Company c = new Company("asd");

		Company[] com = new Company[]{
			new SA("A1",10),
			new SA("A2",2),
			new SB("b1",3),
			new SC("C1",5),
			new SC("C2",7),
			new SA("t",5)
		};

		for(int i=0;i<com.length;i++){
			com[i].skill();
		}

		System.out.println("========================");

		com[2].set(100);

		for(Company o:com){
			o.skill();
		}


	}
}