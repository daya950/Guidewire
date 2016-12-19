
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="loadCommandPublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "loadCommandPublicID"
})
@XmlRootElement(name = "startClaimValidation")
public class StartClaimValidation {

    protected String loadCommandPublicID;

    /**
     * Gets the value of the loadCommandPublicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadCommandPublicID() {
        return loadCommandPublicID;
    }

    /**
     * Sets the value of the loadCommandPublicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadCommandPublicID(String value) {
        this.loadCommandPublicID = value;
    }

}
