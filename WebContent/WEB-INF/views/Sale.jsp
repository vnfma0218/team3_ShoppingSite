<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
  <!--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
   --> <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <!--  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://kit.fontawesome.com/c00b702925.js" crossorigin="anonymous"></script>
     -->  
   <link rel="stylesheet" href="<%=request.getContextPath() %>/css/SalePage.css">
   <jsp:include page="../js/mainJs.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="./common/Top.jsp"></jsp:include>

    <div class="product-detail-container">
        <div class="product-image">
            <img src="./images/jacket.jpg" alt="">
        </div>
        <div class="product-info-container">
            <div class="seller-info">
                <div class="icon">무드글램</div>
                <div class="seller-title"><p>크레센도</p></div>
            </div>
            <div class="detail-title">
                <h1>[브랜디위크][인기재입고]비바 체크 하프자켓 코트</h1>
            </div>
            <div class="detail-price">
                <h1>35,200</h1>
            </div>
            <div class="detail-dcprice">
                <p>쿠폰적용가 29,200원</p>
            </div>
            <div class="review-info">
                <div class="score">
                    <p>❤❤❤❤❤</p> 
                </div>
                <div class="total-reviews">
                    <a href="#"><p>406개 리뷰 보기</p></a>
                </div>
            </div>
            <div class="goods-options-container">
                <select name="colorSelect" id="">
                    <option>사이즈를 선택하세요.</option>
                    <option value="S">S</option>
                    <option value="M">M</option>
                    <option value="L">L</option>
                    <option value="FREE">FREE</option>
                </select>
            </div>
            <div class="price-total-container">
                <div class="total-price-ko">
                    <p>총상품금액</p>
                </div>
                <div class="total-price">
                    <p>0원</p>
                </div>
            </div>
            
            
            <!-- 
   
                <div class="write" data-toggle="collapse" data-target="#demo">
                <a href="member/writeInquPage.do">
                	 <button type="button" class="btn btn-primary" data-toggle="collapse" data-target="#demo">문의하기</button>
                </a>
                </div>
          
             -->
            
            <div class="btn-purchase-container">
                <ul class="btn-purchase-items">
                    <a href="member/purchasePage.do"><li class="btn-purchase-1">
                        <button>바로구매</button>
                    </li></a>
                    <a href="member/cart.do"><li class="btn-purchase-1">
                        <button>장바구니</button>
                    </li></a>
                     <a href="member/writeInquPage.do"><li class="btn-purchase-1">
                        <button>문의하기</button>
                    </li></a>
                </ul>
            </div>
            
            
        </div>
    </div>
    
    <div class="tab-detail-info">
        <ul class="tab-details">
            <li class="tab-details-item">
                <a href="#">
                    상품정보
                </a>
            </li>
            <li class="tab-details-item">
                 <a href="#">
                    리뷰(423)
                </a>
            </li>
            <li class="tab-details-item">
                <a href="#">
                    Q&A(615)
                </a>
            </li>
            <li class="tab-details-item">
                <a href="#">
                    주문정보
                </a>
            </li>
        </ul>
    </div>
    
    <div class="product-description">
        <div class="description-title">
            <p>comment ::</p>
        </div>
        <div class="description">
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni adipisci praesentium illum aliquid neque sit omnis saepe velit dolore atque quae alias accusamus odio consequatur, inventore ratione. Rem, distinctio ratione?

            </p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni adipisci praesentium illum aliquid neque sit omnis saepe velit dolore atque quae alias accusamus odio consequatur, inventore ratione. Rem, distinctio ratione?
                
            </p>
        </div>

        <div class="product-img">
            <img src="../images/+detail_01 (1).jpg" alt="">
            <img src="../images/+detail_01.jpg" alt="">
        </div>
    </div>

    <!-- review -->
    <form>
 <!--    <div id="review" class="review-container">
        <div class="tab-review">
            리뷰
        </div>
        
        <div class="score-review">
            <div class="score-letter">
               <input type ="text" id ="reviewInput" >
               <ul class="btn-reivew-items">
                    <a href="member/purchasePage.do">
                    <li class="btn-reivew-1">
                        <button id="reviewbtn" name="reviewbtn">리뷰등록</button>
                    </li>
            </div>
     
        </div> -->
        <div id="reivew" class="review-container">
            <div class="tab-review">
                <h3 id ="reivew-img"><img src="/team3_ShoppingSite/images/리뷰아이콘.png" width="50">&nbsp;REVIEW</h3>
            </div>
            <div class="score-review">
                <div class="score-letter">
                    <table>
                    <tr>
                       <td><input type ="texdtarea" id ="reviewInput" placeholder ="리뷰를 등록해주세요."></td>
                       <td><button id="reviewbtn">등록</button></td>
                    </tr>
                    </table>
                </div>
            </div>
            </div>

        </form>
    <div id="reivew" class="review-container">
        <div class="review-content-contaier">
            
            <div class="user-score-id">
                <div class="user-score">
                    ❤❤❤❤❤
                </div>
                <div class="user-id">
                    pg5425
                </div>
    
            </div>
    
            <div class="write--time">
                2020.11.17
            </div>
    
        </div>
        <div class="user-review">
            <p>사진보다 예뻐용 부드럽고 좋습니다.</p>
        </div>

        <div class="review-content-contaier">
            
            <div class="user-score-id">
                <div class="user-score">
                    ❤❤❤❤❤
                </div>
                <div class="user-id">
                    pg5425
                </div>
    
            </div>
    
            <div class="write--time">
                2020.11.17
            </div>
    
        </div>
        <div class="user-review">
            <p>사진보다 예뻐용 부드럽고 좋습니다.</p>
        </div>
        <div class="review-content-contaier">
            <div class="user-score-id">
                <div class="user-score">
                    ❤❤❤❤❤
                </div>
                <div class="user-id">
                    pg5425
                </div>
            </div>
            <div class="write--time">
                2020.11.17
            </div>
        </div>
        <div class="user-review">
            <p>사진보다 예뻐용 부드럽고 좋습니다.</p>
        </div>
