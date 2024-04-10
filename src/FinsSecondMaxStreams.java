import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FinsSecondMaxStreams {

	public static void main(String[] args) {
		Integer[] a = {1,2,5,10,4,8,1,2};
		
		// int b = Arrays.stream(a).sorted().distinct().limit(2).findFirst().get();
	//	int[] i = Arrays.asList(a).stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
	//	int[] highest = Arrays.asList(a).stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(2);
		
		 int secondLargestNumber = Arrays
	                .stream(a)
	            //    .boxed()
	                .distinct()
	                .sorted(Collections.reverseOrder())
	         //       .limit(2)
	                .skip(1)
	                .findFirst()
	                .get();
		 System.out.println(""+secondLargestNumber);
		 
	
		
	}

}
