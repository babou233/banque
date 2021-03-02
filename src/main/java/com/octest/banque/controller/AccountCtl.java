package com.octest.banque.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/AccountCtl")
public class AccountCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AccountCtl() {
        super();
        
    }

	
	// demande  de lire une page par un utilisateur 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TO DO
	}

	//l'utilisateur renvoie les données des formulaires (il poste des informations)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//TO DO
		
	}

}
