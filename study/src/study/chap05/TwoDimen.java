package study.chap05;

import java.util.Scanner;

/*
 * ������ �迭
 * arr[][]
 */

public class TwoDimen {

	public static void main(String[] args) {
		//2���� �迭 ����
		int arr1[][] = {{1,2,3},		//3��
				{1,2,3,4},				//4��
				{1,2,3,4,5}				//5��
		};
		for(int i=0;i < arr1.length;i++) {
			System.out.println("arr1["+i+"]�� ���� = "+arr1[i].length);
			for(int j=0; j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]+"");
			}
			System.out.println();
		}
		
		System.out.println("****************");

		//�迭�� ���� �����ϴ� ���
		int arr2[][] = new int[3][];
		int num = 1;
		for(int i = 0;i<3;i++) {
			arr2[i] = new int[i+3];
		}
		for(int i = 0;i < arr2.length;i++) {
			for(int j = 0;j < arr2[i].length;j++) {
				arr2[i][j] = num++;
			}
		}
		for(int i = 0;i < arr2.length;i++) {
			for(int j = 0;j < arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"");
			}
			System.out.println();
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("�迭�� ũ�� : ");
			int len = scanner.nextInt();
			double darr[] = new double[len];
			System.out.println("�迭 darr �� ũ�� : " + darr.length);
		}
	}

}
