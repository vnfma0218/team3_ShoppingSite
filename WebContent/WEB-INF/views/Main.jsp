<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/Main.css">
</head>
<body>
  <!-- 배너 -->
    <div class="banner">
        <img src="<%=request.getContextPath() %>/images/bannerImage_199507_1602477265.jpg" alt="배너이미지">
    </div>

    <!-- topnav -->
    <div class="topnav-container">
        <div class="logo">
            <a href=""><img src="<%=request.getContextPath() %>/images/logo@3x.png"></a>
        </div>
        <!-- <form class="form" action="">
            <div class="searchBar">
                <input type="text" placeholder="search">
                <button type="submit"><i class="fa fa-search"></i></button>
            </div>
        </form> -->
        <!-- <div class="topnav-menus">
            <ul class="menus">
                <li class="menu-item"><a href="#"><p>로그인</p></a></li>
                <li class="menu-item"><a href="#"><p>마이페이지</p></a></li>
                <li class="menu-item"><a href="#"><p>장바구니</p></a></li>
                <li class="menu-item"><a href="#"><p>고객센터</p></a></li>
                <li class="menu-item"><a href="#"><p>찜</p></a></li>
            </ul>
        </div> -->
    </div>

    <!-- 슬라이드쇼 -->
   <!-- Slideshow container -->
<div class="slideshow-container">

    <!-- Full-width images with number and caption text -->
    <div class="mySlides fade">
      <div class="numbertext">1 / 3</div>
      <img src="<%=request.getContextPath() %>/images/img_mountains_wide.jpg" style="width:100%">
      <div class="text">Caption Text</div>
    </div>
  
    <div class="mySlides fade">
      <div class="numbertext">2 / 3</div>
      <img src="<%=request.getContextPath() %>/images/img_nature_wide.jpg" style="width:100%">
      <div class="text">Caption Two</div>
    </div>
  
    <div class="mySlides fade">
      <div class="numbertext">3 / 3</div>
      <img src="<%=request.getContextPath() %>/images/img_snow_wide.jpg" style="width:100%">
      <div class="text">Caption Three</div>
    </div>
  
    <!-- Next and previous buttons -->
    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
    <a class="next" onclick="plusSlides(1)">&#10095;</a>
  </div>
  <br>
  
  <!-- The dots/circles -->
  <div style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span>
    <span class="dot" onclick="currentSlide(2)"></span>
    <span class="dot" onclick="currentSlide(3)"></span>
  </div>

    <!-- category menu -->

    <div class="category-container">
        <ul class="category-menu">
            <li class="category-menu-item">홈</li>
            <li class="category-menu-item">상의</li>
            <li class="category-menu-item">하의</li>
            <li class="category-menu-item">아우터</li>
            <li class="category-menu-item">ACC</li>
            <li class="category-menu-item">
                <a href="member/cart.do">장바구니</a></li>
            <li class="category-menu-item">마이페이지</li>
            <li class="category-menu-item">
                <a href="signInPage.do">로그인</a></li>
        </ul>
    </div>


    <!-- 슬라이더  -->
    <div class="slider">
        <img src="" alt="">
    </div>

    <!-- 메인페이지 타이틀 -->
    <div class="main-title">
        <h1>당신을 위한 추천</h1>
    </div>

    <!-- 상품리스트 -->

    <div class="item-list-container">
        <div class="item">
            <img src="<%=request.getContextPath() %>/images/19309420_1598777941_image1_M.jpg" alt="">
            <div class="store-title">
                <p>세미브랜드</p>
            </div>
            <div class="product-description">
                <p>세련끝판왕 슬렉스..</p>
            </div>
            <div class="product-price">
                <p>13,900</p>
            </div>
            <div class="hit-number">
                <p>400개 구매중</p>
            </div>
        </div>

        <div class="item">
            <img src="<%=request.getContextPath() %>/images/19309420_1598777941_image1_M.jpg" alt="">
            <div class="store-title">
                <p>세미브랜드</p>
            </div>
            <div class="product-description">
                <p>세련끝판왕 슬렉스..</p>
            </div>
            <div class="product-price">
                <p>13,900</p>
            </div>
            <div class="hit-number">
                <p>400개 구매중</p>
            </div>
        </div>

        <div class="item">
            <img src="<%=request.getContextPath() %>/images/19309420_1598777941_image1_M.jpg" alt="">
            <div class="store-title">
                <p>세미브랜드</p>
            </div>
            <div class="product-description">
                <p>세련끝판왕 슬렉스..</p>
            </div>
            <div class="product-price">
                <p>13,900</p>
            </div>
            <div class="hit-number">
                <p>400개 구매중</p>
            </div>
        </div>

        <div class="item">
            <img src="<%=request.getContextPath() %>/images/19309420_1598777941_image1_M.jpg" alt="">
            <div class="store-title">
                <p>세미브랜드</p>
            </div>
            <div class="product-description">
                <p>세련끝판왕 슬렉스..</p>
            </div>
            <div class="product-price">
                <p>13,900</p>
            </div>
            <div class="hit-number">
                <p>400개 구매중</p>
            </div>
        </div>

        <div class="item">
            <img src="/images/19309420_1598777941_image1_M.jpg" alt="">
            <div class="store-title">
                <p>세미브랜드</p>
            </div>
            <div class="product-description">
                <p>세련끝판왕 슬렉스..</p>
            </div>
            <div class="product-price">
                <p>13,900</p>
            </div>
            <div class="hit-number">
                <p>400개 구매중</p>
            </div>
        </div>
       
    
    </div>
    <script src="/js/Main.js"></script>
</body>
</html>