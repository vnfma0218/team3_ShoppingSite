package kr.or.bit.service_ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.JsonObject;

import kr.or.bit.action.ActionAjax;
import kr.or.bit.action.ActionAjaxData;
import kr.or.bit.model.dao.DAOMember;
import kr.or.bit.model.dao.DAOSeller;
import kr.or.bit.model.dto.DTOMember;
import kr.or.bit.model.dto.DTOSeller;

public class SignInAjaxService implements ActionAjax {

	@Override
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
		ActionAjaxData ajaxData = new ActionAjaxData();

		JsonObject body = (JsonObject)request.getAttribute("jsonBody");
		String id = body.get("id").getAsString();
		String pwd = body.get("pwd").getAsString();

		DTOMember member = DAOMember.getMemberById(id);
		if(member == null || !pwd.equals(member.getPwd())) {
			ajaxData.setData("fail");
		} else {
			HttpSession session = request.getSession();
            session.setAttribute("memberId", member.getId());
            
            if(member.getSelFlag().equals("Y")) { // seller인 경우
            	DTOSeller seller = DAOSeller.ryu_getSellerById(id);
            	session.setAttribute("sellerNum", seller.getSelNum());            	
            }
            
            session.setMaxInactiveInterval(15 * 60);
            ajaxData.setData("success");
		}
		ajaxData.setContentType("text/plain");

		return ajaxData;
	}

}
