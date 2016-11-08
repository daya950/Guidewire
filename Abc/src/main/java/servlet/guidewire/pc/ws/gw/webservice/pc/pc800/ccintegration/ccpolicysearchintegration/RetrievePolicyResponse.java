
package main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import main.java.servlet.guidewire.pc.ccintegration.Envelope;


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
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://guidewire.com/pc/ccintegration}Envelope"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "_return"
})
@XmlRootElement(name = "retrievePolicyResponse")
public class RetrievePolicyResponse {

    @XmlElement(name = "return")
    protected RetrievePolicyResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePolicyResponse.Return }
     *     
     */
    public RetrievePolicyResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePolicyResponse.Return }
     *     
     */
    public void setReturn(RetrievePolicyResponse.Return value) {
        this._return = value;
    }


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
     *         &lt;element ref="{http://guidewire.com/pc/ccintegration}Envelope"/>
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
        "envelope"
    })
    public static class Return {

        @XmlElement(name = "Envelope", namespace = "http://guidewire.com/pc/ccintegration", required = true)
        protected Envelope envelope;

        /**
         * Gets the value of the envelope property.
         * 
         * @return
         *     possible object is
         *     {@link Envelope }
         *     
         */
        public Envelope getEnvelope() {
            return envelope;
        }

        /**
         * Sets the value of the envelope property.
         * 
         * @param value
         *     allowed object is
         *     {@link Envelope }
         *     
         */
        public void setEnvelope(Envelope value) {
            this.envelope = value;
        }

    }

}
