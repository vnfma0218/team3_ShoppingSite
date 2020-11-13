<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--index--%>
<%--<input type="button" id="sendAjax" value="send ajax">--%>
<div id="pageContainer">
    <h3>UI(CSS 공통페이지 적용확인)</h3>
    <h3>DB연결 검증작업</h3>
    <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Context context = new InitialContext();
        DataSource datasource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
        conn = datasource.getConnection();
        out.print("DB연결 여부 :"  + conn.isClosed() +"<br>");
        conn.close();
        out.print("DB연결 여부 : " + conn.isClosed() +"<br>");

    %>

</div>
</body>
<script>
document.getElementById('sendAjax').addEventListener('click', async e => {
	console.log('click')
	const jsonData = { id: 'jack', pwd: '1234' }
//	const jsonData = { products: [{id: 'jack'}, {id: 'jack2'}] }
//	const jsonData = [{pNum:2, pName:'하양모자', pAmount: 3, pPrice:50000, pSize:'F', saleNum:100, saleTitle:'모자, 셔츠, 바지 팝니다.', imageAddr:'test address1'},
//						{pNum:3, pName:'검은셔츠', pAmount: 2, pPrice:50000, pSize:'F', saleNum:100, saleTitle:'모자, 셔츠, 바지 팝니다.', imageAddr:'test address2'}]
	const data = JSON.stringify(jsonData);
//	const data = 'id=jack';
	const res = await fetch('modify.ajax', {
	    method: 'POST',
	    headers: {
	      'Content-Type': 'application/json'
//	      'Content-Type': 'text/parameters'
	    },
	    redirect: 'follow',
	    referrerPolicy: 'no-referrer',
	    body: data
	  });
	console.log(res.status)
});
</script>
</html>