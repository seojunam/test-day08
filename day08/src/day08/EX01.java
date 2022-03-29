package day08;

public class EX01 {
	public static void main(String[] args) {
		//[] [] 인덱스가 2개 가 필요하다
		int arr[][]= new int[][] {{1,2},{10,20},{30,40}};
		//콤마 기준으로 0 1 2 있고 그안에 0번째 0은 1이 되고 0번째 1은 2가된다
		
		System.out.println(arr[0][1]);
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		/*
		 System.out.println("=========");
		 for(int[]a:arr){
		 for(int k:a){
		 System.out.print(k+",")
		 }
		 System.out.println();
		 } 
		 */
	}

}
