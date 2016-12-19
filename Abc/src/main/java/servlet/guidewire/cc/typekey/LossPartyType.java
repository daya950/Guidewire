
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossPartyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossPartyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="insured"/>
 *     &lt;enumeration value="third_party"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossPartyType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum LossPartyType {

    @XmlEnumValue("insured")
    INSURED("insured"),
    @XmlEnumValue("third_party")
    THIRD_PARTY("third_party");
    private final String value;

    LossPartyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LossPartyType fromValue(String v) {
        for (LossPartyType c: LossPartyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
