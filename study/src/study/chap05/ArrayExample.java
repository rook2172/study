package study.chap05;

public class ArrayExample {

	public static void main(String[] args) {
		// C언어 int arr[4] 선언하지만 자바에서는 4을 선언하지 못한다.
		//자바 : 배열 -> 객체(Class) -> 인스턴스화(객체를 생성): 메모리를 할당
		int[] arr1 = new int[4];		//new : 객체를 생성하기 
		//arr1 : 참조 변수 (주소를 저장)
		int[] arr2 = null;
//		arr2[2] = 10;
		arr1[2] = 20;
		System.out.println("arr1[2]="+arr1[2]);
		
	    double darr[] = new double[10];   										//방법1
		for(int i = 0;i < 10;i++) {
			darr[i] = 0.1;
		}
		for(int i = 0;i < 10;i++) {
			System.out.println("darr["+i+"]="+darr[i]);
		}
		
		String str1 = "홍길동";			//변경 불가
		String str2 = new String("홍길동");		//변경 가능
		str2.replace("이방원", "홍길동");		//변경 메소드 : replace
		System.out.println(str2);
		
	    int nArr[] = {1,2,3,4,5};		//heap 영역에 int 5개가 할당이 되고 합이 저장됨.   //방법2
	    int aarr[] = new int[10];
	    for(int i=0;i<aarr.length;i++) {
	    	System.out.println(aarr[i]);
	    }
		

	}

}
