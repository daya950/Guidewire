
package com.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPCFilteringCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPCFilteringCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverLastNames" type="{http://guidewire.com/pc/ccintegration}StringArray" minOccurs="0"/>
 *         &lt;element name="LicensePlates" type="{http://guidewire.com/pc/ccintegration}StringArray" minOccurs="0"/>
 *         &lt;element name="PolicySystemIDs" type="{http://guidewire.com/pc/ccintegration}StringArray" minOccurs="0"/>
 *         &lt;element name="PostalCodes" type="{http://guidewire.com/pc/ccintegration}StringArray" minOccurs="0"/>
 *         &lt;element name="VINS" type="{http://guidewire.com/pc/ccintegration}StringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPCFilteringCriteria", propOrder = {
    "driverLastNames",
    "licensePlates",
    "policySystemIDs",
    "postalCodes",
    "vins"
})
public class CCPCFilteringCriteria {

    @XmlElement(name = "DriverLastNames")
    protected StringArray driverLastNames;
    @XmlElement(name = "LicensePlates")
    protected StringArray licensePlates;
    @XmlElement(name = "PolicySystemIDs")
    protected StringArray policySystemIDs;
    @XmlElement(name = "PostalCodes")
    protected StringArray postalCodes;
    @XmlElement(name = "VINS")
    protected StringArray vins;

    /**
     * Gets the value of the driverLastNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getDriverLastNames() {
        return driverLastNames;
    }

    /**
     * Sets the value of the driverLastNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setDriverLastNames(StringArray value) {
        this.driverLastNames = value;
    }

    /**
     * Gets the value of the licensePlates property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getLicensePlates() {
        return licensePlates;
    }

    /**
     * Sets the value of the licensePlates property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setLicensePlates(StringArray value) {
        this.licensePlates = value;
    }

    /**
     * Gets the value of the policySystemIDs property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getPolicySystemIDs() {
        return policySystemIDs;
    }

    /**
     * Sets the value of the policySystemIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setPolicySystemIDs(StringArray value) {
        this.policySystemIDs = value;
    }

    /**
     * Gets the value of the postalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getPostalCodes() {
        return postalCodes;
    }

    /**
     * Sets the value of the postalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setPostalCodes(StringArray value) {
        this.postalCodes = value;
    }

    /**
     * Gets the value of the vins property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getVINS() {
        return vins;
    }

    /**
     * Sets the value of the vins property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setVINS(StringArray value) {
        this.vins = value;
    }

}
