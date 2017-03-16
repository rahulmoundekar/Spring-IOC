package techno;

public class WelcomeBean {

	public WelcomeBean() {
		
	}
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void show()
	{
		System.out.println("Show Method ==== "+message);
	}
	
	
}
