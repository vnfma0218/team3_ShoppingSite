package kr.or.bit.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.Action.Action;
import kr.or.bit.Action.ActionForward;
import kr.or.bit.model.DAO.PurchaseDAO;
import kr.or.bit.model.DTO.PurchaseDTO;


public class Purchase implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception {
		ActionForward forward = new ActionForward();
	    PurchaseDAO purchaseDAO = new PurchaseDAO();
	    PurchaseDTO purchaseDTO = new PurchaseDTO();
	     
	    String PurchaseMsg ="";
	    boolean result=true;
	      
	    try {
	    	purchaseDTO.setoNum(request.getParameter("Onum"));
	    	purchaseDTO.setId(request.getParameter("Id"));
	    	purchaseDTO.setpNum(request.getParameter("Pnum"));
	    	purchaseDTO.setoAmount(request.getParameter("Amount"));
	    	purchaseDTO.setoCreatedAt(request.getParameter("CreateAt"));
	    	
		} catch (Exception e) {
			System.out.println("Serivec : Purchase error "+e.getMessage());
			result = false;
		} finally {
			//주문성공
			if(result) {
				purchaseDAO.purchase(purchaseDTO); //입력받은 값을 DTO에 저장 -> DAO 넘겨주기 -> DB에 저장
	            forward.setRedirect(false);
				forward.setPath("WEB-INF/views/purchasedPage"); //구매내역페이지
				//주문실패
			}else {
				request.setAttribute("PurchaseMsg", PurchaseMsg);
			}
			
		}
	      
		return forward;
	}

}
