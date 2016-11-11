
package servlet.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCLocationBasedRU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCLocationBasedRU">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCRiskUnit">
 *       &lt;sequence>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="Lienholders" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PolicyLocation" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCLocationBasedRU", propOrder = {
    "building",
    "lienholders",
    "policyLocation"
})
@XmlSeeAlso({
    CCBuildingRU.class,
    CCPropertyRU.class,
    CCLocationMiscRU.class,
    CCGeneralLiabilityRU.class,
    CCInlandMarineRU.class,
    CCWCCovEmpRU.class
})
public class CCLocationBasedRU
    extends CCRiskUnit
{

    @XmlElement(name = "Building")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object building;
    @XmlElementRef(name = "Lienholders", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> lienholders;
    @XmlElement(name = "PolicyLocation")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object policyLocation;

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuilding(Object value) {
        this.building = value;
    }

    /**
     * Gets the value of the lienholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lienholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLienholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getLienholders() {
        if (lienholders == null) {
            lienholders = new ArrayList<JAXBElement<Object>>();
        }
        return this.lienholders;
    }

    /**
     * Gets the value of the policyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPolicyLocation() {
        return policyLocation;
    }

    /**
     * Sets the value of the policyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPolicyLocation(Object value) {
        this.policyLocation = value;
    }

}
