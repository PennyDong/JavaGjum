class add1{
	public static void main(String[] args) {
		
		A a1 = new A("abc",77,70);// is-a A, is-a student 
		

		System.out.println(a1.show());
		a1.change("aa",60);
		System.out.println(a1.show());
		a1.skill();

		System.out.println(a1.abc("sa"));

		System.out.println("============");

		B b1 = new B("cc",88,70); //is-a B, is-a student
		System.out.println(b1.show());
		b1.change(66);
		b1.skill();
	}

}