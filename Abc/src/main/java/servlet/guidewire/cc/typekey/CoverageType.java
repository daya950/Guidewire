
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOPReceivablesCov"/>
 *     &lt;enumeration value="IMAccountReceivableCov"/>
 *     &lt;enumeration value="AccountsRecOffPremisesProperty"/>
 *     &lt;enumeration value="BOPAggLimitProjCov"/>
 *     &lt;enumeration value="BOPAlaskaAFGLCov"/>
 *     &lt;enumeration value="BAAudVisDataEqip2Cov"/>
 *     &lt;enumeration value="BADealerLimitLiabCov"/>
 *     &lt;enumeration value="baggage"/>
 *     &lt;enumeration value="BOPBarberCov"/>
 *     &lt;enumeration value="BABobtailLiabCov"/>
 *     &lt;enumeration value="BOPBuildingCov"/>
 *     &lt;enumeration value="CPBldgCov"/>
 *     &lt;enumeration value="BOPBurgRobCov"/>
 *     &lt;enumeration value="BusIncChangeCov"/>
 *     &lt;enumeration value="BOPBusIncDepPrpCov"/>
 *     &lt;enumeration value="BOPBusIncExtCov"/>
 *     &lt;enumeration value="BOPBusIncPayrollCov"/>
 *     &lt;enumeration value="CPBldgBusIncomeCov"/>
 *     &lt;enumeration value="BOPPersonalPropCov"/>
 *     &lt;enumeration value="CPBldgStockCov"/>
 *     &lt;enumeration value="CPBPPCov"/>
 *     &lt;enumeration value="BOPCAEqBldgRecCov"/>
 *     &lt;enumeration value="BOPCAEqBldgSubCov"/>
 *     &lt;enumeration value="BACollisionCov"/>
 *     &lt;enumeration value="PACollisionCov"/>
 *     &lt;enumeration value="BACollisionLimited_MAMI"/>
 *     &lt;enumeration value="PACollision_MA_MI_Limited"/>
 *     &lt;enumeration value="BADOCCollisionCov"/>
 *     &lt;enumeration value="BAComprehensiveCov"/>
 *     &lt;enumeration value="PAComprehensiveCov"/>
 *     &lt;enumeration value="BADOCCompCov"/>
 *     &lt;enumeration value="BOPY2KPremOnlyCov"/>
 *     &lt;enumeration value="BOPY2KLimitedCov"/>
 *     &lt;enumeration value="BOPComputerFraudCov"/>
 *     &lt;enumeration value="BOPCondoAssnCov"/>
 *     &lt;enumeration value="BOPCondoUnitOwnCov"/>
 *     &lt;enumeration value="GLAddCondoCov"/>
 *     &lt;enumeration value="ContractorsEquipAdditionallyAcquiredProperty"/>
 *     &lt;enumeration value="ContractorsEquipDebrisRemoval"/>
 *     &lt;enumeration value="ContractorsEquipEmployeesTools"/>
 *     &lt;enumeration value="ContractorsEquipMiscUnscheduledCov"/>
 *     &lt;enumeration value="ContractorsEquipPollutionCleanup"/>
 *     &lt;enumeration value="ContractorsEquipPreservationOfProperty"/>
 *     &lt;enumeration value="ContractorsEquipRentalReibursement"/>
 *     &lt;enumeration value="ContractorsEquipRentedEquipment"/>
 *     &lt;enumeration value="ContractorsEquipSchedCov"/>
 *     &lt;enumeration value="BOPToolsSchedCov"/>
 *     &lt;enumeration value="BOPToolsInstallUnschedCov"/>
 *     &lt;enumeration value="GLContractualLiabRR"/>
 *     &lt;enumeration value="GLAddInjuryLeasedWorkers"/>
 *     &lt;enumeration value="CPBlanketCov"/>
 *     &lt;enumeration value="PADeathDisabilityCov"/>
 *     &lt;enumeration value="CADeathDisabilityCov"/>
 *     &lt;enumeration value="GLPollutionDesignatedCov"/>
 *     &lt;enumeration value="BOPDesigPremProj"/>
 *     &lt;enumeration value="DandO"/>
 *     &lt;enumeration value="DPDW_Theft_HOE"/>
 *     &lt;enumeration value="BOPEqBldgCov"/>
 *     &lt;enumeration value="BOPEqSpBldgCov"/>
 *     &lt;enumeration value="HODW_Earthquake_HOE"/>
 *     &lt;enumeration value="BOPElectricalSchedCov"/>
 *     &lt;enumeration value="GLElectronicDataLiability"/>
 *     &lt;enumeration value="PAExcessElectronicsCov"/>
 *     &lt;enumeration value="BOPEmpBenExtRpting"/>
 *     &lt;enumeration value="BOPEmpBenefits"/>
 *     &lt;enumeration value="GLEmpBenefitsLiabilityCov"/>
 *     &lt;enumeration value="BOPEmpDisCov"/>
 *     &lt;enumeration value="EANDO"/>
 *     &lt;enumeration value="CPBldgExtraExpenseCov"/>
 *     &lt;enumeration value="FARM"/>
 *     &lt;enumeration value="BOPFDService"/>
 *     &lt;enumeration value="WCFedEmpLiabCov"/>
 *     &lt;enumeration value="BAFellowEmployeesCov"/>
 *     &lt;enumeration value="DPDW_Dwelling_Cov_HOE"/>
 *     &lt;enumeration value="DPDW_Loss_Of_Use_HOE"/>
 *     &lt;enumeration value="DPLI_Med_Pay_HOE"/>
 *     &lt;enumeration value="DPDW_OrdinanceCov_HOE"/>
 *     &lt;enumeration value="DPDW_Other_Structures_HOE"/>
 *     &lt;enumeration value="DPLI_Personal_Liability_HOE"/>
 *     &lt;enumeration value="DPDW_Personal_Property_HOE"/>
 *     &lt;enumeration value="BOPFoodContamCov"/>
 *     &lt;enumeration value="BOPForgeAltCov"/>
 *     &lt;enumeration value="BOPFuncPerPropCov"/>
 *     &lt;enumeration value="BOPFuneralDirCov"/>
 *     &lt;enumeration value="GLCGLCov"/>
 *     &lt;enumeration value="GLDeductible"/>
 *     &lt;enumeration value="GLGovSubdivisions"/>
 *     &lt;enumeration value="BOPGuestPropCov"/>
 *     &lt;enumeration value="BOPGuestSafeDepCov"/>
 *     &lt;enumeration value="health_travel"/>
 *     &lt;enumeration value="BOPHearingAidCov"/>
 *     &lt;enumeration value="BOPHiredAuto"/>
 *     &lt;enumeration value="hiredauto_travel"/>
 *     &lt;enumeration value="BAHiredCollisionCov"/>
 *     &lt;enumeration value="BAHiredCompCov"/>
 *     &lt;enumeration value="BAHiredLiabilityCov"/>
 *     &lt;enumeration value="BAHiredSpecPerilCov"/>
 *     &lt;enumeration value="BAHiredUIMCov"/>
 *     &lt;enumeration value="BAHiredUMCov"/>
 *     &lt;enumeration value="HOLI_PersonalInjury_HOE"/>
 *     &lt;enumeration value="HODW_Dwelling_Cov_HOE"/>
 *     &lt;enumeration value="HODW_Loss_Of_Use_HOE"/>
 *     &lt;enumeration value="HOLI_Med_Pay_HOE"/>
 *     &lt;enumeration value="HODW_OrdinanceCov_HOE"/>
 *     &lt;enumeration value="HODW_Other_Structures_HOE"/>
 *     &lt;enumeration value="HOLI_Personal_Liability_HOE"/>
 *     &lt;enumeration value="HODW_Personal_Property_HOE"/>
 *     &lt;enumeration value="BOPY2KIncomeExpenseCov"/>
 *     &lt;enumeration value="HODW_InflationGaurd_HOE"/>
 *     &lt;enumeration value="IMSignCov"/>
 *     &lt;enumeration value="GLLawnCare"/>
 *     &lt;enumeration value="BOPLeasedWorkerInjCov"/>
 *     &lt;enumeration value="BAOwnedLiabilityCov"/>
 *     &lt;enumeration value="BOPLiabilityCov"/>
 *     &lt;enumeration value="liab_travel"/>
 *     &lt;enumeration value="PALiabilityCov"/>
 *     &lt;enumeration value="BADOCLiabilityCov"/>
 *     &lt;enumeration value="BOPFungiPropCov"/>
 *     &lt;enumeration value="GLLtdFungiBacteriaCov"/>
 *     &lt;enumeration value="HODW_FungiCov_HOE"/>
 *     &lt;enumeration value="HODW_FungiCovFlorida_HOE"/>
 *     &lt;enumeration value="BALimitedPropDamCov"/>
 *     &lt;enumeration value="BOPLiquorEvents"/>
 *     &lt;enumeration value="BOPLiquorRemoveExc"/>
 *     &lt;enumeration value="BOPLiquorCov"/>
 *     &lt;enumeration value="GLLiquorEndorsement"/>
 *     &lt;enumeration value="BALoanLeaseGapCov"/>
 *     &lt;enumeration value="BALossOfUseCov"/>
 *     &lt;enumeration value="GLLimitedPAandInjuryCov"/>
 *     &lt;enumeration value="BOPMATenantReloCov"/>
 *     &lt;enumeration value="BOPMALeadPoisonCov"/>
 *     &lt;enumeration value="MALP"/>
 *     &lt;enumeration value="BOPMechBreakdownCov"/>
 *     &lt;enumeration value="BAOwnedMedPayCov"/>
 *     &lt;enumeration value="PAMedPayCov"/>
 *     &lt;enumeration value="BADOCMedPayCov"/>
 *     &lt;enumeration value="PALimitedMexicoCov"/>
 *     &lt;enumeration value="BOPMineSubCov"/>
 *     &lt;enumeration value="BOPMoneySecCov"/>
 *     &lt;enumeration value="BOPMotelCov"/>
 *     &lt;enumeration value="BOPNewAcquiredOrgCov"/>
 *     &lt;enumeration value="BANonownedLiabCov"/>
 *     &lt;enumeration value="BOPNonOwnedAutoCov"/>
 *     &lt;enumeration value="BANonOwndSSExtendCov"/>
 *     &lt;enumeration value="BOPOrdinanceCov"/>
 *     &lt;enumeration value="HOLI_OtherInsuredResidence_HOE"/>
 *     &lt;enumeration value="WCOtherStatesInsurance"/>
 *     &lt;enumeration value="HODW_OtherStructuresOffPremise_HOE"/>
 *     &lt;enumeration value="HODW_OtherStructuresOnPremise_HOE"/>
 *     &lt;enumeration value="BOPOutdoorProp"/>
 *     &lt;enumeration value="BOPOutSignCov"/>
 *     &lt;enumeration value="BOPPersAdvertInj"/>
 *     &lt;enumeration value="BOPPersonalEffects"/>
 *     &lt;enumeration value="HODW_PersonalPropertyOffResidence_HOE"/>
 *     &lt;enumeration value="BOPPersPropOffPrem"/>
 *     &lt;enumeration value="BOPPesticideApplicatorCov"/>
 *     &lt;enumeration value="GLPestHerbicideApplicatorSchedule"/>
 *     &lt;enumeration value="BOPPharmacistCov"/>
 *     &lt;enumeration value="CA_PIP_AR"/>
 *     &lt;enumeration value="PAPIP_AR"/>
 *     &lt;enumeration value="CAPIP_DE"/>
 *     &lt;enumeration value="PAPIP_DE"/>
 *     &lt;enumeration value="CA_PIP_DC"/>
 *     &lt;enumeration value="PAPIP_DC"/>
 *     &lt;enumeration value="CAPIP_FL"/>
 *     &lt;enumeration value="PAPIP_FL"/>
 *     &lt;enumeration value="CAPIP_HI"/>
 *     &lt;enumeration value="PAPIP_HI"/>
 *     &lt;enumeration value="CAPIP_KS"/>
 *     &lt;enumeration value="PAPIP_KS"/>
 *     &lt;enumeration value="CAPIP_KY"/>
 *     &lt;enumeration value="PAPIP_KY"/>
 *     &lt;enumeration value="CAPIP_MD"/>
 *     &lt;enumeration value="PAPIP_MD"/>
 *     &lt;enumeration value="CAPIP_MA"/>
 *     &lt;enumeration value="PAPIP_MA"/>
 *     &lt;enumeration value="CAPIP_MI"/>
 *     &lt;enumeration value="PAPIP_MI"/>
 *     &lt;enumeration value="CAPIP_MN"/>
 *     &lt;enumeration value="PAPIP_MN"/>
 *     &lt;enumeration value="CAPIP_NJ"/>
 *     &lt;enumeration value="PAPIP_NJ"/>
 *     &lt;enumeration value="CAPIP_NY"/>
 *     &lt;enumeration value="PAPIP_NY"/>
 *     &lt;enumeration value="CAPIP_ND"/>
 *     &lt;enumeration value="PAPIP_ND"/>
 *     &lt;enumeration value="CAPIP_OR"/>
 *     &lt;enumeration value="PAPIP_OR"/>
 *     &lt;enumeration value="CAPIP_PA"/>
 *     &lt;enumeration value="PAPIP_PA"/>
 *     &lt;enumeration value="CAPIP_TX"/>
 *     &lt;enumeration value="PAPIP_TX"/>
 *     &lt;enumeration value="CAPIP_UT"/>
 *     &lt;enumeration value="PAPIP_UT"/>
 *     &lt;enumeration value="CAPIP_WA"/>
 *     &lt;enumeration value="PAPIP_WA"/>
 *     &lt;enumeration value="BOPPropertyCov"/>
 *     &lt;enumeration value="BOPPollutionCov"/>
 *     &lt;enumeration value="PollutionBroadLimited"/>
 *     &lt;enumeration value="BAPollutLiabBasicCov"/>
 *     &lt;enumeration value="BAPollutLiabBoardCov"/>
 *     &lt;enumeration value="BOPMedExpCov"/>
 *     &lt;enumeration value="PUP_Primary_LiabilityCov_PUE"/>
 *     &lt;enumeration value="BOPPrinterCov"/>
 *     &lt;enumeration value="ProductWithdrawalLtd"/>
 *     &lt;enumeration value="BAPropProtectionCov"/>
 *     &lt;enumeration value="PAPropProtectionCov"/>
 *     &lt;enumeration value="PALossOfUseCov"/>
 *     &lt;enumeration value="BARentalCov"/>
 *     &lt;enumeration value="PARentalCov"/>
 *     &lt;enumeration value="HODW_ScheduledProperty_HOE"/>
 *     &lt;enumeration value="BASeasonTrailerLiabCov"/>
 *     &lt;enumeration value="HODW_SectionI_Ded_HOE"/>
 *     &lt;enumeration value="HOLI_LimitedComputer_HOE"/>
 *     &lt;enumeration value="HOLI_FungiCov_HOE"/>
 *     &lt;enumeration value="BOPSelfStorCov"/>
 *     &lt;enumeration value="GLPollutionShortTermCov"/>
 *     &lt;enumeration value="BOPAdditionalCov"/>
 *     &lt;enumeration value="HODW_SpecialLimitsCovC_HOE"/>
 *     &lt;enumeration value="HODW_SpecificStructuresOffPremise_HOE"/>
 *     &lt;enumeration value="BASpecCausesLossCov"/>
 *     &lt;enumeration value="BOPSpoilageCov"/>
 *     &lt;enumeration value="WCWorkersCompCov"/>
 *     &lt;enumeration value="PATapeDiscMediaCov"/>
 *     &lt;enumeration value="BATapeDiscRecordCov"/>
 *     &lt;enumeration value="BOPTenantFireCov"/>
 *     &lt;enumeration value="BOPTenantsLiabilityCov"/>
 *     &lt;enumeration value="BOPCertTerrorCap"/>
 *     &lt;enumeration value="BATowingLaborCov"/>
 *     &lt;enumeration value="PATowingLaborCov"/>
 *     &lt;enumeration value="trip"/>
 *     &lt;enumeration value="GLUndergroundResourceCov"/>
 *     &lt;enumeration value="BAOwnedUIMBICov"/>
 *     &lt;enumeration value="PAUIMBICov"/>
 *     &lt;enumeration value="BADOCUnderinsCov"/>
 *     &lt;enumeration value="BAOwnedUIMPDCov"/>
 *     &lt;enumeration value="PAUIMPDCov"/>
 *     &lt;enumeration value="BAOwnedUMBICov"/>
 *     &lt;enumeration value="PAUMBICov"/>
 *     &lt;enumeration value="BADOCUninsuredCov"/>
 *     &lt;enumeration value="BAOwnedUMPDCov"/>
 *     &lt;enumeration value="PAUMPDCov"/>
 *     &lt;enumeration value="BAOwnedUMBISuppCov"/>
 *     &lt;enumeration value="BOPUtilDirectCov"/>
 *     &lt;enumeration value="BOPUtilTimeCov"/>
 *     &lt;enumeration value="BOPVacancyChangeCov"/>
 *     &lt;enumeration value="BOPVacancyCov"/>
 *     &lt;enumeration value="BOPValuablePapersCov"/>
 *     &lt;enumeration value="BOPVetCov"/>
 *     &lt;enumeration value="BOPOverflowCov"/>
 *     &lt;enumeration value="BOPLocWindHailCov"/>
 *     &lt;enumeration value="WCEmpLiabCov"/>
 *     &lt;enumeration value="WCWorkCompDeductCov"/>
 *     &lt;enumeration value="PUP_WorldWideCov_PUE"/>
 *     &lt;enumeration value="XCUSpecified"/>
 *     &lt;enumeration value="Y2KLimitedCov"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverageType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum CoverageType {

    @XmlEnumValue("BOPReceivablesCov")
    BOP_RECEIVABLES_COV("BOPReceivablesCov"),
    @XmlEnumValue("IMAccountReceivableCov")
    IM_ACCOUNT_RECEIVABLE_COV("IMAccountReceivableCov"),
    @XmlEnumValue("AccountsRecOffPremisesProperty")
    ACCOUNTS_REC_OFF_PREMISES_PROPERTY("AccountsRecOffPremisesProperty"),
    @XmlEnumValue("BOPAggLimitProjCov")
    BOP_AGG_LIMIT_PROJ_COV("BOPAggLimitProjCov"),
    @XmlEnumValue("BOPAlaskaAFGLCov")
    BOP_ALASKA_AFGL_COV("BOPAlaskaAFGLCov"),
    @XmlEnumValue("BAAudVisDataEqip2Cov")
    BA_AUD_VIS_DATA_EQIP_2_COV("BAAudVisDataEqip2Cov"),
    @XmlEnumValue("BADealerLimitLiabCov")
    BA_DEALER_LIMIT_LIAB_COV("BADealerLimitLiabCov"),
    @XmlEnumValue("baggage")
    BAGGAGE("baggage"),
    @XmlEnumValue("BOPBarberCov")
    BOP_BARBER_COV("BOPBarberCov"),
    @XmlEnumValue("BABobtailLiabCov")
    BA_BOBTAIL_LIAB_COV("BABobtailLiabCov"),
    @XmlEnumValue("BOPBuildingCov")
    BOP_BUILDING_COV("BOPBuildingCov"),
    @XmlEnumValue("CPBldgCov")
    CP_BLDG_COV("CPBldgCov"),
    @XmlEnumValue("BOPBurgRobCov")
    BOP_BURG_ROB_COV("BOPBurgRobCov"),
    @XmlEnumValue("BusIncChangeCov")
    BUS_INC_CHANGE_COV("BusIncChangeCov"),
    @XmlEnumValue("BOPBusIncDepPrpCov")
    BOP_BUS_INC_DEP_PRP_COV("BOPBusIncDepPrpCov"),
    @XmlEnumValue("BOPBusIncExtCov")
    BOP_BUS_INC_EXT_COV("BOPBusIncExtCov"),
    @XmlEnumValue("BOPBusIncPayrollCov")
    BOP_BUS_INC_PAYROLL_COV("BOPBusIncPayrollCov"),
    @XmlEnumValue("CPBldgBusIncomeCov")
    CP_BLDG_BUS_INCOME_COV("CPBldgBusIncomeCov"),
    @XmlEnumValue("BOPPersonalPropCov")
    BOP_PERSONAL_PROP_COV("BOPPersonalPropCov"),
    @XmlEnumValue("CPBldgStockCov")
    CP_BLDG_STOCK_COV("CPBldgStockCov"),
    @XmlEnumValue("CPBPPCov")
    CPBPP_COV("CPBPPCov"),
    @XmlEnumValue("BOPCAEqBldgRecCov")
    BOPCA_EQ_BLDG_REC_COV("BOPCAEqBldgRecCov"),
    @XmlEnumValue("BOPCAEqBldgSubCov")
    BOPCA_EQ_BLDG_SUB_COV("BOPCAEqBldgSubCov"),
    @XmlEnumValue("BACollisionCov")
    BA_COLLISION_COV("BACollisionCov"),
    @XmlEnumValue("PACollisionCov")
    PA_COLLISION_COV("PACollisionCov"),
    @XmlEnumValue("BACollisionLimited_MAMI")
    BA_COLLISION_LIMITED_MAMI("BACollisionLimited_MAMI"),
    @XmlEnumValue("PACollision_MA_MI_Limited")
    PA_COLLISION_MA_MI_LIMITED("PACollision_MA_MI_Limited"),
    @XmlEnumValue("BADOCCollisionCov")
    BADOC_COLLISION_COV("BADOCCollisionCov"),
    @XmlEnumValue("BAComprehensiveCov")
    BA_COMPREHENSIVE_COV("BAComprehensiveCov"),
    @XmlEnumValue("PAComprehensiveCov")
    PA_COMPREHENSIVE_COV("PAComprehensiveCov"),
    @XmlEnumValue("BADOCCompCov")
    BADOC_COMP_COV("BADOCCompCov"),
    @XmlEnumValue("BOPY2KPremOnlyCov")
    BOPY_2_K_PREM_ONLY_COV("BOPY2KPremOnlyCov"),
    @XmlEnumValue("BOPY2KLimitedCov")
    BOPY_2_K_LIMITED_COV("BOPY2KLimitedCov"),
    @XmlEnumValue("BOPComputerFraudCov")
    BOP_COMPUTER_FRAUD_COV("BOPComputerFraudCov"),
    @XmlEnumValue("BOPCondoAssnCov")
    BOP_CONDO_ASSN_COV("BOPCondoAssnCov"),
    @XmlEnumValue("BOPCondoUnitOwnCov")
    BOP_CONDO_UNIT_OWN_COV("BOPCondoUnitOwnCov"),
    @XmlEnumValue("GLAddCondoCov")
    GL_ADD_CONDO_COV("GLAddCondoCov"),
    @XmlEnumValue("ContractorsEquipAdditionallyAcquiredProperty")
    CONTRACTORS_EQUIP_ADDITIONALLY_ACQUIRED_PROPERTY("ContractorsEquipAdditionallyAcquiredProperty"),
    @XmlEnumValue("ContractorsEquipDebrisRemoval")
    CONTRACTORS_EQUIP_DEBRIS_REMOVAL("ContractorsEquipDebrisRemoval"),
    @XmlEnumValue("ContractorsEquipEmployeesTools")
    CONTRACTORS_EQUIP_EMPLOYEES_TOOLS("ContractorsEquipEmployeesTools"),
    @XmlEnumValue("ContractorsEquipMiscUnscheduledCov")
    CONTRACTORS_EQUIP_MISC_UNSCHEDULED_COV("ContractorsEquipMiscUnscheduledCov"),
    @XmlEnumValue("ContractorsEquipPollutionCleanup")
    CONTRACTORS_EQUIP_POLLUTION_CLEANUP("ContractorsEquipPollutionCleanup"),
    @XmlEnumValue("ContractorsEquipPreservationOfProperty")
    CONTRACTORS_EQUIP_PRESERVATION_OF_PROPERTY("ContractorsEquipPreservationOfProperty"),
    @XmlEnumValue("ContractorsEquipRentalReibursement")
    CONTRACTORS_EQUIP_RENTAL_REIBURSEMENT("ContractorsEquipRentalReibursement"),
    @XmlEnumValue("ContractorsEquipRentedEquipment")
    CONTRACTORS_EQUIP_RENTED_EQUIPMENT("ContractorsEquipRentedEquipment"),
    @XmlEnumValue("ContractorsEquipSchedCov")
    CONTRACTORS_EQUIP_SCHED_COV("ContractorsEquipSchedCov"),
    @XmlEnumValue("BOPToolsSchedCov")
    BOP_TOOLS_SCHED_COV("BOPToolsSchedCov"),
    @XmlEnumValue("BOPToolsInstallUnschedCov")
    BOP_TOOLS_INSTALL_UNSCHED_COV("BOPToolsInstallUnschedCov"),
    @XmlEnumValue("GLContractualLiabRR")
    GL_CONTRACTUAL_LIAB_RR("GLContractualLiabRR"),
    @XmlEnumValue("GLAddInjuryLeasedWorkers")
    GL_ADD_INJURY_LEASED_WORKERS("GLAddInjuryLeasedWorkers"),
    @XmlEnumValue("CPBlanketCov")
    CP_BLANKET_COV("CPBlanketCov"),
    @XmlEnumValue("PADeathDisabilityCov")
    PA_DEATH_DISABILITY_COV("PADeathDisabilityCov"),
    @XmlEnumValue("CADeathDisabilityCov")
    CA_DEATH_DISABILITY_COV("CADeathDisabilityCov"),
    @XmlEnumValue("GLPollutionDesignatedCov")
    GL_POLLUTION_DESIGNATED_COV("GLPollutionDesignatedCov"),
    @XmlEnumValue("BOPDesigPremProj")
    BOP_DESIG_PREM_PROJ("BOPDesigPremProj"),
    @XmlEnumValue("DandO")
    DAND_O("DandO"),
    @XmlEnumValue("DPDW_Theft_HOE")
    DPDW_THEFT_HOE("DPDW_Theft_HOE"),
    @XmlEnumValue("BOPEqBldgCov")
    BOP_EQ_BLDG_COV("BOPEqBldgCov"),
    @XmlEnumValue("BOPEqSpBldgCov")
    BOP_EQ_SP_BLDG_COV("BOPEqSpBldgCov"),
    @XmlEnumValue("HODW_Earthquake_HOE")
    HODW_EARTHQUAKE_HOE("HODW_Earthquake_HOE"),
    @XmlEnumValue("BOPElectricalSchedCov")
    BOP_ELECTRICAL_SCHED_COV("BOPElectricalSchedCov"),
    @XmlEnumValue("GLElectronicDataLiability")
    GL_ELECTRONIC_DATA_LIABILITY("GLElectronicDataLiability"),
    @XmlEnumValue("PAExcessElectronicsCov")
    PA_EXCESS_ELECTRONICS_COV("PAExcessElectronicsCov"),
    @XmlEnumValue("BOPEmpBenExtRpting")
    BOP_EMP_BEN_EXT_RPTING("BOPEmpBenExtRpting"),
    @XmlEnumValue("BOPEmpBenefits")
    BOP_EMP_BENEFITS("BOPEmpBenefits"),
    @XmlEnumValue("GLEmpBenefitsLiabilityCov")
    GL_EMP_BENEFITS_LIABILITY_COV("GLEmpBenefitsLiabilityCov"),
    @XmlEnumValue("BOPEmpDisCov")
    BOP_EMP_DIS_COV("BOPEmpDisCov"),
    EANDO("EANDO"),
    @XmlEnumValue("CPBldgExtraExpenseCov")
    CP_BLDG_EXTRA_EXPENSE_COV("CPBldgExtraExpenseCov"),
    FARM("FARM"),
    @XmlEnumValue("BOPFDService")
    BOPFD_SERVICE("BOPFDService"),
    @XmlEnumValue("WCFedEmpLiabCov")
    WC_FED_EMP_LIAB_COV("WCFedEmpLiabCov"),
    @XmlEnumValue("BAFellowEmployeesCov")
    BA_FELLOW_EMPLOYEES_COV("BAFellowEmployeesCov"),
    @XmlEnumValue("DPDW_Dwelling_Cov_HOE")
    DPDW_DWELLING_COV_HOE("DPDW_Dwelling_Cov_HOE"),
    @XmlEnumValue("DPDW_Loss_Of_Use_HOE")
    DPDW_LOSS_OF_USE_HOE("DPDW_Loss_Of_Use_HOE"),
    @XmlEnumValue("DPLI_Med_Pay_HOE")
    DPLI_MED_PAY_HOE("DPLI_Med_Pay_HOE"),
    @XmlEnumValue("DPDW_OrdinanceCov_HOE")
    DPDW_ORDINANCE_COV_HOE("DPDW_OrdinanceCov_HOE"),
    @XmlEnumValue("DPDW_Other_Structures_HOE")
    DPDW_OTHER_STRUCTURES_HOE("DPDW_Other_Structures_HOE"),
    @XmlEnumValue("DPLI_Personal_Liability_HOE")
    DPLI_PERSONAL_LIABILITY_HOE("DPLI_Personal_Liability_HOE"),
    @XmlEnumValue("DPDW_Personal_Property_HOE")
    DPDW_PERSONAL_PROPERTY_HOE("DPDW_Personal_Property_HOE"),
    @XmlEnumValue("BOPFoodContamCov")
    BOP_FOOD_CONTAM_COV("BOPFoodContamCov"),
    @XmlEnumValue("BOPForgeAltCov")
    BOP_FORGE_ALT_COV("BOPForgeAltCov"),
    @XmlEnumValue("BOPFuncPerPropCov")
    BOP_FUNC_PER_PROP_COV("BOPFuncPerPropCov"),
    @XmlEnumValue("BOPFuneralDirCov")
    BOP_FUNERAL_DIR_COV("BOPFuneralDirCov"),
    @XmlEnumValue("GLCGLCov")
    GLCGL_COV("GLCGLCov"),
    @XmlEnumValue("GLDeductible")
    GL_DEDUCTIBLE("GLDeductible"),
    @XmlEnumValue("GLGovSubdivisions")
    GL_GOV_SUBDIVISIONS("GLGovSubdivisions"),
    @XmlEnumValue("BOPGuestPropCov")
    BOP_GUEST_PROP_COV("BOPGuestPropCov"),
    @XmlEnumValue("BOPGuestSafeDepCov")
    BOP_GUEST_SAFE_DEP_COV("BOPGuestSafeDepCov"),
    @XmlEnumValue("health_travel")
    HEALTH_TRAVEL("health_travel"),
    @XmlEnumValue("BOPHearingAidCov")
    BOP_HEARING_AID_COV("BOPHearingAidCov"),
    @XmlEnumValue("BOPHiredAuto")
    BOP_HIRED_AUTO("BOPHiredAuto"),
    @XmlEnumValue("hiredauto_travel")
    HIREDAUTO_TRAVEL("hiredauto_travel"),
    @XmlEnumValue("BAHiredCollisionCov")
    BA_HIRED_COLLISION_COV("BAHiredCollisionCov"),
    @XmlEnumValue("BAHiredCompCov")
    BA_HIRED_COMP_COV("BAHiredCompCov"),
    @XmlEnumValue("BAHiredLiabilityCov")
    BA_HIRED_LIABILITY_COV("BAHiredLiabilityCov"),
    @XmlEnumValue("BAHiredSpecPerilCov")
    BA_HIRED_SPEC_PERIL_COV("BAHiredSpecPerilCov"),
    @XmlEnumValue("BAHiredUIMCov")
    BA_HIRED_UIM_COV("BAHiredUIMCov"),
    @XmlEnumValue("BAHiredUMCov")
    BA_HIRED_UM_COV("BAHiredUMCov"),
    @XmlEnumValue("HOLI_PersonalInjury_HOE")
    HOLI_PERSONAL_INJURY_HOE("HOLI_PersonalInjury_HOE"),
    @XmlEnumValue("HODW_Dwelling_Cov_HOE")
    HODW_DWELLING_COV_HOE("HODW_Dwelling_Cov_HOE"),
    @XmlEnumValue("HODW_Loss_Of_Use_HOE")
    HODW_LOSS_OF_USE_HOE("HODW_Loss_Of_Use_HOE"),
    @XmlEnumValue("HOLI_Med_Pay_HOE")
    HOLI_MED_PAY_HOE("HOLI_Med_Pay_HOE"),
    @XmlEnumValue("HODW_OrdinanceCov_HOE")
    HODW_ORDINANCE_COV_HOE("HODW_OrdinanceCov_HOE"),
    @XmlEnumValue("HODW_Other_Structures_HOE")
    HODW_OTHER_STRUCTURES_HOE("HODW_Other_Structures_HOE"),
    @XmlEnumValue("HOLI_Personal_Liability_HOE")
    HOLI_PERSONAL_LIABILITY_HOE("HOLI_Personal_Liability_HOE"),
    @XmlEnumValue("HODW_Personal_Property_HOE")
    HODW_PERSONAL_PROPERTY_HOE("HODW_Personal_Property_HOE"),
    @XmlEnumValue("BOPY2KIncomeExpenseCov")
    BOPY_2_K_INCOME_EXPENSE_COV("BOPY2KIncomeExpenseCov"),
    @XmlEnumValue("HODW_InflationGaurd_HOE")
    HODW_INFLATION_GAURD_HOE("HODW_InflationGaurd_HOE"),
    @XmlEnumValue("IMSignCov")
    IM_SIGN_COV("IMSignCov"),
    @XmlEnumValue("GLLawnCare")
    GL_LAWN_CARE("GLLawnCare"),
    @XmlEnumValue("BOPLeasedWorkerInjCov")
    BOP_LEASED_WORKER_INJ_COV("BOPLeasedWorkerInjCov"),
    @XmlEnumValue("BAOwnedLiabilityCov")
    BA_OWNED_LIABILITY_COV("BAOwnedLiabilityCov"),
    @XmlEnumValue("BOPLiabilityCov")
    BOP_LIABILITY_COV("BOPLiabilityCov"),
    @XmlEnumValue("liab_travel")
    LIAB_TRAVEL("liab_travel"),
    @XmlEnumValue("PALiabilityCov")
    PA_LIABILITY_COV("PALiabilityCov"),
    @XmlEnumValue("BADOCLiabilityCov")
    BADOC_LIABILITY_COV("BADOCLiabilityCov"),
    @XmlEnumValue("BOPFungiPropCov")
    BOP_FUNGI_PROP_COV("BOPFungiPropCov"),
    @XmlEnumValue("GLLtdFungiBacteriaCov")
    GL_LTD_FUNGI_BACTERIA_COV("GLLtdFungiBacteriaCov"),
    @XmlEnumValue("HODW_FungiCov_HOE")
    HODW_FUNGI_COV_HOE("HODW_FungiCov_HOE"),
    @XmlEnumValue("HODW_FungiCovFlorida_HOE")
    HODW_FUNGI_COV_FLORIDA_HOE("HODW_FungiCovFlorida_HOE"),
    @XmlEnumValue("BALimitedPropDamCov")
    BA_LIMITED_PROP_DAM_COV("BALimitedPropDamCov"),
    @XmlEnumValue("BOPLiquorEvents")
    BOP_LIQUOR_EVENTS("BOPLiquorEvents"),
    @XmlEnumValue("BOPLiquorRemoveExc")
    BOP_LIQUOR_REMOVE_EXC("BOPLiquorRemoveExc"),
    @XmlEnumValue("BOPLiquorCov")
    BOP_LIQUOR_COV("BOPLiquorCov"),
    @XmlEnumValue("GLLiquorEndorsement")
    GL_LIQUOR_ENDORSEMENT("GLLiquorEndorsement"),
    @XmlEnumValue("BALoanLeaseGapCov")
    BA_LOAN_LEASE_GAP_COV("BALoanLeaseGapCov"),
    @XmlEnumValue("BALossOfUseCov")
    BA_LOSS_OF_USE_COV("BALossOfUseCov"),
    @XmlEnumValue("GLLimitedPAandInjuryCov")
    GL_LIMITED_P_AAND_INJURY_COV("GLLimitedPAandInjuryCov"),
    @XmlEnumValue("BOPMATenantReloCov")
    BOPMA_TENANT_RELO_COV("BOPMATenantReloCov"),
    @XmlEnumValue("BOPMALeadPoisonCov")
    BOPMA_LEAD_POISON_COV("BOPMALeadPoisonCov"),
    MALP("MALP"),
    @XmlEnumValue("BOPMechBreakdownCov")
    BOP_MECH_BREAKDOWN_COV("BOPMechBreakdownCov"),
    @XmlEnumValue("BAOwnedMedPayCov")
    BA_OWNED_MED_PAY_COV("BAOwnedMedPayCov"),
    @XmlEnumValue("PAMedPayCov")
    PA_MED_PAY_COV("PAMedPayCov"),
    @XmlEnumValue("BADOCMedPayCov")
    BADOC_MED_PAY_COV("BADOCMedPayCov"),
    @XmlEnumValue("PALimitedMexicoCov")
    PA_LIMITED_MEXICO_COV("PALimitedMexicoCov"),
    @XmlEnumValue("BOPMineSubCov")
    BOP_MINE_SUB_COV("BOPMineSubCov"),
    @XmlEnumValue("BOPMoneySecCov")
    BOP_MONEY_SEC_COV("BOPMoneySecCov"),
    @XmlEnumValue("BOPMotelCov")
    BOP_MOTEL_COV("BOPMotelCov"),
    @XmlEnumValue("BOPNewAcquiredOrgCov")
    BOP_NEW_ACQUIRED_ORG_COV("BOPNewAcquiredOrgCov"),
    @XmlEnumValue("BANonownedLiabCov")
    BA_NONOWNED_LIAB_COV("BANonownedLiabCov"),
    @XmlEnumValue("BOPNonOwnedAutoCov")
    BOP_NON_OWNED_AUTO_COV("BOPNonOwnedAutoCov"),
    @XmlEnumValue("BANonOwndSSExtendCov")
    BA_NON_OWND_SS_EXTEND_COV("BANonOwndSSExtendCov"),
    @XmlEnumValue("BOPOrdinanceCov")
    BOP_ORDINANCE_COV("BOPOrdinanceCov"),
    @XmlEnumValue("HOLI_OtherInsuredResidence_HOE")
    HOLI_OTHER_INSURED_RESIDENCE_HOE("HOLI_OtherInsuredResidence_HOE"),
    @XmlEnumValue("WCOtherStatesInsurance")
    WC_OTHER_STATES_INSURANCE("WCOtherStatesInsurance"),
    @XmlEnumValue("HODW_OtherStructuresOffPremise_HOE")
    HODW_OTHER_STRUCTURES_OFF_PREMISE_HOE("HODW_OtherStructuresOffPremise_HOE"),
    @XmlEnumValue("HODW_OtherStructuresOnPremise_HOE")
    HODW_OTHER_STRUCTURES_ON_PREMISE_HOE("HODW_OtherStructuresOnPremise_HOE"),
    @XmlEnumValue("BOPOutdoorProp")
    BOP_OUTDOOR_PROP("BOPOutdoorProp"),
    @XmlEnumValue("BOPOutSignCov")
    BOP_OUT_SIGN_COV("BOPOutSignCov"),
    @XmlEnumValue("BOPPersAdvertInj")
    BOP_PERS_ADVERT_INJ("BOPPersAdvertInj"),
    @XmlEnumValue("BOPPersonalEffects")
    BOP_PERSONAL_EFFECTS("BOPPersonalEffects"),
    @XmlEnumValue("HODW_PersonalPropertyOffResidence_HOE")
    HODW_PERSONAL_PROPERTY_OFF_RESIDENCE_HOE("HODW_PersonalPropertyOffResidence_HOE"),
    @XmlEnumValue("BOPPersPropOffPrem")
    BOP_PERS_PROP_OFF_PREM("BOPPersPropOffPrem"),
    @XmlEnumValue("BOPPesticideApplicatorCov")
    BOP_PESTICIDE_APPLICATOR_COV("BOPPesticideApplicatorCov"),
    @XmlEnumValue("GLPestHerbicideApplicatorSchedule")
    GL_PEST_HERBICIDE_APPLICATOR_SCHEDULE("GLPestHerbicideApplicatorSchedule"),
    @XmlEnumValue("BOPPharmacistCov")
    BOP_PHARMACIST_COV("BOPPharmacistCov"),
    CA_PIP_AR("CA_PIP_AR"),
    PAPIP_AR("PAPIP_AR"),
    CAPIP_DE("CAPIP_DE"),
    PAPIP_DE("PAPIP_DE"),
    CA_PIP_DC("CA_PIP_DC"),
    PAPIP_DC("PAPIP_DC"),
    CAPIP_FL("CAPIP_FL"),
    PAPIP_FL("PAPIP_FL"),
    CAPIP_HI("CAPIP_HI"),
    PAPIP_HI("PAPIP_HI"),
    CAPIP_KS("CAPIP_KS"),
    PAPIP_KS("PAPIP_KS"),
    CAPIP_KY("CAPIP_KY"),
    PAPIP_KY("PAPIP_KY"),
    CAPIP_MD("CAPIP_MD"),
    PAPIP_MD("PAPIP_MD"),
    CAPIP_MA("CAPIP_MA"),
    PAPIP_MA("PAPIP_MA"),
    CAPIP_MI("CAPIP_MI"),
    PAPIP_MI("PAPIP_MI"),
    CAPIP_MN("CAPIP_MN"),
    PAPIP_MN("PAPIP_MN"),
    CAPIP_NJ("CAPIP_NJ"),
    PAPIP_NJ("PAPIP_NJ"),
    CAPIP_NY("CAPIP_NY"),
    PAPIP_NY("PAPIP_NY"),
    CAPIP_ND("CAPIP_ND"),
    PAPIP_ND("PAPIP_ND"),
    CAPIP_OR("CAPIP_OR"),
    PAPIP_OR("PAPIP_OR"),
    CAPIP_PA("CAPIP_PA"),
    PAPIP_PA("PAPIP_PA"),
    CAPIP_TX("CAPIP_TX"),
    PAPIP_TX("PAPIP_TX"),
    CAPIP_UT("CAPIP_UT"),
    PAPIP_UT("PAPIP_UT"),
    CAPIP_WA("CAPIP_WA"),
    PAPIP_WA("PAPIP_WA"),
    @XmlEnumValue("BOPPropertyCov")
    BOP_PROPERTY_COV("BOPPropertyCov"),
    @XmlEnumValue("BOPPollutionCov")
    BOP_POLLUTION_COV("BOPPollutionCov"),
    @XmlEnumValue("PollutionBroadLimited")
    POLLUTION_BROAD_LIMITED("PollutionBroadLimited"),
    @XmlEnumValue("BAPollutLiabBasicCov")
    BA_POLLUT_LIAB_BASIC_COV("BAPollutLiabBasicCov"),
    @XmlEnumValue("BAPollutLiabBoardCov")
    BA_POLLUT_LIAB_BOARD_COV("BAPollutLiabBoardCov"),
    @XmlEnumValue("BOPMedExpCov")
    BOP_MED_EXP_COV("BOPMedExpCov"),
    @XmlEnumValue("PUP_Primary_LiabilityCov_PUE")
    PUP_PRIMARY_LIABILITY_COV_PUE("PUP_Primary_LiabilityCov_PUE"),
    @XmlEnumValue("BOPPrinterCov")
    BOP_PRINTER_COV("BOPPrinterCov"),
    @XmlEnumValue("ProductWithdrawalLtd")
    PRODUCT_WITHDRAWAL_LTD("ProductWithdrawalLtd"),
    @XmlEnumValue("BAPropProtectionCov")
    BA_PROP_PROTECTION_COV("BAPropProtectionCov"),
    @XmlEnumValue("PAPropProtectionCov")
    PA_PROP_PROTECTION_COV("PAPropProtectionCov"),
    @XmlEnumValue("PALossOfUseCov")
    PA_LOSS_OF_USE_COV("PALossOfUseCov"),
    @XmlEnumValue("BARentalCov")
    BA_RENTAL_COV("BARentalCov"),
    @XmlEnumValue("PARentalCov")
    PA_RENTAL_COV("PARentalCov"),
    @XmlEnumValue("HODW_ScheduledProperty_HOE")
    HODW_SCHEDULED_PROPERTY_HOE("HODW_ScheduledProperty_HOE"),
    @XmlEnumValue("BASeasonTrailerLiabCov")
    BA_SEASON_TRAILER_LIAB_COV("BASeasonTrailerLiabCov"),
    @XmlEnumValue("HODW_SectionI_Ded_HOE")
    HODW_SECTION_I_DED_HOE("HODW_SectionI_Ded_HOE"),
    @XmlEnumValue("HOLI_LimitedComputer_HOE")
    HOLI_LIMITED_COMPUTER_HOE("HOLI_LimitedComputer_HOE"),
    @XmlEnumValue("HOLI_FungiCov_HOE")
    HOLI_FUNGI_COV_HOE("HOLI_FungiCov_HOE"),
    @XmlEnumValue("BOPSelfStorCov")
    BOP_SELF_STOR_COV("BOPSelfStorCov"),
    @XmlEnumValue("GLPollutionShortTermCov")
    GL_POLLUTION_SHORT_TERM_COV("GLPollutionShortTermCov"),
    @XmlEnumValue("BOPAdditionalCov")
    BOP_ADDITIONAL_COV("BOPAdditionalCov"),
    @XmlEnumValue("HODW_SpecialLimitsCovC_HOE")
    HODW_SPECIAL_LIMITS_COV_C_HOE("HODW_SpecialLimitsCovC_HOE"),
    @XmlEnumValue("HODW_SpecificStructuresOffPremise_HOE")
    HODW_SPECIFIC_STRUCTURES_OFF_PREMISE_HOE("HODW_SpecificStructuresOffPremise_HOE"),
    @XmlEnumValue("BASpecCausesLossCov")
    BA_SPEC_CAUSES_LOSS_COV("BASpecCausesLossCov"),
    @XmlEnumValue("BOPSpoilageCov")
    BOP_SPOILAGE_COV("BOPSpoilageCov"),
    @XmlEnumValue("WCWorkersCompCov")
    WC_WORKERS_COMP_COV("WCWorkersCompCov"),
    @XmlEnumValue("PATapeDiscMediaCov")
    PA_TAPE_DISC_MEDIA_COV("PATapeDiscMediaCov"),
    @XmlEnumValue("BATapeDiscRecordCov")
    BA_TAPE_DISC_RECORD_COV("BATapeDiscRecordCov"),
    @XmlEnumValue("BOPTenantFireCov")
    BOP_TENANT_FIRE_COV("BOPTenantFireCov"),
    @XmlEnumValue("BOPTenantsLiabilityCov")
    BOP_TENANTS_LIABILITY_COV("BOPTenantsLiabilityCov"),
    @XmlEnumValue("BOPCertTerrorCap")
    BOP_CERT_TERROR_CAP("BOPCertTerrorCap"),
    @XmlEnumValue("BATowingLaborCov")
    BA_TOWING_LABOR_COV("BATowingLaborCov"),
    @XmlEnumValue("PATowingLaborCov")
    PA_TOWING_LABOR_COV("PATowingLaborCov"),
    @XmlEnumValue("trip")
    TRIP("trip"),
    @XmlEnumValue("GLUndergroundResourceCov")
    GL_UNDERGROUND_RESOURCE_COV("GLUndergroundResourceCov"),
    @XmlEnumValue("BAOwnedUIMBICov")
    BA_OWNED_UIMBI_COV("BAOwnedUIMBICov"),
    @XmlEnumValue("PAUIMBICov")
    PAUIMBI_COV("PAUIMBICov"),
    @XmlEnumValue("BADOCUnderinsCov")
    BADOC_UNDERINS_COV("BADOCUnderinsCov"),
    @XmlEnumValue("BAOwnedUIMPDCov")
    BA_OWNED_UIMPD_COV("BAOwnedUIMPDCov"),
    @XmlEnumValue("PAUIMPDCov")
    PAUIMPD_COV("PAUIMPDCov"),
    @XmlEnumValue("BAOwnedUMBICov")
    BA_OWNED_UMBI_COV("BAOwnedUMBICov"),
    @XmlEnumValue("PAUMBICov")
    PAUMBI_COV("PAUMBICov"),
    @XmlEnumValue("BADOCUninsuredCov")
    BADOC_UNINSURED_COV("BADOCUninsuredCov"),
    @XmlEnumValue("BAOwnedUMPDCov")
    BA_OWNED_UMPD_COV("BAOwnedUMPDCov"),
    @XmlEnumValue("PAUMPDCov")
    PAUMPD_COV("PAUMPDCov"),
    @XmlEnumValue("BAOwnedUMBISuppCov")
    BA_OWNED_UMBI_SUPP_COV("BAOwnedUMBISuppCov"),
    @XmlEnumValue("BOPUtilDirectCov")
    BOP_UTIL_DIRECT_COV("BOPUtilDirectCov"),
    @XmlEnumValue("BOPUtilTimeCov")
    BOP_UTIL_TIME_COV("BOPUtilTimeCov"),
    @XmlEnumValue("BOPVacancyChangeCov")
    BOP_VACANCY_CHANGE_COV("BOPVacancyChangeCov"),
    @XmlEnumValue("BOPVacancyCov")
    BOP_VACANCY_COV("BOPVacancyCov"),
    @XmlEnumValue("BOPValuablePapersCov")
    BOP_VALUABLE_PAPERS_COV("BOPValuablePapersCov"),
    @XmlEnumValue("BOPVetCov")
    BOP_VET_COV("BOPVetCov"),
    @XmlEnumValue("BOPOverflowCov")
    BOP_OVERFLOW_COV("BOPOverflowCov"),
    @XmlEnumValue("BOPLocWindHailCov")
    BOP_LOC_WIND_HAIL_COV("BOPLocWindHailCov"),
    @XmlEnumValue("WCEmpLiabCov")
    WC_EMP_LIAB_COV("WCEmpLiabCov"),
    @XmlEnumValue("WCWorkCompDeductCov")
    WC_WORK_COMP_DEDUCT_COV("WCWorkCompDeductCov"),
    @XmlEnumValue("PUP_WorldWideCov_PUE")
    PUP_WORLD_WIDE_COV_PUE("PUP_WorldWideCov_PUE"),
    @XmlEnumValue("XCUSpecified")
    XCU_SPECIFIED("XCUSpecified"),
    @XmlEnumValue("Y2KLimitedCov")
    Y_2_K_LIMITED_COV("Y2KLimitedCov");
    private final String value;

    CoverageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverageType fromValue(String v) {
        for (CoverageType c: CoverageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
