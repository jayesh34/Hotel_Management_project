package com.infogalaxy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerEntity {

	@Id
	private int cid;
	private String cname;
	private String emailid;
	private String mobno;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(int cid, String cname, String emailid, String mobno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.emailid = emailid;
		this.mobno = mobno;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "CustomerModel [cid=" + cid + ", cname=" + cname + ", emailid=" + emailid + ", mobno=" + mobno + "]";
	}

}
