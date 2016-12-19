
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimClosedOutcomeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimClosedOutcomeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="duplicate"/>
 *     &lt;enumeration value="fraud"/>
 *     &lt;enumeration value="mistake"/>
 *     &lt;enumeration value="paymentscomplete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimClosedOutcomeType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ClaimClosedOutcomeType {

    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate"),
    @XmlEnumValue("fraud")
    FRAUD("fraud"),
    @XmlEnumValue("mistake")
    MISTAKE("mistake"),
    @XmlEnumValue("paymentscomplete")
    PAYMENTSCOMPLETE("paymentscomplete");
    private final String value;

    ClaimClosedOutcomeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimClosedOutcomeType fromValue(String v) {
        for (ClaimClosedOutcomeType c: ClaimClosedOutcomeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
