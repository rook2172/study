package study.chap09.instance_meber_class;

public class MainExamole {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		//InnerClass : 인스턴스 멤버 클래스 (객체 생성 후 사용 가능)
		OuterClass.InnerClass instanceClass = new OuterClass.InnerClass();
		instanceClass = outer.new InnerClass();		//인스턴스 멤버 클래스 생성
		instanceClass.num = 10;
		instanceClass.method1();
		
		//정적 클래스
		OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
		staticClass.num = 20;		//객체에 한개마다 존재
//		staticClass.snum = 3;		
		OuterClass.StaticInnerClass.snum = 30;	//객체 한개마다 존재 하지 않는다.--한개만 존재(공용사용)
		staticClass.method1();
		OuterClass.StaticInnerClass.method2();
//		OuterClass.StaticInnerClass.num = 30;		//인스턴스 필드는 클래스 이름으로 접근 불가
		
	}

}
