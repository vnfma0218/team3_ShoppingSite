<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://cdn.ckeditor.com/ckeditor5/23.1.0/classic/ckeditor.js"></script>
<style>

	input[type=text], input[type=password], select {
        width: 100%;
        padding: 15px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #ddd;
    }
    
    .productList label{
    	font-size: large;
    	padding: 10px;
    }
    
    .productList input{
    	margin: 10px;
    }
	.editContent {
		width: 80%;
		margin: 0 auto;
	}
	
	.ck-content {
		height: 500px;
		overflow: scroll;
	}
	/*.editorContainer{
		width: 50%;
	}*/
	table{
		width: 100%;
	}
	
	.image_container {
		width: 100%;
		height: 100%;
		display: grid;
		grid-template-columns: repeat(5, 1fr);
		grid-template-rows: repeat(2, 1fr);
	}
	
	image_container img{
		height: 254px;
	}
	
	.image_file{
		width: 100%;
		height: 100%;
	}
	.productList{
		margin-bottom: 50px;
	}
	
	.productList h4{
		font-weight: bold;
	}
	.editorContainer{
		margin-top: 10px;
	}
	
	@media screen and (max-width: 768px) {
		.image_container {
			width: 100%;
			display: grid;
			grid-template-columns: repeat(2, 1fr);
			grid-template-rows: repeat(5, 1fr);
		}
	}
	
</style>
</head>
<body>
<jsp:include page="./common/Top.jsp"></jsp:include>
<div class="editContent">
	 <h1>판매글등록</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <div><label for="pNameInput"><b>제목</b></label></div>
    <input type="text" id="titleInput">
 	<div><label for="categoryInput"><b>카테고리</b></label></div>
           <select id="categoryInput">
            <option value="30">TOP</option>
			<option value="31">PANTS</option>
			<option value="32">OUTER</option>
			<option value="33">ETC</option>
           </select>
           
	<c:set var="productList" value='<%= request.getAttribute("productList") %>'/>
	<div class="productList">
		<div><h4>판매할 상품</h4></div>
		<c:forEach var="product" items="${ productList }" varStatus="index">
		<c:if test="${product != null}">
			<label>
				<input type="checkbox" name="product" value="${ product.pNum }">${ product.pName }
			</label>
		</c:if> 
	</c:forEach>
	</div>
	
	<button id="writeSale" type="button" class="btn btn-info">작성완료</button>
	<div class="editorContainer">
		<div id="editor" class="_editor"></div>	
	</div>
	<input type="file" id="uploadFile" name="filename1" multiple/>
	<div class="image_container">
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>메인 이미지</p>
				</div>
				<!--  <img class="uploadImage" src="../images/400.jpg" style="width:100%" draggable="true"> -->
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>2번째 이미지</p>
				</div>
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>3번째 이미지</p>
				</div>
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>4번째 이미지</p>
				</div>
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>5번째 이미지</p>
				</div>
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>6번째 이미지</p>
				</div>
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>7번째 이미지</p>
				</div>
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>8번째 이미지</p>
				</div>
				
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>9번째 이미지</p>
				</div>
				
			</div>
		</div>
		<div class="col-md-4 image_file">
			<div class="thumbnail">
				<div class="caption">
					<p>10번째 이미지</p>
				</div>
				
			</div>
		</div>
	</div>
	<!-- 
	</div>
	 -->

	<!-- 
		<table border="1">
			<tr>
				<td>1</td><td>2</td><td>3</td><td>4</td><td>5</td>
			</tr>
			<tr>
				<td></td><td></td><td></td><td></td><td></td>
			</tr>
			<tr>
				<td>6</td><td>7</td><td>8</td><td>9</td><td>10</td>
			</tr>
			<tr>
				<td></td><td></td><td></td><td></td><td></td>
			</tr>
		</table>
	 -->
</div>
</body>
<jsp:include page="../js/writeSaleJs.jsp"></jsp:include>
</html>