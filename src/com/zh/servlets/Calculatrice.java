package com.zh.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zh.beans.Calcul;

@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Calculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calcul calcul = new Calcul();
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		String type = request.getParameter("type");
		
		System.out.println("Test fetch !");
		
		
		if(first != "" && second != ""){
			calcul.setFirst(Integer.parseInt(first));
			calcul.setSecond(Integer.parseInt(second));
			calcul.setType(Integer.parseInt(type));
			calcul.calculate();
		}else {
			request.setAttribute("errorMsg", "Un ou plusieur paramètres sont vide !");
		}
	
		request.setAttribute("calcul", calcul); 
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

}
