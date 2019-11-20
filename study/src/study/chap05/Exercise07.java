package study.chap05;

public class Exercise07 {

	public static void main(String[] args) {
/*		int max =0;
		int sum = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		System.out.println("합="+sum);
		
		for(int i=0;i<array.length;i++) {
			if(max < array[i])
				max = array[i];
		}
		System.out.println("max="+max);
		System.out.println("------------");
		
		//enhanced for
		for(int num:array) {
			if(max<num)
				max=num;
		}
		System.out.println("max="+max);
		
	}
	
	//list : 회원, 게시판 관리 ->
	 * Set : 중복이 허용이 않된다.
	 * Map : key,value 
	
	*/
		int[][] array = {
				{95,86}, 
				{83, 92, 96}, 
				{ 78, 83, 93, 87, 88 }
		};
		
		int sum = 0;
		double avg =0.0;
		int count = 0;
		
		for(int i=0;i<array.length;i++) {			
			count += array[i].length;	
			for(int j=0;j<array[i].length;j++) {
			//	System.out.println(array[i][j]);
				sum+=array[i][j];
			}			
		}
		System.out.println("합="+sum);
		avg = (double)sum/count;
		System.out.println("평균="+avg);	
	}
}
