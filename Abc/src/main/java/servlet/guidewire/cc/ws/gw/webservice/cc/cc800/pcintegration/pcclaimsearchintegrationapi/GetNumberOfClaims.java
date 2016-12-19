
package servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimsearchcriteria.PCClaimSearchCriteria;


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
 *         &lt;element name="criteria" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaimSearchCriteria}PCClaimSearchCriteria" minOccurs="0"/>
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
    "criteria"
})
@XmlRootElement(name = "getNumberOfClaims")
public class GetNumberOfClaims {

    protected PCClaimSearchCriteria criteria;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link PCClaimSearchCriteria }
     *     
     */
    public PCClaimSearchCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCClaimSearchCriteria }
     *     
     */
    public void setCriteria(PCClaimSearchCriteria value) {
        this.criteria = value;
    }

}
