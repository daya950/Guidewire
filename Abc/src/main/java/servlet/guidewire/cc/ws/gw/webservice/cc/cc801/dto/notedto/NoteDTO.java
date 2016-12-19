
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.LanguageType;
import servlet.guidewire.cc.typekey.NoteSecurityType;
import servlet.guidewire.cc.typekey.NoteTopicType;


/**
 * <p>Java class for NoteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Confidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://guidewire.com/cc/typekey}LanguageType" minOccurs="0"/>
 *         &lt;element name="MatterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityType" type="{http://guidewire.com/cc/typekey}NoteSecurityType" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Topic" type="{http://guidewire.com/cc/typekey}NoteTopicType" minOccurs="0"/>
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
@XmlType(name = "NoteDTO", propOrder = {
    "activityID",
    "authoringDate",
    "body",
    "claimContactID",
    "claimID",
    "confidential",
    "createTime",
    "createUserID",
    "exposureID",
    "language",
    "matterID",
    "publicID",
    "securityType",
    "subject",
    "topic",
    "updateTime",
    "updateUserID"
})
public class NoteDTO {

    @XmlElement(name = "ActivityID")
    protected String activityID;
    @XmlElement(name = "AuthoringDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authoringDate;
    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "ClaimContactID")
    protected String claimContactID;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "Confidential")
    protected Boolean confidential;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "ExposureID")
    protected String exposureID;
    @XmlElement(name = "Language")
    @XmlSchemaType(name = "string")
    protected LanguageType language;
    @XmlElement(name = "MatterID")
    protected String matterID;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "SecurityType")
    @XmlSchemaType(name = "string")
    protected NoteSecurityType securityType;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Topic")
    @XmlSchemaType(name = "string")
    protected NoteTopicType topic;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;

    /**
     * Gets the value of the activityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityID(String value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the authoringDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthoringDate() {
        return authoringDate;
    }

    /**
     * Sets the value of the authoringDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthoringDate(XMLGregorianCalendar value) {
        this.authoringDate = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
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
     * Gets the value of the confidential property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfidential() {
        return confidential;
    }

    /**
     * Sets the value of the confidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfidential(Boolean value) {
        this.confidential = value;
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
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
     * Gets the value of the securityType property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSecurityType }
     *     
     */
    public NoteSecurityType getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSecurityType }
     *     
     */
    public void setSecurityType(NoteSecurityType value) {
        this.securityType = value;
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
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link NoteTopicType }
     *     
     */
    public NoteTopicType getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteTopicType }
     *     
     */
    public void setTopic(NoteTopicType value) {
        this.topic = value;
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

}
