package loveDSA;
import java.util.Iterator;

/*   * 
    ** 
   *** 
  **** 
 *****  */
class invertedP
{
	static int i,j;
public void invert()
{
	
	for(i=5;i>0;i--)
	{
		for(j=0;j<=5;j++)
		{
			if(j<i)
			{
				System.out.print(" ");
			}
			else
			System.out.print("*");
		}
		System.out.println(" ");
			
	}
}	
/*  ******
	*    *
	*    *
	*    *
	*    *
    ******      */
//hollow PATTERN...
	public void hollow()
	{
		
		for(i=0; i<=5;i++)
		{
			for(j=0;j<=5;j++)
			{
				if(i==0 || j==0 || i==5 || j==5)
				System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
	/*  1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 */
	public void flowed()
	{
		int count=1;
		for(i=0; i<=5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
/*  1
	21
	321
	4321*/
		public void pattern1()
		{
			
			for(i=1; i<5;i++)
			{
				for(j=i;j>0;j--)
				{
					System.out.print(j);
					
				}
				System.out.println();
			}
	     }
		
		public void pattern2()          
		{
			int lines =4;
			int i,j;
			int space=0;
			for(i=0;i<lines;i++)             /* 12344321
												123**321
												12****21
												1******1*/
			{
				for(j=1;j<=space;j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=lines;j++)
				{
					if(j<= (lines-i))
						System.out.print(j);
					
					else
						System.out.print("*");
				}
				j--;
				
				while(j>0)
				{
					if(j>lines-i)
						System.out.print("*");
					else
						System.out.print(j);
					j--;
				}
				if((lines-i)>9)
					space+=1;
				System.out.println("");
				
			}
		}	
}


public class pattern1 {

	public static void main(String[] args) {
		invertedP p=new invertedP();
//		p.invert();
//		p.hollow();
//		p.flowed();
		
		//p.pattern1();
		p.pattern2();
		

   }
}
