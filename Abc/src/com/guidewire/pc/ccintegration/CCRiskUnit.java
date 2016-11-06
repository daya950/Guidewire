
package com.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCRiskUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCRiskUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="Coverages" type="{http://guidewire.com/pc/ccintegration}CCRUCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RUNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCRiskUnit", propOrder = {
    "classCode",
    "coverages"
})
@XmlSeeAlso({
    CCVehicleRU.class,
    CCLocationBasedRU.class
})
public class CCRiskUnit {

    @XmlElement(name = "ClassCode")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object classCode;
    @XmlElement(name = "Coverages")
    protected List<CCRUCoverage> coverages;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "PolicySystemID")
    protected String policySystemID;
    @XmlAttribute(name = "RUNumber")
    protected Integer ruNumber;

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClassCode(Object value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the coverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCRUCoverage }
     * 
     * 
     */
    public List<CCRUCoverage> getCoverages() {
        if (coverages == null) {
            coverages = new ArrayList<CCRUCoverage>();
        }
        return this.coverages;
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
     * Gets the value of the ruNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRUNumber() {
        return ruNumber;
    }

    /**
     * Sets the value of the ruNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRUNumber(Integer value) {
        this.ruNumber = value;
    }

}
