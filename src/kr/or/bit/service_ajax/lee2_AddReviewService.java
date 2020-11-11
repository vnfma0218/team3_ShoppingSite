package kr.or.bit.service_ajax;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.JsonObject;

import kr.or.bit.action.ActionAjax;
import kr.or.bit.action.ActionAjaxData;
import kr.or.bit.model.dao.lee2_DAOReview;
import kr.or.bit.model.dto.DTOReview;


public class lee2_AddReviewService implements ActionAjax {

	@Override
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
		ActionAjaxData ajaxData = new ActionAjaxData();
		int resultRow = 0;
//		json
//		{salePostnum:num
//		stars:num,
//		content:string
//		}
		JsonObject jsonBody = (JsonObject)request.getAttribute("jsonBody");
		String salePostnum = jsonBody.get("salePostnum").getAsString();
		String content = jsonBody.get("content").getAsString();
		int stars = jsonBody.get("stars").getAsInt();
		
		
		HttpSession session = request.getSession();
		DTOReview reivew = new DTOReview(Integer.parseInt(salePostnum), session.getId(), content, stars);
		resultRow=lee2_DAOReview.insertReview(reivew);
		
		
		if(resultRow == 1) ajaxData.setData("success");
		else ajaxData.setData("fail");
		
		ajaxData.setContentType("text/plain");
		
		return ajaxData;
	}

}
