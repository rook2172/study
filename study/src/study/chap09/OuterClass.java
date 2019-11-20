package study.chap09;
//�ν��Ͻ� �ɹ� Ŭ����
public class OuterClass {
	int num;
	ComThread thread1 = new ComThread();
	
	public OuterClass() {
		
	}
	
	public void method3(String url) {
		ComThread thread = new ComThread();
		method(thread);
	}
	
	public void method(ComThread thread) {
		thread.start();
	}
	
	public void method2() {
		ComThread thread = new ComThread();
		thread.start();
	}
	
	
	//�ν��Ͻ� ��� Ŭ���� : ��ø Ŭ����
	public class ComThread extends Thread {
		@Override
		public void run() {			
			for(int i=0;i<10;i++) {
				System.out.println("count:"+ i);
				try {
					Thread.sleep(1000);		//1�ʵ��� ���ڱ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//���� ��� Ŭ����
	public static class ServerThread extends Thread{
		@Override
		public void run() {
			for(int i = 0;i<5;i++) {
				System.out.println("������ ����� :"+ i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
