<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/MyPage.css">
</head>
<body>
<jsp:include page="./common/Top.jsp"></jsp:include>
    <div class="main-title">
        <h1>마이페이지</h1>
    </div>
    <div class="mypage-menu">
        <div class="container-sm">
            <div class="row">
                <div class="col-sm border-right">회원정보</div>
                <div class="col-sm border-right">판매자등록</div>
                <div class="col-sm border-right">문의글관리</div>
                <div class="col-sm border-right">리뷰관리</div>
                <div class="col-sm">회원탈퇴</div>
            </div>
        </div>
    </div>
    
	<div class="container">

		<div>아이디</div>
		<input type="text" readonly value="jack123">
		
		<div>
			<div id="pwdToggleBtn" class="btn" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false">
				비밀번호 수정
			</div>
		</div>
		<div class="collapse" id="collapseExample">
			<input type="password" placeholder="Enter Password" id="pwdInput" required>
			<div id="pwdCheckOk"></div>
			
			<div>비밀번호 확인</div>
			<input type="password" placeholder="Confirm Password" id="pwdConfirm"required>
		</div>
		
		<div>이름</div>
		<input type="text" placeholder="Name" name="name" required>
		
		<div>핸드폰 번호</div>
		<input type="text" placeholder="PhoneNumber" name="hp" required>
		
		<div>카드번호</div>
		<input type=text placeholder="카드번호 16자리" name="cardNum" required>
		
		<div>주소</div>
		<input type="text" placeholder="Address" name="address" required>
		
		<div class="clearfix">
			<button class="editProfieBtn" id="editProfieBtn">
				회원정보 수정
			</button>
		</div>
		<input type="hidden" name="pwd" id="pwd" value="">
	</div>
    
</body>
<jsp:include page="../js/myPageJs.jsp"></jsp:include>
</html>