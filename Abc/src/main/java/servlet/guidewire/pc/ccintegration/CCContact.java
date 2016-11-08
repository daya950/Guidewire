
package main.java.servlet.guidewire.pc.ccintegration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CCContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllAddresses" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactAddresses" type="{http://guidewire.com/pc/ccintegration}CCContactAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactCompany" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="OfficialIDs" type="{http://guidewire.com/pc/ccintegration}CCOfficialID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="AddressBookUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BureauIDOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DOLIDOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DUNSOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EmailAddress1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EmailAddress2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FEINOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FaxPhoneCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FaxPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FaxPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HomePhoneCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HomePhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NCCIIDOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NameKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PreferredCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SSNOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STAXOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STUNOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SpecialtyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TUNSOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaxStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VendorNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VendorType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="W9Received" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="W9ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="W9ValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="W9ValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="WithholdingRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="WorkPhoneCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WorkPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCContact", propOrder = {
    "allAddresses",
    "contactAddresses",
    "contactCompany",
    "officialIDs",
    "primaryAddress",
    "primaryContact"
})
@XmlSeeAlso({
    CCPerson.class,
    CCCompany.class,
    CCPlace.class
})
public class CCContact {

    @XmlElementRef(name = "AllAddresses", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> allAddresses;
    @XmlElement(name = "ContactAddresses")
    protected List<CCContactAddress> contactAddresses;
    @XmlElement(name = "ContactCompany")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contactCompany;
    @XmlElement(name = "OfficialIDs")
    protected List<CCOfficialID> officialIDs;
    @XmlElement(name = "PrimaryAddress")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object primaryAddress;
    @XmlElement(name = "PrimaryContact")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object primaryContact;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "AddressBookUID")
    protected String addressBookUID;
    @XmlAttribute(name = "BureauIDOfficialID")
    protected String bureauIDOfficialID;
    @XmlAttribute(name = "DOLIDOfficialID")
    protected String dolidOfficialID;
    @XmlAttribute(name = "DUNSOfficialID")
    protected String dunsOfficialID;
    @XmlAttribute(name = "EmailAddress1")
    protected String emailAddress1;
    @XmlAttribute(name = "EmailAddress2")
    protected String emailAddress2;
    @XmlAttribute(name = "FEINOfficialID")
    protected String feinOfficialID;
    @XmlAttribute(name = "FaxPhoneCountry")
    protected String faxPhoneCountry;
    @XmlAttribute(name = "FaxPhone")
    protected String faxPhone;
    @XmlAttribute(name = "FaxPhoneExtension")
    protected String faxPhoneExtension;
    @XmlAttribute(name = "HomePhoneCountry")
    protected String homePhoneCountry;
    @XmlAttribute(name = "HomePhone")
    protected String homePhone;
    @XmlAttribute(name = "HomePhoneExtension")
    protected String homePhoneExtension;
    @XmlAttribute(name = "NCCIIDOfficialID")
    protected String ncciidOfficialID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "NameKanji")
    protected String nameKanji;
    @XmlAttribute(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "OrganizationType")
    protected String organizationType;
    @XmlAttribute(name = "PolicySystemID")
    protected String policySystemID;
    @XmlAttribute(name = "Preferred")
    protected Boolean preferred;
    @XmlAttribute(name = "PreferredCurrency")
    protected String preferredCurrency;
    @XmlAttribute(name = "PrimaryLanguage")
    protected String primaryLanguage;
    @XmlAttribute(name = "PrimaryPhone")
    protected String primaryPhone;
    @XmlAttribute(name = "Score")
    protected Integer score;
    @XmlAttribute(name = "SSNOfficialID")
    protected String ssnOfficialID;
    @XmlAttribute(name = "STAXOfficialID")
    protected String staxOfficialID;
    @XmlAttribute(name = "STUNOfficialID")
    protected String stunOfficialID;
    @XmlAttribute(name = "SpecialtyType")
    protected String specialtyType;
    @XmlAttribute(name = "TUNSOfficialID")
    protected String tunsOfficialID;
    @XmlAttribute(name = "TaxID")
    protected String taxID;
    @XmlAttribute(name = "TaxStatus")
    protected String taxStatus;
    @XmlAttribute(name = "VendorNumber")
    protected String vendorNumber;
    @XmlAttribute(name = "VendorType")
    protected String vendorType;
    @XmlAttribute(name = "W9Received")
    protected Boolean w9Received;
    @XmlAttribute(name = "W9ReceivedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar w9ReceivedDate;
    @XmlAttribute(name = "W9ValidFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar w9ValidFrom;
    @XmlAttribute(name = "W9ValidTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar w9ValidTo;
    @XmlAttribute(name = "WithholdingRate")
    protected BigDecimal withholdingRate;
    @XmlAttribute(name = "WorkPhoneCountry")
    protected String workPhoneCountry;
    @XmlAttribute(name = "WorkPhone")
    protected String workPhone;
    @XmlAttribute(name = "WorkPhoneExtension")
    protected String workPhoneExtension;

    /**
     * Gets the value of the allAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAllAddresses() {
        if (allAddresses == null) {
            allAddresses = new ArrayList<JAXBElement<Object>>();
        }
        return this.allAddresses;
    }

    /**
     * Gets the value of the contactAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCContactAddress }
     * 
     * 
     */
    public List<CCContactAddress> getContactAddresses() {
        if (contactAddresses == null) {
            contactAddresses = new ArrayList<CCContactAddress>();
        }
        return this.contactAddresses;
    }

    /**
     * Gets the value of the contactCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactCompany() {
        return contactCompany;
    }

    /**
     * Sets the value of the contactCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactCompany(Object value) {
        this.contactCompany = value;
    }

    /**
     * Gets the value of the officialIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officialIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficialIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCOfficialID }
     * 
     * 
     */
    public List<CCOfficialID> getOfficialIDs() {
        if (officialIDs == null) {
            officialIDs = new ArrayList<CCOfficialID>();
        }
        return this.officialIDs;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrimaryAddress(Object value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrimaryContact(Object value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the addressBookUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressBookUID() {
        return addressBookUID;
    }

    /**
     * Sets the value of the addressBookUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressBookUID(String value) {
        this.addressBookUID = value;
    }

    /**
     * Gets the value of the bureauIDOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureauIDOfficialID() {
        return bureauIDOfficialID;
    }

    /**
     * Sets the value of the bureauIDOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureauIDOfficialID(String value) {
        this.bureauIDOfficialID = value;
    }

    /**
     * Gets the value of the dolidOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOLIDOfficialID() {
        return dolidOfficialID;
    }

    /**
     * Sets the value of the dolidOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOLIDOfficialID(String value) {
        this.dolidOfficialID = value;
    }

    /**
     * Gets the value of the dunsOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSOfficialID() {
        return dunsOfficialID;
    }

    /**
     * Sets the value of the dunsOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSOfficialID(String value) {
        this.dunsOfficialID = value;
    }

    /**
     * Gets the value of the emailAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress1() {
        return emailAddress1;
    }

    /**
     * Sets the value of the emailAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress1(String value) {
        this.emailAddress1 = value;
    }

    /**
     * Gets the value of the emailAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress2() {
        return emailAddress2;
    }

    /**
     * Sets the value of the emailAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress2(String value) {
        this.emailAddress2 = value;
    }

    /**
     * Gets the value of the feinOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEINOfficialID() {
        return feinOfficialID;
    }

    /**
     * Sets the value of the feinOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEINOfficialID(String value) {
        this.feinOfficialID = value;
    }

    /**
     * Gets the value of the faxPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhoneCountry() {
        return faxPhoneCountry;
    }

    /**
     * Sets the value of the faxPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhoneCountry(String value) {
        this.faxPhoneCountry = value;
    }

    /**
     * Gets the value of the faxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhone() {
        return faxPhone;
    }

    /**
     * Sets the value of the faxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhone(String value) {
        this.faxPhone = value;
    }

    /**
     * Gets the value of the faxPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhoneExtension() {
        return faxPhoneExtension;
    }

    /**
     * Sets the value of the faxPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhoneExtension(String value) {
        this.faxPhoneExtension = value;
    }

    /**
     * Gets the value of the homePhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneCountry() {
        return homePhoneCountry;
    }

    /**
     * Sets the value of the homePhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneCountry(String value) {
        this.homePhoneCountry = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the homePhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneExtension() {
        return homePhoneExtension;
    }

    /**
     * Sets the value of the homePhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneExtension(String value) {
        this.homePhoneExtension = value;
    }

    /**
     * Gets the value of the ncciidOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCCIIDOfficialID() {
        return ncciidOfficialID;
    }

    /**
     * Sets the value of the ncciidOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCCIIDOfficialID(String value) {
        this.ncciidOfficialID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameKanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameKanji() {
        return nameKanji;
    }

    /**
     * Sets the value of the nameKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameKanji(String value) {
        this.nameKanji = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the policySystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySystemID() {
        return policySystemID;
    }

    /**
     * Sets the value of the policySystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySystemID(String value) {
        this.policySystemID = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the preferredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCurrency(String value) {
        this.preferredCurrency = value;
    }

    /**
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguage(String value) {
        this.primaryLanguage = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the ssnOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSNOfficialID() {
        return ssnOfficialID;
    }

    /**
     * Sets the value of the ssnOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSNOfficialID(String value) {
        this.ssnOfficialID = value;
    }

    /**
     * Gets the value of the staxOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAXOfficialID() {
        return staxOfficialID;
    }

    /**
     * Sets the value of the staxOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAXOfficialID(String value) {
        this.staxOfficialID = value;
    }

    /**
     * Gets the value of the stunOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUNOfficialID() {
        return stunOfficialID;
    }

    /**
     * Sets the value of the stunOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUNOfficialID(String value) {
        this.stunOfficialID = value;
    }

    /**
     * Gets the value of the specialtyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialtyType() {
        return specialtyType;
    }

    /**
     * Sets the value of the specialtyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialtyType(String value) {
        this.specialtyType = value;
    }

    /**
     * Gets the value of the tunsOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUNSOfficialID() {
        return tunsOfficialID;
    }

    /**
     * Sets the value of the tunsOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUNSOfficialID(String value) {
        this.tunsOfficialID = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the taxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatus(String value) {
        this.taxStatus = value;
    }

    /**
     * Gets the value of the vendorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumber() {
        return vendorNumber;
    }

    /**
     * Sets the value of the vendorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumber(String value) {
        this.vendorNumber = value;
    }

    /**
     * Gets the value of the vendorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorType() {
        return vendorType;
    }

    /**
     * Sets the value of the vendorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorType(String value) {
        this.vendorType = value;
    }

    /**
     * Gets the value of the w9Received property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isW9Received() {
        return w9Received;
    }

    /**
     * Sets the value of the w9Received property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setW9Received(Boolean value) {
        this.w9Received = value;
    }

    /**
     * Gets the value of the w9ReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getW9ReceivedDate() {
        return w9ReceivedDate;
    }

    /**
     * Sets the value of the w9ReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setW9ReceivedDate(XMLGregorianCalendar value) {
        this.w9ReceivedDate = value;
    }

    /**
     * Gets the value of the w9ValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getW9ValidFrom() {
        return w9ValidFrom;
    }

    /**
     * Sets the value of the w9ValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setW9ValidFrom(XMLGregorianCalendar value) {
        this.w9ValidFrom = value;
    }

    /**
     * Gets the value of the w9ValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getW9ValidTo() {
        return w9ValidTo;
    }

    /**
     * Sets the value of the w9ValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setW9ValidTo(XMLGregorianCalendar value) {
        this.w9ValidTo = value;
    }

    /**
     * Gets the value of the withholdingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWithholdingRate() {
        return withholdingRate;
    }

    /**
     * Sets the value of the withholdingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWithholdingRate(BigDecimal value) {
        this.withholdingRate = value;
    }

    /**
     * Gets the value of the workPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneCountry() {
        return workPhoneCountry;
    }

    /**
     * Sets the value of the workPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneCountry(String value) {
        this.workPhoneCountry = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneExtension(String value) {
        this.workPhoneExtension = value;
    }

}
