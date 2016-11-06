
package com.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyLocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyLocationAddress" type="{http://guidewire.com/pc/ccintegration}CCAddress" minOccurs="0"/>
 *         &lt;element name="PNIAddressFields" type="{http://guidewire.com/pc/ccintegration}CCAddress" minOccurs="0"/>
 *         &lt;element name="TotalInsuredValues" type="{http://guidewire.com/pc/ccintegration}MapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyLocationLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyLocationLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyLocationGeocodeStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyLocationPolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PNIName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PNIPhoneCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PNIPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PNIPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PNIEmail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyLocationInfo", propOrder = {
    "policyLocationAddress",
    "pniAddressFields",
    "totalInsuredValues"
})
public class PolicyLocationInfo {

    @XmlElement(name = "PolicyLocationAddress")
    protected CCAddress policyLocationAddress;
    @XmlElement(name = "PNIAddressFields")
    protected CCAddress pniAddressFields;
    @XmlElement(name = "TotalInsuredValues")
    protected List<MapEntry> totalInsuredValues;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
    @XmlAttribute(name = "ProductCode")
    protected String productCode;
    @XmlAttribute(name = "PolicyLocationLatitude")
    protected String policyLocationLatitude;
    @XmlAttribute(name = "PolicyLocationLongitude")
    protected String policyLocationLongitude;
    @XmlAttribute(name = "PolicyLocationGeocodeStatus")
    protected String policyLocationGeocodeStatus;
    @XmlAttribute(name = "PolicyLocationPolicySystemID")
    protected String policyLocationPolicySystemID;
    @XmlAttribute(name = "PNIName")
    protected String pniName;
    @XmlAttribute(name = "PNIPhoneCountry")
    protected String pniPhoneCountry;
    @XmlAttribute(name = "PNIPhoneNumber")
    protected String pniPhoneNumber;
    @XmlAttribute(name = "PNIPhoneExtension")
    protected String pniPhoneExtension;
    @XmlAttribute(name = "PNIEmail")
    protected String pniEmail;

    /**
     * Gets the value of the policyLocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CCAddress }
     *     
     */
    public CCAddress getPolicyLocationAddress() {
        return policyLocationAddress;
    }

    /**
     * Sets the value of the policyLocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAddress }
     *     
     */
    public void setPolicyLocationAddress(CCAddress value) {
        this.policyLocationAddress = value;
    }

    /**
     * Gets the value of the pniAddressFields property.
     * 
     * @return
     *     possible object is
     *     {@link CCAddress }
     *     
     */
    public CCAddress getPNIAddressFields() {
        return pniAddressFields;
    }

    /**
     * Sets the value of the pniAddressFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAddress }
     *     
     */
    public void setPNIAddressFields(CCAddress value) {
        this.pniAddressFields = value;
    }

    /**
     * Gets the value of the totalInsuredValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalInsuredValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalInsuredValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapEntry }
     * 
     * 
     */
    public List<MapEntry> getTotalInsuredValues() {
        if (totalInsuredValues == null) {
            totalInsuredValues = new ArrayList<MapEntry>();
        }
        return this.totalInsuredValues;
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
     * Gets the value of the policyLocationLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyLocationLatitude() {
        return policyLocationLatitude;
    }

    /**
     * Sets the value of the policyLocationLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyLocationLatitude(String value) {
        this.policyLocationLatitude = value;
    }

    /**
     * Gets the value of the policyLocationLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyLocationLongitude() {
        return policyLocationLongitude;
    }

    /**
     * Sets the value of the policyLocationLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyLocationLongitude(String value) {
        this.policyLocationLongitude = value;
    }

    /**
     * Gets the value of the policyLocationGeocodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyLocationGeocodeStatus() {
        return policyLocationGeocodeStatus;
    }

    /**
     * Sets the value of the policyLocationGeocodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyLocationGeocodeStatus(String value) {
        this.policyLocationGeocodeStatus = value;
    }

    /**
     * Gets the value of the policyLocationPolicySystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyLocationPolicySystemID() {
        return policyLocationPolicySystemID;
    }

    /**
     * Sets the value of the policyLocationPolicySystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyLocationPolicySystemID(String value) {
        this.policyLocationPolicySystemID = value;
    }

    /**
     * Gets the value of the pniName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNIName() {
        return pniName;
    }

    /**
     * Sets the value of the pniName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNIName(String value) {
        this.pniName = value;
    }

    /**
     * Gets the value of the pniPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNIPhoneCountry() {
        return pniPhoneCountry;
    }

    /**
     * Sets the value of the pniPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNIPhoneCountry(String value) {
        this.pniPhoneCountry = value;
    }

    /**
     * Gets the value of the pniPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNIPhoneNumber() {
        return pniPhoneNumber;
    }

    /**
     * Sets the value of the pniPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNIPhoneNumber(String value) {
        this.pniPhoneNumber = value;
    }

    /**
     * Gets the value of the pniPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNIPhoneExtension() {
        return pniPhoneExtension;
    }

    /**
     * Sets the value of the pniPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNIPhoneExtension(String value) {
        this.pniPhoneExtension = value;
    }

    /**
     * Gets the value of the pniEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNIEmail() {
        return pniEmail;
    }

    /**
     * Sets the value of the pniEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNIEmail(String value) {
        this.pniEmail = value;
    }

}
