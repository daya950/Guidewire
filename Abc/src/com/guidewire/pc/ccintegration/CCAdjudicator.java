
package com.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCAdjudicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAdjudicator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCPerson">
 *       &lt;attribute name="AdjudicativeDomain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdjudicatorLicense" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAdjudicator")
public class CCAdjudicator
    extends CCPerson
{

    @XmlAttribute(name = "AdjudicativeDomain")
    protected String adjudicativeDomain;
    @XmlAttribute(name = "AdjudicatorLicense")
    protected String adjudicatorLicense;

    /**
     * Gets the value of the adjudicativeDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjudicativeDomain() {
        return adjudicativeDomain;
    }

    /**
     * Sets the value of the adjudicativeDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjudicativeDomain(String value) {
        this.adjudicativeDomain = value;
    }

    /**
     * Gets the value of the adjudicatorLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjudicatorLicense() {
        return adjudicatorLicense;
    }

    /**
     * Sets the value of the adjudicatorLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjudicatorLicense(String value) {
        this.adjudicatorLicense = value;
    }

}
