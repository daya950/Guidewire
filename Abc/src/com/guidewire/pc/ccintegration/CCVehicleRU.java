
package com.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCVehicleRU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCVehicleRU">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCRiskUnit">
 *       &lt;sequence>
 *         &lt;element name="Vehicle" type="{http://guidewire.com/pc/ccintegration}CCVehicle" minOccurs="0"/>
 *         &lt;element name="VehicleLocation" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCVehicleRU", propOrder = {
    "vehicle",
    "vehicleLocation"
})
public class CCVehicleRU
    extends CCRiskUnit
{

    @XmlElement(name = "Vehicle")
    protected CCVehicle vehicle;
    @XmlElement(name = "VehicleLocation")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object vehicleLocation;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CCVehicle }
     *     
     */
    public CCVehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCVehicle }
     *     
     */
    public void setVehicle(CCVehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the vehicleLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVehicleLocation() {
        return vehicleLocation;
    }

    /**
     * Sets the value of the vehicleLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVehicleLocation(Object value) {
        this.vehicleLocation = value;
    }

}
