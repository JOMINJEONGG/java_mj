package day11.array;

public class ForEx1 {

	public static void main(String[] args) {
		int arr[] = new int[] {4,5,3,1,9};
		//arr[0] = 4; => 원래 이렇게 하나하나 입력해야하는데 번거로워서 위의처럼 쓰는게 드물지만 이번엔 이렇게 초기화 함
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = 0;
			int tmp = arr[i];
			System.out.println(tmp);
		}
	
		System.out.println("=========");
		//향상된 for문
		/* for(자료형 변수명 : 배열명){
		 * }
		 * 배열을 전체 탐색하는 경우 사용
		 * 값을 조회하는 경우(수정하는 경우는 사용하지 않음)
		 * */
		arr = new int[] {4,5,3,1,9};
		for(int tmp : arr){
			tmp = 0;
			System.out.println(tmp);
		}
		for(int tmp : arr){
			System.out.println(tmp);
		}
	}
}
