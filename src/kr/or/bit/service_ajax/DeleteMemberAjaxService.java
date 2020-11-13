package kr.or.bit.service_ajax;

import kr.or.bit.action.ActionAjax;
import kr.or.bit.action.ActionAjaxData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteMemberAjaxService implements ActionAjax {

    @Override
    public ActionAjaxData execute(HttpServletRequest request, HttpServletResponse response) {
        ActionAjaxData ajaxData = new ActionAjaxData();
//        HttpSession session = new HttpSession();
        return null;
    }
}
