package com.pojo;

public class ComplianceTeam {

	private String complianceTeamName,complianceTeamId,complianceTeamPassword;
	
	public ComplianceTeam(){
		complianceTeamName = "";
		complianceTeamId = "";
		complianceTeamPassword = "";
	}
	
	public ComplianceTeam(String complianceTeamName, String complianceTeamId, String complianceTeamPassword) {
		super();
		this.complianceTeamName = complianceTeamName;
		this.complianceTeamId = complianceTeamId;
		this.complianceTeamPassword = complianceTeamPassword;
	}

	public String getComplianceTeamName() {
		return complianceTeamName;
	}

	public void setComplianceTeamName(String complianceTeamName) {
		this.complianceTeamName = complianceTeamName;
	}

	public String getComplianceTeamId() {
		return complianceTeamId;
	}

	public void setComplianceTeamId(String complianceTeamId) {
		this.complianceTeamId = complianceTeamId;
	}

	public String getComplianceTeamPassword() {
		return complianceTeamPassword;
	}

	public void setComplianceTeamPassword(String complianceTeamPassword) {
		this.complianceTeamPassword = complianceTeamPassword;
	}
}
