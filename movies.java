package com.model;

public class movies {
	public String mname;
	public String mactor;
	public String mactress;
	public String mdirector;
	@Override
	public String toString() {
		return "movies [mname=" + mname + ", mactor=" + mactor + ", mactress=" + mactress + ", mdirector=" + mdirector
				+ ", yearofrelease=" + yearofrelease + "]";
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMactor() {
		return mactor;
	}
	public void setMactor(String mactor) {
		this.mactor = mactor;
	}
	public String getMactress() {
		return mactress;
	}
	public void setMactress(String mactress) {
		this.mactress = mactress;
	}
	public String getMdirector() {
		return mdirector;
	}
	public void setMdirector(String mdirector) {
		this.mdirector = mdirector;
	}
	public int getYearofrelease() {
		return yearofrelease;
	}
	public void setYearofrelease(int yearofrelease) {
		this.yearofrelease = yearofrelease;
	}
	public int yearofrelease;
}
