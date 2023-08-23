class FV{

	private static int PV;
	private double r ;
	private int n ;
	private int fv;

	FV(double r,int n)
	{
		
		this.r=r;
		this.n=n;

		fv=(int)(PV*(1+r*n));
	}

	static String CompanyName()
	{
			return "巨匠電腦";
		}

	static  int cal(int x,int y)
	{
		return x*y;
	}

	void setR(double r)
	{
		this.r=r;
	}

	void setPV(int PV)
	{
		this.PV=PV;	//this為物件本身 static為類別共用 一起使用會發生衝突 
	}

	void show()
	{
		fv=(int)(PV*(1+r*n));
		System.out.println("本金:"+PV+
					"\t利率:"+r+
					"\t期數:"+n+
					"\t單利本利和:"+fv);
	}
}