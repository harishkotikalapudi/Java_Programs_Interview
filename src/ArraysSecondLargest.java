
public class ArraysSecondLargest {

	public static void main(String[] args) {

        int[] a = {  8,8, 2, 4, 3, 1, 5, 7 };
        
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
     
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
            	second_max = max;
                max = a[i];
            } else if (a[i] > second_max && a[i] != max) {
                second_max = a[i];
            }
        }
        
        if (second_max == Integer.MIN_VALUE) {
            System.out.println("No Second Highest value");
        } else {
            System.out.println(second_max);
        }

	}

}
