
package servlet.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CCCoverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCoverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CovTerms" type="{http://guidewire.com/pc/ccintegration}CCCovTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Deductible" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ExposureLimit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IncidentLimit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LimitsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCoverage", propOrder = {
    "covTerms"
})
@XmlSeeAlso({
    CCRUCoverage.class,
    CCPolicyCoverage.class
})
public class CCCoverage {

    @XmlElement(name = "CovTerms")
    protected List<CCCovTerm> covTerms;
    @XmlAttribute(name = "Currency")
    protected String currency;
    @XmlAttribute(name = "Deductible")
    protected String deductible;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "ExposureLimit")
    protected String exposureLimit;
    @XmlAttribute(name = "IncidentLimit")
    protected String incidentLimit;
    @XmlAttribute(name = "LimitsIndicator")
    protected String limitsIndicator;
    @XmlAttribute(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "PolicySystemID")
    protected String policySystemID;
    @XmlAttribute(name = "State")
    protected String state;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the covTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the covTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCovTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCCovTerm }
     * 
     * 
     */
    public List<CCCovTerm> getCovTerms() {
        if (covTerms == null) {
            covTerms = new ArrayList<CCCovTerm>();
        }
        return this.covTerms;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductible(String value) {
        this.deductible = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the exposureLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposureLimit() {
        return exposureLimit;
    }

    /**
     * Sets the value of the exposureLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposureLimit(String value) {
        this.exposureLimit = value;
    }

    /**
     * Gets the value of the incidentLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentLimit() {
        return incidentLimit;
    }

    /**
     * Sets the value of the incidentLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentLimit(String value) {
        this.incidentLimit = value;
    }

    /**
     * Gets the value of the limitsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitsIndicator() {
        return limitsIndicator;
    }

    /**
     * Sets the value of the limitsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitsIndicator(String value) {
        this.limitsIndicator = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the policySystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySystemID() {
        return policySystemID;
    }

    /**
     * Sets the value of the policySystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySystemID(String value) {
        this.policySystemID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
