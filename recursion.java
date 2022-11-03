package loveDSA;
import java.util.Scanner;
class factorl
{
	public int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int smallerProblem=factorial(n-1);
		int biggerProblem=n*smallerProblem;
		
		return biggerProblem;
	}
	
	public int  pawer(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		return 2*pawer(n-1);
	}
	public void  printcounting(int n)
	{
		if(n==0)
		{
			return ;
		}
		
		printcounting(n-1);
		System.out.println(n);//
		
	}
	public void walking(int src , int dest)
	{
		System.out.print("source"+src);
		System.out.println("destination"+dest);
		
		if(src==dest)
		{
			System.out.println("Reached Home");
			return;
		}
		src++;
		walking(src , dest);
	}
	public int fibonnacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		System.out.println();
		int ans=fibonnacci(n-1) + fibonnacci(n-2);
		return ans;
	}
	
	
}
public class recursion {

	public static void main(String[] args) {
		factorl obj=new factorl();
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
//		int fact=obj.factorial(n);
		
//		System.out.println(fact);
//		System.out.println(obj.pawer(n));
		
		//obj.printcounting(n);
		
//		int src=1;
//		int dest=10;
//		obj.walking(src,dest);
		
		int ans=obj.fibonnacci(n);
		System.out.println(ans);
		
		

	}

}
