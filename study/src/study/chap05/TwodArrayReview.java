package study.chap05;

//2���� �迭 arr[i][j]

public class TwodArrayReview {

	public static void main(String[] args) {
		int arr1[][] = {{1,2,3},{4,5}};
		
		int arr2[][] =  new int[3][4];
		int arr3[][][] = new int[4][5][6];
		System.out.println("arr1�� ���� ũ�� ="+arr1.length);
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"]�� ũ��= "+arr1[i].length);
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		//�迭�� ���� ���� ũ�⸦ �����ؼ� ����
		int arr4[][] = new int[3][];
		for(int i=0;i<arr4.length;i++) {
			arr4[i] = new int[i + 3];		//�� ���� ���� ���� �迭 ����
			
		}
		int num = 1;
		//���� ����
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4.length;j++) {
				arr4[i][j] = num++;				
			}
		}
		//���� ���
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4.length;j++) {
				System.out.print(arr1[i][j]+" ");			
			}
			System.out.println();
		}
	}

}
