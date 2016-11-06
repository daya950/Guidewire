
package com.guidewire.pc.ccintegration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Represents a ClaimCenter Policy
 *       
 * 
 * <p>Java class for CCPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="AltContact" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClassCodes" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Coverages" type="{http://guidewire.com/pc/ccintegration}CCPolicyCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoveredParty" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DoingBusinessAs" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="Endorsements" type="{http://guidewire.com/pc/ccintegration}CCEndorsement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludedParty" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerAgent" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerCoveredParty" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerDoingBusinessAs" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerExcludedParty" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerInsured" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerPolicyHolder" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerUnderwriter" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Insured" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="InsuredRep" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MainContact" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PolicyHolder" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="PolicyLocations" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RiskUnits" type="{http://guidewire.com/pc/ccintegration}CCRiskUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StatCodes" type="{http://guidewire.com/pc/ccintegration}CCStatCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Underwriter" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="WCCarrier" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Account" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CoverageForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomerServiceTier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FinancialInterests" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForeignCoverage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InsuredSICCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginalEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OtherInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OtherInsuranceInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Participation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyRatingPlan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicySystemPeriodID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="PolicyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProducerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="RetroactiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReturnToWorkPrgm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalProperties" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TotalVehicles" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UnderwritingCo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnderwritingGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WCOtherStates" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WCStates" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPolicy", propOrder = {
    "agent",
    "altContact",
    "classCodes",
    "coverages",
    "coveredParty",
    "doingBusinessAs",
    "endorsements",
    "excludedParty",
    "formerAgent",
    "formerCoveredParty",
    "formerDoingBusinessAs",
    "formerExcludedParty",
    "formerInsured",
    "formerPolicyHolder",
    "formerUnderwriter",
    "insured",
    "insuredRep",
    "mainContact",
    "other",
    "policyHolder",
    "policyLocations",
    "riskUnits",
    "statCodes",
    "underwriter",
    "wcCarrier"
})
public class CCPolicy {

