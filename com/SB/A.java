package com.SB;

import com.SA.student1;
import com.SA.student2;

public class A extends student1 implements student2
{
	private int chi;

	public void cal(int x, int y)
	{
		this.x=x;
		this.y=y;
	}


	public A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}

	public void skill()
	{
		System.out.println("A skill");
	}

	public String show()
	{
		return super.show()+"\t國文:"+chi;
	}

}


