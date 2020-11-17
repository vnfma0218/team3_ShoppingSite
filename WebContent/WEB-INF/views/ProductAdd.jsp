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
           <h3>상품등록</h3>
           <p>Please fill in this form to create an Product.</p>
           <hr>
       
           <div><label for="pNameInput"><b>상품명</b></label></div>
           <input type="text" id="pNameInput">
       
           <div><label for="pPriceInput"><b>가격</b></label></div>
           <input type="text" id="pPriceInput" onkeypress="inNumber()">
       
           <div><label for="pSizeInput"><b>사이즈</b></label></div>
           <select id="pSizeInput">
               <option value="F">F</option>
               <option value="S">S</option>
               <option value="M">M</option>
               <option value="L">L</option>
           </select>

           <div><label for="psw"><b>수량</b></label></div>
           <input type="text" id="pAmountInput" onkeypress="inNumber()">
         
           <div><label for="pDescInput"><b>상품설명</b></label></div>
           <input type="text" id="pDescInput">
           
           <div class="clearfix">
             <button id="addProductBtn" type="submit" class="addPdBtn">상품등록</button>
           </div>
       </div>
       
</div>
</body>
<jsp:include page="../js/productAddJs.jsp"></jsp:include>
</html>