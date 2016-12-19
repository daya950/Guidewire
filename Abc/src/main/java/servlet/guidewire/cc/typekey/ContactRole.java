
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="insured"/>
 *     &lt;enumeration value="claimant"/>
 *     &lt;enumeration value="maincontact"/>
 *     &lt;enumeration value="reporter"/>
 *     &lt;enumeration value="driver"/>
 *     &lt;enumeration value="passenger"/>
 *     &lt;enumeration value="witness"/>
 *     &lt;enumeration value="altcontact"/>
 *     &lt;enumeration value="attorney"/>
 *     &lt;enumeration value="doctor"/>
 *     &lt;enumeration value="hospital"/>
 *     &lt;enumeration value="vendor"/>
 *     &lt;enumeration value="employer"/>
 *     &lt;enumeration value="injured"/>
 *     &lt;enumeration value="nursecasemgr"/>
 *     &lt;enumeration value="recoverypayer"/>
 *     &lt;enumeration value="checkpayee"/>
 *     &lt;enumeration value="recoveryonbehalfof"/>
 *     &lt;enumeration value="wccarrier"/>
 *     &lt;enumeration value="repairshop"/>
 *     &lt;enumeration value="supervisor"/>
 *     &lt;enumeration value="negcontact"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="plaintiffs"/>
 *     &lt;enumeration value="activityowner"/>
 *     &lt;enumeration value="agent"/>
 *     &lt;enumeration value="arbitrationvenue"/>
 *     &lt;enumeration value="arbitrator"/>
 *     &lt;enumeration value="AppraisalSource"/>
 *     &lt;enumeration value="assessor"/>
 *     &lt;enumeration value="casemgmtco"/>
 *     &lt;enumeration value="casemgr"/>
 *     &lt;enumeration value="claimantdep"/>
 *     &lt;enumeration value="codefendant"/>
 *     &lt;enumeration value="collection"/>
 *     &lt;enumeration value="coveredparty"/>
 *     &lt;enumeration value="debrisremoval"/>
 *     &lt;enumeration value="defendant"/>
 *     &lt;enumeration value="disbenprovider"/>
 *     &lt;enumeration value="doingbusinessas"/>
 *     &lt;enumeration value="ems"/>
 *     &lt;enumeration value="excludedparty"/>
 *     &lt;enumeration value="subrogator"/>
 *     &lt;enumeration value="filedby"/>
 *     &lt;enumeration value="FirstIntakeDoctor"/>
 *     &lt;enumeration value="formeragent"/>
 *     &lt;enumeration value="formercheckpayee"/>
 *     &lt;enumeration value="formercoveredparty"/>
 *     &lt;enumeration value="formerdoingbusinessas"/>
 *     &lt;enumeration value="formerexcludedparty"/>
 *     &lt;enumeration value="formerinsured"/>
 *     &lt;enumeration value="formerpolicyholder"/>
 *     &lt;enumeration value="formerunderwriter"/>
 *     &lt;enumeration value="hearingjudge"/>
 *     &lt;enumeration value="hearingvenue"/>
 *     &lt;enumeration value="InsuredRep"/>
 *     &lt;enumeration value="judge"/>
 *     &lt;enumeration value="judges"/>
 *     &lt;enumeration value="LawEnfcAgcy"/>
 *     &lt;enumeration value="leadparalegal"/>
 *     &lt;enumeration value="mattermanager"/>
 *     &lt;enumeration value="lienholder"/>
 *     &lt;enumeration value="lodgingprovider"/>
 *     &lt;enumeration value="mediationvenue"/>
 *     &lt;enumeration value="mediator"/>
 *     &lt;enumeration value="OccTherapist"/>
 *     &lt;enumeration value="incidentowner"/>
 *     &lt;enumeration value="pedestrian"/>
 *     &lt;enumeration value="PhysTherapist"/>
 *     &lt;enumeration value="plaintiff"/>
 *     &lt;enumeration value="policyholder"/>
 *     &lt;enumeration value="fnolassessor"/>
 *     &lt;enumeration value="defenseattorney"/>
 *     &lt;enumeration value="defensefirm"/>
 *     &lt;enumeration value="PrimaryDoctor"/>
 *     &lt;enumeration value="plaintifffirm"/>
 *     &lt;enumeration value="plaintiffatt"/>
 *     &lt;enumeration value="recoveryagent"/>
 *     &lt;enumeration value="rsbenprovider"/>
 *     &lt;enumeration value="adverseparty"/>
 *     &lt;enumeration value="salvagebuyer"/>
 *     &lt;enumeration value="salvageservice"/>
 *     &lt;enumeration value="secdefattorney"/>
 *     &lt;enumeration value="secdefensefirm"/>
 *     &lt;enumeration value="secplaintifffirm"/>
 *     &lt;enumeration value="secplaintiffatt"/>
 *     &lt;enumeration value="servicerequestparticipant"/>
 *     &lt;enumeration value="servicerequestspecialist"/>
 *     &lt;enumeration value="TowingAgcy"/>
 *     &lt;enumeration value="underwriter"/>
 *     &lt;enumeration value="venue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactRole", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ContactRole {

    @XmlEnumValue("insured")
    INSURED("insured"),
    @XmlEnumValue("claimant")
    CLAIMANT("claimant"),
    @XmlEnumValue("maincontact")
    MAINCONTACT("maincontact"),
    @XmlEnumValue("reporter")
    REPORTER("reporter"),
    @XmlEnumValue("driver")
    DRIVER("driver"),
    @XmlEnumValue("passenger")
    PASSENGER("passenger"),
    @XmlEnumValue("witness")
    WITNESS("witness"),
    @XmlEnumValue("altcontact")
    ALTCONTACT("altcontact"),
    @XmlEnumValue("attorney")
    ATTORNEY("attorney"),
    @XmlEnumValue("doctor")
    DOCTOR("doctor"),
    @XmlEnumValue("hospital")
    HOSPITAL("hospital"),
    @XmlEnumValue("vendor")
    VENDOR("vendor"),
    @XmlEnumValue("employer")
    EMPLOYER("employer"),
    @XmlEnumValue("injured")
    INJURED("injured"),
    @XmlEnumValue("nursecasemgr")
    NURSECASEMGR("nursecasemgr"),
    @XmlEnumValue("recoverypayer")
    RECOVERYPAYER("recoverypayer"),
    @XmlEnumValue("checkpayee")
    CHECKPAYEE("checkpayee"),
    @XmlEnumValue("recoveryonbehalfof")
    RECOVERYONBEHALFOF("recoveryonbehalfof"),
    @XmlEnumValue("wccarrier")
    WCCARRIER("wccarrier"),
    @XmlEnumValue("repairshop")
    REPAIRSHOP("repairshop"),
    @XmlEnumValue("supervisor")
    SUPERVISOR("supervisor"),
    @XmlEnumValue("negcontact")
    NEGCONTACT("negcontact"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("plaintiffs")
    PLAINTIFFS("plaintiffs"),
    @XmlEnumValue("activityowner")
    ACTIVITYOWNER("activityowner"),
    @XmlEnumValue("agent")
    AGENT("agent"),
    @XmlEnumValue("arbitrationvenue")
    ARBITRATIONVENUE("arbitrationvenue"),
    @XmlEnumValue("arbitrator")
    ARBITRATOR("arbitrator"),
    @XmlEnumValue("AppraisalSource")
    APPRAISAL_SOURCE("AppraisalSource"),
    @XmlEnumValue("assessor")
    ASSESSOR("assessor"),
    @XmlEnumValue("casemgmtco")
    CASEMGMTCO("casemgmtco"),
    @XmlEnumValue("casemgr")
    CASEMGR("casemgr"),
    @XmlEnumValue("claimantdep")
    CLAIMANTDEP("claimantdep"),
    @XmlEnumValue("codefendant")
    CODEFENDANT("codefendant"),
    @XmlEnumValue("collection")
    COLLECTION("collection"),
    @XmlEnumValue("coveredparty")
    COVEREDPARTY("coveredparty"),
    @XmlEnumValue("debrisremoval")
    DEBRISREMOVAL("debrisremoval"),
    @XmlEnumValue("defendant")
    DEFENDANT("defendant"),
    @XmlEnumValue("disbenprovider")
    DISBENPROVIDER("disbenprovider"),
    @XmlEnumValue("doingbusinessas")
    DOINGBUSINESSAS("doingbusinessas"),
    @XmlEnumValue("ems")
    EMS("ems"),
    @XmlEnumValue("excludedparty")
    EXCLUDEDPARTY("excludedparty"),
    @XmlEnumValue("subrogator")
    SUBROGATOR("subrogator"),
    @XmlEnumValue("filedby")
    FILEDBY("filedby"),
    @XmlEnumValue("FirstIntakeDoctor")
    FIRST_INTAKE_DOCTOR("FirstIntakeDoctor"),
    @XmlEnumValue("formeragent")
    FORMERAGENT("formeragent"),
    @XmlEnumValue("formercheckpayee")
    FORMERCHECKPAYEE("formercheckpayee"),
    @XmlEnumValue("formercoveredparty")
    FORMERCOVEREDPARTY("formercoveredparty"),
    @XmlEnumValue("formerdoingbusinessas")
    FORMERDOINGBUSINESSAS("formerdoingbusinessas"),
    @XmlEnumValue("formerexcludedparty")
    FORMEREXCLUDEDPARTY("formerexcludedparty"),
    @XmlEnumValue("formerinsured")
    FORMERINSURED("formerinsured"),
    @XmlEnumValue("formerpolicyholder")
    FORMERPOLICYHOLDER("formerpolicyholder"),
    @XmlEnumValue("formerunderwriter")
    FORMERUNDERWRITER("formerunderwriter"),
    @XmlEnumValue("hearingjudge")
    HEARINGJUDGE("hearingjudge"),
    @XmlEnumValue("hearingvenue")
    HEARINGVENUE("hearingvenue"),
    @XmlEnumValue("InsuredRep")
    INSURED_REP("InsuredRep"),
    @XmlEnumValue("judge")
    JUDGE("judge"),
    @XmlEnumValue("judges")
    JUDGES("judges"),
    @XmlEnumValue("LawEnfcAgcy")
    LAW_ENFC_AGCY("LawEnfcAgcy"),
    @XmlEnumValue("leadparalegal")
    LEADPARALEGAL("leadparalegal"),
    @XmlEnumValue("mattermanager")
    MATTERMANAGER("mattermanager"),
    @XmlEnumValue("lienholder")
    LIENHOLDER("lienholder"),
    @XmlEnumValue("lodgingprovider")
    LODGINGPROVIDER("lodgingprovider"),
    @XmlEnumValue("mediationvenue")
    MEDIATIONVENUE("mediationvenue"),
    @XmlEnumValue("mediator")
    MEDIATOR("mediator"),
    @XmlEnumValue("OccTherapist")
    OCC_THERAPIST("OccTherapist"),
    @XmlEnumValue("incidentowner")
    INCIDENTOWNER("incidentowner"),
    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),
    @XmlEnumValue("PhysTherapist")
    PHYS_THERAPIST("PhysTherapist"),
    @XmlEnumValue("plaintiff")
    PLAINTIFF("plaintiff"),
    @XmlEnumValue("policyholder")
    POLICYHOLDER("policyholder"),
    @XmlEnumValue("fnolassessor")
    FNOLASSESSOR("fnolassessor"),
    @XmlEnumValue("defenseattorney")
    DEFENSEATTORNEY("defenseattorney"),
    @XmlEnumValue("defensefirm")
    DEFENSEFIRM("defensefirm"),
    @XmlEnumValue("PrimaryDoctor")
    PRIMARY_DOCTOR("PrimaryDoctor"),
    @XmlEnumValue("plaintifffirm")
    PLAINTIFFFIRM("plaintifffirm"),
    @XmlEnumValue("plaintiffatt")
    PLAINTIFFATT("plaintiffatt"),
    @XmlEnumValue("recoveryagent")
    RECOVERYAGENT("recoveryagent"),
    @XmlEnumValue("rsbenprovider")
    RSBENPROVIDER("rsbenprovider"),
    @XmlEnumValue("adverseparty")
    ADVERSEPARTY("adverseparty"),
    @XmlEnumValue("salvagebuyer")
    SALVAGEBUYER("salvagebuyer"),
    @XmlEnumValue("salvageservice")
    SALVAGESERVICE("salvageservice"),
    @XmlEnumValue("secdefattorney")
    SECDEFATTORNEY("secdefattorney"),
    @XmlEnumValue("secdefensefirm")
    SECDEFENSEFIRM("secdefensefirm"),
    @XmlEnumValue("secplaintifffirm")
    SECPLAINTIFFFIRM("secplaintifffirm"),
    @XmlEnumValue("secplaintiffatt")
    SECPLAINTIFFATT("secplaintiffatt"),
    @XmlEnumValue("servicerequestparticipant")
    SERVICEREQUESTPARTICIPANT("servicerequestparticipant"),
    @XmlEnumValue("servicerequestspecialist")
    SERVICEREQUESTSPECIALIST("servicerequestspecialist"),
    @XmlEnumValue("TowingAgcy")
    TOWING_AGCY("TowingAgcy"),
    @XmlEnumValue("underwriter")
    UNDERWRITER("underwriter"),
    @XmlEnumValue("venue")
    VENUE("venue");
    private final String value;

    ContactRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactRole fromValue(String v) {
        for (ContactRole c: ContactRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
