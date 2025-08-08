package com.nanda.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("C4")
	private String cid;
	@Value("Bikram")
	private String cname;
	@Value("9142866719")
	private String cphno;
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + "]";
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCphno() {
		return cphno;
	}
	public void setCphno(String cphno) {
		this.cphno = cphno;
	}
	public Customer(String cid, String cname, String cphno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphno = cphno;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}