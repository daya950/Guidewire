
package servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCFinancialCovTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCFinancialCovTerm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCCovTerm">
 *       &lt;attribute name="FinancialAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCFinancialCovTerm")
public class CCFinancialCovTerm
    extends CCCovTerm
{

    @XmlAttribute(name = "FinancialAmount")
    protected String financialAmount;

    /**
     * Gets the value of the financialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAmount() {
        return financialAmount;
    }

    /**
     * Sets the value of the financialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAmount(String value) {
        this.financialAmount = value;
    }

}
