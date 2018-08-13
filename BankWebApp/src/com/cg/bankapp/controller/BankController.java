package com.cg.bankapp.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bankapp.service.BankAccountService;
import com.cg.bankapp.pojo.BankAccount;

@WebServlet("*.app")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private BankAccountService service = new BankAccountService();
    
    private BankAccount with;
   
    public BankController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getServletPath();
		switch(action) {
		case "/withdraw.app":
			  
			Collection <BankAccount> accounts = service.viewBankAccount();
		    //request.setAttribute("account", accounts );
			int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
			System.out.println(accountNumber);
			double withdrawAmount=Double.parseDouble(request.getParameter("withdrawAmount"));
			
			for(BankAccount account1 : accounts) {
				if(account1.getAccountNumber()==accountNumber) {
					double balance = service.withdraw(withdrawAmount,accountNumber);
					request.setAttribute("bal", balance);
					RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessWithdrawal.jsp");
					
					dispatcher.forward(request, response);
				}
				else {
					response.sendRedirect("error.jsp");
				}
			}
			break;
		
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
