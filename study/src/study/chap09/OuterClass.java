package study.chap09;
//인스턴스 맴버 클래스
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
	
	
	//인스턴스 멤버 클래스 : 중첩 클래스
	public class ComThread extends Thread {
		@Override
		public void run() {			
			for(int i=0;i<10;i++) {
				System.out.println("count:"+ i);
				try {
					Thread.sleep(1000);		//1초동안 잠자기
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//정적 멤버 클래스
	public static class ServerThread extends Thread{
		@Override
		public void run() {
			for(int i = 0;i<5;i++) {
				System.out.println("서버와 통신중 :"+ i);
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
