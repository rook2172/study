package study.chap09.nested_class;

import java.util.Timer;
import java.util.TimerTask;


public class NeatedLocalOuter {
	//���� Ŭ����
	void method() {
		//�ֱ������� Ÿ�̸� �۾�
		//Ÿ�̸� Ŭ������ ����
		//���� Ŭ���� : �޼ҵ� �ȿ����� ����ϱ� ���ؼ� ������ Ŭ����
		class MyTimer extends Timer {
			private void run() {		//10�� Ÿ�Ӿƿ� �Ǹ� ����
				for(int i=0;i<10;i++) {
					System.out.println("Ÿ�Ӿƿ� �߻�");
				}

			}
		}
		MyTimer t = new MyTimer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Ÿ�Ӿƿ� �߻�");
			}	
				
			}
			
		},100);
			
		
	}
	
}
