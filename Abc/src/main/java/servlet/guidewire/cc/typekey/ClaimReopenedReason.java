
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimReopenedReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimReopenedReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mistake"/>
 *     &lt;enumeration value="newinfo"/>
 *     &lt;enumeration value="paymentdenied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimReopenedReason", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ClaimReopenedReason {

    @XmlEnumValue("mistake")
    MISTAKE("mistake"),
    @XmlEnumValue("newinfo")
    NEWINFO("newinfo"),
    @XmlEnumValue("paymentdenied")
    PAYMENTDENIED("paymentdenied");
    private final String value;

    ClaimReopenedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimReopenedReason fromValue(String v) {
        for (ClaimReopenedReason c: ClaimReopenedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
