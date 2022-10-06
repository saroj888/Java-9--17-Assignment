package assign_5;

class question_1 implements myInterface
{
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	void implement()
	{
		question_1 q = new question_1();
		q.mul(4,5);
		q.perform();
	}
}

interface myInterface
{
	public void mul(int a,int b);
	public default void perform()
	{
		add(6,7);
		System.out.println("Private method invoked inside interface");
	}
	
	private void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class question1 {

	public static void main(String[] args) 
	{
		question_1 quest1 = new question_1();
		quest1.implement();
	}
}
