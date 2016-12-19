
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="confirmed"/>
 *     &lt;enumeration value="unconfirmed"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxStatus", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum TaxStatus {

    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TaxStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxStatus fromValue(String v) {
        for (TaxStatus c: TaxStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
