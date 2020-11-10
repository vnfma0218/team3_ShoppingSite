package kr.or.bit.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.model.dao.DAOPurchase;
import kr.or.bit.model.dto.DTOPurchase;

public class PurchasedPageService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		
		String id = (String)request.getSession().getAttribute("memberId");
		List<DTOPurchase> purchaseList = DAOPurchase.getPurchaseListByMemberId(id);
		request.setAttribute("purchaseList", purchaseList);
		
		forward.setRedirect(false);
		forward.setPath("Purchased.jsp");
		
		return forward;
	}

}
