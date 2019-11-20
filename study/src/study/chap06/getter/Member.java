package study.chap06.getter;

public class Member {
	private boolean gender;
	private String id;
	private String name;
	private String pw;
	private String phone;
	private String email;
	
	public Member() {}

	//생성자
	public Member(String id, String name, String pw, String phone, String email, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		
	}

	//Getter, Setter
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String setId(String id) {		//영문과 숫자의 조합으로 7자 이상
		if(id.length()<7)
			System.out.println("7자 이상 입력 하세요.");
		else if(id.isEmpty())
			System.out.println("이메일을 입력 하세요.");
		//정규표현식을 사용해서 파라미터가 규칙대로 입력되었는지 확인
		this.id = id;
	}

	public void getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
