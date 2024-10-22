package com.infogalaxy.modellayer;

public class BillModel {

	private int bid;
	private String bdate;
	private double bamount;
	
	
	public BillModel() {
		super();
	}

	public BillModel(int bid, String bdate, double bamount) {
		super();
		this.bid = bid;
		this.bdate = bdate;
		this.bamount = bamount;
	}

	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public double getBamount() {
		return bamount;
	}
	public void setBamount(double bamount) {
		this.bamount = bamount;
	}
	@Override
	public String toString() {
		return "BillEntity [bid=" + bid + ", bdate=" + bdate + ", bamount=" + bamount + "]";
	}
}
