package kr.or.bit.service_ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.ActionAjax;
import kr.or.bit.action.ActionAjaxData;
import kr.or.bit.model.dao.DAOSalePost;
import kr.or.bit.model.dto.DTOSalePost;


public class lee2_DeleteSaleService implements ActionAjax{

	@Override
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
		ActionAjaxData ajaxData = new ActionAjaxData();
		String saleNum = request.getParameter("saleNum");
		
		DTOSalePost salePost = DAOSalePost.getSalePostBySaleNum(Integer.parseInt(saleNum));
		if(salePost != null) {
			DAOSalePost.getSalePostDelete(Integer.parseInt(saleNum));
			ajaxData.setData("success");
		} else {
			ajaxData.setData("fail");
		}
		ajaxData.setContentType("text/plain");
		return ajaxData;
	}

}
