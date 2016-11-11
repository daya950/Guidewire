
package servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCLocationMiscRU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCLocationMiscRU">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCLocationBasedRU">
 *       &lt;attribute name="OtherRiskType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCLocationMiscRU")
public class CCLocationMiscRU
    extends CCLocationBasedRU
{

    @XmlAttribute(name = "OtherRiskType")
    protected String otherRiskType;

    /**
     * Gets the value of the otherRiskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRiskType() {
        return otherRiskType;
    }

    /**
     * Sets the value of the otherRiskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRiskType(String value) {
        this.otherRiskType = value;
    }

}
