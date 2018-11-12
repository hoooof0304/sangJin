package java_181109;

public class Test3 {

	private String id = "icia";
	private String pw = "1234";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void login(String id, String pw) {
		if (this.id.equals(id)) {
			if (this.pw.equals(pw)) {
				System.out.println(id + "님 로그인 되었습니다");
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다");
			}
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
	}

	public void logout() {
		System.out.println(id + "님 로그아웃 되었습니다");
	}

}
