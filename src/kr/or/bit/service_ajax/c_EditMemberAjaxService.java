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

public class c_EditMemberAjaxService implements ActionAjax {

	@Override
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
		ActionAjaxData ajaxData = new ActionAjaxData();
		c_SHAUtil sha = new c_SHAUtil();
		c_Salt salt = new c_Salt();
		String s =salt.readSalt("key.txt");
//		{
//			pwd:string,
//			}
		JsonObject jsonBody = (JsonObject)request.getAttribute("jsonBody");
		String pwd =sha.getSha512(s+jsonBody.get("pwd").getAsString());
		System.out.println(pwd);
		String hp = jsonBody.get("hp").getAsString();
		
		String cardNum = jsonBody.get("card").getAsString();
		String address = jsonBody.get("address").getAsString();
		String id = (String)request.getAttribute("memberId");
		DTOMember member = new DTOMember(id, pwd, hp, cardNum, address);
		int resultRow = DAOMember.c_updateMember(member);
		
		if(resultRow == 1) ajaxData.setData("success");
		else ajaxData.setData("fail");
		
		ajaxData.setContentType("text/plain");
		
		return ajaxData;
	}

}
