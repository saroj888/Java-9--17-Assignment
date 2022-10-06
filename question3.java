package assign_5;

import java.util.stream.IntStream;

class question_3
{
	void implement()
	{
		IntStream list = IntStream.rangeClosed(11, 20);
		list.forEach(System.out::println);
	}
}


public class question3 {
	public static void main(String[] args) 
	{
		question_3 quest3 = new question_3();
		quest3.implement();
	}
}
