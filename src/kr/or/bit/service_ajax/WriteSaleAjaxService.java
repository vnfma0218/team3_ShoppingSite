package kr.or.bit.service_ajax;

import java.io.IOException;
import java.util.Enumeration;

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
//		{categoryNum:num,
//			title:string,
//			content:string,
//			image:file
//			pNums:[num]
//			}
		
//		INSERT INTO table (column1, column2)
//		SELECT value1, value2 FROM DUAL UNION ALL
//		SELECT value1, value2 FROM DUAL UNION ALL
//		...etc...
//		SELECT value1, value2 FROM DUAL;
		
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("/upload");
		System.out.println(path);
		int size = 1024*1024*10;
		try {
			MultipartRequest multiReq = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
			int categoryNum = Integer.parseInt(multiReq.getParameter("categoryNum"));
			String title = multiReq.getParameter("title");
			String content = multiReq.getParameter("content");
			String[] pNumsStr = multiReq.getParameter("pNums").split(",");
			int[] pNums = new int[pNumsStr.length];
			for(int i = 0; i < pNumsStr.length; i++) {
				pNums[i] = Integer.parseInt(pNumsStr[i]);
			}
			
			Enumeration<String> fileNames = multiReq.getFileNames();
			while(fileNames.hasMoreElements()) {
				String dd = fileNames.nextElement();
				System.out.println(dd);
				System.out.println(multiReq.getOriginalFileName(dd));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		catch (ServletException e) {
//			e.printStackTrace();
//		}
		
		
		return ajaxData;
	}

}
