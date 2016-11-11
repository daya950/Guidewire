
package servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCStatCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCStatCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BuildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InsuranceLine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InsuranceSubLine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MajorPeril" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCStatCode")
public class CCStatCode {

    @XmlAttribute(name = "BuildingNumber")
    protected String buildingNumber;
    @XmlAttribute(name = "ClassCode")
    protected String classCode;
    @XmlAttribute(name = "InsuranceLine")
    protected String insuranceLine;
    @XmlAttribute(name = "InsuranceSubLine")
    protected String insuranceSubLine;
    @XmlAttribute(name = "LineNumber")
    protected Integer lineNumber;
    @XmlAttribute(name = "MajorPeril")
    protected String majorPeril;
    @XmlAttribute(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "State")
    protected String state;
    @XmlAttribute(name = "VehicleNumber")
    protected String vehicleNumber;

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the insuranceLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceLine() {
        return insuranceLine;
    }

    /**
     * Sets the value of the insuranceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceLine(String value) {
        this.insuranceLine = value;
    }

    /**
     * Gets the value of the insuranceSubLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceSubLine() {
        return insuranceSubLine;
    }

    /**
     * Sets the value of the insuranceSubLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceSubLine(String value) {
        this.insuranceSubLine = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the majorPeril property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorPeril() {
        return majorPeril;
    }

    /**
     * Sets the value of the majorPeril property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorPeril(String value) {
        this.majorPeril = value;
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
     * Gets the value of the vehicleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * Sets the value of the vehicleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNumber(String value) {
        this.vehicleNumber = value;
    }

}
