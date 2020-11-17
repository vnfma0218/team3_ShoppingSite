<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>In</title>
<link rel="stylesheet" href="/team3_ShoppingSite/css/ProductAdd.css">
</head>
<body>

<div class="top_container">
	<jsp:include page="./common/MyPageTop.jsp"></jsp:include>
</div>
<div class="sideBar_content_container">
	<div class="sideBar_container">
		<jsp:include page="./common/MyPageMenu.jsp"></jsp:include>
	</div>
	<div class="addProduct_container">
           <h3>회원정보수정</h3>
           <p>Please fill in this form to create an Product.</p>
           <hr>
       
           <div><label for="pNameInput"><b>아이디</b></label></div>
           <input type="text" id="idInput">
       
           <div><label for="pPriceInput"><b>패스워드</b></label></div>
           <input type="text" id="pwdInput" onkeypress="inNumber()">
       
           <div><label for="psw"><b>이름</b></label></div>
           <input type="text" id="nameInput" onkeypress="inNumber()">
         
           <div><label for="pDescInput"><b>핸드폰번호</b></label></div>
           <input type="text" id="hpInput">
           
          
           <div><label for="pDescInput"><b>주소</b></label></div>
           <input type="text" id="addressInput">
           
           <div><label for="pDescInput"><b>카드번호</b></label></div>
           <input type="text" id="cardNumInput">
           
           <div class="clearfix">
             <button id="editBtn" type="submit" class="addPdBtn">수정</button>
           </div>
       </div>
       
</div>
</body>
<jsp:include page="../js/productAddJs.jsp"></jsp:include>
</html>