
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="exception"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureState", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ExposureState {

    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("exception")
    EXCEPTION("exception");
    private final String value;

    ExposureState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExposureState fromValue(String v) {
        for (ExposureState c: ExposureState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
