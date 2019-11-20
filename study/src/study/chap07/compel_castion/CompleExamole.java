package study.chap07.compel_castion;

public class CompleExamole {

	public static void main(String[] args) {
		Parent parent = new Child();		//자동타입변환
		parent.pf1 = 10;
		parent.pmethod1();
		parent.pmethod2();
//		parent.cf1;
//		parent.cmethod1();
		
		Child child = (Child)parent;		//강제타입변환
		child.cf1 = 20;
		child.cmethod1();
		
		Parent p2 = new Parent();
		p2 = parent;
		if(p2 instanceof Child) {			//instanceof->객체로 부터
			Child c2 = (Child) p2;
			c2.cf1 = 20;
			System.out.println("***");
		}
				
	}

}
