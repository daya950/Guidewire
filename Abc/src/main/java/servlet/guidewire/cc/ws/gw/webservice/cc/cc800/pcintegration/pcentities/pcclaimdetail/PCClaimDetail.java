
package servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimdetail;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.typekey.Currency;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaim.PCClaim;


/**
 * <p>Java class for PCClaimDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCClaimDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimInfoPublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimPublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimSecurityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuturePayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Injury" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Litigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LossCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recoveries" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecoveriesCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="RemainingReserves" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RemainingReservesCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="TotalPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPaidCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="pcClaim" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim}PCClaim" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCClaimDetail", propOrder = {
    "claimInfoPublicID",
    "claimPublicID",
    "claimSecurityType",
    "description",
    "futurePayment",
    "injury",
    "litigation",
    "lossCause",
    "recoveries",
    "recoveriesCurrency",
    "remainingReserves",
    "remainingReservesCurrency",
    "totalPaid",
    "totalPaidCurrency",
    "pcClaim"
})
public class PCClaimDetail {

    @XmlElement(name = "ClaimInfoPublicID")
    protected String claimInfoPublicID;
    @XmlElement(name = "ClaimPublicID")
    protected String claimPublicID;
    @XmlElement(name = "ClaimSecurityType")
    protected String claimSecurityType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FuturePayment")
    protected BigDecimal futurePayment;
    @XmlElement(name = "Injury")
    protected Boolean injury;
    @XmlElement(name = "Litigation")
    protected Boolean litigation;
    @XmlElement(name = "LossCause")
    protected String lossCause;
    @XmlElement(name = "Recoveries")
    protected BigDecimal recoveries;
    @XmlElement(name = "RecoveriesCurrency")
    @XmlSchemaType(name = "string")
    protected Currency recoveriesCurrency;
    @XmlElement(name = "RemainingReserves")
    protected BigDecimal remainingReserves;
    @XmlElement(name = "RemainingReservesCurrency")
    @XmlSchemaType(name = "string")
    protected Currency remainingReservesCurrency;
    @XmlElement(name = "TotalPaid")
    protected BigDecimal totalPaid;
    @XmlElement(name = "TotalPaidCurrency")
    @XmlSchemaType(name = "string")
    protected Currency totalPaidCurrency;
    protected PCClaim pcClaim;

    /**
     * Gets the value of the claimInfoPublicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimInfoPublicID() {
        return claimInfoPublicID;
    }

    /**
     * Sets the value of the claimInfoPublicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimInfoPublicID(String value) {
        this.claimInfoPublicID = value;
    }

    /**
     * Gets the value of the claimPublicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimPublicID() {
        return claimPublicID;
    }

    /**
     * Sets the value of the claimPublicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimPublicID(String value) {
        this.claimPublicID = value;
    }

    /**
     * Gets the value of the claimSecurityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimSecurityType() {
        return claimSecurityType;
    }

    /**
     * Sets the value of the claimSecurityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimSecurityType(String value) {
        this.claimSecurityType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the futurePayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuturePayment() {
        return futurePayment;
    }

    /**
     * Sets the value of the futurePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuturePayment(BigDecimal value) {
        this.futurePayment = value;
    }

    /**
     * Gets the value of the injury property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInjury() {
        return injury;
    }

    /**
     * Sets the value of the injury property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInjury(Boolean value) {
        this.injury = value;
    }

    /**
     * Gets the value of the litigation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLitigation() {
        return litigation;
    }

    /**
     * Sets the value of the litigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLitigation(Boolean value) {
        this.litigation = value;
    }

    /**
     * Gets the value of the lossCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossCause() {
        return lossCause;
    }

    /**
     * Sets the value of the lossCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossCause(String value) {
        this.lossCause = value;
    }

    /**
     * Gets the value of the recoveries property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveries() {
        return recoveries;
    }

    /**
     * Sets the value of the recoveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveries(BigDecimal value) {
        this.recoveries = value;
    }

    /**
     * Gets the value of the recoveriesCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRecoveriesCurrency() {
        return recoveriesCurrency;
    }

    /**
     * Sets the value of the recoveriesCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRecoveriesCurrency(Currency value) {
        this.recoveriesCurrency = value;
    }

    /**
     * Gets the value of the remainingReserves property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingReserves() {
        return remainingReserves;
    }

    /**
     * Sets the value of the remainingReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingReserves(BigDecimal value) {
        this.remainingReserves = value;
    }

    /**
     * Gets the value of the remainingReservesCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRemainingReservesCurrency() {
        return remainingReservesCurrency;
    }

    /**
     * Sets the value of the remainingReservesCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRemainingReservesCurrency(Currency value) {
        this.remainingReservesCurrency = value;
    }

    /**
     * Gets the value of the totalPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    /**
     * Sets the value of the totalPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPaid(BigDecimal value) {
        this.totalPaid = value;
    }

    /**
     * Gets the value of the totalPaidCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotalPaidCurrency() {
        return totalPaidCurrency;
    }

    /**
     * Sets the value of the totalPaidCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotalPaidCurrency(Currency value) {
        this.totalPaidCurrency = value;
    }

    /**
     * Gets the value of the pcClaim property.
     * 
     * @return
     *     possible object is
     *     {@link PCClaim }
     *     
     */
    public PCClaim getPcClaim() {
        return pcClaim;
    }

    /**
     * Sets the value of the pcClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCClaim }
     *     
     */
    public void setPcClaim(PCClaim value) {
        this.pcClaim = value;
    }

}
