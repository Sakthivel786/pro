package practise;

public class copyofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array1= {1,2,3,4,5};
		int[]array2=new int[array1.length];
		//copying of array from one to another
		for(int i=0;i<array1.length;i++) {
		array2[i]=array1[i];
		}
		System.out.println("original elements of array");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
			}
		System.out.println();
		System.out.println("copy of array elements");
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
	}
}
