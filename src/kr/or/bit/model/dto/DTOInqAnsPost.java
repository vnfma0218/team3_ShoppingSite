package kr.or.bit.model.dto;

import java.util.Date;

public class DTOInqAnsPost {
	private int inqNum;
	private int saleNum;
	private String inqATitle;
	private String inqAContent;
	private Date inqACreatedAt;
	
	public DTOInqAnsPost() {}
	
	public DTOInqAnsPost(int inqNum, int saleNum, String inqATitle, String inqAContent, Date inqACreatedAt) {
		this.inqNum = inqNum;
		this.saleNum = saleNum;
		this.inqATitle = inqATitle;
		this.inqAContent = inqAContent;
		this.inqACreatedAt = inqACreatedAt;
	}

	public int getInqNum() {
		return inqNum;
	}

	public void setInqNum(int inqNum) {
		this.inqNum = inqNum;
	}

	public int getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	public String getInqATitle() {
		return inqATitle;
	}

	public void setInqATitle(String inqATitle) {
		this.inqATitle = inqATitle;
	}

	public String getInqAContent() {
		return inqAContent;
	}

	public void setInqAContent(String inqAContent) {
		this.inqAContent = inqAContent;
	}

	public Date getInqACreatedAt() {
		return inqACreatedAt;
	}

	public void setInqACreatedAt(Date inqACreatedAt) {
		this.inqACreatedAt = inqACreatedAt;
	}
	
}
