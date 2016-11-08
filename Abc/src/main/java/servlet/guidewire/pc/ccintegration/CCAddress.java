
package main.java.servlet.guidewire.pc.ccintegration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CCAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AddressBookUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine1Kanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine2Kanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CityKanji" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="County" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HTMID" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CEDEX" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CEDEXBureau" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValidUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAddress")
public class CCAddress {

    @XmlAttribute(name = "AddressBookUID")
    protected String addressBookUID;
    @XmlAttribute(name = "AddressLine1")
    protected String addressLine1;
    @XmlAttribute(name = "AddressLine1Kanji")
    protected String addressLine1Kanji;
    @XmlAttribute(name = "AddressLine2")
    protected String addressLine2;
    @XmlAttribute(name = "AddressLine2Kanji")
    protected String addressLine2Kanji;
    @XmlAttribute(name = "AddressLine3")
    protected String addressLine3;
    @XmlAttribute(name = "AddressType")
    protected String addressType;
    @XmlAttribute(name = "City")
    protected String city;
    @XmlAttribute(name = "CityKanji")
    protected String cityKanji;
    @XmlAttribute(name = "Country")
    protected String country;
    @XmlAttribute(name = "County")
    protected String county;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "HTMID")
    protected BigDecimal htmid;
    @XmlAttribute(name = "PostalCode")
    protected String postalCode;
    @XmlAttribute(name = "CEDEX")
    protected Boolean cedex;
    @XmlAttribute(name = "CEDEXBureau")
    protected String cedexBureau;
    @XmlAttribute(name = "State")
    protected String state;
    @XmlAttribute(name = "ValidUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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
     * Gets the value of the htmid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHTMID() {
        return htmid;
    }

    /**
     * Sets the value of the htmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHTMID(BigDecimal value) {
        this.htmid = value;
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
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
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

}
