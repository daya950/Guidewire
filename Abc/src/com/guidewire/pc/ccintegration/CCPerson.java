
package com.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CCPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCContact">
 *       &lt;sequence>
 *         &lt;element name="Employer" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="Guardian" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="Wards" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CellPhoneCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CellPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CellPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FormerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LicenseState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumDependents" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NumDependentsU18" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NumDependentsU25" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Particle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaxFilingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPerson", propOrder = {
    "employer",
    "guardian",
    "wards"
})
@XmlSeeAlso({
    CCAdjudicator.class,
    CCPersonVendor.class
})
public class CCPerson
    extends CCContact
{

    @XmlElement(name = "Employer")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object employer;
    @XmlElement(name = "Guardian")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object guardian;
    @XmlElementRef(name = "Wards", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> wards;
    @XmlAttribute(name = "CellPhoneCountry")
    protected String cellPhoneCountry;
    @XmlAttribute(name = "CellPhone")
    protected String cellPhone;
    @XmlAttribute(name = "CellPhoneExtension")
    protected String cellPhoneExtension;
    @XmlAttribute(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "FirstNameKanji")
    protected String firstNameKanji;
    @XmlAttribute(name = "FormerName")
    protected String formerName;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "LastNameKanji")
    protected String lastNameKanji;
    @XmlAttribute(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlAttribute(name = "LicenseState")
    protected String licenseState;
    @XmlAttribute(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlAttribute(name = "MiddleName")
    protected String middleName;
    @XmlAttribute(name = "NumDependents")
    protected Integer numDependents;
    @XmlAttribute(name = "NumDependentsU18")
    protected Integer numDependentsU18;
    @XmlAttribute(name = "NumDependentsU25")
    protected Integer numDependentsU25;
    @XmlAttribute(name = "Occupation")
    protected String occupation;
    @XmlAttribute(name = "Particle")
    protected String particle;
    @XmlAttribute(name = "Prefix")
    protected String prefix;
    @XmlAttribute(name = "Suffix")
    protected String suffix;
    @XmlAttribute(name = "TaxFilingStatus")
    protected String taxFilingStatus;

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmployer(Object value) {
        this.employer = value;
    }

    /**
     * Gets the value of the guardian property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGuardian() {
        return guardian;
    }

    /**
     * Sets the value of the guardian property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGuardian(Object value) {
        this.guardian = value;
    }

    /**
     * Gets the value of the wards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getWards() {
        if (wards == null) {
            wards = new ArrayList<JAXBElement<Object>>();
        }
        return this.wards;
    }

    /**
     * Gets the value of the cellPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneCountry() {
        return cellPhoneCountry;
    }

    /**
     * Sets the value of the cellPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneCountry(String value) {
        this.cellPhoneCountry = value;
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
     * Gets the value of the cellPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneExtension() {
        return cellPhoneExtension;
    }

    /**
     * Sets the value of the cellPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneExtension(String value) {
        this.cellPhoneExtension = value;
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
     * Gets the value of the formerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormerName() {
        return formerName;
    }

    /**
     * Sets the value of the formerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormerName(String value) {
        this.formerName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     *     {@link String }
     *     
     */
    public String getLicenseState() {
        return licenseState;
    }

    /**
     * Sets the value of the licenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseState(String value) {
        this.licenseState = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
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
     * Gets the value of the numDependents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDependents() {
        return numDependents;
    }

    /**
     * Sets the value of the numDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDependents(Integer value) {
        this.numDependents = value;
    }

    /**
     * Gets the value of the numDependentsU18 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDependentsU18() {
        return numDependentsU18;
    }

    /**
     * Sets the value of the numDependentsU18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDependentsU18(Integer value) {
        this.numDependentsU18 = value;
    }

    /**
     * Gets the value of the numDependentsU25 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDependentsU25() {
        return numDependentsU25;
    }

    /**
     * Sets the value of the numDependentsU25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDependentsU25(Integer value) {
        this.numDependentsU25 = value;
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
     * Gets the value of the particle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticle() {
        return particle;
    }

    /**
     * Sets the value of the particle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticle(String value) {
        this.particle = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the taxFilingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFilingStatus() {
        return taxFilingStatus;
    }

    /**
     * Sets the value of the taxFilingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFilingStatus(String value) {
        this.taxFilingStatus = value;
    }

}
