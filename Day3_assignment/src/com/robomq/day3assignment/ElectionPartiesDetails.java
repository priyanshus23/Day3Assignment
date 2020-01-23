package com.robomq.day3assignment;

public class ElectionPartiesDetails {
	private int Electionid;
	private String name;
	private String ElectionDate;
	private String District;
	private String Constituency;
	private String Countingdate;
	
	public ElectionPartiesDetails(int electionid, String name, String electionDate, String district,
			String constituency, String countingdate) {
		super();
		Electionid = electionid;
		this.name = name;
		ElectionDate = electionDate;
		District = district;
		Constituency = constituency;
		Countingdate = countingdate;
	}
	
	
	@Override
	public String toString() {
		return "ElectionPartiesDetails [Electionid=" + Electionid + ", name=" + name + ", ElectionDate=" + ElectionDate
				+ ", District=" + District + ", Constituency=" + Constituency + ", Countingdate=" + Countingdate + "]";
	}
	
	
	public int getElectionid() {
		return Electionid;
	}
	public void setElectionid(int electionid) {
		Electionid = electionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectionDate() {
		return ElectionDate;
	}
	public void setElectionDate(String electionDate) {
		ElectionDate = electionDate;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getConstituency() {
		return Constituency;
	}
	public void setConstituency(String constituency) {
		Constituency = constituency;
	}
	public String getCountingdate() {
		return Countingdate;
	}
	public void setCountingdate(String countingdate) {
		Countingdate = countingdate;
	}
	
	
}
