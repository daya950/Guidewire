
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claiminfodto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.Currency;
import servlet.guidewire.cc.typekey.Jurisdiction;


/**
 * <p>Java class for ClaimInfoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimInfoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdjusterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssigneeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimAggregateLimitRptIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClaimCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimInAssociationIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimantNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContactIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoverageLineMatchDataIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoverageLineMatchDataInfoValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="InsuredID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JurisdictionState" type="{http://guidewire.com/cc/typekey}Jurisdiction" minOccurs="0"/>
 *         &lt;element name="LoadCommandID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LossLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoticeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyPeriodIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInfoDTO", propOrder = {
    "accessIDs",
    "adjusterID",
    "assignedGroupID",
    "assigneeDisplayName",
    "claimAggregateLimitRptIDs",
    "claimCurrency",
    "claimID",
    "claimInAssociationIDs",
    "claimNumber",
    "claimantNames",
    "contactIDs",
    "coverageLineMatchDataIDs",
    "coverageLineMatchDataInfoValid",
    "createTime",
    "createUserID",
    "currency",
    "insuredID",
    "jurisdictionState",
    "loadCommandID",
    "lossDate",
    "lossLocationCode",
    "lossLocationID",
    "noticeDate",
    "policyNumber",
    "policyPeriodIDs",
    "publicID",
    "purgeDate",
    "updateTime",
    "updateUserID"
})
public class ClaimInfoDTO {

    @XmlElement(name = "AccessIDs")
    protected ClaimInfoDTO.AccessIDs accessIDs;
    @XmlElement(name = "AdjusterID")
    protected String adjusterID;
    @XmlElement(name = "AssignedGroupID")
    protected String assignedGroupID;
    @XmlElement(name = "AssigneeDisplayName")
    protected String assigneeDisplayName;
    @XmlElement(name = "ClaimAggregateLimitRptIDs")
    protected ClaimInfoDTO.ClaimAggregateLimitRptIDs claimAggregateLimitRptIDs;
    @XmlElement(name = "ClaimCurrency")
    @XmlSchemaType(name = "string")
    protected Currency claimCurrency;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "ClaimInAssociationIDs")
    protected ClaimInfoDTO.ClaimInAssociationIDs claimInAssociationIDs;
    @XmlElement(name = "ClaimNumber")
    protected String claimNumber;
    @XmlElement(name = "ClaimantNames")
    protected ClaimInfoDTO.ClaimantNames claimantNames;
    @XmlElement(name = "ContactIDs")
    protected ClaimInfoDTO.ContactIDs contactIDs;
    @XmlElement(name = "CoverageLineMatchDataIDs")
    protected ClaimInfoDTO.CoverageLineMatchDataIDs coverageLineMatchDataIDs;
    @XmlElement(name = "CoverageLineMatchDataInfoValid")
    protected Boolean coverageLineMatchDataInfoValid;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "Currency")
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "InsuredID")
    protected String insuredID;
    @XmlElement(name = "JurisdictionState")
    @XmlSchemaType(name = "string")
    protected Jurisdiction jurisdictionState;
    @XmlElement(name = "LoadCommandID")
    protected Long loadCommandID;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lossDate;
    @XmlElement(name = "LossLocationCode")
    protected String lossLocationCode;
    @XmlElement(name = "LossLocationID")
    protected String lossLocationID;
    @XmlElement(name = "NoticeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar noticeDate;
    @XmlElement(name = "PolicyNumber")
    protected String policyNumber;
    @XmlElement(name = "PolicyPeriodIDs")
    protected ClaimInfoDTO.PolicyPeriodIDs policyPeriodIDs;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "PurgeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purgeDate;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;

    /**
     * Gets the value of the accessIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.AccessIDs }
     *     
     */
    public ClaimInfoDTO.AccessIDs getAccessIDs() {
        return accessIDs;
    }

    /**
     * Sets the value of the accessIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.AccessIDs }
     *     
     */
    public void setAccessIDs(ClaimInfoDTO.AccessIDs value) {
        this.accessIDs = value;
    }

    /**
     * Gets the value of the adjusterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjusterID() {
        return adjusterID;
    }

    /**
     * Sets the value of the adjusterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjusterID(String value) {
        this.adjusterID = value;
    }

    /**
     * Gets the value of the assignedGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedGroupID() {
        return assignedGroupID;
    }

    /**
     * Sets the value of the assignedGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedGroupID(String value) {
        this.assignedGroupID = value;
    }

    /**
     * Gets the value of the assigneeDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigneeDisplayName() {
        return assigneeDisplayName;
    }

    /**
     * Sets the value of the assigneeDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigneeDisplayName(String value) {
        this.assigneeDisplayName = value;
    }

    /**
     * Gets the value of the claimAggregateLimitRptIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.ClaimAggregateLimitRptIDs }
     *     
     */
    public ClaimInfoDTO.ClaimAggregateLimitRptIDs getClaimAggregateLimitRptIDs() {
        return claimAggregateLimitRptIDs;
    }

    /**
     * Sets the value of the claimAggregateLimitRptIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.ClaimAggregateLimitRptIDs }
     *     
     */
    public void setClaimAggregateLimitRptIDs(ClaimInfoDTO.ClaimAggregateLimitRptIDs value) {
        this.claimAggregateLimitRptIDs = value;
    }

    /**
     * Gets the value of the claimCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getClaimCurrency() {
        return claimCurrency;
    }

    /**
     * Sets the value of the claimCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setClaimCurrency(Currency value) {
        this.claimCurrency = value;
    }

    /**
     * Gets the value of the claimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the claimInAssociationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.ClaimInAssociationIDs }
     *     
     */
    public ClaimInfoDTO.ClaimInAssociationIDs getClaimInAssociationIDs() {
        return claimInAssociationIDs;
    }

    /**
     * Sets the value of the claimInAssociationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.ClaimInAssociationIDs }
     *     
     */
    public void setClaimInAssociationIDs(ClaimInfoDTO.ClaimInAssociationIDs value) {
        this.claimInAssociationIDs = value;
    }

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the claimantNames property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.ClaimantNames }
     *     
     */
    public ClaimInfoDTO.ClaimantNames getClaimantNames() {
        return claimantNames;
    }

    /**
     * Sets the value of the claimantNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.ClaimantNames }
     *     
     */
    public void setClaimantNames(ClaimInfoDTO.ClaimantNames value) {
        this.claimantNames = value;
    }

    /**
     * Gets the value of the contactIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.ContactIDs }
     *     
     */
    public ClaimInfoDTO.ContactIDs getContactIDs() {
        return contactIDs;
    }

    /**
     * Sets the value of the contactIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.ContactIDs }
     *     
     */
    public void setContactIDs(ClaimInfoDTO.ContactIDs value) {
        this.contactIDs = value;
    }

    /**
     * Gets the value of the coverageLineMatchDataIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.CoverageLineMatchDataIDs }
     *     
     */
    public ClaimInfoDTO.CoverageLineMatchDataIDs getCoverageLineMatchDataIDs() {
        return coverageLineMatchDataIDs;
    }

    /**
     * Sets the value of the coverageLineMatchDataIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.CoverageLineMatchDataIDs }
     *     
     */
    public void setCoverageLineMatchDataIDs(ClaimInfoDTO.CoverageLineMatchDataIDs value) {
        this.coverageLineMatchDataIDs = value;
    }

    /**
     * Gets the value of the coverageLineMatchDataInfoValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoverageLineMatchDataInfoValid() {
        return coverageLineMatchDataInfoValid;
    }

    /**
     * Sets the value of the coverageLineMatchDataInfoValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoverageLineMatchDataInfoValid(Boolean value) {
        this.coverageLineMatchDataInfoValid = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the insuredID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredID() {
        return insuredID;
    }

    /**
     * Sets the value of the insuredID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredID(String value) {
        this.insuredID = value;
    }

    /**
     * Gets the value of the jurisdictionState property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction }
     *     
     */
    public Jurisdiction getJurisdictionState() {
        return jurisdictionState;
    }

    /**
     * Sets the value of the jurisdictionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction }
     *     
     */
    public void setJurisdictionState(Jurisdiction value) {
        this.jurisdictionState = value;
    }

    /**
     * Gets the value of the loadCommandID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoadCommandID() {
        return loadCommandID;
    }

    /**
     * Sets the value of the loadCommandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoadCommandID(Long value) {
        this.loadCommandID = value;
    }

    /**
     * Gets the value of the lossDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossDate() {
        return lossDate;
    }

    /**
     * Sets the value of the lossDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossDate(XMLGregorianCalendar value) {
        this.lossDate = value;
    }

    /**
     * Gets the value of the lossLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossLocationCode() {
        return lossLocationCode;
    }

    /**
     * Sets the value of the lossLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossLocationCode(String value) {
        this.lossLocationCode = value;
    }

    /**
     * Gets the value of the lossLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossLocationID() {
        return lossLocationID;
    }

    /**
     * Sets the value of the lossLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossLocationID(String value) {
        this.lossLocationID = value;
    }

    /**
     * Gets the value of the noticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoticeDate() {
        return noticeDate;
    }

    /**
     * Sets the value of the noticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoticeDate(XMLGregorianCalendar value) {
        this.noticeDate = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the policyPeriodIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoDTO.PolicyPeriodIDs }
     *     
     */
    public ClaimInfoDTO.PolicyPeriodIDs getPolicyPeriodIDs() {
        return policyPeriodIDs;
    }

    /**
     * Sets the value of the policyPeriodIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoDTO.PolicyPeriodIDs }
     *     
     */
    public void setPolicyPeriodIDs(ClaimInfoDTO.PolicyPeriodIDs value) {
        this.policyPeriodIDs = value;
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
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class AccessIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ClaimAggregateLimitRptIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ClaimInAssociationIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ClaimantNames {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ContactIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class CoverageLineMatchDataIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class PolicyPeriodIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }

}
