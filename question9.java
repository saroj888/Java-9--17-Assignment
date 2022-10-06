package assign_5;

import java.util.*;
import java. util.stream.Collectors;
import java.util.stream.Stream;
class question9
{
    public static void main(String[] args) {
        var unmodList= Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        Collections::unmodifiableList));
        System.out.println(unmodList);
    }
}
