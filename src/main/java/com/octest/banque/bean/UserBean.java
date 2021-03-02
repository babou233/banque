package com.octest.banque.bean;




public class UserBean {
    //login et mot de passe d'un client
	private String login;
	private String password;
	private String confirmPassword;
	//une instance de client
	private CustomerBean customer;
	
	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}

	
	public String getLogin() {
		return login;
	}

	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
	
}
