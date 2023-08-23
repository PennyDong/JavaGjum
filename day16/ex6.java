enum product2 //product2[] ?=new product2[]{word,excel,powerpoint}
{
	word,excel,powerpoint
}

class ex6
{
	public static void main(String[] args) {
		
		System.out.println(product2.word);

		product2[] p = product2.values();

		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}

	}
}