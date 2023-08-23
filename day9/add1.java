class add1{
	public static void main(String[] args) {
		
		A a1 = new A();
		/*
		A is-a A
		A has-a word
		A has-a show()

		A is-a school
		A has-a name
		A has-a chi 

		*/


		B b1 = new B();
		/*
		B is-a B
		B has-a Excel
		B has-a show()

		B is-a school
		B has-a name
		B has-a chi

		*/
		a1.show();
		b1.show();
 	}
}

/*
給定下面程式碼，哪些選項的描述是對的?(選擇3個)
	01. class Animal{}
	02. class Dog extends Animal{Tail tail;}
	03. class Beagle extends Dog{public void jumper(){}}
	04. class Cat extends Animal{public void jumper(){}}

	A. Cat is-a Animal
	B. Cat is-a jumper
	C. Dog is-a Animal
	D. Dog is-a jumper
	E. Beagle has-a Tail


*/