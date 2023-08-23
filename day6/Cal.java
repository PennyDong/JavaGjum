class Cal
{
	private static int x;
	private int y;

	Cal(){
		x++;
		y++;
	}

	void show(){
		System.out.println("x:"+x+"\ty:"+y);
	}
}