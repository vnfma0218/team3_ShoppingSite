package kr.or.bit.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ActionAjax {
	public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response);
}
