package board.model;

public class BoardBean {
	
	private int num;
	private String regdate;
	private int restep;
	private int relevel;
	private String writer;
	private String email;
	private String subject;
	private String passwd;
	private int readcount;
	private int ref;
	private String content;
	private String ip;
	
	public BoardBean() {
		super();
	}

	public BoardBean(int num, String regdate, int restep, int relevel, String writer, String email, String subject,
			String passwd, int readcount, int ref, String content, String ip) {
		super();
		this.num = num;
		this.regdate = regdate;
		this.restep = restep;
		this.relevel = relevel;
		this.writer = writer;
		this.email = email;
		this.subject = subject;
		this.passwd = passwd;
		this.readcount = readcount;
		this.ref = ref;
		this.content = content;
		this.ip = ip;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getRestep() {
		return restep;
	}

	public void setRestep(int restep) {
		this.restep = restep;
	}

	public int getRelevel() {
		return relevel;
	}

	public void setRelevel(int relevel) {
		this.relevel = relevel;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
