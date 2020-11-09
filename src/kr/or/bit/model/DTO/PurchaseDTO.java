package kr.or.bit.model.DTO;

import java.util.Date;

public class PurchaseDTO {
   private String oNum;
   private String id;
   private String pNum;
   private String oAmount;
   private String oCreatedAt;
public String getoNum() {
	return oNum;
}
public void setoNum(String oNum) {
	this.oNum = oNum;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getpNum() {
	return pNum;
}
public void setpNum(String pNum) {
	this.pNum = pNum;
}
public String getoAmount() {
	return oAmount;
}
public void setoAmount(String oAmount) {
	this.oAmount = oAmount;
}
public String getoCreatedAt() {
	return oCreatedAt;
}
public void setoCreatedAt(String oCreatedAt) {
	this.oCreatedAt = oCreatedAt;
}
@Override
public String toString() {
	return "PurchaseDTO [oNum=" + oNum + ", id=" + id + ", pNum=" + pNum + ", oAmount=" + oAmount + ", oCreatedAt="
			+ oCreatedAt + "]";
}
   
     
}