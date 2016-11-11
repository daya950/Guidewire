
package servlet.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="CCAddress" type="{http://guidewire.com/pc/ccintegration}CCAddress"/>
 *           &lt;element name="CCBuilding" type="{http://guidewire.com/pc/ccintegration}CCBuilding"/>
 *           &lt;element name="CCClassCode" type="{http://guidewire.com/pc/ccintegration}CCClassCode"/>
 *           &lt;element name="CCContact" type="{http://guidewire.com/pc/ccintegration}CCContact"/>
 *           &lt;element name="CCPolicyLocation" type="{http://guidewire.com/pc/ccintegration}CCPolicyLocation"/>
 *           &lt;element name="CCPropertyOwner" type="{http://guidewire.com/pc/ccintegration}CCPropertyOwner"/>
 *         &lt;/choice>
 *         &lt;element name="CCPolicy" type="{http://guidewire.com/pc/ccintegration}CCPolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ccAddressOrCCBuildingOrCCClassCode",
    "ccPolicy"
})
@XmlRootElement(name = "Envelope")
public class Envelope {

    @XmlElements({
        @XmlElement(name = "CCAddress", type = CCAddress.class),
        @XmlElement(name = "CCBuilding", type = CCBuilding.class),
        @XmlElement(name = "CCClassCode", type = CCClassCode.class),
        @XmlElement(name = "CCContact", type = CCContact.class),
        @XmlElement(name = "CCPolicyLocation", type = CCPolicyLocation.class),
        @XmlElement(name = "CCPropertyOwner", type = CCPropertyOwner.class)
    })
    protected List<Object> ccAddressOrCCBuildingOrCCClassCode;
    @XmlElement(name = "CCPolicy", required = true)
    protected CCPolicy ccPolicy;

    /**
     * Gets the value of the ccAddressOrCCBuildingOrCCClassCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccAddressOrCCBuildingOrCCClassCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCAddressOrCCBuildingOrCCClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCAddress }
     * {@link CCBuilding }
     * {@link CCClassCode }
     * {@link CCContact }
     * {@link CCPolicyLocation }
     * {@link CCPropertyOwner }
     * 
     * 
     */
    public List<Object> getCCAddressOrCCBuildingOrCCClassCode() {
        if (ccAddressOrCCBuildingOrCCClassCode == null) {
            ccAddressOrCCBuildingOrCCClassCode = new ArrayList<Object>();
        }
        return this.ccAddressOrCCBuildingOrCCClassCode;
    }

    /**
     * Gets the value of the ccPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CCPolicy }
     *     
     */
    public CCPolicy getCCPolicy() {
        return ccPolicy;
    }

    /**
     * Sets the value of the ccPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPolicy }
     *     
     */
    public void setCCPolicy(CCPolicy value) {
        this.ccPolicy = value;
    }

}
