package com.SB;

import com.SA.student1;
import com.SA.student2;

public class B extends student1 implements student2
{
	private int eng;

	public B(String name ,int eng)
	{
		super(name);
		this.eng=eng;
	}

	public void skill()
	{
		System.out.println("B skill");
	} 

	public String show()
	{
		return super.show()+"\t英文:"+eng;
	}
}