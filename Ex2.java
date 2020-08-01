package threads;
import java.util.Random;
public class Ex2 implements Runnable
{
	public void run()
	{
		
    String colours[]= {"white", "blue","black","green","red","yellow"};
    Random random=new Random();
		int index;
		while((index=random.nextInt(6))!=4)
		{
			System.out.println(colours[index]);
		}
	}
	public static void main(String args[])
	{
		Ex2 threadDemo =new Ex2();
		Thread t1=new Thread(threadDemo);
		t1.start();
		
	}

}
