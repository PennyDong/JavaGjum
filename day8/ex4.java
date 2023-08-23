class ex4
{
	public static void main(String[] args) {
		
		Member[] m =new Member[3];

		m[0] = new Member("tt","ss");
		m[1] = new Member("qq","ww");
		m[2] = new Member("cc","kk");


		System.out.println(m);
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);


		for(int i=0;i<m.length;i++)
		{
		System.out.println(m[i]+m[i].show());
		}
	}
	
}