package kr.or.bit.model.dto;

import java.util.Date;

public class DTOPurchase {
	private int oNum;
	private String id;
	private int pNum;
	private int oAmount;
	private Date oCreatedAt;
	
	public DTOPurchase() {}
	
	public DTOPurchase(int oNum, String id, int pNum, int oAmount, Date oCreatedAt) {
		this.oNum = oNum;
		this.id = id;
		this.pNum = pNum;
		this.oAmount = oAmount;
		this.oCreatedAt = oCreatedAt;
	}

	public int getoNum() {
		return oNum;
	}

	public void setoNum(int oNum) {
		this.oNum = oNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public int getoAmount() {
		return oAmount;
	}

	public void setoAmount(int oAmount) {
		this.oAmount = oAmount;
	}

	public Date getoCreatedAt() {
		return oCreatedAt;
	}

	public void setoCreatedAt(Date oCreatedAt) {
		this.oCreatedAt = oCreatedAt;
	}
	
}
