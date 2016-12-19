
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto.ClaimDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.policydto.PolicyDTO;


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
 *         &lt;element name="claimDTO" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ClaimDTO}ClaimDTO" minOccurs="0"/>
 *         &lt;element name="policyDTO" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/PolicyDTO}PolicyDTO" minOccurs="0"/>
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
    "claimDTO",
    "policyDTO"
})
@XmlRootElement(name = "migrateClaim")
public class MigrateClaim {

    protected ClaimDTO claimDTO;
    protected PolicyDTO policyDTO;

    /**
     * Gets the value of the claimDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDTO }
     *     
     */
    public ClaimDTO getClaimDTO() {
        return claimDTO;
    }

    /**
     * Sets the value of the claimDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDTO }
     *     
     */
    public void setClaimDTO(ClaimDTO value) {
        this.claimDTO = value;
    }

    /**
     * Gets the value of the policyDTO property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDTO }
     *     
     */
    public PolicyDTO getPolicyDTO() {
        return policyDTO;
    }

    /**
     * Sets the value of the policyDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDTO }
     *     
     */
    public void setPolicyDTO(PolicyDTO value) {
        this.policyDTO = value;
    }

}
