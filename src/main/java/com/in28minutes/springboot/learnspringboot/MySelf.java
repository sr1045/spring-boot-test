package com.in28minutes.springboot.learnspringboot;

public class MySelf {
	private String fname;
	private String mname;
	private String lname;

	public MySelf(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname!=null?mname:"RajPal";
	}

	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "MySelf [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}

}
