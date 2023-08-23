class school2
{
	static void show()
	{
		System.out.println("static school2");
	}

	static class A
	{
		 void show1()
		{
			System.out.println(" A");
		}

		static void show2()
		{
			System.out.println(" static A");
		}
	}
}
class test2
{
	public static void main(String[] args) {
		//school2.show();
		school2.A a=new school2.A();
		a.show1();

		new school2.A().show1();

		school2.A.show2();
	}
}