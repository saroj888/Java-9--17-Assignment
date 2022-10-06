package assign_5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

class question_2{
    void implement(){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        Set<Integer> set= Set.of(10,20,30,40,50);
        System.out.println("Takewhile Operations:");
        list.stream()
                .takeWhile(e-> e%2!=0)
                .forEach(System.out::println);

        System.out.println("Dropwhile Operations:");
        set.stream()
                .dropWhile(e-> e%2!=0)
                .forEach(e-> System.out.println(e));

    }
}

public class question2 {

	public static void main(String[] args) 
	{
		question_2 quest2 = new question_2();
		quest2.implement();
	}

}
