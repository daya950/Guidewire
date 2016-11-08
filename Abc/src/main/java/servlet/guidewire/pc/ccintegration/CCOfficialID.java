
package main.java.servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCOfficialID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCOfficialID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OfficialIDInsuredAndType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfficialIDType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfficialIDValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCOfficialID")
public class CCOfficialID {

    @XmlAttribute(name = "OfficialIDInsuredAndType")
    protected String officialIDInsuredAndType;
    @XmlAttribute(name = "OfficialIDType")
    protected String officialIDType;
    @XmlAttribute(name = "OfficialIDValue")
    protected String officialIDValue;
    @XmlAttribute(name = "State")
    protected String state;

    /**
     * Gets the value of the officialIDInsuredAndType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialIDInsuredAndType() {
        return officialIDInsuredAndType;
    }

    /**
     * Sets the value of the officialIDInsuredAndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialIDInsuredAndType(String value) {
        this.officialIDInsuredAndType = value;
    }

    /**
     * Gets the value of the officialIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialIDType() {
        return officialIDType;
    }

    /**
     * Sets the value of the officialIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialIDType(String value) {
        this.officialIDType = value;
    }

    /**
     * Gets the value of the officialIDValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialIDValue() {
        return officialIDValue;
    }

    /**
     * Sets the value of the officialIDValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialIDValue(String value) {
        this.officialIDValue = value;
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

}
