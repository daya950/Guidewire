
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoveredPartyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoveredPartyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="addinsured"/>
 *     &lt;enumeration value="addnamedinsured"/>
 *     &lt;enumeration value="tbd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoveredPartyType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum CoveredPartyType {

    @XmlEnumValue("addinsured")
    ADDINSURED("addinsured"),
    @XmlEnumValue("addnamedinsured")
    ADDNAMEDINSURED("addnamedinsured"),
    @XmlEnumValue("tbd")
    TBD("tbd");
    private final String value;

    CoveredPartyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoveredPartyType fromValue(String v) {
        for (CoveredPartyType c: CoveredPartyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
