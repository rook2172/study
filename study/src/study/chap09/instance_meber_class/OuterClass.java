package study.chap09.instance_meber_class;

public class OuterClass {
	//인스턴스 멤버 클래스 : 객체(OuterClass)가 생성이 되어야 
	public class InnerClass {
		//필드 : 인스턴스 필드, 정적 필드
		int num = 10;
		
		
//		static int snum = 30;    //허용이 안됨 
		
		//메소드 : 인스턴스 메소드, 정적 메소드
		void method1() {
			
		}
		
		//정적메소드
//		static void method2() {		//허용이 안됨
					
//				}
	}
	
	public static class StaticInnerClass {
		//필드 : 인스턴스 필드, 정적 필드
		int num = 10;
		//정적필드 : 객체의 생성없이 접근 가능(OuterClass.StaticInnerClass)
		static int snum = 30;    //허용이 됨 
		
		//메소드 : 인스턴스 메소드, 정적 메소드
		void method1() {
			
		}
		
		//정적메소드 : 객체의 생성없이 접근 가능
		static void method2() {		//허용이 됨
					
				}
	}
}
