<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/RegistSellerPage.css">
</head>
<body>
<div class="top_container">
	<jsp:include page="./common/Top.jsp"></jsp:include>
</div>
<div class="sideBar_content_container">
	<div class="sideBar_container">
		<jsp:include page="./common/MyPageMenu.jsp"></jsp:include>
	</div>
	<div class="sellerForm_container">
		 <form action="#">
        <div class="container">
          <h2>판매자등록</h2>
          
          <hr>
      
          <label for="email"><b>이메일</b></label>
          <input type="text" id="emailInput" placeholder="Enter Email" name="email"  required>
      
          <label for="psw"><b>계좌번호</b></label>
          <input type="text" id="accountInput" placeholder="Enter Password" name="accountNum" required>
      
          <label for="psw-repeat"><b>사업자번호</b></label>
          <input type="text" id="registNumInput" placeholder="Repeat Password" name="regisNum" required>
          
          <div class="clearfix" style="text-align:center">
            <button type="button" id="registSellerBtn" class="signupbtn">등록하기</button>
          </div>
        </div>
      </form>
	</div>
</div>
</body>
<jsp:include page="../js/registSellerPageJs.jsp"></jsp:include>
</html>