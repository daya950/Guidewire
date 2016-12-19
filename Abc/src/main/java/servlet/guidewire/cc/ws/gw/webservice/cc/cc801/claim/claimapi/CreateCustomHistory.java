
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.typekey.CustomHistoryType;


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
 *         &lt;element name="historyType" type="{http://guidewire.com/cc/typekey}CustomHistoryType" minOccurs="0"/>
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
    "historyType"
})
@XmlRootElement(name = "createCustomHistory")
public class CreateCustomHistory {

    protected String claimID;
    @XmlSchemaType(name = "string")
    protected CustomHistoryType historyType;

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
     * Gets the value of the historyType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomHistoryType }
     *     
     */
    public CustomHistoryType getHistoryType() {
        return historyType;
    }

    /**
     * Sets the value of the historyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomHistoryType }
     *     
     */
    public void setHistoryType(CustomHistoryType value) {
        this.historyType = value;
    }

}
