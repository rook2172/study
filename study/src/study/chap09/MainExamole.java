package study.chap09;

public class MainExamole {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
//		oc.thread1.start();
//		oc.method3("http://www.naver.com");
//		oc.method2();
		
		//���� ��� Ŭ��
		OuterClass.ServerThread thread = new OuterClass.ServerThread();
		thread.start();
		
		//�ν��Ͻ� ��� Ŭ����
		OuterClass.ComThread thread2 = oc.new ComThread();
		thread2.start();
	}

}
