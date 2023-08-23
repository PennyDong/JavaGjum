interface book{

	//常數
	public static final double pi = 3.14;
	double pi2 = 3.14;

	//book(){} interface 不允許使用建構式


	/*java 7.0以前 --->CRUD*/
	public abstract String bookName(String name);
	double bookPrice(double price);


	/*java 8.0以後*/

	public default void show(){System.out.println("default test");}
	public static void show2(){System.out.println("static test");}

}