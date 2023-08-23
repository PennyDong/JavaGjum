class ex1{
	public static void main(String[] args) {
		//book b = new book();

		//System.out.println(book.pi2);

		book[][] b= new book[2][];
		b[0] = new book[2];
		b[1] = new book[3];

		b[0][0] = new bookStyle();
		b[0][1] = new bookStyle();

		b[1][0] = new bookStyle2();
		b[1][1] = new bookStyle2();
		b[1][2] = new bookStyle2();

		System.out.println("書名:"+b[0][1].bookName("spring")+
			"\t價格:"+b[0][1].bookPrice(1000));

		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.println("書名:"+b[0][1].bookName("spring")+
					"\t價格:"+b[0][1].bookPrice(1000));
			}
		}


		b[0][0].show();
		book.show2();


	}
}