</div>


    <!-- review paging -->
    <div class="review-page-container">
        <a href="#"><</a>
        <a href="#">1</a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#">></a>
    </div>
    
    
    <!-- 판매자 정보 -->
    <div id="review" class="Info-container">
        <div class="tab-info">
            주문정보
        </div>
      
        <div class="info-content-top">
            <p><h3>[스토어 정보]</h3>
            <div class ="info-content">
               <p>상호명 : 주식회사 브랜디</p>
 			   <p>대표자 : team3 </p>
               <p>사업자등록번호 : 220-88-93187</p>
               <p>사업장소재지 : 비트캠프 서초캠퍼스</p>
			</div>
        </div>

        
          <div class="info-content-top">
            <p><h3>[스토어 고객센터]</h3>
            <div class ="info-content">
               <p>주중 10:00 AM ~ 10:00 PM, 주말 및 공휴일 휴무</p>
 			   <p>이메일 : bit@naver.com </p>
			</div>
        </div>
          <div class="tab-info">
            상품정보
        </div>
            <div class ="info-content">
               <p>상품상세참조</p> 			
			</div>			
        </div>
    <!-- Q&A 테이블 -->

    <div class="qna-list-container">
   <div class="tab-info">
            문의글
        </div>
        <table class="qun-list">
              <thead>
                <tr class = "qna-list-topBar"> 
                    <th><h3>분류</h3></th>
                    <th><h3>처리상태</h3></th>
                    <th style ="text-align: center;"><h3>내용</h3></th>
                    <th><h3>작성자</h3></th>
                    <th><h3>작성일</h3></th>
                </tr>
            </thead>
            <tbody class = "qna-list">
                <tr class = "qna-list-bottom">
                    <td><h3>상품문의</h3></td>
                    <td><h3>답변완료</h3></td>
                    <td class="qna-content">
                            <h3>비밀글입니다.</h3>
                    </td>
                    <td><h3>jjj***</h3></td>
                    <td><h3>2020.09.19</h3></td>
                </tr>

               <tr class = "qna-list-bottom">
                    <td><h3>상품문의</h3></td>
                    <td><h3>답변완료</h3></td>
                    <td class="qna-content">
                            <h3>비밀글입니다.</h3>
                    </td>
                    <td><h3>jjj***</h3></td>
                    <td><h3>2020.09.19</h3></td>
                </tr>
                <tr class = "qna-list-bottom">
                    <td><h3>상품문의</h3></td>
                    <td><h3>답변완료</h3></td>
                    <td class="qna-content">
                            <h3>비밀글입니다.</h3>
                    </td>
                    <td><h3>jjj***</h3></td>
                    <td><h3>2020.09.19</h3></td>
                </tr>
            </tbody>
        </table>
    </div>

    
    <!-- qna paging -->
     
 <div class="qna-page-container">
        <a href="#"><</a>
        <a href="#">1</a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#">></a>
    </div>

</body>