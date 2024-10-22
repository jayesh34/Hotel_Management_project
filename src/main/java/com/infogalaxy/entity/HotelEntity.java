package com.infogalaxy.entity;

public class HotelEntity {

	private int fid;
	private String fname;
	private double fprice;
	private int qty;

	public HotelEntity() {
	}

	public HotelEntity(int fid, String fname, double fprice, int qty) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
		this.qty = qty;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getFprice() {
		return fprice;
	}

	public void setFprice(double fprice) {
		this.fprice = fprice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "HotelEntity [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + ", qty=" + qty + "]";
	}

}
