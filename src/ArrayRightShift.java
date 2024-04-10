
public class ArrayRightShift {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//51234
		//45123
		//34512
		int nRotations=3;

		//Right shifting array elements (Numbers of rotations =3)
		for (int j = 0; j < nRotations; j++) {
			
			int last,k;
			last =arr[arr.length-1];
			
			for(k=arr.length-1;k>0;k--) {
				arr[k] =arr[k-1];
			}
			//11234
			arr[0] =last;
		}
		
		
		System.out.print("  Right Shifted:  ");
		for (int i : arr) {
			System.out.print(""+i);
		}
		

	}

}
