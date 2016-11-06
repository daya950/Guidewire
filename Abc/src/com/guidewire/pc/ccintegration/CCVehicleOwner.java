
package com.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCVehicleOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCVehicleOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lienholder" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCVehicleOwner", propOrder = {
    "lienholder"
})
public class CCVehicleOwner {

    @XmlElement(name = "Lienholder")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lienholder;
    @XmlAttribute(name = "OwnerType")
    protected String ownerType;

    /**
     * Gets the value of the lienholder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLienholder() {
        return lienholder;
    }

    /**
     * Sets the value of the lienholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLienholder(Object value) {
        this.lienholder = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

}
