package pkg_1;

public class Day2A2 
{// equation is (((((10*2)+2)-2)-2)/2)
	public int sum(int a, int b)
	{
		int sumresult= a+b;
		System.out.println("The result of sum is "+sumresult);
		return sumresult;
	}
	public int sub(int c, int d)
	{
		int subresult= c-d;
		System.out.println(" The result of substraction is "+subresult);
		return subresult;
	
	}
	public int mul(int g, int h)
	{
		int mulresult= g*h;
		System.out.println("The result of multiplication is "+mulresult);
		return mulresult;
	}
	public void div(int j, int k)
	{
		int divresult= j/k;
		System.out.println(" The result of the equation is "+divresult);
	}
	public static void main(String[] args)
	{
		Day2A2 obj= new Day2A2();
				int b1=obj.mul(10, 2);
				int b2= obj.sum(b1, 2);
				int b3=obj.sub(b2, 2);
				int b4=obj.sub(b3, 2);
				obj.div(b4, 2);
	}
}
