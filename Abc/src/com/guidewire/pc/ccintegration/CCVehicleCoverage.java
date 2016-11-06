
package com.guidewire.pc.ccintegration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCVehicleCoverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCVehicleCoverage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCRUCoverage">
 *       &lt;attribute name="ClaimAggLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="NonmedAggLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PersonAggLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ReplaceAggLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCVehicleCoverage")
public class CCVehicleCoverage
    extends CCRUCoverage
{

    @XmlAttribute(name = "ClaimAggLimit")
    protected BigDecimal claimAggLimit;
    @XmlAttribute(name = "NonmedAggLimit")
    protected BigDecimal nonmedAggLimit;
    @XmlAttribute(name = "PersonAggLimit")
    protected BigDecimal personAggLimit;
    @XmlAttribute(name = "ReplaceAggLimit")
    protected BigDecimal replaceAggLimit;

    /**
     * Gets the value of the claimAggLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClaimAggLimit() {
        return claimAggLimit;
    }

    /**
     * Sets the value of the claimAggLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClaimAggLimit(BigDecimal value) {
        this.claimAggLimit = value;
    }

    /**
     * Gets the value of the nonmedAggLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonmedAggLimit() {
        return nonmedAggLimit;
    }

    /**
     * Sets the value of the nonmedAggLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonmedAggLimit(BigDecimal value) {
        this.nonmedAggLimit = value;
    }

    /**
     * Gets the value of the personAggLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPersonAggLimit() {
        return personAggLimit;
    }

    /**
     * Sets the value of the personAggLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPersonAggLimit(BigDecimal value) {
        this.personAggLimit = value;
    }

    /**
     * Gets the value of the replaceAggLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReplaceAggLimit() {
        return replaceAggLimit;
    }

    /**
     * Sets the value of the replaceAggLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReplaceAggLimit(BigDecimal value) {
        this.replaceAggLimit = value;
    }

}
