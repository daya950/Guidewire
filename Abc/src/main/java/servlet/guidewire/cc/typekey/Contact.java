
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Contact">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="Place"/>
 *     &lt;enumeration value="Adjudicator"/>
 *     &lt;enumeration value="Attorney"/>
 *     &lt;enumeration value="AutoRepairShop"/>
 *     &lt;enumeration value="AutoTowingAgcy"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="Doctor"/>
 *     &lt;enumeration value="LawFirm"/>
 *     &lt;enumeration value="LegalVenue"/>
 *     &lt;enumeration value="MedicalCareOrg"/>
 *     &lt;enumeration value="UserContact"/>
 *     &lt;enumeration value="CompanyVendor"/>
 *     &lt;enumeration value="PersonVendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Contact", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum Contact {

    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Place")
    PLACE("Place"),
    @XmlEnumValue("Adjudicator")
    ADJUDICATOR("Adjudicator"),
    @XmlEnumValue("Attorney")
    ATTORNEY("Attorney"),
    @XmlEnumValue("AutoRepairShop")
    AUTO_REPAIR_SHOP("AutoRepairShop"),
    @XmlEnumValue("AutoTowingAgcy")
    AUTO_TOWING_AGCY("AutoTowingAgcy"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Doctor")
    DOCTOR("Doctor"),
    @XmlEnumValue("LawFirm")
    LAW_FIRM("LawFirm"),
    @XmlEnumValue("LegalVenue")
    LEGAL_VENUE("LegalVenue"),
    @XmlEnumValue("MedicalCareOrg")
    MEDICAL_CARE_ORG("MedicalCareOrg"),
    @XmlEnumValue("UserContact")
    USER_CONTACT("UserContact"),
    @XmlEnumValue("CompanyVendor")
    COMPANY_VENDOR("CompanyVendor"),
    @XmlEnumValue("PersonVendor")
    PERSON_VENDOR("PersonVendor");
    private final String value;

    Contact(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Contact fromValue(String v) {
        for (Contact c: Contact.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
