package kr.or.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.service.MainPageService;
import kr.or.bit.service.SignInPageService;
import kr.or.bit.service.SignOutService;
import kr.or.bit.service.SignUpPageService;
import kr.or.bit.service.SignUpService;

@WebServlet(
		name = "FrontController",
		urlPatterns = "*.do",
		loadOnStartup = 1
		)
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, Action> actionList = null;
       
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.print("*.do Servlet ->");
		actionList = new HashMap<String, Action>();
		
		actionList.put("/mainPage.do", new MainPageService());
		actionList.put("/signUpPage.do", new SignUpPageService());
		actionList.put("/signUp.do", new SignUpService());
		actionList.put("/signInPage.do", new SignInPageService());
		actionList.put("/signOut.do", new SignOutService());
		
		System.out.println(" initialized");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlCommand = (String)request.getAttribute("urlCommand");
		
		Action action = this.actionList.get(urlCommand);
		if(action != null) {
			ActionForward forward = action.execute(request, response);
			
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}
		} else {
			response.sendError(404);
		}
	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
