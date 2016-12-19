
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.ClaimState;
import servlet.guidewire.cc.typekey.Currency;
import servlet.guidewire.cc.typekey.LossCause;
import servlet.guidewire.cc.typekey.LossType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ActivityDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimcontactdto.ClaimContactDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.contactdto.ContactDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.documentdto.DocumentDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.exposuredto.ExposureDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.incidentdto.IncidentDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.NoteDTO;


/**
 * <p>Java class for ClaimDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignedGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureIDs" minOccurs="0">
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
 *         &lt;element name="Fault" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FaultRating" type="{http://guidewire.com/cc/typekey}FaultRating" minOccurs="0"/>
 *         &lt;element name="FirstIntakeDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidentIDs" minOccurs="0">
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
 *         &lt;element name="LossCause" type="{http://guidewire.com/cc/typekey}LossCause" minOccurs="0"/>
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LossType" type="{http://guidewire.com/cc/typekey}LossType" minOccurs="0"/>
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
 *         &lt;element name="NewContacts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ClaimContactDTO}ClaimContactDTO" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="NewExposures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ExposureDTO}ExposureDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NewIncidents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/IncidentDTO}IncidentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="Newwitness" minOccurs="0">
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
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://guidewire.com/cc/typekey}ClaimState" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="hospitalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maincontactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nursecasemgrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reporterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subrogatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="witnessIDs" minOccurs="0">
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
@XmlType(name = "ClaimDTO", propOrder = {
    "assignedGroupID",
    "assignedUserID",
    "claimNumber",
    "closeDate",
    "closed",
    "contactIDs",
    "createTime",
    "createUserID",
    "currency",
    "description",
    "exposureIDs",
    "fault",
    "faultRating",
    "firstIntakeDoctorID",
    "incidentIDs",
    "lossCause",
    "lossDate",
    "lossType",
    "newActivities",
    "newContacts",
    "newDocuments",
    "newExposures",
    "newIncidents",
    "newNotes",
    "newdoctor",
    "newwitness",
    "policyID",
    "previousUserID",
    "primaryDoctorID",
    "publicID",
    "state",
    "updateTime",
    "updateUserID",
    "claimantID",
    "doctorIDs",
    "hospitalID",
    "maincontactID",
    "nursecasemgrID",
    "reporterID",
    "subrogatorID",
    "supervisorID",
    "witnessIDs"
})
public class ClaimDTO {

    @XmlElement(name = "AssignedGroupID")
    protected String assignedGroupID;
    @XmlElement(name = "AssignedUserID")
    protected String assignedUserID;
    @XmlElement(name = "ClaimNumber")
    protected String claimNumber;
    @XmlElement(name = "CloseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDate;
    @XmlElement(name = "Closed")
    protected Boolean closed;
    @XmlElement(name = "ContactIDs")
    protected ClaimDTO.ContactIDs contactIDs;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "Currency")
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExposureIDs")
    protected ClaimDTO.ExposureIDs exposureIDs;
    @XmlElement(name = "Fault")
    protected BigDecimal fault;
    @XmlElement(name = "FaultRating")
    protected String faultRating;
    @XmlElement(name = "FirstIntakeDoctorID")
    protected String firstIntakeDoctorID;
    @XmlElement(name = "IncidentIDs")
    protected ClaimDTO.IncidentIDs incidentIDs;
    @XmlElement(name = "LossCause")
    @XmlSchemaType(name = "string")
    protected LossCause lossCause;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lossDate;
    @XmlElement(name = "LossType")
    @XmlSchemaType(name = "string")
    protected LossType lossType;
    @XmlElement(name = "NewActivities")
    protected ClaimDTO.NewActivities newActivities;
    @XmlElement(name = "NewContacts")
    protected ClaimDTO.NewContacts newContacts;
    @XmlElement(name = "NewDocuments")
    protected ClaimDTO.NewDocuments newDocuments;
    @XmlElement(name = "NewExposures")
    protected ClaimDTO.NewExposures newExposures;
    @XmlElement(name = "NewIncidents")
    protected ClaimDTO.NewIncidents newIncidents;
    @XmlElement(name = "NewNotes")
    protected ClaimDTO.NewNotes newNotes;
    @XmlElement(name = "Newdoctor")
    protected ClaimDTO.Newdoctor newdoctor;
    @XmlElement(name = "Newwitness")
    protected ClaimDTO.Newwitness newwitness;
    @XmlElement(name = "PolicyID")
    protected String policyID;
    @XmlElement(name = "PreviousUserID")
    protected String previousUserID;
    @XmlElement(name = "PrimaryDoctorID")
    protected String primaryDoctorID;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected ClaimState state;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;
    protected String claimantID;
    protected ClaimDTO.DoctorIDs doctorIDs;
    protected String hospitalID;
    protected String maincontactID;
    protected String nursecasemgrID;
    protected String reporterID;
    protected String subrogatorID;
    protected String supervisorID;
    protected ClaimDTO.WitnessIDs witnessIDs;

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
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the contactIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.ContactIDs }
     *     
     */
    public ClaimDTO.ContactIDs getContactIDs() {
        return contactIDs;
    }

    /**
     * Sets the value of the contactIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.ContactIDs }
     *     
     */
    public void setContactIDs(ClaimDTO.ContactIDs value) {
        this.contactIDs = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the exposureIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.ExposureIDs }
     *     
     */
    public ClaimDTO.ExposureIDs getExposureIDs() {
        return exposureIDs;
    }

    /**
     * Sets the value of the exposureIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.ExposureIDs }
     *     
     */
    public void setExposureIDs(ClaimDTO.ExposureIDs value) {
        this.exposureIDs = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFault(BigDecimal value) {
        this.fault = value;
    }

    /**
     * Gets the value of the faultRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultRating() {
        return faultRating;
    }

    /**
     * Sets the value of the faultRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultRating(String value) {
        this.faultRating = value;
    }

    /**
     * Gets the value of the firstIntakeDoctorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstIntakeDoctorID() {
        return firstIntakeDoctorID;
    }

    /**
     * Sets the value of the firstIntakeDoctorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstIntakeDoctorID(String value) {
        this.firstIntakeDoctorID = value;
    }

    /**
     * Gets the value of the incidentIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.IncidentIDs }
     *     
     */
    public ClaimDTO.IncidentIDs getIncidentIDs() {
        return incidentIDs;
    }

    /**
     * Sets the value of the incidentIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.IncidentIDs }
     *     
     */
    public void setIncidentIDs(ClaimDTO.IncidentIDs value) {
        this.incidentIDs = value;
    }

    /**
     * Gets the value of the lossCause property.
     * 
     * @return
     *     possible object is
     *     {@link LossCause }
     *     
     */
    public LossCause getLossCause() {
        return lossCause;
    }

    /**
     * Sets the value of the lossCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossCause }
     *     
     */
    public void setLossCause(LossCause value) {
        this.lossCause = value;
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
     * Gets the value of the lossType property.
     * 
     * @return
     *     possible object is
     *     {@link LossType }
     *     
     */
    public LossType getLossType() {
        return lossType;
    }

    /**
     * Sets the value of the lossType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossType }
     *     
     */
    public void setLossType(LossType value) {
        this.lossType = value;
    }

    /**
     * Gets the value of the newActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.NewActivities }
     *     
     */
    public ClaimDTO.NewActivities getNewActivities() {
        return newActivities;
    }

    /**
     * Sets the value of the newActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.NewActivities }
     *     
     */
    public void setNewActivities(ClaimDTO.NewActivities value) {
        this.newActivities = value;
    }

    /**
     * Gets the value of the newContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.NewContacts }
     *     
     */
    public ClaimDTO.NewContacts getNewContacts() {
        return newContacts;
    }

    /**
     * Sets the value of the newContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.NewContacts }
     *     
     */
    public void setNewContacts(ClaimDTO.NewContacts value) {
        this.newContacts = value;
    }

    /**
     * Gets the value of the newDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.NewDocuments }
     *     
     */
    public ClaimDTO.NewDocuments getNewDocuments() {
        return newDocuments;
    }

    /**
     * Sets the value of the newDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.NewDocuments }
     *     
     */
    public void setNewDocuments(ClaimDTO.NewDocuments value) {
        this.newDocuments = value;
    }

    /**
     * Gets the value of the newExposures property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.NewExposures }
     *     
     */
    public ClaimDTO.NewExposures getNewExposures() {
        return newExposures;
    }

    /**
     * Sets the value of the newExposures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.NewExposures }
     *     
     */
    public void setNewExposures(ClaimDTO.NewExposures value) {
        this.newExposures = value;
    }

    /**
     * Gets the value of the newIncidents property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.NewIncidents }
     *     
     */
    public ClaimDTO.NewIncidents getNewIncidents() {
        return newIncidents;
    }

    /**
     * Sets the value of the newIncidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.NewIncidents }
     *     
     */
    public void setNewIncidents(ClaimDTO.NewIncidents value) {
        this.newIncidents = value;
    }

    /**
     * Gets the value of the newNotes property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.NewNotes }
     *     
     */
    public ClaimDTO.NewNotes getNewNotes() {
        return newNotes;
    }

    /**
     * Sets the value of the newNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.NewNotes }
     *     
     */
    public void setNewNotes(ClaimDTO.NewNotes value) {
        this.newNotes = value;
    }

    /**
     * Gets the value of the newdoctor property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.Newdoctor }
     *     
     */
    public ClaimDTO.Newdoctor getNewdoctor() {
        return newdoctor;
    }

    /**
     * Sets the value of the newdoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.Newdoctor }
     *     
     */
    public void setNewdoctor(ClaimDTO.Newdoctor value) {
        this.newdoctor = value;
    }

    /**
     * Gets the value of the newwitness property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.Newwitness }
     *     
     */
    public ClaimDTO.Newwitness getNewwitness() {
        return newwitness;
    }

    /**
     * Sets the value of the newwitness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.Newwitness }
     *     
     */
    public void setNewwitness(ClaimDTO.Newwitness value) {
        this.newwitness = value;
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
     * Gets the value of the previousUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousUserID() {
        return previousUserID;
    }

    /**
     * Sets the value of the previousUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousUserID(String value) {
        this.previousUserID = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimState }
     *     
     */
    public ClaimState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimState }
     *     
     */
    public void setState(ClaimState value) {
        this.state = value;
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
     * Gets the value of the doctorIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.DoctorIDs }
     *     
     */
    public ClaimDTO.DoctorIDs getDoctorIDs() {
        return doctorIDs;
    }

    /**
     * Sets the value of the doctorIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.DoctorIDs }
     *     
     */
    public void setDoctorIDs(ClaimDTO.DoctorIDs value) {
        this.doctorIDs = value;
    }

    /**
     * Gets the value of the hospitalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalID() {
        return hospitalID;
    }

    /**
     * Sets the value of the hospitalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalID(String value) {
        this.hospitalID = value;
    }

    /**
     * Gets the value of the maincontactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaincontactID() {
        return maincontactID;
    }

    /**
     * Sets the value of the maincontactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaincontactID(String value) {
        this.maincontactID = value;
    }

    /**
     * Gets the value of the nursecasemgrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNursecasemgrID() {
        return nursecasemgrID;
    }

    /**
     * Sets the value of the nursecasemgrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNursecasemgrID(String value) {
        this.nursecasemgrID = value;
    }

    /**
     * Gets the value of the reporterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterID() {
        return reporterID;
    }

    /**
     * Sets the value of the reporterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterID(String value) {
        this.reporterID = value;
    }

    /**
     * Gets the value of the subrogatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubrogatorID() {
        return subrogatorID;
    }

    /**
     * Sets the value of the subrogatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubrogatorID(String value) {
        this.subrogatorID = value;
    }

    /**
     * Gets the value of the supervisorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorID() {
        return supervisorID;
    }

    /**
     * Sets the value of the supervisorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorID(String value) {
        this.supervisorID = value;
    }

    /**
     * Gets the value of the witnessIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO.WitnessIDs }
     *     
     */
    public ClaimDTO.WitnessIDs getWitnessIDs() {
        return witnessIDs;
    }

    /**
     * Sets the value of the witnessIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO.WitnessIDs }
     *     
     */
    public void setWitnessIDs(ClaimDTO.WitnessIDs value) {
        this.witnessIDs = value;
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
    public static class ExposureIDs {

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
    public static class IncidentIDs {

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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ClaimContactDTO}ClaimContactDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewContacts {

        @XmlElement(name = "Entry", nillable = true)
        protected List<ClaimContactDTO> entry;

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
         * {@link ClaimContactDTO }
         * 
         * 
         */
        public List<ClaimContactDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ClaimContactDTO>();
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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ExposureDTO}ExposureDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewExposures {

        @XmlElement(name = "Entry", nillable = true)
        protected List<ExposureDTO> entry;

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
         * {@link ExposureDTO }
         * 
         * 
         */
        public List<ExposureDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ExposureDTO>();
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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/IncidentDTO}IncidentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewIncidents {

        @XmlElement(name = "Entry", nillable = true)
        protected List<IncidentDTO> entry;

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
         * {@link IncidentDTO }
         * 
         * 
         */
        public List<IncidentDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<IncidentDTO>();
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
    public static class Newwitness {

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
    public static class WitnessIDs {

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
