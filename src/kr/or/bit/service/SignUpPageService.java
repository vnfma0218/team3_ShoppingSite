package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;

public class SignUpPageService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		if(session.getAttribute("memberId") != null) {
			forward.setRedirect(true);
			forward.setPath("mainPage.do");
		} else {
			forward.setRedirect(false);
			forward.setPath("SignUp.jsp");			
		}
		
		return forward;
	}

}
