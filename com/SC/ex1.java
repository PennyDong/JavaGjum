package com.SC;

import com.SA.student1;
import com.SA.student2;
import com.SB.A;
import com.SB.B;

class ex1
{
	public static void main(String[] args) {
		//student1 s = new student1("abc");
		//System.out.println(s.show());

		A a1 = new A("a",100);
		System.out.println(a1.show());
		a1.skill();

		System.out.println(a1.x+"\t"+a1.y);


		B b1 = new B("b",100);
		System.out.println(b1.show());
		b1.skill();


	}

}