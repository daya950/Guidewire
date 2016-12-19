
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.policysummarydto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.PolicyStatus;
import servlet.guidewire.cc.typekey.PolicyType;
import servlet.guidewire.cc.typekey.State;


/**
 * <p>Java class for PolicySummaryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicySummaryDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanSelectProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanSelectRiskUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanSelectVehicles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsuredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyType" type="{http://guidewire.com/cc/typekey}PolicyType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProducerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyInvolvedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyPolicyType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://guidewire.com/cc/typekey}State" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://guidewire.com/cc/typekey}PolicyStatus" minOccurs="0"/>
 *         &lt;element name="VehicleIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleInvolvedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehiclePolicyType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicySummaryDTO", propOrder = {
    "canSelectProperties",
    "canSelectRiskUnits",
    "canSelectVehicles",
    "city",
    "effectiveDate",
    "expirationDate",
    "insuredName",
    "lossDate",
    "policyNumber",
    "policyType",
    "postalCode",
    "producerCode",
    "propertyInvolvedID",
    "propertyPolicyType",
    "publicID",
    "state",
    "status",
    "vehicleIDs",
    "vehicleInvolvedID",
    "vehiclePolicyType"
})
public class PolicySummaryDTO {

    @XmlElement(name = "CanSelectProperties")
    protected Boolean canSelectProperties;
    @XmlElement(name = "CanSelectRiskUnits")
    protected Boolean canSelectRiskUnits;
    @XmlElement(name = "CanSelectVehicles")
    protected Boolean canSelectVehicles;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "InsuredName")
    protected String insuredName;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lossDate;
    @XmlElement(name = "PolicyNumber")
    protected String policyNumber;
    @XmlElement(name = "PolicyType")
    @XmlSchemaType(name = "string")
    protected PolicyType policyType;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "ProducerCode")
    protected String producerCode;
    @XmlElement(name = "PropertyInvolvedID")
    protected String propertyInvolvedID;
    @XmlElement(name = "PropertyPolicyType")
    protected Boolean propertyPolicyType;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected State state;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected PolicyStatus status;
    @XmlElement(name = "VehicleIDs")
    protected PolicySummaryDTO.VehicleIDs vehicleIDs;
    @XmlElement(name = "VehicleInvolvedID")
    protected String vehicleInvolvedID;
    @XmlElement(name = "VehiclePolicyType")
    protected Boolean vehiclePolicyType;

    /**
     * Gets the value of the canSelectProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSelectProperties() {
        return canSelectProperties;
    }

    /**
     * Sets the value of the canSelectProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSelectProperties(Boolean value) {
        this.canSelectProperties = value;
    }

    /**
     * Gets the value of the canSelectRiskUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSelectRiskUnits() {
        return canSelectRiskUnits;
    }

    /**
     * Sets the value of the canSelectRiskUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSelectRiskUnits(Boolean value) {
        this.canSelectRiskUnits = value;
    }

    /**
     * Gets the value of the canSelectVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSelectVehicles() {
        return canSelectVehicles;
    }

    /**
     * Sets the value of the canSelectVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSelectVehicles(Boolean value) {
        this.canSelectVehicles = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredName(String value) {
        this.insuredName = value;
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
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicyType(PolicyType value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the producerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerCode(String value) {
        this.producerCode = value;
    }

    /**
     * Gets the value of the propertyInvolvedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyInvolvedID() {
        return propertyInvolvedID;
    }

    /**
     * Sets the value of the propertyInvolvedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyInvolvedID(String value) {
        this.propertyInvolvedID = value;
    }

    /**
     * Gets the value of the propertyPolicyType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyPolicyType() {
        return propertyPolicyType;
    }

    /**
     * Sets the value of the propertyPolicyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyPolicyType(Boolean value) {
        this.propertyPolicyType = value;
    }

    /**
     * Gets the value of the publicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicID() {
        return publicID;
    }

    /**
     * Sets the value of the publicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicID(String value) {
        this.publicID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyStatus }
     *     
     */
    public PolicyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyStatus }
     *     
     */
    public void setStatus(PolicyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the vehicleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySummaryDTO.VehicleIDs }
     *     
     */
    public PolicySummaryDTO.VehicleIDs getVehicleIDs() {
        return vehicleIDs;
    }

    /**
     * Sets the value of the vehicleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySummaryDTO.VehicleIDs }
     *     
     */
    public void setVehicleIDs(PolicySummaryDTO.VehicleIDs value) {
        this.vehicleIDs = value;
    }

    /**
     * Gets the value of the vehicleInvolvedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInvolvedID() {
        return vehicleInvolvedID;
    }

    /**
     * Sets the value of the vehicleInvolvedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInvolvedID(String value) {
        this.vehicleInvolvedID = value;
    }

    /**
     * Gets the value of the vehiclePolicyType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehiclePolicyType() {
        return vehiclePolicyType;
    }

    /**
     * Sets the value of the vehiclePolicyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehiclePolicyType(Boolean value) {
        this.vehiclePolicyType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Entry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class VehicleIDs {

        @XmlElement(name = "Entry", nillable = true)
        protected List<String> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntry() {
            if (entry == null) {
                entry = new ArrayList<String>();
            }
            return this.entry;
        }

    }

}
