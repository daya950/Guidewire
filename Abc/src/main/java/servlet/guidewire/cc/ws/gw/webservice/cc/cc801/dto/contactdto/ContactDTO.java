
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.contactdto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.Contact;
import servlet.guidewire.cc.typekey.ContactCreationApprovalStatus;
import servlet.guidewire.cc.typekey.Currency;
import servlet.guidewire.cc.typekey.GenderType;
import servlet.guidewire.cc.typekey.Jurisdiction;
import servlet.guidewire.cc.typekey.MaritalStatus;
import servlet.guidewire.cc.typekey.NamePrefix;
import servlet.guidewire.cc.typekey.NameSuffix;
import servlet.guidewire.cc.typekey.OrganizationType;
import servlet.guidewire.cc.typekey.PhoneCountryCode;
import servlet.guidewire.cc.typekey.PrimaryPhoneType;
import servlet.guidewire.cc.typekey.SpecialtyType;
import servlet.guidewire.cc.typekey.TaxFilingStatusType;
import servlet.guidewire.cc.typekey.TaxStatus;
import servlet.guidewire.cc.typekey.ValidationLevel;
import servlet.guidewire.cc.typekey.VendorType;


/**
 * <p>Java class for ContactDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressBookUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoRepairLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionAgencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateStatus" type="{http://guidewire.com/cc/typekey}ContactCreationApprovalStatus" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DoctorSpecialty" type="{http://guidewire.com/cc/typekey}SpecialtyType" minOccurs="0"/>
 *         &lt;element name="EmailAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEINOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://guidewire.com/cc/typekey}GenderType" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhoneCountry" type="{http://guidewire.com/cc/typekey}PhoneCountryCode" minOccurs="0"/>
 *         &lt;element name="HomePhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseState" type="{http://guidewire.com/cc/typekey}Jurisdiction" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://guidewire.com/cc/typekey}MaritalStatus" minOccurs="0"/>
 *         &lt;element name="MedicalLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalOrgSpecialty" type="{http://guidewire.com/cc/typekey}SpecialtyType" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameKanji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationType" type="{http://guidewire.com/cc/typekey}OrganizationType" minOccurs="0"/>
 *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferredCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://guidewire.com/cc/typekey}NamePrefix" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhone" type="{http://guidewire.com/cc/typekey}PrimaryPhoneType" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSNOfficialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SpecialtyType" type="{http://guidewire.com/cc/typekey}SpecialtyType" minOccurs="0"/>
 *         &lt;element name="Subtype" type="{http://guidewire.com/cc/typekey}Contact" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://guidewire.com/cc/typekey}NameSuffix" minOccurs="0"/>
 *         &lt;element name="TaxFilingStatus" type="{http://guidewire.com/cc/typekey}TaxFilingStatusType" minOccurs="0"/>
 *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxStatus" type="{http://guidewire.com/cc/typekey}TaxStatus" minOccurs="0"/>
 *         &lt;element name="ThirdpartyinsurerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationLevel" type="{http://guidewire.com/cc/typekey}ValidationLevel" minOccurs="0"/>
 *         &lt;element name="VendorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorType" type="{http://guidewire.com/cc/typekey}VendorType" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneCountry" type="{http://guidewire.com/cc/typekey}PhoneCountryCode" minOccurs="0"/>
 *         &lt;element name="WorkPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDTO", propOrder = {
    "addressBookUID",
    "autoRepairLicense",
    "cellPhone",
    "collectionAgencyID",
    "createStatus",
    "createTime",
    "createUserID",
    "dateOfBirth",
    "doctorSpecialty",
    "emailAddress1",
    "employerID",
    "feinOfficialID",
    "firstName",
    "firstNameKanji",
    "gender",
    "homePhone",
    "homePhoneCountry",
    "homePhoneExtension",
    "lastName",
    "lastNameKanji",
    "licenseNumber",
    "licenseState",
    "maritalStatus",
    "medicalLicense",
    "medicalOrgSpecialty",
    "middleName",
    "name",
    "nameKanji",
    "notes",
    "occupation",
    "organizationType",
    "preferred",
    "preferredCurrency",
    "prefix",
    "primaryAddressDisplayValue",
    "primaryAddressID",
    "primaryContactID",
    "primaryPhone",
    "primaryPhoneValue",
    "publicID",
    "ssnOfficialID",
    "score",
    "specialtyType",
    "subtype",
    "suffix",
    "taxFilingStatus",
    "taxID",
    "taxStatus",
    "thirdpartyinsurerID",
    "updateTime",
    "updateUserID",
    "validationLevel",
    "vendorNumber",
    "vendorType",
    "workPhone",
    "workPhoneCountry",
    "workPhoneExtension"
})
public class ContactDTO {

    @XmlElement(name = "AddressBookUID")
    protected String addressBookUID;
    @XmlElement(name = "AutoRepairLicense")
    protected String autoRepairLicense;
    @XmlElement(name = "CellPhone")
    protected String cellPhone;
    @XmlElement(name = "CollectionAgencyID")
    protected String collectionAgencyID;
    @XmlElement(name = "CreateStatus")
    @XmlSchemaType(name = "string")
    protected ContactCreationApprovalStatus createStatus;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "DoctorSpecialty")
    @XmlSchemaType(name = "string")
    protected SpecialtyType doctorSpecialty;
    @XmlElement(name = "EmailAddress1")
    protected String emailAddress1;
    @XmlElement(name = "EmployerID")
    protected String employerID;
    @XmlElement(name = "FEINOfficialID")
    protected String feinOfficialID;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FirstNameKanji")
    protected String firstNameKanji;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "HomePhoneCountry")
    @XmlSchemaType(name = "string")
    protected PhoneCountryCode homePhoneCountry;
    @XmlElement(name = "HomePhoneExtension")
    protected String homePhoneExtension;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LastNameKanji")
    protected String lastNameKanji;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "LicenseState")
    @XmlSchemaType(name = "string")
    protected Jurisdiction licenseState;
    @XmlElement(name = "MaritalStatus")
    @XmlSchemaType(name = "string")
    protected MaritalStatus maritalStatus;
    @XmlElement(name = "MedicalLicense")
    protected String medicalLicense;
    @XmlElement(name = "MedicalOrgSpecialty")
    @XmlSchemaType(name = "string")
    protected SpecialtyType medicalOrgSpecialty;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NameKanji")
    protected String nameKanji;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "OrganizationType")
    @XmlSchemaType(name = "string")
    protected OrganizationType organizationType;
    @XmlElement(name = "Preferred")
    protected Boolean preferred;
    @XmlElement(name = "PreferredCurrency")
    @XmlSchemaType(name = "string")
    protected Currency preferredCurrency;
    @XmlElement(name = "Prefix")
    @XmlSchemaType(name = "string")
    protected NamePrefix prefix;
    @XmlElement(name = "PrimaryAddressDisplayValue")
    protected String primaryAddressDisplayValue;
    @XmlElement(name = "PrimaryAddressID")
    protected String primaryAddressID;
    @XmlElement(name = "PrimaryContactID")
    protected String primaryContactID;
    @XmlElement(name = "PrimaryPhone")
    @XmlSchemaType(name = "string")
    protected PrimaryPhoneType primaryPhone;
    @XmlElement(name = "PrimaryPhoneValue")
    protected String primaryPhoneValue;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "SSNOfficialID")
    protected String ssnOfficialID;
    @XmlElement(name = "Score")
    protected Integer score;
    @XmlElement(name = "SpecialtyType")
    @XmlSchemaType(name = "string")
    protected SpecialtyType specialtyType;
    @XmlElement(name = "Subtype")
    @XmlSchemaType(name = "string")
    protected Contact subtype;
    @XmlElement(name = "Suffix")
    @XmlSchemaType(name = "string")
    protected NameSuffix suffix;
    @XmlElement(name = "TaxFilingStatus")
    @XmlSchemaType(name = "string")
    protected TaxFilingStatusType taxFilingStatus;
    @XmlElement(name = "TaxID")
    protected String taxID;
    @XmlElement(name = "TaxStatus")
    @XmlSchemaType(name = "string")
    protected TaxStatus taxStatus;
    @XmlElement(name = "ThirdpartyinsurerID")
    protected String thirdpartyinsurerID;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;
    @XmlElement(name = "ValidationLevel")
    @XmlSchemaType(name = "string")
    protected ValidationLevel validationLevel;
    @XmlElement(name = "VendorNumber")
    protected String vendorNumber;
    @XmlElement(name = "VendorType")
    @XmlSchemaType(name = "string")
    protected VendorType vendorType;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "WorkPhoneCountry")
    @XmlSchemaType(name = "string")
    protected PhoneCountryCode workPhoneCountry;
    @XmlElement(name = "WorkPhoneExtension")
    protected String workPhoneExtension;

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
     * Gets the value of the autoRepairLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoRepairLicense() {
        return autoRepairLicense;
    }

    /**
     * Sets the value of the autoRepairLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoRepairLicense(String value) {
        this.autoRepairLicense = value;
    }

    /**
     * Gets the value of the cellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the collectionAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAgencyID() {
        return collectionAgencyID;
    }

    /**
     * Sets the value of the collectionAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAgencyID(String value) {
        this.collectionAgencyID = value;
    }

    /**
     * Gets the value of the createStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ContactCreationApprovalStatus }
     *     
     */
    public ContactCreationApprovalStatus getCreateStatus() {
        return createStatus;
    }

    /**
     * Sets the value of the createStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactCreationApprovalStatus }
     *     
     */
    public void setCreateStatus(ContactCreationApprovalStatus value) {
        this.createStatus = value;
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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the doctorSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialtyType }
     *     
     */
    public SpecialtyType getDoctorSpecialty() {
        return doctorSpecialty;
    }

    /**
     * Sets the value of the doctorSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialtyType }
     *     
     */
    public void setDoctorSpecialty(SpecialtyType value) {
        this.doctorSpecialty = value;
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
     * Gets the value of the employerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerID() {
        return employerID;
    }

    /**
     * Sets the value of the employerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerID(String value) {
        this.employerID = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the firstNameKanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameKanji() {
        return firstNameKanji;
    }

    /**
     * Sets the value of the firstNameKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameKanji(String value) {
        this.firstNameKanji = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
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
     * Gets the value of the homePhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCountryCode }
     *     
     */
    public PhoneCountryCode getHomePhoneCountry() {
        return homePhoneCountry;
    }

    /**
     * Sets the value of the homePhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCountryCode }
     *     
     */
    public void setHomePhoneCountry(PhoneCountryCode value) {
        this.homePhoneCountry = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNameKanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameKanji() {
        return lastNameKanji;
    }

    /**
     * Sets the value of the lastNameKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameKanji(String value) {
        this.lastNameKanji = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licenseState property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction }
     *     
     */
    public Jurisdiction getLicenseState() {
        return licenseState;
    }

    /**
     * Sets the value of the licenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction }
     *     
     */
    public void setLicenseState(Jurisdiction value) {
        this.licenseState = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatus }
     *     
     */
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatus }
     *     
     */
    public void setMaritalStatus(MaritalStatus value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the medicalLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalLicense() {
        return medicalLicense;
    }

    /**
     * Sets the value of the medicalLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalLicense(String value) {
        this.medicalLicense = value;
    }

    /**
     * Gets the value of the medicalOrgSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialtyType }
     *     
     */
    public SpecialtyType getMedicalOrgSpecialty() {
        return medicalOrgSpecialty;
    }

    /**
     * Sets the value of the medicalOrgSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialtyType }
     *     
     */
    public void setMedicalOrgSpecialty(SpecialtyType value) {
        this.medicalOrgSpecialty = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
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
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganizationType(OrganizationType value) {
        this.organizationType = value;
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
     *     {@link Currency }
     *     
     */
    public Currency getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPreferredCurrency(Currency value) {
        this.preferredCurrency = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix }
     *     
     */
    public NamePrefix getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix }
     *     
     */
    public void setPrefix(NamePrefix value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the primaryAddressDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressDisplayValue() {
        return primaryAddressDisplayValue;
    }

    /**
     * Sets the value of the primaryAddressDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressDisplayValue(String value) {
        this.primaryAddressDisplayValue = value;
    }

    /**
     * Gets the value of the primaryAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressID() {
        return primaryAddressID;
    }

    /**
     * Sets the value of the primaryAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressID(String value) {
        this.primaryAddressID = value;
    }

    /**
     * Gets the value of the primaryContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactID() {
        return primaryContactID;
    }

    /**
     * Sets the value of the primaryContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactID(String value) {
        this.primaryContactID = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryPhoneType }
     *     
     */
    public PrimaryPhoneType getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryPhoneType }
     *     
     */
    public void setPrimaryPhone(PrimaryPhoneType value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the primaryPhoneValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhoneValue() {
        return primaryPhoneValue;
    }

    /**
     * Sets the value of the primaryPhoneValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhoneValue(String value) {
        this.primaryPhoneValue = value;
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
     * Gets the value of the specialtyType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialtyType }
     *     
     */
    public SpecialtyType getSpecialtyType() {
        return specialtyType;
    }

    /**
     * Sets the value of the specialtyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialtyType }
     *     
     */
    public void setSpecialtyType(SpecialtyType value) {
        this.specialtyType = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setSubtype(Contact value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffix }
     *     
     */
    public NameSuffix getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffix }
     *     
     */
    public void setSuffix(NameSuffix value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the taxFilingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFilingStatusType }
     *     
     */
    public TaxFilingStatusType getTaxFilingStatus() {
        return taxFilingStatus;
    }

    /**
     * Sets the value of the taxFilingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFilingStatusType }
     *     
     */
    public void setTaxFilingStatus(TaxFilingStatusType value) {
        this.taxFilingStatus = value;
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
     *     {@link TaxStatus }
     *     
     */
    public TaxStatus getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxStatus }
     *     
     */
    public void setTaxStatus(TaxStatus value) {
        this.taxStatus = value;
    }

    /**
     * Gets the value of the thirdpartyinsurerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdpartyinsurerID() {
        return thirdpartyinsurerID;
    }

    /**
     * Sets the value of the thirdpartyinsurerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdpartyinsurerID(String value) {
        this.thirdpartyinsurerID = value;
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
     *     {@link VendorType }
     *     
     */
    public VendorType getVendorType() {
        return vendorType;
    }

    /**
     * Sets the value of the vendorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorType }
     *     
     */
    public void setVendorType(VendorType value) {
        this.vendorType = value;
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
     * Gets the value of the workPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCountryCode }
     *     
     */
    public PhoneCountryCode getWorkPhoneCountry() {
        return workPhoneCountry;
    }

    /**
     * Sets the value of the workPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCountryCode }
     *     
     */
    public void setWorkPhoneCountry(PhoneCountryCode value) {
        this.workPhoneCountry = value;
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
