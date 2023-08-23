class Company
{
	enum month
	{一月,二月,三月};

	enum address
	{台北,台中};

	enum product
	{Lcd,Ram,Mouse};

}

class ex7
{
	public static void main(String[] args) {
		
		Company.month[] m= Company.month.values();
		Company.address[] a= Company.address.values();
		Company.product[] p= Company.product.values();

		System.out.println(p[0]+"\t"+a[0]+"\t"+m[0]);
	}
}