import java.io.File;
import java.io.IOException;
class ex2
{
	public static void main(String[] args) {
		File f1=new File("c:/ABC/a.txt");
		try
		{
			f1.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println("無新增權限");
			e.printStackTrace();
		}
		
	}
}