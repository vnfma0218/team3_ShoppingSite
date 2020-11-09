package kr.or.bit.Controller;

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

import kr.or.bit.Action.Action;
import kr.or.bit.Action.ActionForward;



@WebServlet(
      name = "FrontController",
      urlPatterns = "*.do",
      loadOnStartup = 1
      )
public class FrontContorller extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   private HashMap<String, Action> actionList = null;
       
    public FrontContorller() {
        super();
        // TODO Auto-generated constructor stub
    }

   public void init(ServletConfig config) throws ServletException {
      System.out.print("*.do Servlet ->");
      actionList = new HashMap<String, Action>();
      
      actionList.put("/mainPage.do", new MainPageService()); //메인페이지
      actionList.put("/signUpPage.do", new SignUpPageService()); //회원가입페이지
      actionList.put("/signUp.do", new SignUpService()); // 회원가입 기능
      actionList.put("/signInPage.do", new SignInPageService()); //로그인페이지
      actionList.put("/signOut.do", new SignOutService());//로그인 기능
      actionList.put("/category.do", new CategoryPageService()); //카테고리 페이지
      actionList.put("/salePage.do", new SalePageService()); // 판매자 페이지
      actionList.put("/cart.do", new CartPageService()); // 장바구니 페이지
      actionList.put("/purchasePage.do", new PurchasePageService()); //구매페이지
      
      System.out.println(" initialized");
   }

   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String urlCommand = (String)request.getAttribute("urlCommand");
      
      Action action = this.actionList.get(urlCommand);
      
      try {
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
      } catch (Exception e) {

	  } finally {
		
	  }
      
   }

//   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      // TODO Auto-generated method stub
//      response.getWriter().append("Served at: ").append(request.getContextPath());
//   }
//
//   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      // TODO Auto-generated method stub
//      doGet(request, response);
//   }

}