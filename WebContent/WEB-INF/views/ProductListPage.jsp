<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/team3_ShoppingSite/css/ProductList.css">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
</head>
<body>
<div class="top_container">
	<jsp:include page="./common/MyPageTop.jsp"></jsp:include>
</div>
<div class="sideBar_content_container">
	<div class="sideBar_container">
		<jsp:include page="./common/MyPageMenu.jsp"></jsp:include>
	</div>
	<div class=productList_container>
		 <div class="productList_title" style="margin-bottom: 70px;">
        	<h3>상품목록</h3>
         </div>
	<div class="pd_info_table">
	        <table>
	                <tr class="addProductBtn_table">
	                    <td>
	                        <div class="addProductBtn">
	                            <a href="/team3_ShoppingSite/seller/productAddPage.do">
	                            	 <button type="button" class="btn btn-primary">상품등록하기</button>
	                            </a>
	                        </div>
	                    </td>
	                    <td></td>
	                    <td></td>
	                    <td></td>
	                    <td></td>
	                </tr>
	           
	         </table>
	           <table class="table" style=width:90%;>
                <thead class="thead-dark">
                  <tr>
                    <th scope="col">상품명</th>
                    <th scope="col">가격</th>
                    <th scope="col">사이즈</th>
                    <th scope="col">재고</th>
                    <th scope="col">설명</th>
                  </tr>
                </thead>
                <tbody>
                    <c:set var="productList" value='<%= request.getAttribute("productList") %>'/>
                    <c:forEach var="product" items="${ productList }" varStatus="index">
                    <c:if test="${product != null}">
                          
                  <tr>
                    <th scope="row">${ product.pName }</th>
                    <td>${ product.pPrice }</td>
                    <td>${ product.pSize }</td>
                    <td>${ product.pAmount }</td>
                    <td>${ product.pDescription }</td>
                  </tr>
                </c:if> 
            </c:forEach>
                </tbody>
              </table>
	        </div>
	</div>
</div>
</body>
</html>