package assign_5;

import java.util.Optional;

public class question6 
{
	public static void main(String[] args) 
	{
        Optional<Integer> op= Optional.of(1000);
        System.out.println("Optional type:"+op);
        System.out.println("Getting the stream:");
        op.stream().forEach(System.out::println);
    }
}
