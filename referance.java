//pass by reference and value;

package loveDSA;

class demo
{
	int x=10;
	int y=20;
	int disp(demo A , demo B)
	{
		A.x=98;
		
		System.out.println("x is ="+x);
		System.out.println("Y is ="+y);
		return 0;
	}
}

public class referance {

	public static void main(String[] args) {

		demo C=new demo();
		demo D=new demo();
		D.y=27;
		C.disp(C,D);
		D.disp(C,D);
		
	}

}
