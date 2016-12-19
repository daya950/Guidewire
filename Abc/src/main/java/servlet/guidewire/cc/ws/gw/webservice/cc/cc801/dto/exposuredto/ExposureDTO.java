
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.exposuredto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.ClaimSegment;
import servlet.guidewire.cc.typekey.ClaimStrategy;
import servlet.guidewire.cc.typekey.CoverageType;
import servlet.guidewire.cc.typekey.ExposureState;
import servlet.guidewire.cc.typekey.ExposureType;
import servlet.guidewire.cc.typekey.LossCategory;
import servlet.guidewire.cc.typekey.LossPartyType;
import servlet.guidewire.cc.typekey.ValidationLevel;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ActivityDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.contactdto.ContactDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.documentdto.DocumentDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.NoteDTO;


/**
 * <p>Java class for ExposureDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposureDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignedGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClaimantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CoverageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageSubType" type="{http://guidewire.com/cc/typekey}CoverageSubtype" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureType" type="{http://guidewire.com/cc/typekey}ExposureType" minOccurs="0"/>
 *         &lt;element name="IncidentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossCategory" type="{http://guidewire.com/cc/typekey}LossCategory" minOccurs="0"/>
 *         &lt;element name="LossParty" type="{http://guidewire.com/cc/typekey}LossPartyType" minOccurs="0"/>
 *         &lt;element name="NewActivities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ActivityDTO}ActivityDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NewDocuments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/DocumentDTO}DocumentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NewNotes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/NoteDTO}NoteDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Newdoctor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ContactDTO}ContactDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrimaryCoverage" type="{http://guidewire.com/cc/typekey}CoverageType" minOccurs="0"/>
 *         &lt;element name="PrimaryDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://guidewire.com/cc/typekey}ClaimSegment" minOccurs="0"/>
 *         &lt;element name="State" type="{http://guidewire.com/cc/typekey}ExposureState" minOccurs="0"/>
 *         &lt;element name="Strategy" type="{http://guidewire.com/cc/typekey}ClaimStrategy" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationLevel" type="{http://guidewire.com/cc/typekey}ValidationLevel" minOccurs="0"/>
 *         &lt;element name="doctorIDs" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureDTO", propOrder = {
    "assignedGroupID",
    "assignedUserID",
    "claimID",
    "claimOrder",
    "claimantID",
    "closeDate",
    "coverageID",
    "coverageSubType",
    "createTime",
    "createUserID",
    "exposureType",
    "incidentID",
    "lossCategory",
    "lossParty",
    "newActivities",
    "newDocuments",
    "newNotes",
    "newdoctor",
    "primaryCoverage",
    "primaryDoctorID",
    "publicID",
    "segment",
    "state",
    "strategy",
    "updateTime",
    "updateUserID",
    "validationLevel",
    "doctorIDs"
})
public class ExposureDTO {

    @XmlElement(name = "AssignedGroupID")
    protected String assignedGroupID;
    @XmlElement(name = "AssignedUserID")
    protected String assignedUserID;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "ClaimOrder")
    protected Integer claimOrder;
    @XmlElement(name = "ClaimantID")
    protected String claimantID;
    @XmlElement(name = "CloseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDate;
    @XmlElement(name = "CoverageID")
    protected String coverageID;
    @XmlElement(name = "CoverageSubType")
    protected String coverageSubType;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "ExposureType")
    @XmlSchemaType(name = "string")
    protected ExposureType exposureType;
    @XmlElement(name = "IncidentID")
    protected String incidentID;
    @XmlElement(name = "LossCategory")
    @XmlSchemaType(name = "string")
    protected LossCategory lossCategory;
    @XmlElement(name = "LossParty")
    @XmlSchemaType(name = "string")
    protected LossPartyType lossParty;
    @XmlElement(name = "NewActivities")
    protected ExposureDTO.NewActivities newActivities;
    @XmlElement(name = "NewDocuments")
    protected ExposureDTO.NewDocuments newDocuments;
    @XmlElement(name = "NewNotes")
    protected ExposureDTO.NewNotes newNotes;
    @XmlElement(name = "Newdoctor")
    protected ExposureDTO.Newdoctor newdoctor;
    @XmlElement(name = "PrimaryCoverage")
    @XmlSchemaType(name = "string")
    protected CoverageType primaryCoverage;
    @XmlElement(name = "PrimaryDoctorID")
    protected String primaryDoctorID;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "Segment")
    @XmlSchemaType(name = "string")
    protected ClaimSegment segment;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected ExposureState state;
    @XmlElement(name = "Strategy")
    @XmlSchemaType(name = "string")
    protected ClaimStrategy strategy;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;
    @XmlElement(name = "ValidationLevel")
    @XmlSchemaType(name = "string")
    protected ValidationLevel validationLevel;
    protected ExposureDTO.DoctorIDs doctorIDs;

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
     * Gets the value of the assignedUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserID() {
        return assignedUserID;
    }

    /**
     * Sets the value of the assignedUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserID(String value) {
        this.assignedUserID = value;
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
     * Gets the value of the claimOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClaimOrder() {
        return claimOrder;
    }

    /**
     * Sets the value of the claimOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClaimOrder(Integer value) {
        this.claimOrder = value;
    }

    /**
     * Gets the value of the claimantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimantID() {
        return claimantID;
    }

    /**
     * Sets the value of the claimantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimantID(String value) {
        this.claimantID = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the coverageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageID() {
        return coverageID;
    }

    /**
     * Sets the value of the coverageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageID(String value) {
        this.coverageID = value;
    }

    /**
     * Gets the value of the coverageSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageSubType() {
        return coverageSubType;
    }

    /**
     * Sets the value of the coverageSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageSubType(String value) {
        this.coverageSubType = value;
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
     * Gets the value of the exposureType property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType }
     *     
     */
    public ExposureType getExposureType() {
        return exposureType;
    }

    /**
     * Sets the value of the exposureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType }
     *     
     */
    public void setExposureType(ExposureType value) {
        this.exposureType = value;
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
     * Gets the value of the lossCategory property.
     * 
     * @return
     *     possible object is
     *     {@link LossCategory }
     *     
     */
    public LossCategory getLossCategory() {
        return lossCategory;
    }

    /**
     * Sets the value of the lossCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossCategory }
     *     
     */
    public void setLossCategory(LossCategory value) {
        this.lossCategory = value;
    }

    /**
     * Gets the value of the lossParty property.
     * 
     * @return
     *     possible object is
     *     {@link LossPartyType }
     *     
     */
    public LossPartyType getLossParty() {
        return lossParty;
    }

    /**
     * Sets the value of the lossParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossPartyType }
     *     
     */
    public void setLossParty(LossPartyType value) {
        this.lossParty = value;
    }

    /**
     * Gets the value of the newActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureDTO.NewActivities }
     *     
     */
    public ExposureDTO.NewActivities getNewActivities() {
        return newActivities;
    }

    /**
     * Sets the value of the newActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureDTO.NewActivities }
     *     
     */
    public void setNewActivities(ExposureDTO.NewActivities value) {
        this.newActivities = value;
    }

    /**
     * Gets the value of the newDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureDTO.NewDocuments }
     *     
     */
    public ExposureDTO.NewDocuments getNewDocuments() {
        return newDocuments;
    }

    /**
     * Sets the value of the newDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureDTO.NewDocuments }
     *     
     */
    public void setNewDocuments(ExposureDTO.NewDocuments value) {
        this.newDocuments = value;
    }

    /**
     * Gets the value of the newNotes property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureDTO.NewNotes }
     *     
     */
    public ExposureDTO.NewNotes getNewNotes() {
        return newNotes;
    }

    /**
     * Sets the value of the newNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureDTO.NewNotes }
     *     
     */
    public void setNewNotes(ExposureDTO.NewNotes value) {
        this.newNotes = value;
    }

    /**
     * Gets the value of the newdoctor property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureDTO.Newdoctor }
     *     
     */
    public ExposureDTO.Newdoctor getNewdoctor() {
        return newdoctor;
    }

    /**
     * Sets the value of the newdoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureDTO.Newdoctor }
     *     
     */
    public void setNewdoctor(ExposureDTO.Newdoctor value) {
        this.newdoctor = value;
    }

    /**
     * Gets the value of the primaryCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageType }
     *     
     */
    public CoverageType getPrimaryCoverage() {
        return primaryCoverage;
    }

    /**
     * Sets the value of the primaryCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageType }
     *     
     */
    public void setPrimaryCoverage(CoverageType value) {
        this.primaryCoverage = value;
    }

    /**
     * Gets the value of the primaryDoctorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDoctorID() {
        return primaryDoctorID;
    }

    /**
     * Sets the value of the primaryDoctorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDoctorID(String value) {
        this.primaryDoctorID = value;
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
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimSegment }
     *     
     */
    public ClaimSegment getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimSegment }
     *     
     */
    public void setSegment(ClaimSegment value) {
        this.segment = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureState }
     *     
     */
    public ExposureState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureState }
     *     
     */
    public void setState(ExposureState value) {
        this.state = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStrategy }
     *     
     */
    public ClaimStrategy getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStrategy }
     *     
     */
    public void setStrategy(ClaimStrategy value) {
        this.strategy = value;
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
     * Gets the value of the validationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationLevel }
     *     
     */
    public ValidationLevel getValidationLevel() {
        return validationLevel;
    }

    /**
     * Sets the value of the validationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationLevel }
     *     
     */
    public void setValidationLevel(ValidationLevel value) {
        this.validationLevel = value;
    }

    /**
     * Gets the value of the doctorIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureDTO.DoctorIDs }
     *     
     */
    public ExposureDTO.DoctorIDs getDoctorIDs() {
        return doctorIDs;
    }

    /**
     * Sets the value of the doctorIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureDTO.DoctorIDs }
     *     
     */
    public void setDoctorIDs(ExposureDTO.DoctorIDs value) {
        this.doctorIDs = value;
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
    public static class DoctorIDs {

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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ActivityDTO}ActivityDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewActivities {

        @XmlElement(name = "Entry", nillable = true)
        protected List<ActivityDTO> entry;

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
         * {@link ActivityDTO }
         * 
         * 
         */
        public List<ActivityDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ActivityDTO>();
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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/DocumentDTO}DocumentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewDocuments {

        @XmlElement(name = "Entry", nillable = true)
        protected List<DocumentDTO> entry;

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
         * {@link DocumentDTO }
         * 
         * 
         */
        public List<DocumentDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<DocumentDTO>();
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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/NoteDTO}NoteDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewNotes {

        @XmlElement(name = "Entry", nillable = true)
        protected List<NoteDTO> entry;

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
         * {@link NoteDTO }
         * 
         * 
         */
        public List<NoteDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<NoteDTO>();
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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ContactDTO}ContactDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class Newdoctor {

        @XmlElement(name = "Entry", nillable = true)
        protected List<ContactDTO> entry;

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
         * {@link ContactDTO }
         * 
         * 
         */
        public List<ContactDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ContactDTO>();
            }
            return this.entry;
        }

    }

}
