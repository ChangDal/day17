package day13_this_setget;

public class Quiz_Login {
	private String userId,userPw;
	public int compare(String userId,String userPw){
		if(getUserId() != null  && this.userPw != null)
			if(this.userId.equals(userId) && getUserPw().equals(userPw)) return 0;
			else return 1;
		return 1;
	}
	public boolean out(){	return false;	}
	public String getUserId() {	return userId;	}
	public void setUserId(String userId) {	this.userId = userId;	}
	public String getUserPw() {	return userPw;	}
	public void setUserPw(String userPw) {	this.userPw = userPw; }
}
