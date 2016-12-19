
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureClosedOutcomeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureClosedOutcomeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="duplicate"/>
 *     &lt;enumeration value="fraud"/>
 *     &lt;enumeration value="mistake"/>
 *     &lt;enumeration value="paymentscomplete"/>
 *     &lt;enumeration value="unnecessary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureClosedOutcomeType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ExposureClosedOutcomeType {

    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate"),
    @XmlEnumValue("fraud")
    FRAUD("fraud"),
    @XmlEnumValue("mistake")
    MISTAKE("mistake"),
    @XmlEnumValue("paymentscomplete")
    PAYMENTSCOMPLETE("paymentscomplete"),
    @XmlEnumValue("unnecessary")
    UNNECESSARY("unnecessary");
    private final String value;

    ExposureClosedOutcomeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExposureClosedOutcomeType fromValue(String v) {
        for (ExposureClosedOutcomeType c: ExposureClosedOutcomeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
