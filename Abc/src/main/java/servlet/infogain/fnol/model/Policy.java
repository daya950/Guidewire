package servlet.infogain.fnol.model;


import java.util.List;

public class Policy {

	private String policyNumber;
	private String policyCurrency;
	private String lineOfBusiness;
	private String policyType;
	protected List<VehicleInfoDTO> vehicles = null;
	private String address;
	private String expiryDate;
	
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyCurrency() {
		return policyCurrency;
	}
	public void setPolicyCurrency(String policyCurrency) {
		this.policyCurrency = policyCurrency;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public List<VehicleInfoDTO> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<VehicleInfoDTO> vehicles) {
		this.vehicles = vehicles;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
