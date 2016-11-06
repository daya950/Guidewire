
package com.guidewire.pc.ccintegration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPropertyCoverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPropertyCoverage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCRUCoverage">
 *       &lt;attribute name="Coinsurance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CoverageBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPropertyCoverage")
public class CCPropertyCoverage
    extends CCRUCoverage
{

    @XmlAttribute(name = "Coinsurance")
    protected BigDecimal coinsurance;
    @XmlAttribute(name = "CoverageBasis")
    protected String coverageBasis;

    /**
     * Gets the value of the coinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoinsurance() {
        return coinsurance;
    }

    /**
     * Sets the value of the coinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoinsurance(BigDecimal value) {
        this.coinsurance = value;
    }

    /**
     * Gets the value of the coverageBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageBasis() {
        return coverageBasis;
    }

    /**
     * Sets the value of the coverageBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageBasis(String value) {
        this.coverageBasis = value;
    }

}
