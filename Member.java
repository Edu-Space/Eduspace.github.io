public class Member {
	private String name;
	private String email;
	private String mobile;
	private String passout;
	public Member(String name, String email, String mobile, String passout) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.passout = passout;
	}
	public Member() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassout() {
		return passout;
	}
	public void setPassout(String passout) {
		this.passout = passout;
	}
}