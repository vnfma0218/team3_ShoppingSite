package kr.or.bit.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.Action.Action;
import kr.or.bit.Action.ActionForward;
import kr.or.bit.model.DAO.ProductDAO;
import kr.or.bit.model.DTO.ProductDTO;

public class ProductAdd implements Action{

   @Override
   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
      ActionForward forward = new ActionForward();
      ProductDAO productDao = new ProductDAO();
      ProductDTO productDto = new ProductDTO();
      
      
      try {
         productDto.setP_num(request.getParameter("pnum")); //상품번호
         productDto.setP_name(request.getParameter("snum")); //판매자번호
         productDto.setP_price(request.getParameter("pname")); //상품이름
         productDto.setP_size(request.getParameter("price")); //가격
         productDto.setP_amount(request.getParameter("psize")); //사이즈
         productDto.setP_amount(request.getParameter("amount")); //수량
         productDto.setP_description(request.getParameter("description"));//설명
      } catch (Exception e) {
         System.out.println("Service: ProductAdde Error"+e.getMessage());;
      } finally {        
            productDao.productAdd(productDto); //입력받은 값을 DTO에 저장 -> DAO 넘겨주기 -> DB에 저장
            forward.setRedirect(false);
            forward.setPath("productList.do"); //상품목록페이지 경로이동
      }
      return forward;
   }

}