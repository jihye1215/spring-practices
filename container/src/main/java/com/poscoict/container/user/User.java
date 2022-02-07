package com.poscoict.container.user;

public class User {
	private long no = 0L;
	private String name = "김지혜";
	private Friend friend = null;
	
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void setNo(long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + "]";
	}
}
