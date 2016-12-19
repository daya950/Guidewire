
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="archived"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimState", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ClaimState {

    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("archived")
    ARCHIVED("archived");
    private final String value;

    ClaimState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimState fromValue(String v) {
        for (ClaimState c: ClaimState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
