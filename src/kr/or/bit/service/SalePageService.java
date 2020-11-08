package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.model.dao.DAOSalePost;
import kr.or.bit.model.dto.DTOSalePost;

public class SalePageService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		
		int saleNum = Integer.parseInt(request.getParameter("pnum"));
		DTOSalePost salePost = DAOSalePost.getSalePostBySaleNum(saleNum);
		request.setAttribute("saleNum", saleNum);
		
		forward.setRedirect(false);
		forward.setPath("Sale.jsp");
		
		return forward;
	}

}
