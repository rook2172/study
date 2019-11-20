package study.chap09;

public class MainExamole {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
//		oc.thread1.start();
//		oc.method3("http://www.naver.com");
//		oc.method2();
		
		//정적 멤버 클래
		OuterClass.ServerThread thread = new OuterClass.ServerThread();
		thread.start();
		
		//인스턴스 멤버 클래스
		OuterClass.ComThread thread2 = oc.new ComThread();
		thread2.start();
	}

}
