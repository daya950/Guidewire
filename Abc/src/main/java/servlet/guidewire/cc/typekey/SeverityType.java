
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="minor"/>
 *     &lt;enumeration value="moderate-gen"/>
 *     &lt;enumeration value="moderate-auto"/>
 *     &lt;enumeration value="moderate-prop"/>
 *     &lt;enumeration value="major-gen"/>
 *     &lt;enumeration value="major-auto"/>
 *     &lt;enumeration value="major-prop"/>
 *     &lt;enumeration value="major-injury"/>
 *     &lt;enumeration value="severe-gen"/>
 *     &lt;enumeration value="severe-auto"/>
 *     &lt;enumeration value="severe-injury"/>
 *     &lt;enumeration value="td"/>
 *     &lt;enumeration value="pd"/>
 *     &lt;enumeration value="medical_only"/>
 *     &lt;enumeration value="temporary"/>
 *     &lt;enumeration value="perm-total"/>
 *     &lt;enumeration value="fatal"/>
 *     &lt;enumeration value="contract-medical"/>
 *     &lt;enumeration value="wc-ell"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeverityType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum SeverityType {

    @XmlEnumValue("minor")
    MINOR("minor"),
    @XmlEnumValue("moderate-gen")
    MODERATE_GEN("moderate-gen"),
    @XmlEnumValue("moderate-auto")
    MODERATE_AUTO("moderate-auto"),
    @XmlEnumValue("moderate-prop")
    MODERATE_PROP("moderate-prop"),
    @XmlEnumValue("major-gen")
    MAJOR_GEN("major-gen"),
    @XmlEnumValue("major-auto")
    MAJOR_AUTO("major-auto"),
    @XmlEnumValue("major-prop")
    MAJOR_PROP("major-prop"),
    @XmlEnumValue("major-injury")
    MAJOR_INJURY("major-injury"),
    @XmlEnumValue("severe-gen")
    SEVERE_GEN("severe-gen"),
    @XmlEnumValue("severe-auto")
    SEVERE_AUTO("severe-auto"),
    @XmlEnumValue("severe-injury")
    SEVERE_INJURY("severe-injury"),
    @XmlEnumValue("td")
    TD("td"),
    @XmlEnumValue("pd")
    PD("pd"),
    @XmlEnumValue("medical_only")
    MEDICAL_ONLY("medical_only"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary"),
    @XmlEnumValue("perm-total")
    PERM_TOTAL("perm-total"),
    @XmlEnumValue("fatal")
    FATAL("fatal"),
    @XmlEnumValue("contract-medical")
    CONTRACT_MEDICAL("contract-medical"),
    @XmlEnumValue("wc-ell")
    WC_ELL("wc-ell");
    private final String value;

    SeverityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityType fromValue(String v) {
        for (SeverityType c: SeverityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
