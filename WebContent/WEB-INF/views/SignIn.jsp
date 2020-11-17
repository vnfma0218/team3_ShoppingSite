<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">
 	
    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath() %>/assets/dist/css/bootstrap.min.css" rel="stylesheet">
     <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- <link rel="stylesheet" href="<%=request.getContextPath() %>/css/SignIn.css"> -->
     	
</head>
 <body class="text-center">
<jsp:include page="./common/Top.jsp"></jsp:include>
  <form class="form-signin" style="width: 30%; margin: 0 auto;">
  <a href="/team3_ShoppingSite/mainPage.do">
	  <img src="/team3_ShoppingSite/images/logo@3x.png" style="width: 150px; margin-bottom: 50px;">
  </a>
  <h1 class="h3 mb-3 font-weight-normal">Welcom</h1>
  <label for="inputEmail" class="sr-only">Email address</label>
  <input type="email" id="inputEmail" class="form-control" placeholder="아이디" required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="비밀번호" required>
  <div class="checkbox mb-3" id="signIngMsg">
  
  </div>
  
  <a class="btn btn-lg btn-primary btn-block" id="signBtn">로그인</a>
  <a class="btn btn-lg btn-primary btn-block" href="signUpPage.do">회원가입</a>
</form>
</body>
<jsp:include page="../js/signInJs.jsp"></jsp:include>
</html>