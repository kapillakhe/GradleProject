package gradle;

public class UserStory {

	private User user;
	private String actionDesired = "";
	private String outcomeDesired = "";
	
	public UserStory() {
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getActionDesired() {
		return actionDesired;
	}
	public void setActionDesired(String actionDesired) {
		this.actionDesired = actionDesired;
	}
	public String getOutcomeDesired() {
		return outcomeDesired;
	}
	public void setOutcomeDesired(String outcomeDesired) {
		this.outcomeDesired = outcomeDesired;
	}

}
