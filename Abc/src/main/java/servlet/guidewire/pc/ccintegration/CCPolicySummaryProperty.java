
package main.java.servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPolicySummaryProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPolicySummaryProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine1Kanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine2Kanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BuildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CityKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertyNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPolicySummaryProperty")
public class CCPolicySummaryProperty {

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
    @XmlAttribute(name = "BuildingNumber")
    protected String buildingNumber;
    @XmlAttribute(name = "City")
    protected String city;
    @XmlAttribute(name = "CityKanji")
    protected String cityKanji;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "PropertyNumber")
    protected Integer propertyNumber;
    @XmlAttribute(name = "PolicySystemID")
    protected String policySystemID;

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
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the propertyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyNumber() {
        return propertyNumber;
    }

    /**
     * Sets the value of the propertyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyNumber(Integer value) {
        this.propertyNumber = value;
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

}
