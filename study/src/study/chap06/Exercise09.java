package study.chap06;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		/* ������ : ������ �Է� �޴´�. -> �ְ������� �������
		 * ���� : �ּҰ�=0, �ִ밪=100
		 * �ִ밪�� ���� �ʱ�ġ : 
		 *�޴������� : 1.�л���(�迭�� ũ��)
		 *			2.�����Է� -> �迭�� ����, �ִ밪�� ���� ���Ѵ�.
		 *			3.���� ����Ʈ : �迭�� ���
		 *			4.�м� : �ְ�����, ��հ� ���
		 *			5.���� -> run = false �϶� ����
		 */
		int max = -1;	//�ʱ�ġ�� �ּҰ� -> �Է� �����ʹ� �ִ밪
		int sum;		//����
		double avg;		//���
		boolean run = true;	//�޴��� �Է� �ޱ� ���� �ݺ��� ->while�ݺ���(������ ���� �ƴҶ�)
		int studentNum = 0;
		Scanner scanner = new Scanner(System.in);
		int scores[] = null;	//1���� �迭 ����(��������)
		
		while(run) {	//������ �ݺ�
			//Ư�� ���� : ���� �޴��� ���� ->�ݺ����� ������� ó��
			System.out.println("--------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.println("--------------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();//int �Է�(�޴�)
			
			if(selectNo == 1) {
				//�л���> 3
				System.out.println("�л���> ");
				studentNum = scanner.nextInt();
				//�迭�� ����
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				//�л�����ŭ ������ �Է�
				//scores[0]> 80
				for(int i=0;i<studentNum;i++) {
				System.out.println("scores["+i+"]>");
				scores[i] = scanner.nextInt();
				}
				//�ִ밪�� ��->��
			}else if(selectNo == 3) {
				for(int i=0;i<studentNum;i++) {
					//scores[0] 85
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			}else if(selectNo == 4) {
				//�ְ����� : 95
				//������� : 91.0
				max = -1;		//�޴��� 4.�м��� ������ ������ �ٽð��
				sum = 0;
				for(int i=0;i<studentNum;i++) {
					//���ο� �ִ밪�� ���Ѵ�.
					if(max<scores[i])
						max=scores[i];
					//���� ���Ѵ�.
					sum += scores[i];
					
				}
				avg=(double)sum/studentNum;
				System.out.println("�ְ� ����:"+max);
				System.out.println("��� ����:"+avg);
			}else if(selectNo == 5) {
				run = false;		//�ݺ����� ���ǽ� run-> �ݺ����� ����� ����
			}
			
		}
		System.out.println("���α׷� ����");
		
	}

}
