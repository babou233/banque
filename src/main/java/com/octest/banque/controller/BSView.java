package com.octest.banque.controller;

public interface BSView {
	
	public String APP_CONTEXT = "/Banking-System";

	public String LAYOUT_VIEW = "/BaseLayout.jsp";
	public String PAGE_FOLDER = "/jsp";

	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String ERROR_VIEW = PAGE_FOLDER + "/Error.jsp";

	
	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";	
	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	
	public String CUSTOMER_VIEW = PAGE_FOLDER + "/CustomerView.jsp";	
	public String CUSTOMER_LIST_VIEW = PAGE_FOLDER + "/CustomerListView.jsp";
	
	public String RECEIPT_VIEW = PAGE_FOLDER + "/ReceiptView.jsp";
	
	public String ACCOUNT_VIEW = PAGE_FOLDER + "/AccountView.jsp";	
	public String ACCOUNT_LIST_VIEW = PAGE_FOLDER + "/AccountListView.jsp";
	
	public String TRANSACATION_VIEW = PAGE_FOLDER + "/TransactionView.jsp";	
	public String TRANSACTION_LIST_VIEW = PAGE_FOLDER + "/TransactionListView.jsp";
	
	public String ADMIN_TRANSACATION_VIEW = PAGE_FOLDER + "/AdminTransactionView.jsp";	
	public String ADMIN_TRANSACTION_LIST_VIEW = PAGE_FOLDER + "/AdminTransactionListView.jsp";
	
	public String BENEFICIARY_VIEW = PAGE_FOLDER + "/BeneficiaryView.jsp";	
	public String BENEFICIARY_LIST_VIEW = PAGE_FOLDER + "/BeneficiaryListView.jsp";
	
	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public String WELCOME_VIEW = PAGE_FOLDER + "/Welcome.jsp";
	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";

	public String ERROR_CTL = "/ctl/ErrorCtl";
	public String USER_CTL = APP_CONTEXT + "/ctl/UserCtl";
	public String USER_LIST_CTL = APP_CONTEXT + "/ctl/UserListCtl";
	 
	public String CUSTOMER_CTL = APP_CONTEXT + "/ctl/CustomerCtl";
	public String CUSTOMER_LIST_CTL = APP_CONTEXT + "/ctl/CustomerListCtl";
	
	public String ACCOUNT_CTL = APP_CONTEXT + "/ctl/AccountCtl";
	public String ACCOUNT_LIST_CTL = APP_CONTEXT + "/ctl/AccountListCtl";
	
	public String TRANSACTION_CTL = APP_CONTEXT + "/ctl/TransactionCtl";
	public String TRANSACTION_LIST_CTL = APP_CONTEXT + "/ctl/TransactionListCtl";
	
	public String ADMIN_TRANSACTION_CTL = APP_CONTEXT + "/ctl/AdminTransactionCtl";
	public String ADMIN_TRANSACTION_LIST_CTL = APP_CONTEXT + "/ctl/AdminTransactionListCtl";
	
	public String BENEFICIARY_CTL = APP_CONTEXT + "/ctl/BeneficiaryCtl";
	public String BENEFICIARY_LIST_CTL = APP_CONTEXT + "/ctl/BeneficiaryListCtl";
	
	
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";
	public String LOGOUT_CTL = APP_CONTEXT + "/LoginCtl";
	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";



}
