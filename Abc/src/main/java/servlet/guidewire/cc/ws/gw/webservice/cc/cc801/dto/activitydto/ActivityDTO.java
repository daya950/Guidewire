
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.ActivityClass;
import servlet.guidewire.cc.typekey.ActivityType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.NoteDTO;


/**
 * <p>Java class for ActivityDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityClass" type="{http://guidewire.com/cc/typekey}ActivityClass" minOccurs="0"/>
 *         &lt;element name="ActivityPatternID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://guidewire.com/cc/typekey}ActivityType" minOccurs="0"/>
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
@XmlType(name = "ActivityDTO", propOrder = {
    "activityClass",
    "activityPatternID",
    "activityStatus",
    "approvalIssue",
    "assignedGroupID",
    "assignedUserID",
    "claimID",
    "claimantID",
    "createTime",
    "createUserID",
    "description",
    "exposureID",
    "newNotes",
    "publicID",
    "subject",
    "type",
    "updateTime",
    "updateUserID"
})
public class ActivityDTO {

    @XmlElement(name = "ActivityClass")
    @XmlSchemaType(name = "string")
    protected ActivityClass activityClass;
    @XmlElement(name = "ActivityPatternID")
    protected String activityPatternID;
    @XmlElement(name = "ActivityStatus")
    protected String activityStatus;
    @XmlElement(name = "ApprovalIssue")
    protected String approvalIssue;
    @XmlElement(name = "AssignedGroupID")
    protected String assignedGroupID;
    @XmlElement(name = "AssignedUserID")
    protected String assignedUserID;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "ClaimantID")
    protected String claimantID;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExposureID")
    protected String exposureID;
    @XmlElement(name = "NewNotes")
    protected ActivityDTO.NewNotes newNotes;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ActivityType type;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;

    /**
     * Gets the value of the activityClass property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityClass }
     *     
     */
    public ActivityClass getActivityClass() {
        return activityClass;
    }

    /**
     * Sets the value of the activityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityClass }
     *     
     */
    public void setActivityClass(ActivityClass value) {
        this.activityClass = value;
    }

    /**
     * Gets the value of the activityPatternID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityPatternID() {
        return activityPatternID;
    }

    /**
     * Sets the value of the activityPatternID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityPatternID(String value) {
        this.activityPatternID = value;
    }

    /**
     * Gets the value of the activityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityStatus() {
        return activityStatus;
    }

    /**
     * Sets the value of the activityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityStatus(String value) {
        this.activityStatus = value;
    }

    /**
     * Gets the value of the approvalIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalIssue() {
        return approvalIssue;
    }

    /**
     * Sets the value of the approvalIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalIssue(String value) {
        this.approvalIssue = value;
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
     * Gets the value of the newNotes property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityDTO.NewNotes }
     *     
     */
    public ActivityDTO.NewNotes getNewNotes() {
        return newNotes;
    }

    /**
     * Sets the value of the newNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityDTO.NewNotes }
     *     
     */
    public void setNewNotes(ActivityDTO.NewNotes value) {
        this.newNotes = value;
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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityType }
     *     
     */
    public ActivityType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityType }
     *     
     */
    public void setType(ActivityType value) {
        this.type = value;
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

}
