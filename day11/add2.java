class add2{
	public static void main(String[] args) {
		
		Order[][] x= new Order[3][];
		x[0]=new Order[4];
		x[1]=new Order[3];
		x[2]=new Order[2];

		x[0][0]=new A("a1",10);
		x[0][1]=new A("a2",10);
		x[0][2]=new A("a3",10);
		x[0][3]=new A("a4",10);

		x[1][0]=new B("b1",5);
		x[1][1]=new B("b2",5);
		x[1][2]=new B("b3",5);

		x[2][0]=new C("c1",7);
		x[2][1]=new C("c2",7);


		System.out.println(x);		
		for(int i=0;i<x.length;i++){
			System.out.println("\t"+x[i]);
			for(int j=0;j<x[i].length;j++){
				System.out.println("\t\t"+x[i][j]+"\t"+x[i][j].show());
			}
		}

		x[0][0].skill();
		((A)x[0][0]).skillA();//降轉 將Order轉成A物件
		x[0][1].skillA();//在Order裡 建立一個空白的skillA()方法

		System.out.println(x[0][2] instanceof A); // 檢查 前物件跟後面物件有沒有關係
		System.out.println(x[0][2] instanceof Order);
		System.out.println(x[0][2] instanceof B);

		System.out.println("=================");
		System.out.println(x);
		for(Order[] o:x){
			System.out.println("\t"+o);
			for(Order u:o){
				System.out.println("\t\t"+u+u.show());
			}
		}

		System.out.println("=================");

		System.out.println(x[0][0]);
		System.out.println(x[1][0]);
		System.out.println(x[0][0].show());
		System.out.println(x[1][0].show());
		System.out.println(x[0][0].equals(x[1][0]));

		System.out.println("=================");

		x[0][0]=x[1][0];

		System.out.println(x[0][0]);
		System.out.println(x[1][0]);
		System.out.println(x[0][0].show());
		System.out.println(x[1][0].show());
		System.out.println(x[0][0].equals(x[1][0]));

		System.out.println(x[1][0].toString());

	}
		}
