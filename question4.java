package assign_5;

import java.util.*;
import java.util.stream.*;

public class question4
{
    public static <T> Stream <T>
    getStream(Iterator<T> iterator)
    {
        Spliterator<T> spliterator= Spliterators.spliteratorUnknownSize(iterator, 0);
        return StreamSupport.stream(spliterator, false);
    }
    public static void main(String[] args) {
        Iterator<Integer> iterator= Arrays.asList(10,20,30,40,50).iterator();
        Stream<Integer> stream= getStream(iterator);
        stream.forEach(s-> System.out.println(s));
    }
}
