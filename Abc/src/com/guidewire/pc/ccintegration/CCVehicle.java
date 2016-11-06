
package com.guidewire.pc.ccintegration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lienholders" type="{http://guidewire.com/pc/ccintegration}CCVehicleOwner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BoatType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LicensePlate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Loan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LoanMonthlyPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="LoanPayoffAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="LoanMonthsRemaining" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Make" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Model" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OffRoadStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Vin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Year" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCVehicle", propOrder = {
    "lienholders"
})
public class CCVehicle {

    @XmlElement(name = "Lienholders")
    protected List<CCVehicleOwner> lienholders;
    @XmlAttribute(name = "BoatType")
    protected String boatType;
    @XmlAttribute(name = "Color")
    protected String color;
    @XmlAttribute(name = "LicensePlate")
    protected String licensePlate;
    @XmlAttribute(name = "Loan")
    protected Boolean loan;
    @XmlAttribute(name = "LoanMonthlyPayment")
    protected BigDecimal loanMonthlyPayment;
    @XmlAttribute(name = "LoanPayoffAmount")
    protected BigDecimal loanPayoffAmount;
    @XmlAttribute(name = "LoanMonthsRemaining")
    protected Integer loanMonthsRemaining;
    @XmlAttribute(name = "Make")
    protected String make;
    @XmlAttribute(name = "Manufacturer")
    protected String manufacturer;
    @XmlAttribute(name = "Model")
    protected String model;
    @XmlAttribute(name = "OffRoadStyle")
    protected String offRoadStyle;
    @XmlAttribute(name = "PolicySystemID")
    protected String policySystemID;
    @XmlAttribute(name = "SerialNumber")
    protected String serialNumber;
    @XmlAttribute(name = "State")
    protected String state;
    @XmlAttribute(name = "Style")
    protected String style;
    @XmlAttribute(name = "Vin")
    protected String vin;
    @XmlAttribute(name = "Year")
    protected Integer year;

    /**
     * Gets the value of the lienholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lienholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLienholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCVehicleOwner }
     * 
     * 
     */
    public List<CCVehicleOwner> getLienholders() {
        if (lienholders == null) {
            lienholders = new ArrayList<CCVehicleOwner>();
        }
        return this.lienholders;
    }

    /**
     * Gets the value of the boatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoatType() {
        return boatType;
    }

    /**
     * Sets the value of the boatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoatType(String value) {
        this.boatType = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the licensePlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Sets the value of the licensePlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlate(String value) {
        this.licensePlate = value;
    }

    /**
     * Gets the value of the loan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoan(Boolean value) {
        this.loan = value;
    }

    /**
     * Gets the value of the loanMonthlyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanMonthlyPayment() {
        return loanMonthlyPayment;
    }

    /**
     * Sets the value of the loanMonthlyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanMonthlyPayment(BigDecimal value) {
        this.loanMonthlyPayment = value;
    }

    /**
     * Gets the value of the loanPayoffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanPayoffAmount() {
        return loanPayoffAmount;
    }

    /**
     * Sets the value of the loanPayoffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanPayoffAmount(BigDecimal value) {
        this.loanPayoffAmount = value;
    }

    /**
     * Gets the value of the loanMonthsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanMonthsRemaining() {
        return loanMonthsRemaining;
    }

    /**
     * Sets the value of the loanMonthsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanMonthsRemaining(Integer value) {
        this.loanMonthsRemaining = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the offRoadStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffRoadStyle() {
        return offRoadStyle;
    }

    /**
     * Sets the value of the offRoadStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffRoadStyle(String value) {
        this.offRoadStyle = value;
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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
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
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

}
