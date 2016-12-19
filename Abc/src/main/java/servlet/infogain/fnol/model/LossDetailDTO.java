package servlet.infogain.fnol.model;

public class LossDetailDTO {
	private String lossVehicleDate;   // YYYY-MM-DD format *
	private String lossVehicleTime;	// hh:mm:ss  format *
	private String lossVehicleCause;
	private String lossVehicleLocation;
	private String lossVehicleIncidentDesc;  //*
	private String lossCauseCD;
	private String damageDesc;
	private String whereOccurredDesc;
	private String lossVehicleAddr;
	private String totalLossIndicator;
	private String salvageIndicator;
	private String lossVehicleYear;
	private String lossVehicleReportBy;
	
	
	public String getLossVehicleDate() {
		return lossVehicleDate;
	}
	public void setLossVehicleDate(String lossVehicleDate) {
		this.lossVehicleDate = lossVehicleDate;
	}
	public String getLossVehicleTime() {
		return lossVehicleTime;
	}
	public void setLossVehicleTime(String lossVehicleTime) {
		this.lossVehicleTime = lossVehicleTime;
	}
	public String getLossVehicleCause() {
		return lossVehicleCause;
	}
	public void setLossVehicleCause(String lossVehicleCause) {
		this.lossVehicleCause = lossVehicleCause;
	}
	public String getLossVehicleLocation() {
		return lossVehicleLocation;
	}
	public void setLossVehicleLocation(String lossVehicleLocation) {
		this.lossVehicleLocation = lossVehicleLocation;
	}
	public String getLossVehicleIncidentDesc() {
		return lossVehicleIncidentDesc;
	}
	public void setLossVehicleIncidentDesc(String lossVehicleIncidentDesc) {
		this.lossVehicleIncidentDesc = lossVehicleIncidentDesc;
	}
	public String getLossVehicleAddr() {
		return lossVehicleAddr;
	}
	public void setLossVehicleAddr(String lossVehicleAddr) {
		this.lossVehicleAddr = lossVehicleAddr;
	}
	public String getLossCauseCD() {
		return lossCauseCD;
	}
	public void setLossCauseCD(String lossCauseCD) {
		this.lossCauseCD = lossCauseCD;
	}
	public String getDamageDesc() {
		return damageDesc;
	}
	public void setDamageDesc(String damageDesc) {
		this.damageDesc = damageDesc;
	}
	public String getWhereOccurredDesc() {
		return whereOccurredDesc;
	}
	public void setWhereOccurredDesc(String whereOccurredDesc) {
		this.whereOccurredDesc = whereOccurredDesc;
	}
	public String getTotalLossIndicator() {
		return totalLossIndicator;
	}
	public void setTotalLossIndicator(String totalLossIndicator) {
		this.totalLossIndicator = totalLossIndicator;
	}
	public String getSalvageIndicator() {
		return salvageIndicator;
	}
	public void setSalvageIndicator(String salvageIndicator) {
		this.salvageIndicator = salvageIndicator;
	}
	public String getLossVehicleYear() {
		return lossVehicleYear;
	}
	public void setLossVehicleYear(String lossVehicleYear) {
		this.lossVehicleYear = lossVehicleYear;
	}
	public String getLossVehicleReportBy() {
		return lossVehicleReportBy;
	}
	public void setLossVehicleReportBy(String lossVehicleReportBy) {
		this.lossVehicleReportBy = lossVehicleReportBy;
	}
	
	
}
