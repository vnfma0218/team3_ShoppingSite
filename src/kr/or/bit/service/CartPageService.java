package kr.or.bit.service;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;

public class CartPageService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		
		System.out.println("CartPageService");
		JsonObject body = (JsonObject)request.getAttribute("jsonBody");
		JsonArray products =  body.get("products").getAsJsonArray();
		
		Iterator<JsonElement> iter = products.iterator();
		while(iter.hasNext()) {
//			int productNum = iter.next().getAsInt();
			JsonObject aa = iter.next().getAsJsonObject();
			System.out.println(aa.get("id").getAsString());
		}
		
		
		forward.setRedirect(false);
		forward.setPath("Cart.jsp");
		
		return forward;
	}

}
