package kr.or.bit.model.dto;

import java.util.Date;

public class DTOSalePost {
	private int saleNum;
	private int selNum;
	private int categoryNum;
	private String saleTitle;
	private String saleContent;
	private Date saleCreatedAt;
	private String[] imageAddrs;
	
	public DTOSalePost() {}
	
	public DTOSalePost(int saleNum, int selNum, int categoryNum, String saleTitle, String saleContent, Date saleCreatedAt, String[] imageAddrs) {
		this.saleNum = saleNum;
		this.selNum = selNum;
		this.categoryNum = categoryNum;
		this.saleTitle = saleTitle;
		this.saleContent = saleContent;
		this.saleCreatedAt = saleCreatedAt;
		this.imageAddrs = imageAddrs;
	}

	public int getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	public int getSelNum() {
		return selNum;
	}

	public void setSelNum(int selNum) {
		this.selNum = selNum;
	}

	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getSaleTitle() {
		return saleTitle;
	}

	public void setSaleTitle(String saleTitle) {
		this.saleTitle = saleTitle;
	}

	public String getSaleContent() {
		return saleContent;
	}

	public void setSaleContent(String saleContent) {
		this.saleContent = saleContent;
	}

	public Date getSaleCreatedAt() {
		return saleCreatedAt;
	}

	public void setSaleCreatedAt(Date saleCreatedAt) {
		this.saleCreatedAt = saleCreatedAt;
	}

	public String[] getImageAddrs() {
		return imageAddrs;
	}

	public void setImageAddrs(String[] imageAddrs) {
		this.imageAddrs = imageAddrs;
	}
	
}
