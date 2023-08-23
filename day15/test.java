class school
{
	void show()
	{
		System.out.println("hello show");
	}
	void skill()
	{
		System.out.println("hello skill");
	}
	class A
	{
		void show()
		{
			System.out.println("hello A");
		}
		void show2()
		{
			System.out.println("hello A2");
		}
	}
}
class test
{
	public static void main(String[] args) {
		school s1 = new school();
		s1.show();

		new school().show();

		school.A a = new school().new A();
		System.out.println(a);
		a.show();
		a.show2();

		new school().new A().show();
		//a.skill();
		/*
		test.java:37: error: cannot find symbol
                a.skill();
                 ^
  		symbol:   method skill()
  		location: variable a of type school.A
		1 error
		*/
	}
}