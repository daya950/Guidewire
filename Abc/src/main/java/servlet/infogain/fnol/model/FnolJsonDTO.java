package servlet.infogain.fnol.model;


public class FnolJsonDTO {
	
	protected Policy policyDetails = new Policy();
	protected Questionnaire questionnaire = new Questionnaire();
	protected VehicleInfoDTO vehicleInfo = new VehicleInfoDTO();
	protected LossDetailDTO lossDetail = new LossDetailDTO();
	
	
	public Policy getPolicyDetails() {
		return policyDetails;
	}
	public void setPolicyDetails(Policy policyDetails) {
		this.policyDetails = policyDetails;
	}
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	public VehicleInfoDTO getVehicleInfoDTO() {
		return vehicleInfo;
	}
	public void setVehicleInfoDTO(VehicleInfoDTO vehicleInfoDTO) {
		this.vehicleInfo = vehicleInfoDTO;
	}
	public LossDetailDTO getLossDetailDTO() {
		return lossDetail;
	}
	public void setLossDetailDTO(LossDetailDTO lossDetailDTO) {
		this.lossDetail = lossDetailDTO;
	}
	
	
}
