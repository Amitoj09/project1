package pkg_1;

public class Day2A1 
{
	public int sum(int a, int b)
	{
		int s1;
		s1=a+b;
		System.out.println(" result of sum is "+s1);
		return s1;
	}
	public int sub(int c, int d)
	{
		int s2;
		s2= c-d;
		System.out.println("Result of subtraction is "+s2);
		return s2;
	}
	public int mul(int f, int g)
	{
		int m;
		m=f*g;
		System.out.println("Result of multiplication is "+m);
		return m;
	}
	public void div(int h, int j)
	{
		int r;
		r=h/j;
		System.out.println("Result of equation is "+r);
	
	}
	public static void main(String[] args)
	{
	// equation (((((10+2)+2)-2)*2)/2)
		Day2A1 obj= new Day2A1();
		int sumresult= obj.sum(10, 2);
		int sm2= obj.sum(sumresult, 2);
		int sbr=obj.sub(sm2, 2);
		int mulr=obj.mul(sbr, 2);
		obj.div(mulr, 2);
		
		
	}
}

