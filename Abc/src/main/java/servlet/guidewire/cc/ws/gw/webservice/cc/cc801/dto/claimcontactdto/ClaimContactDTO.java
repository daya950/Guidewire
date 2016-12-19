
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimcontactdto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimcontactroledto.ClaimContactRoleDTO;


/**
 * <p>Java class for ClaimContactDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimContactDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimantFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNameDenorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactProhibited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewRoles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ClaimContactRoleDTO}ClaimContactRoleDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PersonFirstNameDenorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastNameDenorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoleIDs" minOccurs="0">
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
@XmlType(name = "ClaimContactDTO", propOrder = {
    "claimID",
    "claimantFlag",
    "contactID",
    "contactNameDenorm",
    "contactProhibited",
    "createTime",
    "createUserID",
    "newRoles",
    "personFirstNameDenorm",
    "personLastNameDenorm",
    "policyID",
    "publicID",
    "roleIDs",
    "updateTime",
    "updateUserID"
})
public class ClaimContactDTO {

    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "ClaimantFlag")
    protected Boolean claimantFlag;
    @XmlElement(name = "ContactID")
    protected String contactID;
    @XmlElement(name = "ContactNameDenorm")
    protected String contactNameDenorm;
    @XmlElement(name = "ContactProhibited")
    protected Boolean contactProhibited;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "NewRoles")
    protected ClaimContactDTO.NewRoles newRoles;
    @XmlElement(name = "PersonFirstNameDenorm")
    protected String personFirstNameDenorm;
    @XmlElement(name = "PersonLastNameDenorm")
    protected String personLastNameDenorm;
    @XmlElement(name = "PolicyID")
    protected String policyID;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "RoleIDs")
    protected ClaimContactDTO.RoleIDs roleIDs;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;

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
     * Gets the value of the claimantFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimantFlag() {
        return claimantFlag;
    }

    /**
     * Sets the value of the claimantFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimantFlag(Boolean value) {
        this.claimantFlag = value;
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
     * Gets the value of the contactNameDenorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameDenorm() {
        return contactNameDenorm;
    }

    /**
     * Sets the value of the contactNameDenorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameDenorm(String value) {
        this.contactNameDenorm = value;
    }

    /**
     * Gets the value of the contactProhibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactProhibited() {
        return contactProhibited;
    }

    /**
     * Sets the value of the contactProhibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactProhibited(Boolean value) {
        this.contactProhibited = value;
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
     * Gets the value of the newRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimContactDTO.NewRoles }
     *     
     */
    public ClaimContactDTO.NewRoles getNewRoles() {
        return newRoles;
    }

    /**
     * Sets the value of the newRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimContactDTO.NewRoles }
     *     
     */
    public void setNewRoles(ClaimContactDTO.NewRoles value) {
        this.newRoles = value;
    }

    /**
     * Gets the value of the personFirstNameDenorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstNameDenorm() {
        return personFirstNameDenorm;
    }

    /**
     * Sets the value of the personFirstNameDenorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstNameDenorm(String value) {
        this.personFirstNameDenorm = value;
    }

    /**
     * Gets the value of the personLastNameDenorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonLastNameDenorm() {
        return personLastNameDenorm;
    }

    /**
     * Sets the value of the personLastNameDenorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonLastNameDenorm(String value) {
        this.personLastNameDenorm = value;
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
     * Gets the value of the roleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimContactDTO.RoleIDs }
     *     
     */
    public ClaimContactDTO.RoleIDs getRoleIDs() {
        return roleIDs;
    }

    /**
     * Sets the value of the roleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimContactDTO.RoleIDs }
     *     
     */
    public void setRoleIDs(ClaimContactDTO.RoleIDs value) {
        this.roleIDs = value;
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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ClaimContactRoleDTO}ClaimContactRoleDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewRoles {

        @XmlElement(name = "Entry", nillable = true)
        protected List<ClaimContactRoleDTO> entry;

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
         * {@link ClaimContactRoleDTO }
         * 
         * 
         */
        public List<ClaimContactRoleDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ClaimContactRoleDTO>();
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
    public static class RoleIDs {

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
