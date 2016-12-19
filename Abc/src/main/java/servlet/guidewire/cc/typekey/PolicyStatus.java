
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="archived"/>
 *     &lt;enumeration value="canceled"/>
 *     &lt;enumeration value="expired"/>
 *     &lt;enumeration value="inforce"/>
 *     &lt;enumeration value="pending_cancellation"/>
 *     &lt;enumeration value="pending_confirmation"/>
 *     &lt;enumeration value="paymentpastdue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyStatus", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum PolicyStatus {

    @XmlEnumValue("archived")
    ARCHIVED("archived"),
    @XmlEnumValue("canceled")
    CANCELED("canceled"),
    @XmlEnumValue("expired")
    EXPIRED("expired"),
    @XmlEnumValue("inforce")
    INFORCE("inforce"),
    @XmlEnumValue("pending_cancellation")
    PENDING_CANCELLATION("pending_cancellation"),
    @XmlEnumValue("pending_confirmation")
    PENDING_CONFIRMATION("pending_confirmation"),
    @XmlEnumValue("paymentpastdue")
    PAYMENTPASTDUE("paymentpastdue");
    private final String value;

    PolicyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyStatus fromValue(String v) {
        for (PolicyStatus c: PolicyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
