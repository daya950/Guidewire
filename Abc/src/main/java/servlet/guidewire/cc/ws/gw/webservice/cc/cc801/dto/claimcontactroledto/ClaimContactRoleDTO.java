
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimcontactroledto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.ContactRole;
import servlet.guidewire.cc.typekey.CoveredPartyType;
import servlet.guidewire.cc.typekey.YesNo;


/**
 * <p>Java class for ClaimContactRoleDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimContactRoleDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClaimContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredPartyType" type="{http://guidewire.com/cc/typekey}CoveredPartyType" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EvaluationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegotiationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://guidewire.com/cc/typekey}ContactRole" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WitnessPerspective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WitnessPosition" type="{http://guidewire.com/cc/typekey}WitnessPosition" minOccurs="0"/>
 *         &lt;element name="WitnessStatementInd" type="{http://guidewire.com/cc/typekey}YesNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimContactRoleDTO", propOrder = {
    "active",
    "claimContactID",
    "comments",
    "contactID",
    "coveredPartyType",
    "createTime",
    "createUserID",
    "evaluationID",
    "exposureID",
    "incidentID",
    "matterID",
    "negotiationID",
    "partyNumber",
    "policyID",
    "publicID",
    "role",
    "updateTime",
    "updateUserID",
    "witnessPerspective",
    "witnessPosition",
    "witnessStatementInd"
})
public class ClaimContactRoleDTO {

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "ClaimContactID")
    protected String claimContactID;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ContactID")
    protected String contactID;
    @XmlElement(name = "CoveredPartyType")
    @XmlSchemaType(name = "string")
    protected CoveredPartyType coveredPartyType;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "EvaluationID")
    protected String evaluationID;
    @XmlElement(name = "ExposureID")
    protected String exposureID;
    @XmlElement(name = "IncidentID")
    protected String incidentID;
    @XmlElement(name = "MatterID")
    protected String matterID;
    @XmlElement(name = "NegotiationID")
    protected String negotiationID;
    @XmlElement(name = "PartyNumber")
    protected Integer partyNumber;
    @XmlElement(name = "PolicyID")
    protected String policyID;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected ContactRole role;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;
    @XmlElement(name = "WitnessPerspective")
    protected String witnessPerspective;
    @XmlElement(name = "WitnessPosition")
    protected String witnessPosition;
    @XmlElement(name = "WitnessStatementInd")
    @XmlSchemaType(name = "string")
    protected YesNo witnessStatementInd;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the claimContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimContactID() {
        return claimContactID;
    }

    /**
     * Sets the value of the claimContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimContactID(String value) {
        this.claimContactID = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactID(String value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the coveredPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link CoveredPartyType }
     *     
     */
    public CoveredPartyType getCoveredPartyType() {
        return coveredPartyType;
    }

    /**
     * Sets the value of the coveredPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredPartyType }
     *     
     */
    public void setCoveredPartyType(CoveredPartyType value) {
        this.coveredPartyType = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUserID() {
        return createUserID;
    }

    /**
     * Sets the value of the createUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUserID(String value) {
        this.createUserID = value;
    }

    /**
     * Gets the value of the evaluationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationID() {
        return evaluationID;
    }

    /**
     * Sets the value of the evaluationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationID(String value) {
        this.evaluationID = value;
    }

    /**
     * Gets the value of the exposureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposureID() {
        return exposureID;
    }

    /**
     * Sets the value of the exposureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposureID(String value) {
        this.exposureID = value;
    }

    /**
     * Gets the value of the incidentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentID() {
        return incidentID;
    }

    /**
     * Sets the value of the incidentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentID(String value) {
        this.incidentID = value;
    }

    /**
     * Gets the value of the matterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatterID() {
        return matterID;
    }

    /**
     * Sets the value of the matterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatterID(String value) {
        this.matterID = value;
    }

    /**
     * Gets the value of the negotiationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiationID() {
        return negotiationID;
    }

    /**
     * Sets the value of the negotiationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiationID(String value) {
        this.negotiationID = value;
    }

    /**
     * Gets the value of the partyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartyNumber(Integer value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyID(String value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the publicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicID() {
        return publicID;
    }

    /**
     * Sets the value of the publicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicID(String value) {
        this.publicID = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRole }
     *     
     */
    public ContactRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRole }
     *     
     */
    public void setRole(ContactRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the updateUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUserID() {
        return updateUserID;
    }

    /**
     * Sets the value of the updateUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUserID(String value) {
        this.updateUserID = value;
    }

    /**
     * Gets the value of the witnessPerspective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessPerspective() {
        return witnessPerspective;
    }

    /**
     * Sets the value of the witnessPerspective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessPerspective(String value) {
        this.witnessPerspective = value;
    }

    /**
     * Gets the value of the witnessPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessPosition() {
        return witnessPosition;
    }

    /**
     * Sets the value of the witnessPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessPosition(String value) {
        this.witnessPosition = value;
    }

    /**
     * Gets the value of the witnessStatementInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getWitnessStatementInd() {
        return witnessStatementInd;
    }

    /**
     * Sets the value of the witnessStatementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setWitnessStatementInd(YesNo value) {
        this.witnessStatementInd = value;
    }

}
