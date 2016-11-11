
package servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCLegalVenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCLegalVenue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCPlace">
 *       &lt;attribute name="VenueType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCLegalVenue")
public class CCLegalVenue
    extends CCPlace
{

    @XmlAttribute(name = "VenueType")
    protected String venueType;

    /**
     * Gets the value of the venueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenueType() {
        return venueType;
    }

    /**
     * Sets the value of the venueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenueType(String value) {
        this.venueType = value;
    }

}
