
package servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaim;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.Currency;


/**
 * <p>Java class for PCClaim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCClaim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimSecurityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LargeLossIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LitigationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemainingReserves" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RemainingReservesCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalIncurred" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalIncurredCurrency" type="{http://guidewire.com/cc/typekey}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCClaim", propOrder = {
    "claimNumber",
    "claimSecurityType",
    "fraudIndicator",
    "largeLossIndicator",
    "litigationIndicator",
    "lossDate",
    "policyNumber",
    "policyTypeName",
    "remainingReserves",
    "remainingReservesCurrency",
    "status",
    "totalIncurred",
    "totalIncurredCurrency"
})
public class PCClaim {

    @XmlElement(name = "ClaimNumber")
    protected String claimNumber;
    @XmlElement(name = "ClaimSecurityType")
    protected String claimSecurityType;
    @XmlElement(name = "FraudIndicator")
    protected Boolean fraudIndicator;
    @XmlElement(name = "LargeLossIndicator")
    protected Boolean largeLossIndicator;
    @XmlElement(name = "LitigationIndicator")
    protected Boolean litigationIndicator;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lossDate;
    @XmlElement(name = "PolicyNumber")
    protected String policyNumber;
    @XmlElement(name = "PolicyTypeName")
    protected String policyTypeName;
    @XmlElement(name = "RemainingReserves")
    protected BigDecimal remainingReserves;
    @XmlElement(name = "RemainingReservesCurrency")
    @XmlSchemaType(name = "string")
    protected Currency remainingReservesCurrency;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TotalIncurred")
    protected BigDecimal totalIncurred;
    @XmlElement(name = "TotalIncurredCurrency")
    @XmlSchemaType(name = "string")
    protected Currency totalIncurredCurrency;

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
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
     * Gets the value of the fraudIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFraudIndicator() {
        return fraudIndicator;
    }

    /**
     * Sets the value of the fraudIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFraudIndicator(Boolean value) {
        this.fraudIndicator = value;
    }

    /**
     * Gets the value of the largeLossIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLargeLossIndicator() {
        return largeLossIndicator;
    }

    /**
     * Sets the value of the largeLossIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLargeLossIndicator(Boolean value) {
        this.largeLossIndicator = value;
    }

    /**
     * Gets the value of the litigationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLitigationIndicator() {
        return litigationIndicator;
    }

    /**
     * Sets the value of the litigationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLitigationIndicator(Boolean value) {
        this.litigationIndicator = value;
    }

    /**
     * Gets the value of the lossDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossDate() {
        return lossDate;
    }

    /**
     * Sets the value of the lossDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossDate(XMLGregorianCalendar value) {
        this.lossDate = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the policyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }

    /**
     * Sets the value of the policyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTypeName(String value) {
        this.policyTypeName = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalIncurred property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIncurred() {
        return totalIncurred;
    }

    /**
     * Sets the value of the totalIncurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIncurred(BigDecimal value) {
        this.totalIncurred = value;
    }

    /**
     * Gets the value of the totalIncurredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotalIncurredCurrency() {
        return totalIncurredCurrency;
    }

    /**
     * Sets the value of the totalIncurredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotalIncurredCurrency(Currency value) {
        this.totalIncurredCurrency = value;
    }

}
