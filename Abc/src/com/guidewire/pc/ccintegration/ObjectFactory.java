
package com.guidewire.pc.ccintegration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.guidewire.pc.ccintegration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CCLocationBasedRULienholders_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Lienholders");
    private final static QName _CCPolicyLocationBuildings_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Buildings");
    private final static QName _CCContactAllAddresses_QNAME = new QName("http://guidewire.com/pc/ccintegration", "AllAddresses");
    private final static QName _CCPolicyCoveredParty_QNAME = new QName("http://guidewire.com/pc/ccintegration", "CoveredParty");
    private final static QName _CCPolicyMainContact_QNAME = new QName("http://guidewire.com/pc/ccintegration", "MainContact");
    private final static QName _CCPolicyAltContact_QNAME = new QName("http://guidewire.com/pc/ccintegration", "AltContact");
    private final static QName _CCPolicyFormerAgent_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerAgent");
    private final static QName _CCPolicyInsuredRep_QNAME = new QName("http://guidewire.com/pc/ccintegration", "InsuredRep");
    private final static QName _CCPolicyExcludedParty_QNAME = new QName("http://guidewire.com/pc/ccintegration", "ExcludedParty");
    private final static QName _CCPolicyFormerExcludedParty_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerExcludedParty");
    private final static QName _CCPolicyPolicyLocations_QNAME = new QName("http://guidewire.com/pc/ccintegration", "PolicyLocations");
    private final static QName _CCPolicyFormerUnderwriter_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerUnderwriter");
    private final static QName _CCPolicyClassCodes_QNAME = new QName("http://guidewire.com/pc/ccintegration", "ClassCodes");
    private final static QName _CCPolicyOther_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Other");
    private final static QName _CCPolicyWCCarrier_QNAME = new QName("http://guidewire.com/pc/ccintegration", "WCCarrier");
    private final static QName _CCPolicyFormerDoingBusinessAs_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerDoingBusinessAs");
    private final static QName _CCPolicyFormerCoveredParty_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerCoveredParty");
    private final static QName _CCPolicyFormerInsured_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerInsured");
    private final static QName _CCPolicyFormerPolicyHolder_QNAME = new QName("http://guidewire.com/pc/ccintegration", "FormerPolicyHolder");
    private final static QName _CCPersonWards_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Wards");
    private final static QName _CCCompanyThirdpartyinsured_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Thirdpartyinsured");
    private final static QName _CCCompanyEmployees_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Employees");
    private final static QName _CCCompanyCase_QNAME = new QName("http://guidewire.com/pc/ccintegration", "Case");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.guidewire.pc.ccintegration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CCPCFilteringCriteria }
     * 
     */
    public CCPCFilteringCriteria createCCPCFilteringCriteria() {
        return new CCPCFilteringCriteria();
    }

    /**
     * Create an instance of {@link CCPCSearchCriteria }
     * 
     */
    public CCPCSearchCriteria createCCPCSearchCriteria() {
        return new CCPCSearchCriteria();
    }

    /**
     * Create an instance of {@link Summaries }
     * 
     */
    public Summaries createSummaries() {
        return new Summaries();
    }

    /**
     * Create an instance of {@link CCPolicySummary }
     * 
     */
    public CCPolicySummary createCCPolicySummary() {
        return new CCPolicySummary();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link CCAddress }
     * 
     */
    public CCAddress createCCAddress() {
        return new CCAddress();
    }

    /**
     * Create an instance of {@link CCBuilding }
     * 
     */
    public CCBuilding createCCBuilding() {
        return new CCBuilding();
    }

    /**
     * Create an instance of {@link CCClassCode }
     * 
     */
    public CCClassCode createCCClassCode() {
        return new CCClassCode();
    }

    /**
     * Create an instance of {@link CCContact }
     * 
     */
    public CCContact createCCContact() {
        return new CCContact();
    }

    /**
     * Create an instance of {@link CCPolicyLocation }
     * 
     */
    public CCPolicyLocation createCCPolicyLocation() {
        return new CCPolicyLocation();
    }

    /**
     * Create an instance of {@link CCPropertyOwner }
     * 
     */
    public CCPropertyOwner createCCPropertyOwner() {
        return new CCPropertyOwner();
    }

    /**
     * Create an instance of {@link CCPolicy }
     * 
     */
    public CCPolicy createCCPolicy() {
        return new CCPolicy();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link CCLegalVenue }
     * 
     */
    public CCLegalVenue createCCLegalVenue() {
        return new CCLegalVenue();
    }

    /**
     * Create an instance of {@link CCPropertyCoverage }
     * 
     */
    public CCPropertyCoverage createCCPropertyCoverage() {
        return new CCPropertyCoverage();
    }

    /**
     * Create an instance of {@link CCCompany }
     * 
     */
    public CCCompany createCCCompany() {
        return new CCCompany();
    }

    /**
     * Create an instance of {@link CCRiskUnit }
     * 
     */
    public CCRiskUnit createCCRiskUnit() {
        return new CCRiskUnit();
    }

    /**
     * Create an instance of {@link CCVehicleCoverage }
     * 
     */
    public CCVehicleCoverage createCCVehicleCoverage() {
        return new CCVehicleCoverage();
    }

    /**
     * Create an instance of {@link CCPolicySummaryVehicle }
     * 
     */
    public CCPolicySummaryVehicle createCCPolicySummaryVehicle() {
        return new CCPolicySummaryVehicle();
    }

    /**
     * Create an instance of {@link CCRUCoverage }
     * 
     */
    public CCRUCoverage createCCRUCoverage() {
        return new CCRUCoverage();
    }

    /**
     * Create an instance of {@link CCNumericCovTerm }
     * 
     */
    public CCNumericCovTerm createCCNumericCovTerm() {
        return new CCNumericCovTerm();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link CCOfficialID }
     * 
     */
    public CCOfficialID createCCOfficialID() {
        return new CCOfficialID();
    }

    /**
     * Create an instance of {@link CCFinancialCovTerm }
     * 
     */
    public CCFinancialCovTerm createCCFinancialCovTerm() {
        return new CCFinancialCovTerm();
    }

    /**
     * Create an instance of {@link CCBuildingRU }
     * 
     */
    public CCBuildingRU createCCBuildingRU() {
        return new CCBuildingRU();
    }

    /**
     * Create an instance of {@link CCPropertyItem }
     * 
     */
    public CCPropertyItem createCCPropertyItem() {
        return new CCPropertyItem();
    }

    /**
     * Create an instance of {@link CCPolicySummaryProperty }
     * 
     */
    public CCPolicySummaryProperty createCCPolicySummaryProperty() {
        return new CCPolicySummaryProperty();
    }

    /**
     * Create an instance of {@link CCVehicle }
     * 
     */
    public CCVehicle createCCVehicle() {
        return new CCVehicle();
    }

    /**
     * Create an instance of {@link CCStatCode }
     * 
     */
    public CCStatCode createCCStatCode() {
        return new CCStatCode();
    }

    /**
     * Create an instance of {@link CCAdjudicator }
     * 
     */
    public CCAdjudicator createCCAdjudicator() {
        return new CCAdjudicator();
    }

    /**
     * Create an instance of {@link CCPropertyRU }
     * 
     */
    public CCPropertyRU createCCPropertyRU() {
        return new CCPropertyRU();
    }

    /**
     * Create an instance of {@link CCVehicleOwner }
     * 
     */
    public CCVehicleOwner createCCVehicleOwner() {
        return new CCVehicleOwner();
    }

    /**
     * Create an instance of {@link CCPolicyCoverage }
     * 
     */
    public CCPolicyCoverage createCCPolicyCoverage() {
        return new CCPolicyCoverage();
    }

    /**
     * Create an instance of {@link CCLocationMiscRU }
     * 
     */
    public CCLocationMiscRU createCCLocationMiscRU() {
        return new CCLocationMiscRU();
    }

    /**
     * Create an instance of {@link CCPersonVendor }
     * 
     */
    public CCPersonVendor createCCPersonVendor() {
        return new CCPersonVendor();
    }

    /**
     * Create an instance of {@link CCGeneralLiabilityRU }
     * 
     */
    public CCGeneralLiabilityRU createCCGeneralLiabilityRU() {
        return new CCGeneralLiabilityRU();
    }

    /**
     * Create an instance of {@link CCCoverage }
     * 
     */
    public CCCoverage createCCCoverage() {
        return new CCCoverage();
    }

    /**
     * Create an instance of {@link CCPerson }
     * 
     */
    public CCPerson createCCPerson() {
        return new CCPerson();
    }

    /**
     * Create an instance of {@link CCVehicleRU }
     * 
     */
    public CCVehicleRU createCCVehicleRU() {
        return new CCVehicleRU();
    }

    /**
     * Create an instance of {@link CCEndorsement }
     * 
     */
    public CCEndorsement createCCEndorsement() {
        return new CCEndorsement();
    }

    /**
     * Create an instance of {@link CCClassificationCovTerm }
     * 
     */
    public CCClassificationCovTerm createCCClassificationCovTerm() {
        return new CCClassificationCovTerm();
    }

    /**
     * Create an instance of {@link PolicyLocationInfo }
     * 
     */
    public PolicyLocationInfo createPolicyLocationInfo() {
        return new PolicyLocationInfo();
    }

    /**
     * Create an instance of {@link CCCompanyVendor }
     * 
     */
    public CCCompanyVendor createCCCompanyVendor() {
        return new CCCompanyVendor();
    }

    /**
     * Create an instance of {@link CCInlandMarineRU }
     * 
     */
    public CCInlandMarineRU createCCInlandMarineRU() {
        return new CCInlandMarineRU();
    }

    /**
     * Create an instance of {@link CCPlace }
     * 
     */
    public CCPlace createCCPlace() {
        return new CCPlace();
    }

    /**
     * Create an instance of {@link CCWCCovEmpRU }
     * 
     */
    public CCWCCovEmpRU createCCWCCovEmpRU() {
        return new CCWCCovEmpRU();
    }

    /**
     * Create an instance of {@link CCContactAddress }
     * 
     */
    public CCContactAddress createCCContactAddress() {
        return new CCContactAddress();
    }

    /**
     * Create an instance of {@link CCCovTerm }
     * 
     */
    public CCCovTerm createCCCovTerm() {
        return new CCCovTerm();
    }

    /**
     * Create an instance of {@link CCLocationBasedRU }
     * 
     */
    public CCLocationBasedRU createCCLocationBasedRU() {
        return new CCLocationBasedRU();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Lienholders", scope = CCLocationBasedRU.class)
    @XmlIDREF
    public JAXBElement<Object> createCCLocationBasedRULienholders(Object value) {
        return new JAXBElement<Object>(_CCLocationBasedRULienholders_QNAME, Object.class, CCLocationBasedRU.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Buildings", scope = CCPolicyLocation.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyLocationBuildings(Object value) {
        return new JAXBElement<Object>(_CCPolicyLocationBuildings_QNAME, Object.class, CCPolicyLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Lienholders", scope = CCPolicyLocation.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyLocationLienholders(Object value) {
        return new JAXBElement<Object>(_CCLocationBasedRULienholders_QNAME, Object.class, CCPolicyLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "AllAddresses", scope = CCContact.class)
    @XmlIDREF
    public JAXBElement<Object> createCCContactAllAddresses(Object value) {
        return new JAXBElement<Object>(_CCContactAllAddresses_QNAME, Object.class, CCContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "CoveredParty", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyCoveredParty(Object value) {
        return new JAXBElement<Object>(_CCPolicyCoveredParty_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "MainContact", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyMainContact(Object value) {
        return new JAXBElement<Object>(_CCPolicyMainContact_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "AltContact", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyAltContact(Object value) {
        return new JAXBElement<Object>(_CCPolicyAltContact_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerAgent", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerAgent(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerAgent_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "InsuredRep", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyInsuredRep(Object value) {
        return new JAXBElement<Object>(_CCPolicyInsuredRep_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "ExcludedParty", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyExcludedParty(Object value) {
        return new JAXBElement<Object>(_CCPolicyExcludedParty_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerExcludedParty", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerExcludedParty(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerExcludedParty_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "PolicyLocations", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyPolicyLocations(Object value) {
        return new JAXBElement<Object>(_CCPolicyPolicyLocations_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerUnderwriter", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerUnderwriter(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerUnderwriter_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "ClassCodes", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyClassCodes(Object value) {
        return new JAXBElement<Object>(_CCPolicyClassCodes_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Other", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyOther(Object value) {
        return new JAXBElement<Object>(_CCPolicyOther_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "WCCarrier", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyWCCarrier(Object value) {
        return new JAXBElement<Object>(_CCPolicyWCCarrier_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerDoingBusinessAs", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerDoingBusinessAs(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerDoingBusinessAs_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerCoveredParty", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerCoveredParty(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerCoveredParty_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerInsured", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerInsured(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerInsured_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "FormerPolicyHolder", scope = CCPolicy.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPolicyFormerPolicyHolder(Object value) {
        return new JAXBElement<Object>(_CCPolicyFormerPolicyHolder_QNAME, Object.class, CCPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Wards", scope = CCPerson.class)
    @XmlIDREF
    public JAXBElement<Object> createCCPersonWards(Object value) {
        return new JAXBElement<Object>(_CCPersonWards_QNAME, Object.class, CCPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Thirdpartyinsured", scope = CCCompany.class)
    @XmlIDREF
    public JAXBElement<Object> createCCCompanyThirdpartyinsured(Object value) {
        return new JAXBElement<Object>(_CCCompanyThirdpartyinsured_QNAME, Object.class, CCCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Employees", scope = CCCompany.class)
    @XmlIDREF
    public JAXBElement<Object> createCCCompanyEmployees(Object value) {
        return new JAXBElement<Object>(_CCCompanyEmployees_QNAME, Object.class, CCCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/pc/ccintegration", name = "Case", scope = CCCompany.class)
    @XmlIDREF
    public JAXBElement<Object> createCCCompanyCase(Object value) {
        return new JAXBElement<Object>(_CCCompanyCase_QNAME, Object.class, CCCompany.class, value);
    }

}