    @XmlElement(name = "Agent")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object agent;
    @XmlElementRef(name = "AltContact", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> altContact;
    @XmlElementRef(name = "ClassCodes", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> classCodes;
    @XmlElement(name = "Coverages")
    protected List<CCPolicyCoverage> coverages;
    @XmlElementRef(name = "CoveredParty", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> coveredParty;
    @XmlElement(name = "DoingBusinessAs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object doingBusinessAs;
    @XmlElement(name = "Endorsements")
    protected List<CCEndorsement> endorsements;
    @XmlElementRef(name = "ExcludedParty", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> excludedParty;
    @XmlElementRef(name = "FormerAgent", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerAgent;
    @XmlElementRef(name = "FormerCoveredParty", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerCoveredParty;
    @XmlElementRef(name = "FormerDoingBusinessAs", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerDoingBusinessAs;
    @XmlElementRef(name = "FormerExcludedParty", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerExcludedParty;
    @XmlElementRef(name = "FormerInsured", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerInsured;
    @XmlElementRef(name = "FormerPolicyHolder", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerPolicyHolder;
    @XmlElementRef(name = "FormerUnderwriter", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> formerUnderwriter;
    @XmlElement(name = "Insured")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object insured;
    @XmlElementRef(name = "InsuredRep", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> insuredRep;
    @XmlElementRef(name = "MainContact", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> mainContact;
    @XmlElementRef(name = "Other", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> other;
    @XmlElement(name = "PolicyHolder")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object policyHolder;
    @XmlElementRef(name = "PolicyLocations", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> policyLocations;
    @XmlElement(name = "RiskUnits")
    protected List<CCRiskUnit> riskUnits;
    @XmlElement(name = "StatCodes")
    protected List<CCStatCode> statCodes;
    @XmlElement(name = "Underwriter")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object underwriter;
    @XmlElementRef(name = "WCCarrier", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> wcCarrier;
    @XmlAttribute(name = "Account")
    protected String account;
    @XmlAttribute(name = "CancellationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlAttribute(name = "CoverageForm")
    protected String coverageForm;
    @XmlAttribute(name = "Currency")
    protected String currency;
    @XmlAttribute(name = "CustomerServiceTier")
    protected String customerServiceTier;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "FinancialInterests")
    protected String financialInterests;
    @XmlAttribute(name = "ForeignCoverage")
    protected Boolean foreignCoverage;
    @XmlAttribute(name = "InsuredSICCode")
    protected String insuredSICCode;
    @XmlAttribute(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "OriginalEffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalEffectiveDate;
    @XmlAttribute(name = "OtherInsurance")
    protected Boolean otherInsurance;
    @XmlAttribute(name = "OtherInsuranceInfo")
    protected String otherInsuranceInfo;
    @XmlAttribute(name = "Participation")
    protected BigDecimal participation;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
    @XmlAttribute(name = "PolicyRatingPlan")
    protected String policyRatingPlan;
    @XmlAttribute(name = "PolicySource")
    protected String policySource;
    @XmlAttribute(name = "PolicySuffix")
    protected String policySuffix;
    @XmlAttribute(name = "PolicySystemPeriodID")
    protected Long policySystemPeriodID;
    @XmlAttribute(name = "PolicyType")
    protected String policyType;
    @XmlAttribute(name = "ProducerCode")
    protected String producerCode;
    @XmlAttribute(name = "ReportingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportingDate;
    @XmlAttribute(name = "RetroactiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retroactiveDate;
    @XmlAttribute(name = "ReturnToWorkPrgm")
    protected Boolean returnToWorkPrgm;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "TotalProperties")
    protected Integer totalProperties;
    @XmlAttribute(name = "TotalVehicles")
    protected Integer totalVehicles;
    @XmlAttribute(name = "UnderwritingCo")
    protected String underwritingCo;
    @XmlAttribute(name = "UnderwritingGroup")
    protected String underwritingGroup;
    @XmlAttribute(name = "WCOtherStates")
    protected String wcOtherStates;
    @XmlAttribute(name = "WCStates")
    protected String wcStates;

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAgent(Object value) {
        this.agent = value;
    }

    /**
     * Gets the value of the altContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAltContact() {
        if (altContact == null) {
            altContact = new ArrayList<JAXBElement<Object>>();
        }
        return this.altContact;
    }

    /**
     * Gets the value of the classCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getClassCodes() {
        if (classCodes == null) {
            classCodes = new ArrayList<JAXBElement<Object>>();
        }
        return this.classCodes;
    }

    /**
     * Gets the value of the coverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCPolicyCoverage }
     * 
     * 
     */
    public List<CCPolicyCoverage> getCoverages() {
        if (coverages == null) {
            coverages = new ArrayList<CCPolicyCoverage>();
        }
        return this.coverages;
    }

    /**
     * Gets the value of the coveredParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveredParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveredParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getCoveredParty() {
        if (coveredParty == null) {
            coveredParty = new ArrayList<JAXBElement<Object>>();
        }
        return this.coveredParty;
    }

    /**
     * Gets the value of the doingBusinessAs property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDoingBusinessAs() {
        return doingBusinessAs;
    }

    /**
     * Sets the value of the doingBusinessAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDoingBusinessAs(Object value) {
        this.doingBusinessAs = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCEndorsement }
     * 
     * 
     */
    public List<CCEndorsement> getEndorsements() {
        if (endorsements == null) {
            endorsements = new ArrayList<CCEndorsement>();
        }
        return this.endorsements;
    }

    /**
     * Gets the value of the excludedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getExcludedParty() {
        if (excludedParty == null) {
            excludedParty = new ArrayList<JAXBElement<Object>>();
        }
        return this.excludedParty;
    }

    /**
     * Gets the value of the formerAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerAgent() {
        if (formerAgent == null) {
            formerAgent = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerAgent;
    }

    /**
     * Gets the value of the formerCoveredParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerCoveredParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerCoveredParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerCoveredParty() {
        if (formerCoveredParty == null) {
            formerCoveredParty = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerCoveredParty;
    }

    /**
     * Gets the value of the formerDoingBusinessAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerDoingBusinessAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerDoingBusinessAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerDoingBusinessAs() {
        if (formerDoingBusinessAs == null) {
            formerDoingBusinessAs = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerDoingBusinessAs;
    }

    /**
     * Gets the value of the formerExcludedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerExcludedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerExcludedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerExcludedParty() {
        if (formerExcludedParty == null) {
            formerExcludedParty = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerExcludedParty;
    }

    /**
     * Gets the value of the formerInsured property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerInsured property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerInsured().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerInsured() {
        if (formerInsured == null) {
            formerInsured = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerInsured;
    }

    /**
     * Gets the value of the formerPolicyHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerPolicyHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerPolicyHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerPolicyHolder() {
        if (formerPolicyHolder == null) {
            formerPolicyHolder = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerPolicyHolder;
    }

    /**
     * Gets the value of the formerUnderwriter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerUnderwriter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerUnderwriter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFormerUnderwriter() {
        if (formerUnderwriter == null) {
            formerUnderwriter = new ArrayList<JAXBElement<Object>>();
        }
        return this.formerUnderwriter;
    }

    /**
     * Gets the value of the insured property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInsured() {
        return insured;
    }

    /**
     * Sets the value of the insured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInsured(Object value) {
        this.insured = value;
    }

    /**
     * Gets the value of the insuredRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getInsuredRep() {
        if (insuredRep == null) {
            insuredRep = new ArrayList<JAXBElement<Object>>();
        }
        return this.insuredRep;
    }

    /**
     * Gets the value of the mainContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getMainContact() {
        if (mainContact == null) {
            mainContact = new ArrayList<JAXBElement<Object>>();
        }
        return this.mainContact;
    }

    /**
     * Gets the value of the other property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the other property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getOther() {
        if (other == null) {
            other = new ArrayList<JAXBElement<Object>>();
        }
        return this.other;
    }

    /**
     * Gets the value of the policyHolder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the value of the policyHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPolicyHolder(Object value) {
        this.policyHolder = value;
    }

    /**
     * Gets the value of the policyLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getPolicyLocations() {
        if (policyLocations == null) {
            policyLocations = new ArrayList<JAXBElement<Object>>();
        }
        return this.policyLocations;
    }

    /**
     * Gets the value of the riskUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCRiskUnit }
     * 
     * 
     */
    public List<CCRiskUnit> getRiskUnits() {
        if (riskUnits == null) {
            riskUnits = new ArrayList<CCRiskUnit>();
        }
        return this.riskUnits;
    }

    /**
     * Gets the value of the statCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCStatCode }
     * 
     * 
     */
    public List<CCStatCode> getStatCodes() {
        if (statCodes == null) {
            statCodes = new ArrayList<CCStatCode>();
        }
        return this.statCodes;
    }

    /**
     * Gets the value of the underwriter property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnderwriter() {
        return underwriter;
    }

    /**
     * Sets the value of the underwriter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnderwriter(Object value) {
        this.underwriter = value;
    }

    /**
     * Gets the value of the wcCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wcCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWCCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getWCCarrier() {
        if (wcCarrier == null) {
            wcCarrier = new ArrayList<JAXBElement<Object>>();
        }
        return this.wcCarrier;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the coverageForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageForm() {
        return coverageForm;
    }

    /**
     * Sets the value of the coverageForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageForm(String value) {
        this.coverageForm = value;
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
     * Gets the value of the customerServiceTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceTier() {
        return customerServiceTier;
    }

    /**
     * Sets the value of the customerServiceTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceTier(String value) {
        this.customerServiceTier = value;
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
     * Gets the value of the financialInterests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialInterests() {
        return financialInterests;
    }

    /**
     * Sets the value of the financialInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialInterests(String value) {
        this.financialInterests = value;
    }

    /**
     * Gets the value of the foreignCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignCoverage() {
        return foreignCoverage;
    }

    /**
     * Sets the value of the foreignCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignCoverage(Boolean value) {
        this.foreignCoverage = value;
    }

    /**
     * Gets the value of the insuredSICCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredSICCode() {
        return insuredSICCode;
    }

    /**
     * Sets the value of the insuredSICCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredSICCode(String value) {
        this.insuredSICCode = value;
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
     * Gets the value of the originalEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalEffectiveDate() {
        return originalEffectiveDate;
    }

    /**
     * Sets the value of the originalEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalEffectiveDate(XMLGregorianCalendar value) {
        this.originalEffectiveDate = value;
    }

    /**
     * Gets the value of the otherInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherInsurance() {
        return otherInsurance;
    }

    /**
     * Sets the value of the otherInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherInsurance(Boolean value) {
        this.otherInsurance = value;
    }

    /**
     * Gets the value of the otherInsuranceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsuranceInfo() {
        return otherInsuranceInfo;
    }

    /**
     * Sets the value of the otherInsuranceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsuranceInfo(String value) {
        this.otherInsuranceInfo = value;
    }

    /**
     * Gets the value of the participation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParticipation() {
        return participation;
    }

    /**
     * Sets the value of the participation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParticipation(BigDecimal value) {
        this.participation = value;
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
     * Gets the value of the policyRatingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyRatingPlan() {
        return policyRatingPlan;
    }

    /**
     * Sets the value of the policyRatingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyRatingPlan(String value) {
        this.policyRatingPlan = value;
    }

    /**
     * Gets the value of the policySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySource() {
        return policySource;
    }

    /**
     * Sets the value of the policySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySource(String value) {
        this.policySource = value;
    }

    /**
     * Gets the value of the policySuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySuffix() {
        return policySuffix;
    }

    /**
     * Sets the value of the policySuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySuffix(String value) {
        this.policySuffix = value;
    }

    /**
     * Gets the value of the policySystemPeriodID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicySystemPeriodID() {
        return policySystemPeriodID;
    }

    /**
     * Sets the value of the policySystemPeriodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicySystemPeriodID(Long value) {
        this.policySystemPeriodID = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyType(String value) {
        this.policyType = value;
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
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDate(XMLGregorianCalendar value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the retroactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetroactiveDate() {
        return retroactiveDate;
    }

    /**
     * Sets the value of the retroactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetroactiveDate(XMLGregorianCalendar value) {
        this.retroactiveDate = value;
    }

    /**
     * Gets the value of the returnToWorkPrgm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnToWorkPrgm() {
        return returnToWorkPrgm;
    }

    /**
     * Sets the value of the returnToWorkPrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnToWorkPrgm(Boolean value) {
        this.returnToWorkPrgm = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalProperties() {
        return totalProperties;
    }

    /**
     * Sets the value of the totalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalProperties(Integer value) {
        this.totalProperties = value;
    }

    /**
     * Gets the value of the totalVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalVehicles() {
        return totalVehicles;
    }

    /**
     * Sets the value of the totalVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalVehicles(Integer value) {
        this.totalVehicles = value;
    }

    /**
     * Gets the value of the underwritingCo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwritingCo() {
        return underwritingCo;
    }

    /**
     * Sets the value of the underwritingCo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwritingCo(String value) {
        this.underwritingCo = value;
    }

    /**
     * Gets the value of the underwritingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwritingGroup() {
        return underwritingGroup;
    }

    /**
     * Sets the value of the underwritingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwritingGroup(String value) {
        this.underwritingGroup = value;
    }

    /**
     * Gets the value of the wcOtherStates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWCOtherStates() {
        return wcOtherStates;
    }

    /**
     * Sets the value of the wcOtherStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWCOtherStates(String value) {
        this.wcOtherStates = value;
    }

    /**
     * Gets the value of the wcStates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWCStates() {
        return wcStates;
    }

    /**
     * Sets the value of the wcStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWCStates(String value) {
        this.wcStates = value;
    }

}
