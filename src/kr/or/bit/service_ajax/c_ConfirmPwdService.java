package kr.or.bit.service_ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

import kr.or.bit.action.ActionAjax;
import kr.or.bit.action.ActionAjaxData;
import kr.or.bit.model.dao.DAOMember;
import kr.or.bit.model.dto.DTOMember;
import kr.or.bit.utils.c_SHAUtil;
import kr.or.bit.utils.c_Salt;

public class c_ConfirmPwdService implements ActionAjax {

	@Override
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
		ActionAjaxData ajaxData = new ActionAjaxData();
		c_SHAUtil sga = new c_SHAUtil();
		c_Salt salt = new c_Salt();
		String s = salt.readSalt("key.txt");
		
		JsonObject body = (JsonObject)request.getAttribute("jsonBody");
		String id = body.get("id").getAsString();//id받아와야하나?
		String pwd = body.get("pwd").getAsString();

		DTOMember member = DAOMember.getMemberById(id);
		if(sga.getSha512(s+pwd) == member.getPwd()) {
			ajaxData.setData("success");
		} else {
			ajaxData.setData("fail");
		}
		ajaxData.setContentType("text/plain");
		
		return ajaxData;
	}

}
