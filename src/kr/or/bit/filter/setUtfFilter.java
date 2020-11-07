package kr.or.bit.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class setUtfFilter
 */
//@WebFilter("/*")
public class setUtfFilter implements Filter {

    public setUtfFilter() {
        // TODO Auto-generated constructor stub
    }

    public void init(FilterConfig fConfig) throws ServletException {
    	// TODO Auto-generated method stub
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest)request;
		httpReq.setCharacterEncoding("UTF-8");
		String requestURI = httpReq.getRequestURI();
    	String contextPath = httpReq.getContextPath();
    	String urlCommand = requestURI.substring(contextPath.length());
    	httpReq.setAttribute("urlCommand", urlCommand);
    	System.out.println(httpReq.getMethod() + " " + urlCommand);
		chain.doFilter(request, response);
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
