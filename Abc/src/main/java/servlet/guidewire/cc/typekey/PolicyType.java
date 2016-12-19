
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BusinessOwners"/>
 *     &lt;enumeration value="BusinessAuto"/>
 *     &lt;enumeration value="CommercialPackage"/>
 *     &lt;enumeration value="CommercialProperty"/>
 *     &lt;enumeration value="farmowners"/>
 *     &lt;enumeration value="GeneralLiability"/>
 *     &lt;enumeration value="Homeowners"/>
 *     &lt;enumeration value="InlandMarine"/>
 *     &lt;enumeration value="PersonalAuto"/>
 *     &lt;enumeration value="travel_per"/>
 *     &lt;enumeration value="PersonalUmbrella"/>
 *     &lt;enumeration value="prof_liability"/>
 *     &lt;enumeration value="WorkersComp"/>
 *     &lt;enumeration value="D_and_O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum PolicyType {

    @XmlEnumValue("BusinessOwners")
    BUSINESS_OWNERS("BusinessOwners"),
    @XmlEnumValue("BusinessAuto")
    BUSINESS_AUTO("BusinessAuto"),
    @XmlEnumValue("CommercialPackage")
    COMMERCIAL_PACKAGE("CommercialPackage"),
    @XmlEnumValue("CommercialProperty")
    COMMERCIAL_PROPERTY("CommercialProperty"),
    @XmlEnumValue("farmowners")
    FARMOWNERS("farmowners"),
    @XmlEnumValue("GeneralLiability")
    GENERAL_LIABILITY("GeneralLiability"),
    @XmlEnumValue("Homeowners")
    HOMEOWNERS("Homeowners"),
    @XmlEnumValue("InlandMarine")
    INLAND_MARINE("InlandMarine"),
    @XmlEnumValue("PersonalAuto")
    PERSONAL_AUTO("PersonalAuto"),
    @XmlEnumValue("travel_per")
    TRAVEL_PER("travel_per"),
    @XmlEnumValue("PersonalUmbrella")
    PERSONAL_UMBRELLA("PersonalUmbrella"),
    @XmlEnumValue("prof_liability")
    PROF_LIABILITY("prof_liability"),
    @XmlEnumValue("WorkersComp")
    WORKERS_COMP("WorkersComp"),
    @XmlEnumValue("D_and_O")
    D_AND_O("D_and_O");
    private final String value;

    PolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyType fromValue(String v) {
        for (PolicyType c: PolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
