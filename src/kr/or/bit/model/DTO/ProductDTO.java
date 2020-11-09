package kr.or.bit.model.DTO;

public class ProductDTO {
   private String p_num;
   private String sel_num;
   private String p_name;
   private String p_price;
   private String p_size;
   private String p_amount;
   private String p_description;
public String getP_num() {
	return p_num;
}
public void setP_num(String p_num) {
	this.p_num = p_num;
}
public String getSel_num() {
	return sel_num;
}
public void setSel_num(String sel_num) {
	this.sel_num = sel_num;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public String getP_price() {
	return p_price;
}
public void setP_price(String p_price) {
	this.p_price = p_price;
}
public String getP_size() {
	return p_size;
}
public void setP_size(String p_size) {
	this.p_size = p_size;
}
public String getP_amount() {
	return p_amount;
}
public void setP_amount(String p_amount) {
	this.p_amount = p_amount;
}
public String getP_description() {
	return p_description;
}
public void setP_description(String p_description) {
	this.p_description = p_description;
}
@Override
public String toString() {
	return "ProductDTO [p_num=" + p_num + ", sel_num=" + sel_num + ", p_name=" + p_name + ", p_price=" + p_price
			+ ", p_size=" + p_size + ", p_amount=" + p_amount + ", p_description=" + p_description + "]";
}
   
   
  
   
}