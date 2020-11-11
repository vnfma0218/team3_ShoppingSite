package kr.or.bit.service_ajax;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("/upload");
		System.out.println(path);
		int size = 1024*1024*10;
		try {
			Part file = request.getPart("file");
			String contentType = file.getContentType();
			System.out.println(contentType);
			MultipartRequest multiReq = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
		
		return ajaxData;
	}

}
