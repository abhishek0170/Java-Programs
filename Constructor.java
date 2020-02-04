public class Constructor
{
	public static void main(String args[])
	{
		A obj=new A(5);
		//A obj=new A(4.4,5);
		//A obj=new A(9,8);//A obj=new A(2,3.5);
		//A obj=new A();

	}
}
class A
{
	public A()
	{
		System.out.println("in A class");
	}
	public A(int k)
	{
		System.out.println("in A class with k");
	}
	public A(int i,double d)
	{
		System.out.println("in A class with i and d");
	}			
	
}
