
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.policysummarydto.PolicySummaryDTO;


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
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policySummaryDTO" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/PolicySummaryDTO}PolicySummaryDTO" minOccurs="0"/>
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
    "claimID",
    "policySummaryDTO"
})
@XmlRootElement(name = "setPolicy")
public class SetPolicy {

    protected String claimID;
    protected PolicySummaryDTO policySummaryDTO;

    /**
     * Gets the value of the claimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the policySummaryDTO property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySummaryDTO }
     *     
     */
    public PolicySummaryDTO getPolicySummaryDTO() {
        return policySummaryDTO;
    }

    /**
     * Sets the value of the policySummaryDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySummaryDTO }
     *     
     */
    public void setPolicySummaryDTO(PolicySummaryDTO value) {
        this.policySummaryDTO = value;
    }

}
