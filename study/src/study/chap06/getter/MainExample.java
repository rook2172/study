package study.chap06.getter;

public class MainExample {

	public static void main(String[] args) {
//		Member member = new Member("hong", "ȫ�浿", "1234","1111", "hong@naver.com");
//		Member lee = new Member();
//		lee.setId("lee");
//		lee.setName("�̼���");
//		lee.setPw("1234");
//		lee.setPhone("1111");
//		lee.setEmail("lee@gmail.com");
//		System.out.println("���̵�: "+ member.getId());
//		System.out.println("�̸�: "+ member.getName());
//		System.out.println("��й�ȣ: "+ member.getPw());
//		System.out.println("��ȭ��ȣ: "+ member.getPhone());
//		System.out.println("�̸���: "+ member.getEmail());
		
		//�Ű�������
		int sum = add(10,20,30,40,50,60);
		System.out.println("��: "+sum);
		sum = add(10,20);
		System.out.println("��: "+sum);
		sum = add(10,20,30);
		System.out.println("��: "+sum);

	}

	private static int add(int ...data) {		//�Ű������� �������� ���� �� ���
		// data : �迭
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum += data[i];
		}
		return sum;		
	}

}
