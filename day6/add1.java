class add1{
	public static void main(String[] args) {

		//FV.PV=-20000;
		//System.out.println(FV.PV);


		FV f1 =new FV(0.015,3);
		FV f2 =new FV(0.014,4);
		FV f3 =new FV(0.013,5);
		FV f4 =new FV(0.012,6);

		f1.show();
		f2.show();
		f3.show();
		f4.show();

		System.out.println("============================");

		//FV.PV=40000;
		//f4.r=0.011;
		f4.setR(0.011);
		System.out.println(FV.cal(2,4));

		System.out.println(FV.CompanyName());

		f1.show();
		f2.show();
		f3.show();
		f4.show();
	}
}