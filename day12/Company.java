abstract class Company{

	private String name;

	Company(String name){
		this.name=name;
	}

	String show(){
		return "name="+name;
	}
	abstract void skill();
	abstract void set(int p);
}