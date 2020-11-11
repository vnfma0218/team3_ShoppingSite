package kr.or.bit.service_ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.ActionAjax;
import kr.or.bit.action.ActionAjaxData;

public class WriteSaleAjaxService implements ActionAjax {

	@Override
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
		ActionAjaxData ajaxData = new ActionAjaxData();
//		{category:string,
//			title:string,
//			content:string,
//			image:file
//			pNums:[num]
//			}
		
		
		return ajaxData;
	}

}
