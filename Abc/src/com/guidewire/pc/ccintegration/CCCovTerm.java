
package com.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCovTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCovTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CovTermOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CovTermPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ModelAggregation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ModelRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCovTerm")
@XmlSeeAlso({
    CCNumericCovTerm.class,
    CCFinancialCovTerm.class,
    CCClassificationCovTerm.class
})
public class CCCovTerm {

    @XmlAttribute(name = "CovTermOrder")
    protected Integer covTermOrder;
    @XmlAttribute(name = "CovTermPattern")
    protected String covTermPattern;
    @XmlAttribute(name = "ModelAggregation")
    protected String modelAggregation;
    @XmlAttribute(name = "ModelRestriction")
    protected String modelRestriction;
    @XmlAttribute(name = "PolicySystemID")
    protected String policySystemID;

    /**
     * Gets the value of the covTermOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCovTermOrder() {
        return covTermOrder;
    }

    /**
     * Sets the value of the covTermOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCovTermOrder(Integer value) {
        this.covTermOrder = value;
    }

    /**
     * Gets the value of the covTermPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCovTermPattern() {
        return covTermPattern;
    }

    /**
     * Sets the value of the covTermPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCovTermPattern(String value) {
        this.covTermPattern = value;
    }

    /**
     * Gets the value of the modelAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelAggregation() {
        return modelAggregation;
    }

    /**
     * Sets the value of the modelAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelAggregation(String value) {
        this.modelAggregation = value;
    }

    /**
     * Gets the value of the modelRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelRestriction() {
        return modelRestriction;
    }

    /**
     * Sets the value of the modelRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelRestriction(String value) {
        this.modelRestriction = value;
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

}
