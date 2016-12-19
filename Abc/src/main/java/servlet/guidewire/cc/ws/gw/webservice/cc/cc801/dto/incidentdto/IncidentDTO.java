
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.incidentdto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import servlet.guidewire.cc.typekey.DisabledDueToAccident;
import servlet.guidewire.cc.typekey.Incident;
import servlet.guidewire.cc.typekey.InjuryType;
import servlet.guidewire.cc.typekey.LossOccured;
import servlet.guidewire.cc.typekey.MedicalTreatmentType;
import servlet.guidewire.cc.typekey.SeverityType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.exposuredto.ExposureDTO;


/**
 * <p>Java class for IncidentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmbulanceUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedInjuryType" type="{http://guidewire.com/cc/typekey}DetailedInjuryType" minOccurs="0"/>
 *         &lt;element name="DisabledDueToAccident" type="{http://guidewire.com/cc/typekey}DisabledDueToAccident" minOccurs="0"/>
 *         &lt;element name="ExposureIDs" minOccurs="0">
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
 *         &lt;element name="GeneralInjuryType" type="{http://guidewire.com/cc/typekey}InjuryType" minOccurs="0"/>
 *         &lt;element name="LocationAddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossOccured" type="{http://guidewire.com/cc/typekey}LossOccured" minOccurs="0"/>
 *         &lt;element name="LossofUse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MedicalTreatmentType" type="{http://guidewire.com/cc/typekey}MedicalTreatmentType" minOccurs="0"/>
 *         &lt;element name="NewExposures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ExposureDTO}ExposureDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PropertyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://guidewire.com/cc/typekey}SeverityType" minOccurs="0"/>
 *         &lt;element name="Subtype" type="{http://guidewire.com/cc/typekey}Incident" minOccurs="0"/>
 *         &lt;element name="TypeofPropertyIDs" minOccurs="0">
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
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="injuredID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentDTO", propOrder = {
    "ambulanceUsed",
    "claimID",
    "createTime",
    "createUserID",
    "description",
    "detailedInjuryType",
    "disabledDueToAccident",
    "exposureIDs",
    "generalInjuryType",
    "locationAddressID",
    "lossDesc",
    "lossOccured",
    "lossofUse",
    "medicalTreatmentType",
    "newExposures",
    "propertyDesc",
    "publicID",
    "severity",
    "subtype",
    "typeofPropertyIDs",
    "updateTime",
    "updateUserID",
    "vehicleID",
    "driverID",
    "injuredID"
})
public class IncidentDTO {

    @XmlElement(name = "AmbulanceUsed")
    protected Boolean ambulanceUsed;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateUserID")
    protected String createUserID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DetailedInjuryType")
    protected String detailedInjuryType;
    @XmlElement(name = "DisabledDueToAccident")
    @XmlSchemaType(name = "string")
    protected DisabledDueToAccident disabledDueToAccident;
    @XmlElement(name = "ExposureIDs")
    protected IncidentDTO.ExposureIDs exposureIDs;
    @XmlElement(name = "GeneralInjuryType")
    @XmlSchemaType(name = "string")
    protected InjuryType generalInjuryType;
    @XmlElement(name = "LocationAddressID")
    protected String locationAddressID;
    @XmlElement(name = "LossDesc")
    protected String lossDesc;
    @XmlElement(name = "LossOccured")
    @XmlSchemaType(name = "string")
    protected LossOccured lossOccured;
    @XmlElement(name = "LossofUse")
    protected Boolean lossofUse;
    @XmlElement(name = "MedicalTreatmentType")
    @XmlSchemaType(name = "string")
    protected MedicalTreatmentType medicalTreatmentType;
    @XmlElement(name = "NewExposures")
    protected IncidentDTO.NewExposures newExposures;
    @XmlElement(name = "PropertyDesc")
    protected String propertyDesc;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "string")
    protected SeverityType severity;
    @XmlElement(name = "Subtype")
    @XmlSchemaType(name = "string")
    protected Incident subtype;
    @XmlElement(name = "TypeofPropertyIDs")
    protected IncidentDTO.TypeofPropertyIDs typeofPropertyIDs;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "UpdateUserID")
    protected String updateUserID;
    @XmlElement(name = "VehicleID")
    protected String vehicleID;
    protected String driverID;
    protected String injuredID;

    /**
     * Gets the value of the ambulanceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmbulanceUsed() {
        return ambulanceUsed;
    }

    /**
     * Sets the value of the ambulanceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmbulanceUsed(Boolean value) {
        this.ambulanceUsed = value;
    }

    /**
     * Gets the value of the claimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUserID() {
        return createUserID;
    }

    /**
     * Sets the value of the createUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUserID(String value) {
        this.createUserID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the detailedInjuryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedInjuryType() {
        return detailedInjuryType;
    }

    /**
     * Sets the value of the detailedInjuryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedInjuryType(String value) {
        this.detailedInjuryType = value;
    }

    /**
     * Gets the value of the disabledDueToAccident property.
     * 
     * @return
     *     possible object is
     *     {@link DisabledDueToAccident }
     *     
     */
    public DisabledDueToAccident getDisabledDueToAccident() {
        return disabledDueToAccident;
    }

    /**
     * Sets the value of the disabledDueToAccident property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabledDueToAccident }
     *     
     */
    public void setDisabledDueToAccident(DisabledDueToAccident value) {
        this.disabledDueToAccident = value;
    }

    /**
     * Gets the value of the exposureIDs property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentDTO.ExposureIDs }
     *     
     */
    public IncidentDTO.ExposureIDs getExposureIDs() {
        return exposureIDs;
    }

    /**
     * Sets the value of the exposureIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentDTO.ExposureIDs }
     *     
     */
    public void setExposureIDs(IncidentDTO.ExposureIDs value) {
        this.exposureIDs = value;
    }

    /**
     * Gets the value of the generalInjuryType property.
     * 
     * @return
     *     possible object is
     *     {@link InjuryType }
     *     
     */
    public InjuryType getGeneralInjuryType() {
        return generalInjuryType;
    }

    /**
     * Sets the value of the generalInjuryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryType }
     *     
     */
    public void setGeneralInjuryType(InjuryType value) {
        this.generalInjuryType = value;
    }

    /**
     * Gets the value of the locationAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAddressID() {
        return locationAddressID;
    }

    /**
     * Sets the value of the locationAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAddressID(String value) {
        this.locationAddressID = value;
    }

    /**
     * Gets the value of the lossDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossDesc() {
        return lossDesc;
    }

    /**
     * Sets the value of the lossDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossDesc(String value) {
        this.lossDesc = value;
    }

    /**
     * Gets the value of the lossOccured property.
     * 
     * @return
     *     possible object is
     *     {@link LossOccured }
     *     
     */
    public LossOccured getLossOccured() {
        return lossOccured;
    }

    /**
     * Sets the value of the lossOccured property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossOccured }
     *     
     */
    public void setLossOccured(LossOccured value) {
        this.lossOccured = value;
    }

    /**
     * Gets the value of the lossofUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLossofUse() {
        return lossofUse;
    }

    /**
     * Sets the value of the lossofUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLossofUse(Boolean value) {
        this.lossofUse = value;
    }

    /**
     * Gets the value of the medicalTreatmentType property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalTreatmentType }
     *     
     */
    public MedicalTreatmentType getMedicalTreatmentType() {
        return medicalTreatmentType;
    }

    /**
     * Sets the value of the medicalTreatmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalTreatmentType }
     *     
     */
    public void setMedicalTreatmentType(MedicalTreatmentType value) {
        this.medicalTreatmentType = value;
    }

    /**
     * Gets the value of the newExposures property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentDTO.NewExposures }
     *     
     */
    public IncidentDTO.NewExposures getNewExposures() {
        return newExposures;
    }

    /**
     * Sets the value of the newExposures property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentDTO.NewExposures }
     *     
     */
    public void setNewExposures(IncidentDTO.NewExposures value) {
        this.newExposures = value;
    }

    /**
     * Gets the value of the propertyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDesc() {
        return propertyDesc;
    }

    /**
     * Sets the value of the propertyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDesc(String value) {
        this.propertyDesc = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityType }
     *     
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityType }
     *     
     */
    public void setSeverity(SeverityType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link Incident }
     *     
     */
    public Incident getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incident }
     *     
     */
    public void setSubtype(Incident value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the typeofPropertyIDs property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentDTO.TypeofPropertyIDs }
     *     
     */
    public IncidentDTO.TypeofPropertyIDs getTypeofPropertyIDs() {
        return typeofPropertyIDs;
    }

    /**
     * Sets the value of the typeofPropertyIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentDTO.TypeofPropertyIDs }
     *     
     */
    public void setTypeofPropertyIDs(IncidentDTO.TypeofPropertyIDs value) {
        this.typeofPropertyIDs = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the updateUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUserID() {
        return updateUserID;
    }

    /**
     * Sets the value of the updateUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUserID(String value) {
        this.updateUserID = value;
    }

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the driverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverID() {
        return driverID;
    }

    /**
     * Sets the value of the driverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverID(String value) {
        this.driverID = value;
    }

    /**
     * Gets the value of the injuredID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInjuredID() {
        return injuredID;
    }

    /**
     * Sets the value of the injuredID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInjuredID(String value) {
        this.injuredID = value;
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
    public static class ExposureIDs {

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
     *         &lt;element name="Entry" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ExposureDTO}ExposureDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NewExposures {

        @XmlElement(name = "Entry", nillable = true)
        protected List<ExposureDTO> entry;

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
         * {@link ExposureDTO }
         * 
         * 
         */
        public List<ExposureDTO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ExposureDTO>();
            }
            return this.entry;
        }

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
    public static class TypeofPropertyIDs {

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
