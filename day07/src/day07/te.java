package day07;

public class te {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		   //2. invert_arr배열에 거꾸로 저장 후 출력
		   int[] invert_arr = new int[arr.length];
		   int size = arr.length;
		   for(int num : arr) {
		      invert_arr[--size] = num;
		   }
		   for(int num : invert_arr) {
		      System.out.print(num+", ");
		   }
		   System.out.println();
	}

}
