package study.chap07.field_polymorphism;

public class HanKookTire extends Tire {
	//������ : default ������ -> �θ��� �����ڸ� ȣ��
	public HanKookTire(String locatinon, int maxRotation) {
		super(locatinon, maxRotation);
	}
	
	
	//�ڽİ�ü���� �θ��� �޼ҵ带 ������
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HanKookTire ����: "+ (maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+ location +"HanKookTire ��ũ***");
			return false;
		}
	}
	
	

}
