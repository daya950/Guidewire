
package com.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Represents a ClaimCenter Policy Search Criteria
 *       
 * 
 * <p>Java class for CCPCSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPCSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CompanyNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IncludeArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastNameKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NonRenewalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryInsuredCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryInsuredCityKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryInsuredCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryInsuredPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryInsuredState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProducerCodeString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProducerString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPCSearchCriteria")
public class CCPCSearchCriteria {

    @XmlAttribute(name = "AccountNumber")
    protected String accountNumber;
    @XmlAttribute(name = "AsOfDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "CompanyName")
    protected String companyName;
    @XmlAttribute(name = "CompanyNameKanji")
    protected String companyNameKanji;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "FirstNameKanji")
    protected String firstNameKanji;
    @XmlAttribute(name = "IncludeArchived")
    protected Boolean includeArchived;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "LastNameKanji")
    protected String lastNameKanji;
    @XmlAttribute(name = "NonRenewalCode")
    protected String nonRenewalCode;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
    @XmlAttribute(name = "PolicyStatus")
    protected String policyStatus;
    @XmlAttribute(name = "PrimaryInsuredCity")
    protected String primaryInsuredCity;
    @XmlAttribute(name = "PrimaryInsuredCityKanji")
    protected String primaryInsuredCityKanji;
    @XmlAttribute(name = "PrimaryInsuredCountry")
    protected String primaryInsuredCountry;
    @XmlAttribute(name = "PrimaryInsuredPostalCode")
    protected String primaryInsuredPostalCode;
    @XmlAttribute(name = "PrimaryInsuredState")
    protected String primaryInsuredState;
    @XmlAttribute(name = "ProducerCodeString")
    protected String producerCodeString;
    @XmlAttribute(name = "ProducerString")
    protected String producerString;
    @XmlAttribute(name = "Product")
    protected String product;
    @XmlAttribute(name = "ProductCode")
    protected String productCode;
    @XmlAttribute(name = "TaxID")
    protected String taxID;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyNameKanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameKanji() {
        return companyNameKanji;
    }

    /**
     * Sets the value of the companyNameKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameKanji(String value) {
        this.companyNameKanji = value;
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
     * Gets the value of the includeArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeArchived() {
        return includeArchived;
    }

    /**
     * Sets the value of the includeArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeArchived(Boolean value) {
        this.includeArchived = value;
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
     * Gets the value of the nonRenewalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRenewalCode() {
        return nonRenewalCode;
    }

    /**
     * Sets the value of the nonRenewalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRenewalCode(String value) {
        this.nonRenewalCode = value;
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
     * Gets the value of the policyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * Sets the value of the policyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * Gets the value of the primaryInsuredCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInsuredCity() {
        return primaryInsuredCity;
    }

    /**
     * Sets the value of the primaryInsuredCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInsuredCity(String value) {
        this.primaryInsuredCity = value;
    }

    /**
     * Gets the value of the primaryInsuredCityKanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInsuredCityKanji() {
        return primaryInsuredCityKanji;
    }

    /**
     * Sets the value of the primaryInsuredCityKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInsuredCityKanji(String value) {
        this.primaryInsuredCityKanji = value;
    }

    /**
     * Gets the value of the primaryInsuredCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInsuredCountry() {
        return primaryInsuredCountry;
    }

    /**
     * Sets the value of the primaryInsuredCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInsuredCountry(String value) {
        this.primaryInsuredCountry = value;
    }

    /**
     * Gets the value of the primaryInsuredPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInsuredPostalCode() {
        return primaryInsuredPostalCode;
    }

    /**
     * Sets the value of the primaryInsuredPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInsuredPostalCode(String value) {
        this.primaryInsuredPostalCode = value;
    }

    /**
     * Gets the value of the primaryInsuredState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInsuredState() {
        return primaryInsuredState;
    }

    /**
     * Sets the value of the primaryInsuredState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInsuredState(String value) {
        this.primaryInsuredState = value;
    }

    /**
     * Gets the value of the producerCodeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerCodeString() {
        return producerCodeString;
    }

    /**
     * Sets the value of the producerCodeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerCodeString(String value) {
        this.producerCodeString = value;
    }

    /**
     * Gets the value of the producerString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerString() {
        return producerString;
    }

    /**
     * Sets the value of the producerString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerString(String value) {
        this.producerString = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
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

}
