interface book3
{
	String bookShow(String name,double price);
}

class ex3
{
	public static void main(String[] args) {
	/*	
		book3 b1=cal::b1;
		System.out.println(b1.bookShow("a",-1000));
}*/
	book3[] b=new book3[3];
		b[0]=cal::b1;//new book3(){};
		b[1]=cal::b2;
		b[2]=cal::b3;


		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+"\t"+b[i].bookShow("java11",1000));
		}
	}
}


class cal
{
	public static String b1(String name,double price)
	{
		if(price>=2000)
		{
			return "名:"+name+"\t價錢"+price*0.8;
		}
		else if(price>=1000)
		{
			return "名"+name+"\t價錢"+price*0.9;
		}
		else if(price>=0)
			{
				return "名:"+name+"\t價錢:"+price;
			}
		else
			{
				return "價格要大於0";
			}
		}
	public static String b2(String name,double price)
	{
		if(price>=0)
			{
				return "名:"+name+"\t價錢:"+price*0.95;
			}
			else
			{
				return "價格要大於0";
			}
	}	
		
	public static String b3(String name,double price)
	{
		return
		"名="+name+"\t價錢"+price;
		
	}
}