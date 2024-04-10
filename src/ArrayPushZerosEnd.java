
public class ArrayPushZerosEnd {

	public static void main(String[] args) {
		
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int ary_legnth  = arr.length;

		 PushZeros(arr,ary_legnth);
	}


	private static void PushZeros(int[] arr, int ary_legnth) {
		int counter =0;
		
		 for (int i = 0; i < ary_legnth; i++) {
			if(arr[i]!=0) {
				arr[counter++] = arr[i];
			}
		}
		 while (counter<ary_legnth) {
			 arr[counter++] =0;
		}
		 System.out.println("Method 1:  ");
		 for (int i : arr) {
			System.out.print(" "+i);
		}
	}

}
