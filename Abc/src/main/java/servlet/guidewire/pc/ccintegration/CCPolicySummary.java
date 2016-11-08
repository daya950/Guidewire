
package main.java.servlet.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CCPolicySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPolicySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Properties" type="{http://guidewire.com/pc/ccintegration}CCPolicySummaryProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Vehicles" type="{http://guidewire.com/pc/ccintegration}CCPolicySummaryVehicle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine1Kanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine2Kanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CityKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="InsuredName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CEDEX" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CEDEXBureau" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProducerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPolicySummary", propOrder = {
    "properties",
    "vehicles"
})
public class CCPolicySummary {

    @XmlElement(name = "Properties")
    protected List<CCPolicySummaryProperty> properties;
    @XmlElement(name = "Vehicles")
    protected List<CCPolicySummaryVehicle> vehicles;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "AddressLine1")
    protected String addressLine1;
    @XmlAttribute(name = "AddressLine1Kanji")
    protected String addressLine1Kanji;
    @XmlAttribute(name = "AddressLine2")
    protected String addressLine2;
    @XmlAttribute(name = "AddressLine2Kanji")
    protected String addressLine2Kanji;
    @XmlAttribute(name = "City")
    protected String city;
    @XmlAttribute(name = "CityKanji")
    protected String cityKanji;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "InsuredName")
    protected String insuredName;
    @XmlAttribute(name = "IsArchived")
    protected Boolean isArchived;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
    @XmlAttribute(name = "PolicyType")
    protected String policyType;
    @XmlAttribute(name = "PostalCode")
    protected String postalCode;
    @XmlAttribute(name = "CEDEX")
    protected Boolean cedex;
    @XmlAttribute(name = "CEDEXBureau")
    protected String cedexBureau;
    @XmlAttribute(name = "ProducerCode")
    protected String producerCode;
    @XmlAttribute(name = "State")
    protected String state;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCPolicySummaryProperty }
     * 
     * 
     */
    public List<CCPolicySummaryProperty> getProperties() {
        if (properties == null) {
            properties = new ArrayList<CCPolicySummaryProperty>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCPolicySummaryVehicle }
     * 
     * 
     */
    public List<CCPolicySummaryVehicle> getVehicles() {
        if (vehicles == null) {
            vehicles = new ArrayList<CCPolicySummaryVehicle>();
        }
        return this.vehicles;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine1Kanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1Kanji() {
        return addressLine1Kanji;
    }

    /**
     * Sets the value of the addressLine1Kanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1Kanji(String value) {
        this.addressLine1Kanji = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine2Kanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2Kanji() {
        return addressLine2Kanji;
    }

    /**
     * Sets the value of the addressLine2Kanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2Kanji(String value) {
        this.addressLine2Kanji = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityKanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityKanji() {
        return cityKanji;
    }

    /**
     * Sets the value of the cityKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityKanji(String value) {
        this.cityKanji = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredName(String value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
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
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyType(String value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cedex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCEDEX() {
        return cedex;
    }

    /**
     * Sets the value of the cedex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCEDEX(Boolean value) {
        this.cedex = value;
    }

    /**
     * Gets the value of the cedexBureau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDEXBureau() {
        return cedexBureau;
    }

    /**
     * Sets the value of the cedexBureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDEXBureau(String value) {
        this.cedexBureau = value;
    }

    /**
     * Gets the value of the producerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerCode(String value) {
        this.producerCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
